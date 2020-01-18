package Admin.Dialog.Database;

import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.OSPrompt;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FormRestore extends javax.swing.JDialog {
    
    private String path = "";
    private String[] command;
    private final Message msg = new Message();
    private final OSPrompt os = new OSPrompt();
    private final Koneksi con = new Koneksi();
    
    public FormRestore(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boxPath = new javax.swing.JTextField();
        btnClose = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Restore Database");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        boxPath.setEditable(false);
        boxPath.setText("Path ://");

        btnClose.setBackground(new java.awt.Color(22, 160, 133));
        btnClose.setForeground(new java.awt.Color(254, 254, 254));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setOpaque(true);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSelectPath(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_segarkan.png"))); // NOI18N
        jButton1.setText("Restore");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSimpan(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxPath, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxPath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(434, 155));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onSelectPath(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSelectPath
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("SQL File", "sql");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                path = file.getSelectedFile().getAbsolutePath();
                boxPath.setText(path);
            } catch (Exception e) {
                msg.msgError("Error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_onSelectPath

    private void onSimpan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(path.isEmpty()) {
                msg.msgWarning("Mohon pilih sql file terlebih dahulu!");
            } else {
                if(os.isUnix()) {
                    command = new String[] {"/opt/lampp/bin/mysql", "--user=root", con.getDB(), "-e", "source " + path};
                } else if(os.isWindows()) {
                    command = new String[] {"C:\\xampp\\mysql\\bin\\mysql", "--user=root", con.getDB(), "-e", "source " + path};
                }
                Process proc = Runtime.getRuntime().exec(command);
                if(proc.waitFor() == 0) {
                    msg.msgInformation("Sukses");
                    this.dispose();
                } else {
                    msg.msgWarning("Gagal");
                }
            }
        } catch (IOException | InterruptedException e) {
            msg.msgError("Error simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FormRestore dialog = new FormRestore(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxPath;
    private static javax.swing.JLabel btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
