package Admin.Dialog.Master;

import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import Library.Validasi;
import datechooser.beans.DateChooserCombo;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DialogAddBlacklist extends javax.swing.JDialog {
    
    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private final Validasi valid = new Validasi();
    private String sql;
    private ResultSet rs;

    public DialogAddBlacklist(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showDetail();
    }

    private void showDetail() {
        try {
            if(TempData.getStatus()) {
                rs = con.getQuery("SELECT * FROM BLACKLIST WHERE "
                        + "id_tersangka ='" + TempData.getId() + "'");
                if(rs.next()) {
                    boxID.setText(rs.getString(1));
                    boxNama.setText(rs.getString(2));
                    boxJenis.setSelectedItem(rs.getString(5));
                    boxNo.setText(rs.getString(6));
                    boxAlamat.setText(rs.getString(7));
                    boxKasus.setSelectedItem(rs.getString(8));
                    boxAgama.setSelectedItem(rs.getString(4));
                    Calendar cal1 = new GregorianCalendar(1900 + rs.getDate(3).getYear(), rs.getDate(3).getMonth(), rs.getDate(3).getDate());
                    boxTanggal.setSelectedDate(cal1);
                }
                boxID.setEditable(false);
                btnSimpan.setText("Ubah");
            }
        } catch (Exception e) {
            msg.msgError("Error Show Detail : " + e.getMessage());
        }
    }
    
    private Date getDate(DateChooserCombo box) throws ParseException {
        String dates = new SimpleDateFormat("yyyy-MM-dd").format(box.getSelectedDate().getTime());
        return new SimpleDateFormat("yyyy-MM-dd").parse(dates);
    }
    
    private String getDateSql(DateChooserCombo box) throws ParseException {
        return (1900 + getDate(box).getYear()) + "-" + (getDate(box).getMonth() + 1) + "-" + getDate(box).getDate();
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
        boxNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxAlamat = new javax.swing.JTextField();
        boxJenis = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxTanggal = new datechooser.beans.DateChooserCombo();
        boxAgama = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        boxKasus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Blacklist");
        setBackground(new java.awt.Color(254, 254, 254));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_24_120.png"))); // NOI18N
        jLabel1.setText("FORM ADD BLACKLIST");

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
        jLabel2.setText("ID Tersangka (KTP)");

        boxID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateKtp(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel3.setText("Nama Tersangka");

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
        jLabel6.setText("Alamat");

        boxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Pria", "Wanita" }));
        boxJenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel7.setText("Kasus");

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

        jLabel8.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel8.setText("Tanggal Lahir");

        boxTanggal.setFormat(1);

        boxAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Agama", "Islam", "Kristen", "Budha", "Hindu", "Konghucu", "Lain - Lain" }));
        boxAgama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel9.setText("Agama");

        boxKasus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kasus", "Narkoba", "Pembunuhan", "Pemerkosaan", "Pencurian", "Penganiayaan", "Lain - Lain" }));
        boxKasus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(boxID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(boxNama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(boxNo))
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxAgama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxAlamat)
                            .addComponent(boxKasus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(boxAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(boxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxKasus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        setSize(new java.awt.Dimension(431, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxID.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom id ketua \"NO KTP\"");
                boxID.requestFocus();
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
            } else if(boxKasus.getSelectedIndex() == 0) {
                msg.msgWarning("Mohon pilih kasus");
                boxKasus.requestFocus();
            } else if(boxID.getText().length() < 16) {
                msg.msgWarning("No KTP harus 16 angka");
                boxID.requestFocus();
            } else if(boxAgama.getSelectedIndex() == 0) {
                msg.msgWarning("Mohon pilih agama");
                boxAgama.requestFocus();
            } else {
                if(TempData.getStatus()) {
                    sql = "UPDATE BLACKLIST SET "
                        + "nama_tersangka ='" + boxNama.getText() + "', "
                            + "tgl_lahir ='" + getDateSql(boxTanggal) + "', "
                                + "agama ='" + boxAgama.getSelectedItem()+ "', "
                                    + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                        + "no_telp ='" +  boxNo.getText() + "', "
                                            + "alamat ='" +  boxAlamat.getText() + "', "
                                                + "kasus ='" +  boxKasus.getSelectedItem()+ "' "
                                                    + "WHERE id_tersangka ='" + boxID.getText() + "'";
                } else {
                    rs = con.getQuery("SELECT * FROM BLACKLIST WHERE id_tersangka ='" + boxID.getText() + "'");
                    if(rs.next()) {
                        msg.msgWarning("No KTP " + boxID.getText() + " sudah terdaftar");
                    } else {
                        sql = "INSERT INTO BLACKLIST SET "
                            + "nama_tersangka ='" + boxNama.getText() + "', "
                                + "tgl_lahir ='" + getDateSql(boxTanggal) + "', "
                                    + "agama ='" + boxAgama.getSelectedItem()+ "', "
                                        + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                            + "no_telp ='" +  boxNo.getText() + "', "
                                                + "alamat ='" +  boxAlamat.getText() + "', "
                                                    + "kasus ='" +  boxKasus.getSelectedItem() + "', "
                                                        + "id_tersangka ='" + boxID.getText() + "'";
                    }
                }
                con.setExecute(sql);
                this.dispose();
            }
            
        } catch (Exception e) {
            msg.msgError("Error simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onValidateTelp(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateTelp
        if(boxNo.getText().length() > 12) {
            msg.msgWarning("No Telpon maksimal 13 angka");
            evt.consume();
        } else {
            valid.validInt(evt);
        }
    }//GEN-LAST:event_onValidateTelp

    private void onValidateNama(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateNama
        valid.validChar(evt);
    }//GEN-LAST:event_onValidateNama

    private void onValidateKtp(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateKtp
        if(boxID.getText().length() > 15) {
            msg.msgWarning("No KTP hanya boleh 16 angka");
            evt.consume();
        } else {
            valid.validInt(evt);
        }
    }//GEN-LAST:event_onValidateKtp

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAddBlacklist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAddBlacklist dialog = new DialogAddBlacklist(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> boxAgama;
    private javax.swing.JTextField boxAlamat;
    private javax.swing.JTextField boxID;
    private javax.swing.JComboBox<String> boxJenis;
    private javax.swing.JComboBox<String> boxKasus;
    private javax.swing.JTextField boxNama;
    private javax.swing.JTextField boxNo;
    private datechooser.beans.DateChooserCombo boxTanggal;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
