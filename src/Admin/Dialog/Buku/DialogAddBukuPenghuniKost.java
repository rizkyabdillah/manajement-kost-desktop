package Admin.Dialog.Buku;

import Admin.Dialog.Pilih.DialogPilihKost;
import Admin.Dialog.Pilih.DialogPilihPenghuni;
import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import datechooser.beans.DateChooserCombo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DialogAddBukuPenghuniKost extends javax.swing.JDialog {

    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private String sql, idKost = "", idPenghuni = "", jkP, jkK;
    private ResultSet rs;
    
    public DialogAddBukuPenghuniKost(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        boxTanggalMasuk.setSelectedDate(new GregorianCalendar(
                1900 + new Date().getYear(), 
                    new Date().getMonth(), 
                        new Date().getDate() - 1
        ));
        showDetail();
    }
    
    private void showDetail() {
        try {
            if(TempData.getStatus()) {
                rs = con.getQuery("SELECT * FROM BUKU_PENGHUNI_KOST WHERE "
                        + "id_penghuni ='" + TempData.getId() + "' AND "
                                + "id_kost ='" + TempData.getId1() + "'");
                if(rs.next()) {
                    boxIDPenghuni.setText(rs.getString(1));
                    idPenghuni = rs.getString(1);
                    
                    boxIDKost.setText(rs.getString(2));
                    idKost = rs.getString(2);
                    
                    Calendar cal1 = new GregorianCalendar(1900 + rs.getDate(3).getYear(), rs.getDate(3).getMonth(), rs.getDate(3).getDate());
                    boxTanggalMasuk.setSelectedDate(cal1);
                    Calendar cal2 = new GregorianCalendar(1900 + rs.getDate(4).getYear(), rs.getDate(4).getMonth(), rs.getDate(4).getDate());
                    boxTanggalKeluar.setSelectedDate(cal2);
                }
                setGenderP(idPenghuni);
                setGenderK(idKost);
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
    
    private Date getDateNow() {
        return new Date(new Date().getYear(), new Date().getMonth(), new Date().getDate());
    }
        
    private void setGenderK(String id) {
        try {
            rs = con.getQuery("SELECT jenis_kost FROM KOST WHERE id_kost ='" + id + "'");
            if(rs.next()) {
                jkK = rs.getString(1);
            }
        } catch (SQLException e) {
            msg.msgError("Error getGender : " + e.getMessage());
        }
    }
    
    private void setGenderP(String id) {
        try {
            rs = con.getQuery("SELECT jenis_kelamin FROM PENGHUNI_KOST WHERE id_penghuni ='" + id + "'");
            if(rs.next()) {
                jkP = rs.getString(1);
            }
        } catch (SQLException e) {
            msg.msgError("Error getGender : " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxIDKost = new javax.swing.JTextField();
        boxTanggalMasuk = new datechooser.beans.DateChooserCombo();
        btnSimpan = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        boxIDPenghuni = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        boxTanggalKeluar = new datechooser.beans.DateChooserCombo();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Add Buku Riwayat Kost");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_8_120.png"))); // NOI18N
        jLabel1.setText(" FORM ADD BUKU PENGHUNI KOST");

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

        jLabel4.setText("Tanggal Masuk");

        jLabel3.setText("ID Kost");

        jLabel7.setBackground(new java.awt.Color(254, 254, 254));
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 175, 134)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihKost(evt);
            }
        });

        boxIDKost.setEditable(false);

        boxTanggalMasuk.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(48, 48, 48),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(48, 48, 48),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(48, 48, 48),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(48, 48, 48),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    boxTanggalMasuk.setLocale(new java.util.Locale("in", "", ""));
    boxTanggalMasuk.setNavigateFont(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 11));
    boxTanggalMasuk.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_PERIOD);
    boxTanggalMasuk.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
        public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
            onPilihTglMasuk(evt);
        }
    });

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

    jLabel14.setBackground(new java.awt.Color(254, 254, 254));
    jLabel14.setForeground(new java.awt.Color(254, 254, 254));
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
    jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 175, 134)));
    jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jLabel14.setOpaque(true);
    jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            onPilihPenghuni(evt);
        }
    });

    boxIDPenghuni.setEditable(false);

    jLabel15.setText("ID Penghuni");

    boxTanggalKeluar.setLocale(new java.util.Locale("in", "", ""));
    boxTanggalKeluar.setNavigateFont(new java.awt.Font("Lohit Devanagari", java.awt.Font.PLAIN, 11));
    boxTanggalKeluar.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
        public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
            onPilihTglKeluar(evt);
        }
    });

    jLabel16.setText("Tanggal Keluar");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(boxIDPenghuni)
                    .addGap(1, 1, 1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boxIDKost)
                            .addGap(41, 41, 41))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boxTanggalMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(boxTanggalKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxIDPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxIDKost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(boxTanggalMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(boxTanggalKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    setSize(new java.awt.Dimension(581, 423));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxIDPenghuni.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih ID Penghuni");
                boxIDPenghuni.requestFocus();
            } else if(boxIDKost.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih ID Kost");
                boxIDKost.requestFocus();
            } else if(!jkK.equals(jkP)) {
                msg.msgWarning("Kost " + jkK + " tidak boleh diisi oleh penghuni " + jkP);
            } else if(getDate(boxTanggalMasuk).compareTo(getDate(boxTanggalKeluar)) > 0) {
                msg.msgWarning("Tanggal masuk tidak boleh lebih besar dari tanggal keluar");
            } else if(getDate(boxTanggalKeluar).compareTo(getDate(boxTanggalMasuk)) < 0) {
                msg.msgWarning("Tanggal keluar tidak boleh lebih kecil dari tanggal masuk");
            } else {
                if(getDate(boxTanggalKeluar).compareTo(getDateNow()) < 0) {
                    if(!TempData.getStatus()) {
                        idPenghuni = boxIDPenghuni.getText();
                        idKost = boxIDKost.getText();
                    }
                    con.setExecute("INSERT INTO LOG_BUKU_PENGHUNI_KOST SET "
                                + "id_penghuni ='" + idPenghuni + "', "
                                    + "id_kost ='" + idKost + "', "
                                        + "tanggal_masuk ='" + getDateSql(boxTanggalMasuk) + "', "
                                            + "tanggal_keluar ='" + getDateSql(boxTanggalKeluar) + "'");
                    this.dispose();
                } else {
                    rs = con.getQuery("SELECT * FROM VIEW_BUKU_PENGHUNI_KOST WHERE "
                        + "id_penghuni ='" + boxIDPenghuni.getText() + "' AND "
                            + "id_kost ='" + boxIDKost.getText() + "'");
                    if(rs.next()) {
                        if(!idKost.equals(boxIDKost.getText())) {
                            msg.msgWarning("Data kost dengan nama "
                                    + rs.getString(3) + " dan bertempat kost di "
                                            + rs.getString(4) + " sudah terdaftar");
                        } else {
                            sql = "UPDATE BUKU_PENGHUNI_KOST SET "
                                    + "id_kost ='" + boxIDKost.getText() + "', "
                                        + "tanggal_masuk ='" + getDateSql(boxTanggalMasuk) + "', "
                                            + "tanggal_keluar ='" + getDateSql(boxTanggalKeluar) + "' "
                                                + "WHERE id_penghuni ='" + idPenghuni + "' AND "
                                                    + "id_kost ='" + idKost + "'";
                            con.setExecute(sql);
                            this.dispose();
                        }
                    } else {
                        if(TempData.getStatus()) {
                            sql = "UPDATE BUKU_PENGHUNI_KOST SET "
                                    + "id_kost ='" + boxIDKost.getText() + "', "
                                        + "tanggal_masuk ='" + getDateSql(boxTanggalMasuk) + "', "
                                            + "tanggal_keluar ='" + getDateSql(boxTanggalKeluar) + "' "
                                                + "WHERE id_penghuni ='" + idPenghuni + "' AND "
                                                    + "id_kost ='" + idKost + "'";
                        } else {
                            sql = "INSERT INTO BUKU_PENGHUNI_KOST SET "
                                    + "id_penghuni ='" + boxIDPenghuni.getText() + "', "
                                        + "id_kost ='" + boxIDKost.getText() + "', "
                                            + "tanggal_masuk ='" + getDateSql(boxTanggalMasuk) + "', "
                                                + "tanggal_keluar ='" + getDateSql(boxTanggalKeluar) + "' ";
                        }
                        con.setExecute(sql);
                        this.dispose();
                    }
                }
            }
        } catch (Exception e) {
            msg.msgError("Error simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onPilihKost(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihKost
        new DialogPilihKost(null, true).setVisible(true);
         if(!TempData.getId1().isEmpty()) {
            boxIDKost.setText(TempData.getId1());
            setGenderK(TempData.getId1());
        }
        TempData.setId1("");
    }//GEN-LAST:event_onPilihKost

    private void onPilihTglMasuk(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_onPilihTglMasuk
        try {
            if(getDate(boxTanggalMasuk).compareTo(getDate(boxTanggalKeluar)) > 0) {
                msg.msgWarning("Tanggal masuk tidak boleh lebih besar dari tanggal keluar");
            }
        } catch (ParseException ex) {
            Logger.getLogger(DialogAddBukuPenghuniKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onPilihTglMasuk

    private void onPilihPenghuni(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihPenghuni
        if(TempData.getStatus()) {
            msg.msgWarning("Anda tidak diperbolehkan memilih id penghuni disaat update");
        } else {
            new DialogPilihPenghuni(null, true).setVisible(true);
            if(!TempData.getId().isEmpty()) {
                boxIDPenghuni.setText(TempData.getId());
                setGenderP(TempData.getId());
            }
            TempData.setId("");
        }
    }//GEN-LAST:event_onPilihPenghuni

    private void onPilihTglKeluar(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_onPilihTglKeluar
        try {
            if(getDate(boxTanggalKeluar).compareTo(getDate(boxTanggalMasuk)) < 0) {
                msg.msgWarning("Tanggal keluar tidak boleh lebih kecil dari tanggal masuk");
            }
        } catch (ParseException ex) {
            Logger.getLogger(DialogAddBukuPenghuniKost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_onPilihTglKeluar

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAddBukuPenghuniKost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAddBukuPenghuniKost dialog = new DialogAddBukuPenghuniKost(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField boxIDKost;
    private javax.swing.JTextField boxIDPenghuni;
    private datechooser.beans.DateChooserCombo boxTanggalKeluar;
    private datechooser.beans.DateChooserCombo boxTanggalMasuk;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
