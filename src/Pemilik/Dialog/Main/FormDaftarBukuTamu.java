package Pemilik.Dialog.Main;

import Admin.Dialog.Master.DialogAddTamu;
import Admin.Dialog.Pilih.DialogPilihPenghuni;
import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import Library.Validasi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormDaftarBukuTamu extends javax.swing.JFrame {

    private final Message msg = new Message();
    private final Koneksi con = new Koneksi();
    private final Validasi valid = new Validasi();
    private String idBuku = "", nama;
    private int index = 0;
    private ArrayList<String> idTamu = new ArrayList<>();
    private ArrayList<String> idPenghuni = new ArrayList<>();
    private ResultSet rs;
    private String[] header = {
        "ID Tamu", "Nama Tamu", "Nama Penghuni", "Waktu Kunjung"
    };
    
    public FormDaftarBukuTamu() {
        initComponents();
        boxIDBuku.setText(TempData.getId2().substring(2) + getDate());
        boxNamaKost.setText(TempData.getNama());
        this.setExtendedState(MAXIMIZED_BOTH);
        showTabel("");
    }
    
    private String getDate() {
        return new SimpleDateFormat("ddMMyy").format(new Date());
    }
    
    private String getDateSql() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
    }
    
    private void showTabel(String key) {
        try {
            String sql = "SELECT id_tamu, nama_tamu, nama_penghuni, waktu_kunjung"
                + " FROM VIEW_BUKU_DETAIL_TAMU WHERE "
                    + "id_kost ='" + TempData.getId2() + "' AND "
                        + "status ='Masuk' AND ("
                            + "id_tamu LIKE '%" + key + "%' OR "
                                + "nama_tamu LIKE '%" + key + "%' OR "
                                    + "nama_penghuni LIKE '%" + key + "%' OR "
                                        + "waktu_kunjung LIKE '%" + key + "%')";
            addToArray();
            con.showTabel(tabel, header, sql);
            tabel.getColumnModel().getColumn(0).setMinWidth(150);
            tabel.getColumnModel().getColumn(1).setMinWidth(300);
            tabel.getColumnModel().getColumn(2).setMinWidth(300);
            tabel.getColumnModel().getColumn(3).setMinWidth(250);
        } catch (Exception e) {
            msg.msgError("Error show tabel : " + e.getMessage());
        }
    }
    
    private void kosongkan() {
        boxIDTamu.setText("");
        boxNamaTamu.setText("");
        boxIDPenghuni.setText("");
        boxAgenda.setText("");
        TempData.setId("");
        boxIDTamu.requestFocus();
    }
    
    private void addToArray() {
        try {
            idTamu.clear();
            idPenghuni.clear();
            rs = con.getQuery("SELECT * FROM VIEW_BUKU_DETAIL_TAMU WHERE "
                    + "id_kost ='" + TempData.getId2() + "' AND "
                        + "status ='Masuk'");
            while(rs.next()) {
                idBuku = rs.getString("id_buku_tamu");
                idTamu.add(rs.getString("id_tamu"));
                idPenghuni.add(rs.getString("id_penghuni"));
            }
        } catch (SQLException e) {
            msg.msgError("Error to array : " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnHapus2 = new javax.swing.JLabel();
        boxCari = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        boxIDBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        boxNamaKost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxIDTamu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        boxIDPenghuni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        boxNamaTamu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        boxAgenda = new javax.swing.JTextArea();
        btnHapus3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FORM MENU TAMU");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_7_150.png"))); // NOI18N
        jLabel1.setText("FORM DAFTAR BUKU TAMU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM DATA TAMU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPilihTabel(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        btnHapus2.setBackground(new java.awt.Color(22, 160, 133));
        btnHapus2.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_keluar.png"))); // NOI18N
        btnHapus2.setText("Keluar");
        btnHapus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus2.setOpaque(true);
        btnHapus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onKeluarkan(evt);
            }
        });

        boxCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onCari(evt);
            }
        });

        btnReload.setBackground(new java.awt.Color(22, 160, 133));
        btnReload.setForeground(new java.awt.Color(254, 254, 254));
        btnReload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_segarkan.png"))); // NOI18N
        btnReload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReload.setOpaque(true);
        btnReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onReload(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnHapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(boxCari, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxCari, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM DAFTAR TAMU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        boxIDBuku.setEditable(false);

        jLabel2.setText("ID Buku");

        boxNamaKost.setEditable(false);

        jLabel3.setText("Nama Kost");

        boxIDTamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCekID(evt);
            }
        });
        boxIDTamu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidateID(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                onCekTamu(evt);
            }
        });

        jLabel4.setText("ID Tamu");

        jLabel5.setFont(new java.awt.Font("Lohit Devanagari", 0, 10)); // NOI18N
        jLabel5.setText("*Enter");

        jLabel6.setText("ID Penghuni");

        boxIDPenghuni.setEditable(false);

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

        boxNamaTamu.setEditable(false);

        jLabel7.setText("Nama Tamu");

        jLabel9.setText("Agenda Tamu");

        boxAgenda.setColumns(8);
        boxAgenda.setRows(3);
        jScrollPane2.setViewportView(boxAgenda);

        btnHapus3.setBackground(new java.awt.Color(22, 160, 133));
        btnHapus3.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_simpan.png"))); // NOI18N
        btnHapus3.setText("Simpan");
        btnHapus3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus3.setOpaque(true);
        btnHapus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSimpan(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHapus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxIDBuku))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxNamaKost, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxIDPenghuni))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxIDTamu)))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxNamaTamu))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxIDBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxNamaKost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxIDTamu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxNamaTamu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(boxIDPenghuni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHapus3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        setSize(new java.awt.Dimension(1063, 701));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onKeluarkan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onKeluarkan
        try {
            if(idBuku.isEmpty()) {
                msg.msgWarning("Mohon pilih data yang akan dikeluarkan!");
            } else {
                int i = msg.msgQuestion("Apakah anda yakin " + nama + " ingin keluar dari kost " + boxNamaKost.getText() + " ?");
                if(i == JOptionPane.YES_OPTION) {
                    con.setExecute("UPDATE BUKU_DETAIL_TAMU SET status ='Keluar', "
                        + "waktu_pulang ='" + getDateSql() + "' "
                            + "WHERE id_buku_tamu ='" + idBuku + "' AND "
                                + "id_tamu ='" + idTamu.get(index) + "' AND "
                                    + "id_penghuni ='" + idPenghuni.get(index) + "'");

                    this.idBuku = "";
                    showTabel("");  
                }
            }
        } catch (Exception e) {
            msg.msgError("Error keluarkan : " + e.getMessage());
        }
    }//GEN-LAST:event_onKeluarkan

    private void onCari(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCari
        showTabel(boxCari.getText());
    }//GEN-LAST:event_onCari

    private void onReload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onReload
        showTabel("");
        boxCari.setText("");
    }//GEN-LAST:event_onReload

    private void onPilihPenghuni(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihPenghuni
        new DialogPilihPenghuni(this, true, TempData.getId2()).setVisible(true);
        boxIDPenghuni.setText(TempData.getId());
    }//GEN-LAST:event_onPilihPenghuni

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxIDTamu.getText().isEmpty()) {
                msg.msgWarning("Kolom ID Tamu tidak boleh kosong!");
                boxIDTamu.requestFocus();
            } else if(boxNamaTamu.getText().isEmpty()) {
                msg.msgWarning("Mohon isikan ID Tamu dengan benar!");
                boxIDTamu.requestFocus();
            } else if(boxIDPenghuni.getText().isEmpty()) {
                msg.msgWarning("Mohon pilih ID Penghuni!");
                boxIDPenghuni.requestFocus();
            } else if(boxAgenda.getText().isEmpty()) {
                msg.msgWarning("Kolom Agenda tidak boleh kosong!");
                boxAgenda.requestFocus();
            } else {
                rs = con.getQuery("SELECT * FROM TAMU WHERE id_tamu ='" + boxIDTamu.getText() + "'");
                if(!rs.next()) {
                    msg.msgWarning("ID Tamu tidak terdaftar!");
                    boxNamaTamu.setText("");
                } else {
                    rs = con.getQuery("SELECT * FROM BUKU_TAMU WHERE id_buku_tamu ='" + boxIDBuku.getText() + "'");
                    if(!rs.next()) {
                        con.setExecute("INSERT INTO BUKU_TAMU VALUES('" + boxIDBuku.getText() + "','" + TempData.getId2() + "')");
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
                                            + getDateSql() + "',null,'Masuk')");
                        kosongkan();
                        showTabel("");
                    }
                }
            }
        } catch (Exception e) {
            msg.msgError("Error onSimpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onCekID(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCekID
        try {
            if(boxIDTamu.getText().length() < 16) {
                msg.msgWarning("ID Harus 16 angka sesuai dengan ktp!");
            } else {
                boolean ketemu = true;
                while(ketemu) {
                    rs = con.getQuery("SELECT * FROM TAMU WHERE id_tamu ='" + boxIDTamu.getText() + "'");
                    if(rs.next()) {
                        boxNamaTamu.setText(rs.getString(2));
                        ketemu = false;
                    } else {
                        int i = msg.msgQuestion("ID Anda Belum Terdaftar \nApakah anda ingin mendaftarkan?");
                        if(i == JOptionPane.YES_OPTION) {
                            boxNamaTamu.setText("");
                            new DialogAddTamu(this, true, boxIDTamu.getText()).setVisible(true);
                        } else {
                            ketemu = false;
                        }
                    }
                }
            }
        } catch (Exception e) {
            msg.msgError("Error cek id : " + e.getMessage());
        }
    }//GEN-LAST:event_onCekID

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

    private void onValidateID(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidateID
        try {
            if(boxIDTamu.getText().length() > 15) {
//                msg.msgWarning("No KTP hanya boleh 16 angka");
                evt.consume();
            } else {
                valid.validInt(evt);
            }
        } catch (Exception e) {
            msg.msgError("Error validate : " + e.getMessage());
        }
    }//GEN-LAST:event_onValidateID

    private void onPilihTabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihTabel
        try {
            index = tabel.getSelectedRow();
            nama = tabel.getValueAt(index, 1).toString();
        } catch (Exception e) {
            idBuku = "";
            System.err.println("Error pilih tabel : " + e.getMessage());;
        }
    }//GEN-LAST:event_onPilihTabel

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDaftarBukuTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new FormDaftarBukuTamu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea boxAgenda;
    private javax.swing.JTextField boxCari;
    private javax.swing.JTextField boxIDBuku;
    private javax.swing.JTextField boxIDPenghuni;
    private javax.swing.JTextField boxIDTamu;
    private javax.swing.JTextField boxNamaKost;
    private javax.swing.JTextField boxNamaTamu;
    private static javax.swing.JLabel btnHapus2;
    private static javax.swing.JLabel btnHapus3;
    private javax.swing.JLabel btnReload;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
