package Library;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageControl {
    
    private String path = null;
    private File selectedFile;
    private final Message msg = new Message();
    
    public ImageIcon resizeImage(String imagePath, byte[] pic, int x, int y) {
        try {
            ImageIcon myImage;

            if (imagePath != null) {
                myImage = new ImageIcon(imagePath);
            } else {
                myImage = new ImageIcon(pic);
            }

            Image img = myImage.getImage();
            Image img2 = img.getScaledInstance(x, y, Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(img2);
            return image;
        } catch (Exception e) {
            System.err.println("Error resize : " + e.getMessage());
            return null;
        }
    }
    
    public void showImage(JLabel lb, int x, int y){
        try {
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG Photos", "png");
            file.addChoosableFileFilter(filter);
            int result = file.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                selectedFile = file.getSelectedFile();
                path = selectedFile.getAbsolutePath();
                lb.setIcon(resizeImage(path, null, x, y));
            } else {
                System.out.println("No File Selected");
            }
        } catch (HeadlessException e) {
            msg.msgWarning("Gambar terlalu besar!");
        }
    }
    
    public File getFile() {
        return selectedFile;
    }
    
    public String getPath() {
        return path;
    }
}
