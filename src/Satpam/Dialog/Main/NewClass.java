
package Satpam.Dialog.Main;
import java.awt.FontMetrics;
// w w w. j a  v a  2s  .c om
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class NewClass {
  public static void main(String[] args) {
    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.setUI(new MetalTabbedPaneUI() {
      @Override
      protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        int width = super.calculateTabWidth(tabPlacement, tabIndex, metrics);
        int extra = tabIndex * 50;
        return width + extra;
      }
    });
    tabbedPane.addTab("JTable", new JScrollPane(new JTable(5, 5)));
    tabbedPane.addTab("JTree", new JScrollPane(new JTree()));
    tabbedPane.addTab("JSplitPane", new JSplitPane());

    JPanel p = new JPanel();
    p.add(tabbedPane);

    JFrame frame = new JFrame();
    frame.setContentPane(p);
    frame.pack();
    frame.setVisible(true);
  }
}