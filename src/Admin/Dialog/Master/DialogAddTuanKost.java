package Admin.Dialog.Master;

import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import Library.Validasi;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;

public class DialogAddTuanKost extends javax.swing.JDialog {
    
    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private final Validasi valid = new Validasi();
    private String sql, sql1, username = "";
    private ResultSet rs;
    
    public DialogAddTuanKost(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showDetail();
    }
    
    private void showDetail() {
        try {
            if(TempData.getStatus()) {
                rs = con.getQuery("SELECT * FROM VIEW_PEMILIK WHERE "
                        + "id_pemilik ='" + TempData.getId() + "'");
                if(rs.next()) {
                    boxID.setText(rs.getString(1));
                    boxNama.setText(rs.getString(2));
                    boxJenis.setSelectedItem(rs.getString(3));
                    boxNo.setText(rs.getString(4));
                    boxAlamat.setText(rs.getString(5));
                    boxUsername.setText(rs.getString(6));
                    boxPassword.setText(rs.getString(7));
                    username = rs.getString(6);
                }
                rs = con.getQuery("SELECT pertanyaan, jawaban FROM USER WHERE "
                        + "id_user ='" + boxID.getText() + "'");
                if(rs.next()) {
                    boxPertanyaan.setSelectedItem(rs.getString(1));
                    boxJawaban.setText(rs.getString(2));
                }
                boxID.setEditable(false);
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
        boxID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxAlamat = new javax.swing.JTextField();
        boxJenis = new javax.swing.JComboBox<>();
        boxUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
        boxPassword = new javax.swing.JPasswordField();
        cbPass = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        boxPertanyaan = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        boxJawaban = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Tuan Kost");
        setBackground(new java.awt.Color(254, 254, 254));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_3_120.png"))); // NOI18N
        jLabel1.setText(" FORM ADD TUAN KOST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
        jLabel2.setText("ID Pemilik Kost (KTP)");

        boxID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateKtp(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel3.setText("Nama Pemilik Kost");

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

        boxUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateUsername(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel8.setText("Password");

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

        cbPass.setFont(new java.awt.Font("Lohit Devanagari", 0, 10)); // NOI18N
        cbPass.setText("Lihat Password");
        cbPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbPass.setBorderPaintedFlat(true);
        cbPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLihatPasswd(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Keamanan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11))); // NOI18N

        boxPertanyaan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Pertanyaan", "Siapakah nama ibu anda?", "Siapakah nama ayah anda?", "Siapakah nama teman dekat anda?", "Dimanakah tempat tinggal anda?" }));
        boxPertanyaan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel11.setText("Pertanyaan");

        jLabel12.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel12.setText("Jawaban");

        boxJawaban.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxJawabanonValidateJawaban(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(boxPertanyaan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(boxJawaban)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(boxPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(boxJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(boxID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boxNama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boxJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boxNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boxAlamat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boxUsername))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(boxPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(cbPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(boxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(cbPass)
                .addGap(3, 3, 3)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(437, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onValidateKtp(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateKtp
        if(boxID.getText().length() > 15) {
            msg.msgWarning("No KTP hanya boleh 16 angka");
            evt.consume();
        } else {
            valid.validInt(evt);
        }
    }//GEN-LAST:event_onValidateKtp

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
            } else if(boxUsername.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom username");
                boxUsername.requestFocus();
            } else if(boxPassword.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom password");
                boxPassword.requestFocus();
            } else if(boxID.getText().length() < 16) {
                msg.msgWarning("No KTP harus 16 angka");
                boxID.requestFocus();
            } else if(boxPertanyaan.getSelectedIndex() == 0) {
                msg.msgWarning("Mohon pilih jenis pertanyaan");
                boxPertanyaan.requestFocus();
            } else if(boxJawaban.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom jawaban");
                boxJawaban.requestFocus();
            } else {
                rs = con.getQuery("SELECT * FROM USER WHERE "
                        + "username ='" + boxUsername.getText() + "'");
                if(rs.next()) {
                    if(!username.equals(boxUsername.getText())) {
                        msg.msgWarning("Username dengan " 
                            + boxUsername.getText() + " sudah terdaftar ");
                    } else {
                        sql = "UPDATE USER SET "
                                + "username ='" + boxUsername.getText() + "', "
                                    + "password ='" + boxPassword.getText() + "', "
                                        + "pertanyaan ='" + boxPertanyaan.getSelectedItem()+ "', "
                                            + "jawaban ='" + boxJawaban.getText() + "', "
                                                + "level ='Pemilik Kost' "
                                                    + "WHERE id_user ='" + boxID.getText() + "'";
                        sql1 = "UPDATE PEMILIK_KOST SET "
                                + "nama_pemilik ='" + boxNama.getText() + "', "
                                    + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                        + "no_telp ='" + boxNo.getText() + "', "
                                            + "alamat ='" + boxAlamat.getText() + "' "
                                                + "WHERE id_pemilik ='" + boxID.getText() + "'";
                        
                        con.setExecute(sql);
                        con.setExecute(sql1);
                        this.dispose();
                    }
                } else {
                    if(TempData.getStatus()) {
                        sql = "UPDATE USER SET "
                                + "username ='" + boxUsername.getText() + "', "
                                    + "password ='" + boxPassword.getText() + "', "
                                        + "pertanyaan ='" + boxPertanyaan.getSelectedItem()+ "', "
                                            + "jawaban ='" + boxJawaban.getText() + "', "
                                                + "level ='Pemilik Kost' "
                                                    + "WHERE id_user ='" + boxID.getText() + "'";
                        sql1 = "UPDATE PEMILIK_KOST SET "
                                + "nama_pemilik ='" + boxNama.getText() + "', "
                                    + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                        + "no_telp ='" + boxNo.getText() + "', "
                                            + "alamat ='" + boxAlamat.getText() + "' "
                                                + "WHERE id_pemilik ='" + boxID.getText() + "'";
                    } else {
                        rs = con.getQuery("SELECT * FROM PEMILIK_KOST WHERE id_pemilik ='" + boxID.getText() + "'");
                        if(rs.next()) {
                            msg.msgWarning("No KTP " + boxID.getText() + " sudah terdaftar");
                        } else {
                            sql = "INSERT INTO USER SET "
                                + "username ='" + boxUsername.getText() + "', "
                                    + "password ='" + boxPassword.getText() + "', "
                                        + "pertanyaan ='" + boxPertanyaan.getSelectedItem()+ "', "
                                            + "jawaban ='" + boxJawaban.getText() + "', "
                                                + "level ='Pemilik Kost', "
                                                    + "id_user ='" + boxID.getText() + "'";
                            sql1 = "INSERT INTO PEMILIK_KOST SET "
                                    + "nama_pemilik ='" + boxNama.getText() + "', "
                                        + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                            + "no_telp ='" + boxNo.getText() + "', "
                                                + "alamat ='" + boxAlamat.getText() + "', "
                                                    + "id_pemilik ='" + boxID.getText() + "'";
                        }
                    }
                    con.setExecute(sql);
                    con.setExecute(sql1);
    //                kosongkan();
                    this.dispose();
                }
            }
        } catch (Exception e) {
            msg.msgError("Error simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onLihatPasswd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLihatPasswd
        if(cbPass.isSelected()) {
            boxPassword.setEchoChar((char)0);
        } else {
            boxPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_onLihatPasswd

    private void onValidateUsername(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateUsername
        char c = evt.getKeyChar();
        if(boxUsername.getText().length() > 19) {
            msg.msgWarning("Username terlalu panjang!");
            evt.consume();
        } else {
            if(c == KeyEvent.VK_SPACE) {
                msg.msgWarning("Username tidak boleh terdapat spasi!");
                evt.consume();
            }
        }
    }//GEN-LAST:event_onValidateUsername

    private void boxJawabanonValidateJawaban(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxJawabanonValidateJawaban
        if(boxJawaban.getText().length() > 25) {
            msg.msgWarning("jawaban terlalu panjang!");
            evt.consume();
        } else {
            valid.validChar(evt);
        }
    }//GEN-LAST:event_boxJawabanonValidateJawaban

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAddTuanKost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAddTuanKost dialog = new DialogAddTuanKost(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField boxJawaban;
    private javax.swing.JComboBox<String> boxJenis;
    private javax.swing.JTextField boxNama;
    private javax.swing.JTextField boxNo;
    private javax.swing.JPasswordField boxPassword;
    private javax.swing.JComboBox<String> boxPertanyaan;
    private javax.swing.JTextField boxUsername;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JCheckBox cbPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
