package Admin.Panel.Buku;

import Admin.Dialog.Buku.DialogAddBukuPenghuniKost;
import Library.Koneksi;
import Library.Message;
import Library.TempData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PnlBukuPenghuniKost extends javax.swing.JPanel {

    private final Message msg = new Message();
    private final Koneksi con = new Koneksi();
    private String id = "", idk = "", namaPenghuni = "", namaKost = "", prefix;
    private ResultSet rs;
    private boolean isFound = false;
    
    private final ArrayList<String> idPenghuni = new ArrayList<>();
    private final ArrayList<String> idKost = new ArrayList<>();

    private final String header[] = {
        "ID Penghuni", "ID Kost", "Nama Penghuni", "Nama Kost", "Tanggal Masuk", "Tanggal Keluar"
    };

    public PnlBukuPenghuniKost() {
        initComponents();
        prefix = "SELECT * FROM VIEW_BUKU_PENGHUNI_KOST WHERE ";
        showTabel("");
        cekOntime();
    }
    
    public PnlBukuPenghuniKost(String id) {
        initComponents();
        prefix = "SELECT * FROM VIEW_BUKU_PENGHUNI_KOST_RT WHERE id_ketua_rt ='" + id + "' AND ";
        showTabel("");
        cekOntime();
    }

    private void showTabel(String key) {
        try {
            String sql = prefix
                + "status ='Verifikasi' AND ("
                    + "id_penghuni LIKE '%" + key + "%' OR "
                        + "id_kost LIKE '%" + key + "%' OR "
                            + "nama_penghuni LIKE '%" + key + "%' OR "
                                + "nama_kost LIKE '%" + key + "%' OR "
                                    + "tanggal_masuk LIKE '%" + key + "%' OR "
                                        + "tanggal_keluar LIKE '%" + key + "%')";
            con.showTabel(tabel, header, sql);
            tabel.getColumnModel().getColumn(0).setMinWidth(150);
            tabel.getColumnModel().getColumn(1).setMinWidth(100);
            tabel.getColumnModel().getColumn(2).setMinWidth(225);
            tabel.getColumnModel().getColumn(3).setMinWidth(225);
            tabel.getColumnModel().getColumn(4).setMinWidth(150);
            tabel.getColumnModel().getColumn(5).setMinWidth(150);
        } catch (Exception e) {
            msg.msgError("Error show tabel : " + e.getMessage());
        }

    }
    
    private void clearArray() {
        this.idPenghuni.clear();
        this.idKost.clear();
    }
    
    private void addArray(String idPel, String idKost) {
        clearArray();
        this.idPenghuni.add(idPel);
        this.idKost.add(idKost);
    }

    /*
    
    Cek otomatis untuk penghuni yang 
    memiliki tempo tanggal keluar sama dengan tanggal sekarang.
    dan otomatis dikeluarkan pada jam 23:59
    
    */
    
    private void cekOntime() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    if(getTimeNow().equals("23:59")) {
                        try {
                            rs = con.getQuery("SELECT * FROM BUKU_PENGHUNI_KOST WHERE tanggal_keluar ='" + getDateNow() + "'");
                            while (rs.next()) {
                                addArray(rs.getString(1), rs.getString(2));
                                isFound = true;
                            }
                            if(isFound) {
                                for(int i = 0; i < idKost.size(); i++) {
                                    con.setExecute("INSERT INTO LOG_BUKU_PENGHUNI_KOST SELECT * FROM BUKU_PENGHUNI_KOST WHERE "
                                            + "id_penghuni ='" + idPenghuni.get(i) + "' AND id_kost ='" + idKost.get(i) + "'");
                                    con.setExecute("DELETE FROM BUKU_PENGHUNI_KOST WHERE "
                                            + "id_penghuni ='" + idPenghuni.get(i) + "' AND id_kost ='" + idKost.get(i) + "'");
                                }
                                showTabel("");
                            }
                        } catch (SQLException e) {
                            msg.msgError("Error Query : " + e.getMessage());
                        }
                    } else {
                        try {
                            Thread.sleep(15000);;
                        } catch (InterruptedException e) {
                            msg.msgError("Error : " + e.getMessage());
                        }
                    }
                } 
            }
        });
        thread.start();
    }
    
