package Admin.Dialog.Master;

import Library.ImageControl;
import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import Library.Validasi;
import datechooser.beans.DateChooserCombo;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DialogAddPenghuniKost extends javax.swing.JDialog {
    
    private ImageControl image1 = new ImageControl();
    private ImageControl image2 = new ImageControl();
    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private final Validasi valid = new Validasi();
    private Calendar cal;
    private String date, sql1;
    private ResultSet rs;

    public DialogAddPenghuniKost(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showDetail();
    }
    
    private void showDetail() {
        try {
            if(TempData.getStatus()) {
                rs = con.getQuery("SELECT * FROM PENGHUNI_KOST WHERE "
                        + "id_penghuni ='" + TempData.getId() + "'");
                if(rs.next()) {
                    boxID.setText(rs.getString(1));
                    boxNama.setText(rs.getString(2));
                    boxAgama.setSelectedItem(rs.getString(3));
                    cal = new GregorianCalendar(1900 + rs.getDate(4).getYear(), rs.getDate(4).getMonth(), rs.getDate(4).getDate());
                    boxTanggal.setSelectedDate(cal);
                    boxJenis.setSelectedItem(rs.getString(5));
                    boxNo.setText(rs.getString(6));
                    boxAlamat.setText(rs.getString(7));
                    fotoKtp.setIcon(image1.resizeImage(null, rs.getBytes(8), 200, 200));
                    fotoPenghuni.setIcon(image2.resizeImage(null, rs.getBytes(9), 200, 200));
                    date = rs.getString(4);
                }
                boxID.setEditable(false);
                btnSimpan.setText("Ubah");
            }
        } catch (Exception e) {
            msg.msgError("Error Show Detail : " + e.getMessage());
        }
    }
        
    private Date getDate(DateChooserCombo box) throws ParseException {
        String dates = new SimpleDateFormat("yyyy-MM-dd")
                .format(box.getSelectedDate().getTime());
        return new SimpleDateFormat("yyyy-MM-dd").parse(dates);
    }
    
    private String getDateSql(Date date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
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
        jLabel6 = new javax.swing.JLabel();
        boxJenis = new javax.swing.JComboBox<>();
        boxNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
        boxAlamat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fotoKtp = new javax.swing.JLabel();
        fotoPenghuni = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        boxTanggal = new datechooser.beans.DateChooserCombo();
        boxAgama = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Penghuni Kost");
        setBackground(new java.awt.Color(254, 254, 254));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_5_120.png"))); // NOI18N
        jLabel1.setText(" FORM ADD PENGHUNI KOST");

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
        jLabel2.setText("ID Penghuni Kost (KTP)");

        boxID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateKtp(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                onCekPenghuni(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel3.setText("Nama Penghuni");

        boxNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateNama(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel5.setText("Agama");

        jLabel6.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel6.setText("Tanggal Lahir");

        boxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Pria", "Wanita" }));
        boxJenis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boxNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateNo(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel7.setText("No Telp");

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

        jLabel10.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel10.setText("Alamat");

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        fotoKtp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_home_200.png"))); // NOI18N

        fotoPenghuni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_home_200.png"))); // NOI18N

        jLabel12.setForeground(new java.awt.Color(2, 175, 134));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("upload");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihKtp(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(2, 175, 134));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("upload");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihPengghni(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lohit Devanagari", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("FOTO KTP");

        jLabel15.setFont(new java.awt.Font("Lohit Devanagari", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("FOTO PENGHUNI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fotoKtp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fotoPenghuni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxTanggal.setFormat(1);
        boxTanggal.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
        boxTanggal.setLocale(new java.util.Locale("in", "", ""));

        boxAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Agama", "Islam", "Hindu", "Budha", "Kristen", "Shinto", "Konghucu" }));
        boxAgama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxNo, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(boxAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(boxNama)
                            .addComponent(boxID, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(boxJenis, 0, 223, Short.MAX_VALUE)
                            .addComponent(boxTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxAgama, 0, 223, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxID)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boxTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(845, 545));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onPilihKtp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihKtp
        image1.showImage(fotoKtp, 200, 200);
    }//GEN-LAST:event_onPilihKtp

    private void onPilihPengghni(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihPengghni
        image2.showImage(fotoPenghuni, 200, 200);
    }//GEN-LAST:event_onPilihPengghni

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

    private void onValidateNo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateNo
        if(boxNo.getText().length() > 12) {
            msg.msgWarning("No Telpon maksimal 13 angka");
            evt.consume();
        } else {
            valid.validInt(evt);
        }
    }//GEN-LAST:event_onValidateNo

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxID.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom id penghuni \"NO KTP\"");
                boxID.requestFocus();
            } else if(boxNama.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom nama");
                boxNama.requestFocus();
            } else if(boxJenis.getSelectedIndex() == 0) {
                msg.msgWarning("Mohon pilih jenis kelamin");
                boxJenis.requestFocus();
            } else if(boxAgama.getSelectedIndex() == 0) {
                msg.msgWarning("Mohon pilih agama");
                boxAgama.requestFocus();
            } else if(boxNo.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom no telpon");
                boxNo.requestFocus();
            } else if(boxAlamat.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom alamat");
                boxAlamat.requestFocus();
            } else if(boxTanggal.getText().equals(new Date().getDate())) {
                msg.msgWarning("Mohon pilih tanggal lahir");
                boxTanggal.requestFocus();
            } else if(boxID.getText().length() < 16) {
                msg.msgWarning("No KTP harus 16 angka");
                boxID.requestFocus();
            } else {
                if(TempData.getStatus()) {
                    sql1 = "UPDATE PENGHUNI_KOST SET "
                            + "nama_penghuni ='" + boxNama.getText() + "', "
                                + "agama ='" + boxAgama.getSelectedItem() + "', "
                                    + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                        + "tanggal_lahir ='" + getDateSql(getDate(boxTanggal)) + "', "
                                            + "no_telp ='" + boxNo.getText() + "', "
                                                + "alamat ='" + boxAlamat.getText() + "' "
                                                    + "WHERE id_penghuni ='" + boxID.getText() + "'";
                    if(image1.getPath() != null) {
                        con.updateImage(image1.getFile(), "foto_ktp", boxID.getText());
                    }

                    if(image2.getPath() != null) {
                        con.updateImage(image2.getFile(), "foto_anggota", boxID.getText());
                    }
                    
                    con.setExecute(sql1);
                    this.dispose();
                } else {
                    rs = con.getQuery("SELECT * FROM PENGHUNI_KOST WHERE id_penghuni ='" + boxID.getText() + "'");
                    if(rs.next()) {
                        msg.msgWarning("No KTP " + boxID.getText() + " sudah terdaftar");
                    } else {
                        
                        
                        if(image1.getPath() == null) {
                            msg.msgWarning("Mohon pilih foto KTP!");
                        } else if(image2.getPath() == null) {
                            msg.msgWarning("Mohon pilih foto ANGGOTA!");
                        } else {
                            sql1 = "INSERT INTO PENGHUNI_KOST SET "
                                + "nama_penghuni ='" + boxNama.getText() + "', "
                                    + "agama ='" + boxAgama.getSelectedItem() + "', "
                                        + "jenis_kelamin ='" + boxJenis.getSelectedItem() + "', "
                                            + "tanggal_lahir ='" + getDateSql(getDate(boxTanggal)) + "', "
                                                + "no_telp ='" + boxNo.getText() + "', "
                                                    + "alamat ='" + boxAlamat.getText() + "', "
                                                        + "id_penghuni ='" + boxID.getText() + "'";

                            con.setExecute(sql1);
                            con.updateImage(image1.getFile(), "foto_ktp", boxID.getText());
                            con.updateImage(image2.getFile(), "foto_anggota", boxID.getText());
                            this.dispose();
                            
                        }
                    }
                }
            }
        } catch (Exception e) {
            msg.msgError("Error simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onCekPenghuni(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCekPenghuni
        try {
            rs = con.getQuery("SELECT * FROM BLACKLIST WHERE id_tersangka ='" + boxID.getText() + "'");
            if(rs.next()) {
                msg.msgWarning("MAAF NO KTP " + boxID.getText() + " TERINDIKASI KASUS!!! "
                        + "\nANDA TIDAK DIPERBOLEHKAN MENDAFTAR MENJADI PENGHUNI KOST BARU");
                this.dispose();
            }
        } catch (Exception e) {
            msg.msgError("Error cek tamu : " + e.getMessage());
        }
    }//GEN-LAST:event_onCekPenghuni

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAddPenghuniKost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAddPenghuniKost dialog = new DialogAddPenghuniKost(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField boxNama;
    private javax.swing.JTextField boxNo;
    private datechooser.beans.DateChooserCombo boxTanggal;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel fotoKtp;
    private javax.swing.JLabel fotoPenghuni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
