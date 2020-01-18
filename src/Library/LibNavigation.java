package Library;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LibNavigation {
        
    public void setActive(JPanel pnlUtama, JPanel pnlTujuan) {
        pnlUtama.removeAll();
        pnlUtama.add(pnlTujuan);
        pnlUtama.repaint();
        pnlUtama.revalidate();
    }
    
    public void setVisible(JPanel panel, JLabel label) {
        label.setForeground(LibColor.getColor());
        panel.setVisible(true);
    }
    
}
