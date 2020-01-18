package Admin.Dialog.Buku;

import Admin.Dialog.Pilih.DialogPilihKost;
import Admin.Dialog.Pilih.DialogPilihPenghuni;
import Admin.Dialog.Pilih.DialogPilihTamu;
import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import datechooser.beans.DateChooserCombo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;

public class DialogAddBukuTamu extends javax.swing.JDialog {

    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private String idKost = "";
    private ResultSet rs;
    
    public DialogAddBukuTamu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showJam(jmKunjung);
        showJam(jmPulang);
        showMenit(mnKunjung);
        showMenit(mnPulang);
        if(!idKost.equals("")) {
            boxIDBuku.setText(idKost + getDate());
        }
    }
    
    public final void showJam(JComboBox box) {
        for(int i = 1; i < 24; i++) {
            box.addItem(String.format("%02d", i));
        }
        box.setSelectedItem(getHour());
    }
    
    public final void showMenit(JComboBox box) {
        for(int i = 1; i < 60; i++) {
            box.addItem(String.format("%02d", i));
        }
        box.setSelectedItem(getMinute());
    }
    
    private Date getDate(DateChooserCombo box, JComboBox jam, JComboBox menit) throws ParseException {
        String dates = new SimpleDateFormat("yyyy-MM-dd")
                .format(box.getSelectedDate().getTime()) + "/" 
                    + jam.getSelectedItem() + ":" + menit.getSelectedItem();
        return new SimpleDateFormat("yyyy-MM-dd/HH:mm").parse(dates);
    }
    
    private String getDateSql(Date date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
    }
    
    private String getDate() {
        return new SimpleDateFormat("ddMMyy").format(new Date());
    }
    
    private String getHour() {
        return new SimpleDateFormat("HH").format(new Date());
    }
    
    private String getMinute() {
        return new SimpleDateFormat("mm").format(new Date());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        boxIDTamu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxIDBuku = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        boxIDKost = new javax.swing.JTextField();
        boxIDPenghuni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxAgenda = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        mnKunjung = new javax.swing.JComboBox<>();
        jmKunjung = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        boxDateKunjung = new datechooser.beans.DateChooserCombo();
        jPanel4 = new javax.swing.JPanel();
        mnPulang = new javax.swing.JComboBox<>();
        jmPulang = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        boxDateKeluar = new datechooser.beans.DateChooserCombo();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Add Buku Tamu");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_7_120.png"))); // NOI18N
        jLabel1.setText(" FORM ADD BUKU TAMU");

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

        jLabel2.setText("ID Buku");

        jLabel8.setBackground(new java.awt.Color(254, 254, 254));
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 175, 134)));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihPenghuni(evt);
            }
        });

        jLabel4.setText("ID Penghuni");

        jLabel5.setText("ID Tamu");

        boxIDBuku.setEditable(false);

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

        boxIDPenghuni.setEditable(false);

        jLabel10.setText("Agenda Tamu");

        boxAgenda.setColumns(8);
        boxAgenda.setRows(2);
        boxAgenda.setTabSize(2);
        jScrollPane1.setViewportView(boxAgenda);

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

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Waktu Kunjung", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11))); // NOI18N

        mnKunjung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        mnKunjung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmKunjung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        jmKunjung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(":");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jmKunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(mnKunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boxDateKunjung, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(boxDateKunjung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmKunjung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnKunjung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Waktu Keluar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11))); // NOI18N

        mnPulang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        mnPulang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmPulang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00" }));
        jmPulang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(":");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jmPulang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(mnPulang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boxDateKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(boxDateKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmPulang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnPulang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel11.setBackground(new java.awt.Color(254, 254, 254));
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 175, 134)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihTamu(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxIDBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxIDKost, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boxIDTamu, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxIDPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxIDBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boxIDKost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxIDPenghuni, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(boxIDTamu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

        setSize(new java.awt.Dimension(794, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxIDKost.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih id kost");
                boxIDKost.requestFocus();
            } else if(boxIDPenghuni.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih id penghuni");
                boxIDPenghuni.requestFocus();
            } else if(boxIDTamu.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih id tamu");
                boxIDTamu.requestFocus();
            } else if(boxAgenda.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom agenda");
                boxAgenda.requestFocus();
            } else if(getDate(boxDateKunjung, jmKunjung, mnKunjung)
                    .compareTo(getDate(boxDateKeluar, jmPulang, mnPulang)) > 0) {
                msg.msgWarning("Waktu kunjung tidak boleh lebih besar dari waktu keluar");
            } else if(getDate(boxDateKunjung, jmKunjung, mnKunjung)
                    .compareTo(getDate(boxDateKeluar, jmPulang, mnPulang)) == 0) {
                msg.msgWarning("Waktu kunjung tidak boleh sama dengan waktu keluar");
            } else {
                rs = con.getQuery("SELECT * FROM BUKU_TAMU WHERE id_buku_tamu ='" + boxIDBuku.getText() + "'");
                if(!rs.next()) {
                    con.setExecute("INSERT INTO BUKU_TAMU VALUES('"
                        + boxIDBuku.getText() + "','"
                            + boxIDKost.getText() + "')");
                }
                
                rs = con.getQuery("SELECT * FROM BUKU_DETAIL_TAMU WHERE "
                    + "id_buku_tamu ='" + boxIDBuku.getText() + "' AND "
                        + "id_tamu ='" + boxIDTamu.getText() + "' AND "
                            + "id_penghuni ='" + boxIDPenghuni.getText() + "' AND "
                                + "status ='Masuk'");
                if(rs.next()) {
                    msg.msgWarning("Tamu tersebut sudah terdaftar!");
                } else {
                    con.setExecute("INSERT INTO BUKU_DETAIL_TAMU VALUES('"
                        + boxIDBuku.getText() + "','"
                            + boxIDTamu.getText() + "','"
                                + boxIDPenghuni.getText() + "','"
                                    + boxAgenda.getText() + "','"                
                                        + getDateSql(getDate(boxDateKunjung, jmKunjung, mnKunjung)) + "','"                
                                            + getDateSql(getDate(boxDateKeluar, jmPulang, mnPulang)) + "','"                
                                                + "Masuk')" );
                    this.dispose();
                }
            }
        } catch (SQLException | ParseException e) {
            msg.msgError("Error simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onPilihKost(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihKost
        new DialogPilihKost(null, true).setVisible(true);
        if(!TempData.getId1().isEmpty()) {
            boxIDKost.setText(TempData.getId1());
            idKost = TempData.getId1().substring(2);
            boxIDBuku.setText(idKost + getDate());
            boxIDPenghuni.setText("");
        }
        TempData.setId1("");
    }//GEN-LAST:event_onPilihKost

    private void onPilihPenghuni(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihPenghuni
        if(boxIDKost.getText().isEmpty()) {
            msg.msgWarning("Mohon pilih kost terlebih dahulu!");
        } else {
            new DialogPilihPenghuni(null, true, boxIDKost.getText()).setVisible(true);
            if(!TempData.getId().isEmpty()) {
                boxIDPenghuni.setText(TempData.getId());
            }
            TempData.setId("");
        }
    }//GEN-LAST:event_onPilihPenghuni

    private void onPilihTamu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihTamu
        new DialogPilihTamu(null, true).setVisible(true);
        if(!TempData.getId2().isEmpty()) {
            boxIDTamu.setText(TempData.getId2());
        }
        TempData.setId2("");
    }//GEN-LAST:event_onPilihTamu

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAddBukuTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogAddBukuTamu dialog = new DialogAddBukuTamu(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextArea boxAgenda;
    private datechooser.beans.DateChooserCombo boxDateKeluar;
    private datechooser.beans.DateChooserCombo boxDateKunjung;
    private javax.swing.JTextField boxIDBuku;
    private javax.swing.JTextField boxIDKost;
    private javax.swing.JTextField boxIDPenghuni;
    private javax.swing.JTextField boxIDTamu;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jmKunjung;
    private javax.swing.JComboBox<String> jmPulang;
    private javax.swing.JComboBox<String> mnKunjung;
    private javax.swing.JComboBox<String> mnPulang;
    // End of variables declaration//GEN-END:variables
}