//    private void cekOntime() {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        isFound = false;
//                        clearArray();
//                        Thread.sleep(5000);
//                        if(!getTimeNow().equals("23:59")) {
//                            rs = con.getQuery("SELECT id_penghuni, id_kost, DATEDIFF(tanggal_keluar, '" + getDateNow() + "') FROM BUKU_PENGHUNI_KOST");
//                            while (rs.next()) {
//                                if(rs.getInt(3) < 0) {
//                                    addArray(rs.getString(1), rs.getString(2));
//                                }
//                                isFound = true;
//                            }
//                            if(isFound) {
//                                System.out.println(idPenghuni);
//                                for(int i = 0; i < idKost.size(); i++) {
//                                    con.setExecute("INSERT INTO LOG_BUKU_PENGHUNI_KOST SELECT * FROM BUKU_PENGHUNI_KOST WHERE "
//                                            + "id_penghuni ='" + idPenghuni.get(i) + "' AND id_kost ='" + idKost.get(i) + "'");
//                                    con.setExecute("DELETE FROM BUKU_PENGHUNI_KOST WHERE "
//                                            + "id_penghuni ='" + idPenghuni.get(i) + "' AND id_kost ='" + idKost.get(i) + "'");
//                                }
//                                try {
//                                    
//                                    showTabel("");
//                                } catch (Exception e) {
//                                    msg.msgError(e.getMessage());
//                                }
//                            }
//                        } else {
//                            rs = con.getQuery("SELECT * FROM BUKU_PENGHUNI_KOST WHERE tanggal_keluar ='" + getDateNow() + "'");
//                            while (rs.next()) {
//                                addArray(rs.getString(1), rs.getString(2));
//                                isFound = true;
//                            }
//                            if(isFound) {
//                                for(int i = 0; i < idKost.size(); i++) {
//                                    con.setExecute("INSERT INTO LOG_BUKU_PENGHUNI_KOST SELECT * FROM BUKU_PENGHUNI_KOST WHERE "
//                                            + "id_penghuni ='" + idPenghuni.get(i) + "' AND id_kost ='" + idKost.get(i) + "'");
//                                    con.setExecute("DELETE FROM BUKU_PENGHUNI_KOST WHERE "
//                                            + "id_penghuni ='" + idPenghuni.get(i) + "' AND id_kost ='" + idKost.get(i) + "'");
//                                }
//                                showTabel("");
//                            }
//                        }
//                    } catch (Exception e) {
//                        msg.msgError("Error Query : " + e.getMessage());
//                    }
//                }
//
//            }
//        });
//        thread.start();
//    }

    private String getDateNow() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    private String getTimeNow() {
        return new SimpleDateFormat("HH:mm").format(new Date());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambah = new javax.swing.JLabel();
        btnUbah = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        boxCari = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnClose = new javax.swing.JLabel();
        btnHapus1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

        btnTambah.setBackground(new java.awt.Color(22, 160, 133));
        btnTambah.setForeground(new java.awt.Color(254, 254, 254));
        btnTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_tambah.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTambah.setOpaque(true);
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onTambah(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(22, 160, 133));
        btnUbah.setForeground(new java.awt.Color(254, 254, 254));
        btnUbah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_edit.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbah.setOpaque(true);
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onUbah(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(22, 160, 133));
        btnHapus.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_hapus.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus.setOpaque(true);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onHapus(evt);
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

        btnClose.setBackground(new java.awt.Color(22, 160, 133));
        btnClose.setForeground(new java.awt.Color(254, 254, 254));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/22.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setOpaque(true);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onClose(evt);
            }
        });

        btnHapus1.setBackground(new java.awt.Color(22, 160, 133));
        btnHapus1.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_keluar.png"))); // NOI18N
        btnHapus1.setText("Keluarkan");
        btnHapus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus1.setOpaque(true);
        btnHapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onKeluar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(boxCari, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClose
        getParent().remove(this);
    }//GEN-LAST:event_onClose

    private void onTambah(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onTambah
        TempData.setStatus(false);
        new DialogAddBukuPenghuniKost(null, true).setVisible(true);
        showTabel("");
        id = "";
        idk = "";
    }//GEN-LAST:event_onTambah

    private void onReload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onReload
        showTabel("");
        boxCari.setText("");
    }//GEN-LAST:event_onReload

    private void onCari(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCari
        showTabel(boxCari.getText());
    }//GEN-LAST:event_onCari

    private void onUbah(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onUbah
        try {
            if (id.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan diubah!");
            } else {
                TempData.setId(id);
                TempData.setId1(idk);
                TempData.setStatus(true);
                new DialogAddBukuPenghuniKost(null, true).setVisible(true);
                id = "";
                idk = "";
            }
            showTabel("");
        } catch (Exception e) {
            msg.msgError("Error ubah : " + e.getMessage());
        }
    }//GEN-LAST:event_onUbah

    private void onHapus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHapus
        try {
            if (id.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan hapus!");
            } else {
                int i = msg.msgQuestion("Apakah anda yakin ingin menghapus data "
                        + namaPenghuni + " pada kost " + namaKost + " ?");
                if (i == JOptionPane.YES_OPTION) {
                    con.setExecute("DELETE FROM BUKU_PENGHUNI_KOST WHERE "
                            + "id_penghuni ='" + id + "' AND id_kost ='" + idk + "'");
                }
            }
            this.id = "";
            showTabel("");
        } catch (Exception e) {
            msg.msgError("Error hapus : " + e.getMessage());
        }
    }//GEN-LAST:event_onHapus

    private void onPilihTabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihTabel
        try {
            id = tabel.getValueAt(tabel.getSelectedRow(), 0).toString();
            idk = tabel.getValueAt(tabel.getSelectedRow(), 1).toString();
            namaPenghuni = tabel.getValueAt(tabel.getSelectedRow(), 2).toString();
            namaKost = tabel.getValueAt(tabel.getSelectedRow(), 3).toString();
        } catch (Exception e) {
            id = "";
            System.err.println("Error pilih tabel : " + e.getMessage());
        }
    }//GEN-LAST:event_onPilihTabel

    private void onKeluar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onKeluar
        try {
            if (id.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan dikeluarkan!");
            } else {
                int i = msg.msgQuestion("Apakah anda yakin ingin mengeluarkan penghuni "
                        + namaPenghuni + " dari kost " + namaKost + " ?");
                if (i == JOptionPane.YES_OPTION) {
                    con.setExecute("INSERT INTO LOG_BUKU_PENGHUNI_KOST SELECT id_penghuni, "
                            + "id_kost, tanggal_masuk, tanggal_keluar FROM BUKU_PENGHUNI_KOST WHERE "
                            + "id_penghuni ='" + id + "' AND id_kost ='" + idk + "'");
                    con.setExecute("DELETE FROM BUKU_PENGHUNI_KOST WHERE "
                            + "id_penghuni ='" + id + "' AND id_kost ='" + idk + "'");
                }
            }
            showTabel("");
        } catch (Exception e) {
            msg.msgError("Error hapus : " + e.getMessage());
        }
    }//GEN-LAST:event_onKeluar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCari;
    private static javax.swing.JLabel btnClose;
    private static javax.swing.JLabel btnHapus;
    private static javax.swing.JLabel btnHapus1;
    private static javax.swing.JLabel btnReload;
    private static javax.swing.JLabel btnTambah;
    private static javax.swing.JLabel btnUbah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
