package Admin.Panel.Buku;

import Admin.Dialog.Buku.DialogAddBukuTamu;
import Admin.Dialog.Buku.DialogDetailBukuTamu;
import Admin.Dialog.Buku.DialogFilterKost;
import Library.Koneksi;
import Library.Message;
import Library.TempData;
import Library.TempUser;
import javax.swing.JOptionPane;

public class PnlBukuTamu extends javax.swing.JPanel {
    
    private final Message msg = new Message();
    private final Koneksi con = new Koneksi();
    private String id = "", prefix, postfix = "", ids;

    private final String header[] = {
        "ID Buku Tamu", "Nama Kost"  
    };
    
    public PnlBukuTamu() {
        initComponents();
        prefix = "SELECT * FROM VIEW_BUKU_TAMU WHERE ";
        showTabel("");
    }
    
    public PnlBukuTamu(String id) {
        initComponents();
        this.ids = id;
        prefix = "SELECT * FROM VIEW_BUKU_TAMU_RT WHERE id_ketua_rt ='" + this.ids + "' AND (";
        postfix = ")";
        showTabel("");
    }
    
    private void showTabel(String key) {
        try {
            String sql = prefix
                    + "id_buku_tamu LIKE '%" + key + "%' OR "
                            + "nama_kost LIKE '%" + key + "%'" + postfix;
            con.showTabel(tabel, header, sql);
            tabel.getColumnModel().getColumn(0).setMinWidth(250);
            tabel.getColumnModel().getColumn(1).setMinWidth(750);
        } catch (Exception e) {
            msg.msgError("Error show tabel : " + e.getMessage());
        }
   
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTambah = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        boxCari = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnClose = new javax.swing.JLabel();
        btnHapus1 = new javax.swing.JLabel();
        btnHapus2 = new javax.swing.JLabel();

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
        btnHapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_masterdata.png"))); // NOI18N
        btnHapus1.setText("Lihat Detail");
        btnHapus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus1.setOpaque(true);
        btnHapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onLihatDetail(evt);
            }
        });

        btnHapus2.setBackground(new java.awt.Color(22, 160, 133));
        btnHapus2.setForeground(new java.awt.Color(254, 254, 254));
        btnHapus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHapus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_cari.png"))); // NOI18N
        btnHapus2.setText("Filter Kost");
        btnHapus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus2.setOpaque(true);
        btnHapus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onFIlter(evt);
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
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnHapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        new DialogAddBukuTamu(null, true).setVisible(true);
        showTabel("");
        id = "";
    }//GEN-LAST:event_onTambah

    private void onReload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onReload
        if (TempUser.getLevel().equals("Admin")) {
            prefix = "SELECT * FROM VIEW_BUKU_TAMU WHERE ";
            postfix = "";
        } else  {
            prefix = "SELECT * FROM VIEW_BUKU_TAMU_RT WHERE id_ketua_rt ='" + this.ids + "' AND (";
            postfix = ")";
        }
        showTabel("");
        boxCari.setText("");
        TempData.setId2("");
    }//GEN-LAST:event_onReload

    private void onCari(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCari
        showTabel(boxCari.getText());
    }//GEN-LAST:event_onCari

    private void onHapus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHapus
        try {
            if(id.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan hapus!");
            } else {
                int i = msg.msgQuestion("Apakah anda yakin ingin menghapus id tamu " + id + " ?");
                if(i == JOptionPane.YES_OPTION) {
                    con.setExecute("DELETE FROM BUKU_TAMU WHERE id_buku_tamu ='" + id + "'");
                }
            }
            showTabel("");
            this.id = "";
        } catch (Exception e) {
            msg.msgError("Error hapus : " + e.getMessage());
        }
    }//GEN-LAST:event_onHapus

    private void onPilihTabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihTabel
        try {
            id = tabel.getValueAt(tabel.getSelectedRow(), 0).toString();
        } catch (Exception e) {
            id = "";
            System.err.println("Error pilih tabel : " + e.getMessage());
        }
    }//GEN-LAST:event_onPilihTabel

    private void onLihatDetail(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onLihatDetail
        try {
            if (id.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan dilihat!");
            } else {
                new DialogDetailBukuTamu(null, true, id, true).setVisible(true);
            }
            showTabel("");
        } catch (Exception e) {
            msg.msgError("Error lihat detail : " + e.getMessage());
        }
    }//GEN-LAST:event_onLihatDetail

    private void onFIlter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onFIlter
        TempData.setStatus(false);
        if(TempUser.getLevel().equals("Admin")) {
            new DialogFilterKost(null, true).setVisible(true);
        } else {
            new DialogFilterKost(null, true, TempUser.getId()).setVisible(true);
        }
        if(!TempData.getId2().isEmpty()) {
            prefix = "SELECT * FROM VIEW_BUKU_TAMU WHERE id_kost ='" + TempData.getId2() + "' AND (";
            postfix = ")";
            showTabel("");
        }
    }//GEN-LAST:event_onFIlter


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCari;
    private static javax.swing.JLabel btnClose;
    private static javax.swing.JLabel btnHapus;
    private static javax.swing.JLabel btnHapus1;
    private static javax.swing.JLabel btnHapus2;
    private static javax.swing.JLabel btnReload;
    private static javax.swing.JLabel btnTambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
