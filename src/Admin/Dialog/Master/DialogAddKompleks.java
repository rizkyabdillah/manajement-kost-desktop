package Admin.Dialog.Master;

import Admin.Dialog.Pilih.DialogPilihKetuaRT;
import Admin.Dialog.Pilih.DialogPilihSatpam;
import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import Library.Validasi;
import java.sql.ResultSet;

public class DialogAddKompleks extends javax.swing.JDialog {

    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private final Validasi valid = new Validasi();
    private String sql, satpam = "";
    private ResultSet rs;
    
    public DialogAddKompleks(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showDetail();
    }
    
    private void showDetail() {
        try {
            if(TempData.getStatus()) {
                rs = con.getQuery("SELECT * FROM KOMPLEKS WHERE "
                        + "id_kompleks ='" + TempData.getId() + "'");
                if(rs.next()) {
                    boxID.setText(rs.getString(1));
                    boxKetua.setText(rs.getString(2));
                    boxSatpam.setText(rs.getString(3));
                    boxAlamat.setText(rs.getString(4));
                    satpam = rs.getString(3);
                }
                boxID.setEditable(false);
                btnSimpan.setText("Ubah");
            } else {
                boxID.setText(con.getAutoMaxID("KM", 6, "KOMPLEKS", "id_kompleks"));
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
        boxID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxAlamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxKetua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxSatpam = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Kompleks");
        setBackground(new java.awt.Color(254, 254, 254));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_6_120.png"))); // NOI18N
        jLabel1.setText(" FORM ADD KOMPLEKS");

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
        jLabel2.setText("ID Kompleks");

        boxID.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel5.setText("ID Ketua RT");

        boxKetua.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel6.setText("ID Satpam");

        boxSatpam.setEditable(false);

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

        jLabel7.setBackground(new java.awt.Color(254, 254, 254));
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 175, 134)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihKetua(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(254, 254, 254));
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 175, 134)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihSatpam(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxID)
                            .addComponent(boxAlamat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxKetua)
                            .addComponent(boxSatpam))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxID)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxAlamat)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxKetua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(boxSatpam, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(438, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onPilihKetua(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihKetua
        new DialogPilihKetuaRT(null, true).setVisible(true);
        if(!TempData.getId().isEmpty()) {
            boxKetua.setText(TempData.getId());
        }
        TempData.setId("");
    }//GEN-LAST:event_onPilihKetua

    private void onPilihSatpam(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihSatpam
        new DialogPilihSatpam(null, true).setVisible(true);
        if(!TempData.getId1().isEmpty()) {
            boxSatpam.setText(TempData.getId1());
        }
        TempData.setId1("");
    }//GEN-LAST:event_onPilihSatpam

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxAlamat.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom nama");
                boxAlamat.requestFocus();
            } else if(boxKetua.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih Ketua RT");
                boxKetua.requestFocus();
            } else if(boxSatpam.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih Satpam");
                boxSatpam.requestFocus();
            } else {
                rs = con.getQuery("SELECT * FROM KOMPLEKS WHERE "
                        + "id_satpam ='" + boxSatpam.getText() + "'");
                if(rs.next()) {
                    if(!satpam.equals(boxSatpam.getText())) {
                        msg.msgWarning("Satpam dengan kode " 
                            + boxSatpam.getText() + " sudah terdaftar "
                                    + "pada alamat " + rs.getString("alamat"));
                    } else {
                        sql = "UPDATE KOMPLEKS SET "
                                + "id_ketua_rt ='" + boxKetua.getText() + "', "
                                    + "id_satpam ='" + boxSatpam.getText() + "', "
                                        + "alamat ='" + boxAlamat.getText() + "' "
                                            + "WHERE id_kompleks ='" + boxID.getText() + "'";
                        con.setExecute(sql);
                        this.dispose();
                    }
                } else {
                    if(TempData.getStatus()) {
                        sql = "UPDATE KOMPLEKS SET "
                                + "id_ketua_rt ='" + boxKetua.getText() + "', "
                                    + "id_satpam ='" + boxSatpam.getText() + "', "
                                        + "alamat ='" + boxAlamat.getText() + "' "
                                            + "WHERE id_kompleks ='" + boxID.getText() + "'";
                    } else {
                        sql = "INSERT INTO KOMPLEKS SET "
                                + "id_ketua_rt ='" + boxKetua.getText() + "', "
                                    + "id_satpam ='" + boxSatpam.getText() + "', "
                                        + "alamat ='" + boxAlamat.getText() + "', "
                                            + "id_kompleks ='" + boxID.getText() + "'";
                    }
                    con.setExecute(sql);
                    this.dispose();
                }
            }
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(DialogAddKompleks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAddKompleks dialog = new DialogAddKompleks(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField boxID;
    private javax.swing.JTextField boxKetua;
    private javax.swing.JTextField boxSatpam;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
