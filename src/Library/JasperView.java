package Library;

import java.awt.Frame;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

public class JasperView {
    
    private final Message msg = new Message();
    private final String path = "src/Laporan/";
    private final String extension = ".jasper";
    
    public void showReportToPanel(String file, HashMap param, JPanel panel, Connection con) {
        try {
            JasperPrint print = JasperFillManager.fillReport(path + file + extension, param, con);
            JRViewer view = new JRViewer(print);
            view.setBounds(0, 0, panel.getWidth(), panel.getHeight());
            panel.removeAll();
            panel.add(view);
            panel.repaint();
            panel.revalidate();
        } catch (JRException e) {
            msg.msgError("Error Jasper View : " + e.getMessage());
        }
    }
    
    public void showReportToJasperView(String file, HashMap param, Connection con) {
        try {
            JasperPrint print = JasperFillManager.fillReport(path + file + extension, param, con);
            JasperViewer view = new JasperViewer(print);
            view.setExtendedState(Frame.MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (JRException e) {
            msg.msgError("Error Jasper View : " + e.getMessage());
        }
    }
    
}
