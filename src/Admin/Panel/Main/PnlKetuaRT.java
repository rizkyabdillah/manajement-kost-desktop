package Admin.Panel.Main;

import Admin.Dialog.Master.DialogAddKetuaRT;
import Library.Koneksi;
import Library.Message;
import Library.TempData;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PnlKetuaRT extends javax.swing.JPanel {
    
    private final Message msg = new Message();
    private final Koneksi con = new Koneksi();
    private String idKetua = "", namaKetua = "";
    private ResultSet rs;

    private final String header[] = {
        "Id Ketua RT", "Nama Ketua RT", "Jenis Kelamin", "No Telp", "Alamat", "Username", "Password"  
    };
    
    public PnlKetuaRT() {
        initComponents();
        showTabel("");
    }
    
    private void showTabel(String key) {
        try {
            String sql = "SELECT * FROM VIEW_KETUA_RT WHERE "
                    + "id_ketua_rt LIKE '%" + key + "%' OR "
                        + "nama_ketua LIKE '%" + key + "%' OR "
                            + "jenis_kelamin LIKE '%" + key + "%' OR "
                                + "no_telp LIKE '%" + key + "%' OR "
                                    + "alamat LIKE '%" + key + "%' OR "
                                        + "username LIKE '%" + key + "%' OR "
                                            + "password LIKE '%" + key + "%'";
            con.showTabel(tabel, header, sql);
            tabel.getColumnModel().getColumn(0).setMinWidth(120);
            tabel.getColumnModel().getColumn(1).setMinWidth(220);
            tabel.getColumnModel().getColumn(2).setMinWidth(80);
            tabel.getColumnModel().getColumn(3).setMinWidth(100);
            tabel.getColumnModel().getColumn(4).setMinWidth(480);
            tabel.getColumnModel().getColumn(5).setMinWidth(80);
            tabel.getColumnModel().getColumn(6).setMinWidth(80);
        } catch (Exception e) {
            msg.msgError("Error show tabel : " + e.getMessage());
        }
   
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
                .addComponent(boxCari, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
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
                    .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxCari)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
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
        new DialogAddKetuaRT(null, true).setVisible(true);
        showTabel("");
        idKetua = "";
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
            if(idKetua.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan diubah!");
            } else {
                TempData.setId(idKetua);
                TempData.setStatus(true);
                new DialogAddKetuaRT(null, true).setVisible(true);
                idKetua = "";
            }
                showTabel("");
        } catch (Exception e) {
            msg.msgError("Error ubah : " + e.getMessage());
        }
    }//GEN-LAST:event_onUbah

    private void onHapus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHapus
        try {
            if(idKetua.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan hapus!");
            } else {
                int i = msg.msgQuestion("Apakah anda yakin ingin menghapus data " + namaKetua + " ?");
                if(i == JOptionPane.YES_OPTION) {
                    con.setExecute("DELETE FROM USER WHERE id_user ='" + idKetua + "'");
                    con.setExecute("DELETE FROM KETUA_RT WHERE id_ketua_rt ='" + idKetua + "'");
                }
            }
            this.idKetua = "";
            showTabel("");
        } catch (Exception e) {
            msg.msgError("Error hapus : " + e.getMessage());
        }
    }//GEN-LAST:event_onHapus

    private void onPilihTabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPilihTabel
        try {
            idKetua = tabel.getValueAt(tabel.getSelectedRow(), 0).toString();
            namaKetua = tabel.getValueAt(tabel.getSelectedRow(), 1).toString();
        } catch (Exception e) {
            idKetua = "";
            System.err.println("Error pilih tabel : " + e.getMessage());
        }
    }//GEN-LAST:event_onPilihTabel


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCari;
    private static javax.swing.JLabel btnClose;
    private static javax.swing.JLabel btnHapus;
    private static javax.swing.JLabel btnReload;
    private static javax.swing.JLabel btnTambah;
    private static javax.swing.JLabel btnUbah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
