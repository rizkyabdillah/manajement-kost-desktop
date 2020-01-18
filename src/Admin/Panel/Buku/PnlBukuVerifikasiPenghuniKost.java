package Admin.Panel.Buku;

import Library.Koneksi;
import Library.Message;
import javax.swing.JOptionPane;

public class PnlBukuVerifikasiPenghuniKost extends javax.swing.JPanel {

    private final Message msg = new Message();
    private final Koneksi con = new Koneksi();
    private String id = "", idk = "", namaPenghuni = "", namaKost = "", tbl, filter = "";

    private final String header[] = {
        "ID Penghuni", "ID Kost", "Nama Penghuni", "Nama Kost", "Tanggal Masuk", "Tanggal Keluar"
    };

    public PnlBukuVerifikasiPenghuniKost() {
        initComponents();
        tbl = "VIEW_BUKU_PENGHUNI_KOST";
        showTabel("");
    }
    
    public PnlBukuVerifikasiPenghuniKost(String id) {
        initComponents();
        tbl = "VIEW_BUKU_PENGHUNI_KOST_RT";
        filter = "id_ketua_rt ='" + id + "' AND ";
        showTabel("");
    }

    private void showTabel(String key) {
        try {
            String sql = "SELECT * FROM " + tbl + " WHERE "
                + "status <> 'Verifikasi' AND " + filter + "("
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxCari = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnClose = new javax.swing.JLabel();
        btnHapus1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(254, 254, 254));

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
        btnHapus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_check.png"))); // NOI18N
        btnHapus1.setText("Verifikasi");
        btnHapus1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus1.setOpaque(true);
        btnHapus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onVerifikasi(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(boxCari, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
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
                    .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClose
        getParent().remove(this);
    }//GEN-LAST:event_onClose

    private void onReload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onReload
        showTabel("");
        boxCari.setText("");
    }//GEN-LAST:event_onReload

    private void onCari(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCari
        showTabel(boxCari.getText());
    }//GEN-LAST:event_onCari

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

    private void onVerifikasi(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onVerifikasi
        try {
            if (id.equals("")) {
                msg.msgWarning("Mohon pilih data yang akan diverifikasi!");
            } else {
                int i = msg.msgQuestion("Apakah anda yakin ingin memverifikasi penghuni "
                        + namaPenghuni + " dari kost " + namaKost + " ?");
                if (i == JOptionPane.YES_OPTION) {
                    con.setExecute("UPDATE BUKU_PENGHUNI_KOST SET status ='Verifikasi' WHERE "
                            + "id_penghuni ='" + id + "' AND id_kost ='" + idk + "'");
                }
            }
            showTabel("");
        } catch (Exception e) {
            msg.msgError("Error hapus : " + e.getMessage());
        }
    }//GEN-LAST:event_onVerifikasi


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCari;
    private static javax.swing.JLabel btnClose;
    private static javax.swing.JLabel btnHapus1;
    private static javax.swing.JLabel btnReload;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
