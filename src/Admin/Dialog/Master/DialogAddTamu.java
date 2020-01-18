package Admin.Dialog.Master;

import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import Library.Validasi;
import java.sql.ResultSet;

public class DialogAddTamu extends javax.swing.JDialog {

    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private final Validasi valid = new Validasi();
    private String sql;
    private ResultSet rs;
    
    public DialogAddTamu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showDetail();
    }
    
    public DialogAddTamu(java.awt.Frame parent, boolean modal, String id) {
        super(parent, modal);
        initComponents();
        boxIDTamu.setText(id);
        boxIDTamu.setEditable(false);
        boxNama.requestFocus();
    }
    
    private void showDetail() {
        try {
            if(TempData.getStatus()) {
                rs = con.getQuery("SELECT * FROM TAMU WHERE "
                        + "id_tamu ='" + TempData.getId() + "'");
                if(rs.next()) {
                    boxIDTamu.setText(rs.getString(1));
                    boxNama.setText(rs.getString(2));
                    boxJenis.setSelectedItem(rs.getString(5));
                    boxNo.setText(rs.getString(4));
                    boxAlamat.setText(rs.getString(3));
                }
                boxIDTamu.setEditable(false);
                btnSimpan.setText("Ubah");
            }
        } catch (Exception e) {
            msg.msgError("Error Show Detail : " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxIDTamu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxAlamat = new javax.swing.JTextField();
        boxJenis = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Tamu");
        setBackground(new java.awt.Color(254, 254, 254));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_0_120.png"))); // NOI18N
        jLabel1.setText(" FORM ADD TAMU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel2.setText("ID Tamu (KTP)");

        boxIDTamu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateID(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                onCekTamu(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel3.setText("Nama Tamu");

        boxNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateNama(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel5.setText("No Telp");

        boxNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateTelp(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel6.setText("Asal");

        boxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Pria", "Wanita" }));
        boxJenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSimpan.setBackground(new java.awt.Color(22, 160, 133));
        btnSimpan.setForeground(new java.awt.Color(254, 254, 254));
        btnSimpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_simpan.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setOpaque(true);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSimpan(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxIDTamu)
                            .addComponent(boxNama)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxNo)
                            .addComponent(boxJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxAlamat))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxIDTamu)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxNama)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxNo)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxAlamat)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setSize(new java.awt.Dimension(381, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onValidateID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateID
        try {
            if(boxIDTamu.getText().length() > 15) {
                msg.msgWarning("No KTP hanya boleh 16 angka");
                evt.consume();
            } else {
                valid.validInt(evt);
            }
        } catch (Exception e) {
            msg.msgError("Error validate : " + e.getMessage());
        }
    }//GEN-LAST:event_onValidateID

    private void onValidateNama(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateNama
        valid.validChar(evt);
    }//GEN-LAST:event_onValidateNama

    private void onValidateTelp(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateTelp
        if(boxNo.getText().length() > 12) {
            msg.msgWarning("No Telpon maksimal 13 angka");
            evt.consume();
        } else {
            valid.validInt(evt);
        }
    }//GEN-LAST:event_onValidateTelp

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxIDTamu.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom id tamu \"NO KTP\"");
                boxIDTamu.requestFocus();
            } else if(boxNama.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom nama");
                boxNama.requestFocus();
            } else if(boxJenis.getSelectedIndex() == 0) {
                msg.msgWarning("Mohon pilih jenis kelamin");
                boxJenis.requestFocus();
            } else if(boxNo.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom no telpon");
                boxNo.requestFocus();
            } else if(boxAlamat.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom alamat");
                boxAlamat.requestFocus();
            } else if(boxIDTamu.getText().length() < 16) {
                msg.msgWarning("No KTP harus 16 angka");
                boxIDTamu.requestFocus();
            } else {
                if(TempData.getStatus()) {
                    sql = "UPDATE TAMU SET "
                            + "nama_tamu ='" + boxNama.getText() + "', "
                                + "asal ='" + boxAlamat.getText() + "', "
                                    + "no_telp ='" + boxNo.getText() + "', "
                                        + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "' "
                                            + "WHERE id_tamu ='" + boxIDTamu.getText() + "'";
                } else {
                    rs = con.getQuery("SELECT * FROM TAMU WHERE id_tamu ='" + boxIDTamu.getText() + "'");
                    if(rs.next()) {
                        msg.msgWarning("No KTP " + boxIDTamu.getText() 
                                + " sudah terdaftar dengan nama " 
                                    + rs.getString("nama_tamu"));
                    } else {
                        sql = "INSERT INTO TAMU SET "
                                + "nama_tamu ='" + boxNama.getText() + "', "
                                    + "asal ='" + boxAlamat.getText() + "', "
                                        + "no_telp ='" + boxNo.getText() + "', "
                                            + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                                + "id_tamu ='" + boxIDTamu.getText() + "'";
                    }
                }
                con.setExecute(sql);
                this.dispose();
            }
        } catch (Exception e) {
            msg.msgError("Error simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onCekTamu(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCekTamu
        try {
            rs = con.getQuery("SELECT * FROM BLACKLIST WHERE id_tersangka ='" + boxIDTamu.getText() + "'");
            if(rs.next()) {
                msg.msgWarning("TAMU DENGAN NO KTP " + boxIDTamu.getText() + " TERINDIKASI KASUS!!! "
                        + "\nTAMU TERSEBUT TIDAK DIPERBOLEHKAN BERKUNJUNG.");
                this.dispose();
            }
        } catch (Exception e) {
            msg.msgError("Error cek tamu : " + e.getMessage());
        }
    }//GEN-LAST:event_onCekTamu

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAddTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAddTamu dialog = new DialogAddTamu(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxAlamat;
    private javax.swing.JTextField boxIDTamu;
    private javax.swing.JComboBox<String> boxJenis;
    private javax.swing.JTextField boxNama;
    private javax.swing.JTextField boxNo;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
