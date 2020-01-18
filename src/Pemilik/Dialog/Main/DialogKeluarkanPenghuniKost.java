package Pemilik.Dialog.Main;

import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempData;
import javax.swing.JOptionPane;

public class DialogKeluarkanPenghuniKost extends javax.swing.JDialog {
    
    private final Message msg = new Message();
    private final Koneksi con = new Koneksi();
    private String id = "", idk = "", namaPenghuni = "", namaKost = "";

    private final String header[] = {
        "ID Penghuni", "ID Kost", "Nama Penghuni", "Nama Kost", "Tanggal Masuk", "Tanggal Keluar"
    };

    public DialogKeluarkanPenghuniKost(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showTabel("");
    }
        
    private void showTabel(String key) {
        try {
            String sql = "SELECT * FROM VIEW_BUKU_PENGHUNI_KOST WHERE "
                + "id_kost ='" + TempData.getId2() + "' AND "
                    + "status ='Verifikasi' AND ("
                        + "id_penghuni LIKE '%" + key + "%' OR "
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

        jPanel1 = new javax.swing.JPanel();
        boxCari = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnHapus2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Blacklist");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

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

        tabel.setBorder(null);
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
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
        btnHapus2.setText("Keluarkan");
        btnHapus2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHapus2.setOpaque(true);
        btnHapus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onKeluarkan(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_8_120.png"))); // NOI18N
        jLabel1.setText("FORM BUKU PENGHUNI KOST");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(boxCari, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxCari, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapus2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addGap(3, 3, 3))
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

        setSize(new java.awt.Dimension(1330, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onCari(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onCari
        showTabel(boxCari.getText());
    }//GEN-LAST:event_onCari

    private void onReload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onReload
        showTabel("");
        boxCari.setText("");
    }//GEN-LAST:event_onReload

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

    private void onKeluarkan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onKeluarkan
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
    }//GEN-LAST:event_onKeluarkan

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogKeluarkanPenghuniKost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogKeluarkanPenghuniKost dialog = new DialogKeluarkanPenghuniKost(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField boxCari;
    private static javax.swing.JLabel btnHapus2;
    private javax.swing.JLabel btnReload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
