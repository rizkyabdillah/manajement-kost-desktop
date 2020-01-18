package Admin.Dialog.Buku;

import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DialogDetailBukuTamu extends javax.swing.JDialog {
    
    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private String sql, idBuku = "", waktu, id = "";
    private int index = 0;
    private ArrayList<String> idTamu = new ArrayList<>();
    private ArrayList<String> idPenghuni = new ArrayList<>();
    private ResultSet rs;

    private final String header[] = {
        "Id Buku Tamu", "Nama Tamu", "Nama Penghuni", "Agenda Tamu", "Waktu Kunjung", "Waktu Pulang"
    };

    public DialogDetailBukuTamu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        showTabel("");
    }
    
    public DialogDetailBukuTamu(java.awt.Frame parent, boolean modal, String ids, boolean status) {
        super(parent, modal);
        initComponents();
        this.id = ids;
        showTabel("");
        if(!status) {
            btnHapus.setVisible(false);
            btnKeluarkan.setVisible(false);
        }
    }
    
    private String getStatus() {
        return (filterStatus.getSelectedIndex() == 0) ? "Masuk" : "Keluar";
    }

    private void showTabel(String key) {
        try {
            sql = "SELECT * FROM VIEW_BUKU_DETAIL_TAMU WHERE "
                    + "id_buku_tamu ='" + id + "' AND "
                        + "status ='" + getStatus() + "' AND ("
                            + "nama_tamu LIKE '%" + key + "%' OR "
                                + "nama_penghuni LIKE '%" + key + "%' OR "
                                    + "agenda_tamu LIKE '%" + key + "%' OR "
                                        + "waktu_kunjung LIKE '%" + key + "%' OR "
                                            + "waktu_pulang LIKE '%" + key + "%')";
            
            addToArray(sql);
            con.showTabel(tabel, header, sql);
            tabel.getColumnModel().getColumn(0).setMinWidth(80);
            tabel.getColumnModel().getColumn(1).setMinWidth(180);
            tabel.getColumnModel().getColumn(2).setMinWidth(180);
            tabel.getColumnModel().getColumn(3).setMinWidth(320);
            tabel.getColumnModel().getColumn(4).setMinWidth(120);
            tabel.getColumnModel().getColumn(5).setMinWidth(120);
        } catch (Exception e) {
            msg.msgError("Error show tabel : " + e.getMessage());
        }
   
    }
    
    private void addToArray(String sql) {
        try {
            idTamu.clear();
            idPenghuni.clear();
            rs = con.getQuery(sql);
            while(rs.next()) {
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
        boxCari = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnKeluarkan = new javax.swing.JLabel();
        btnHapus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filterStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Detail Buku Tamu");

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

        btnKeluarkan.setBackground(new java.awt.Color(22, 160, 133));
        btnKeluarkan.setForeground(new java.awt.Color(254, 254, 254));
        btnKeluarkan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKeluarkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_keluar.png"))); // NOI18N
        btnKeluarkan.setText("Keluarkan");
        btnKeluarkan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluarkan.setOpaque(true);
        btnKeluarkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onKeluarkan(evt);
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

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_7_120.png"))); // NOI18N
        jLabel1.setText(" FORM DETAIL BUKU TAMU");

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

        filterStatus.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        filterStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tamu Masuk", "Tamu Keluar" }));
        filterStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onPilihStatus(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnKeluarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(filterStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(boxCari, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(filterStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCari, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnKeluarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
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
            index = tabel.getSelectedRow();
            idBuku = tabel.getValueAt(index, 0).toString();
            waktu = tabel.getValueAt(index, 4).toString();
        } catch (Exception e) {
            idBuku = "";
            System.err.println("Error pilih tabel : " + e.getMessage());;
        }
    }//GEN-LAST:event_onPilihTabel

    private void onHapus(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHapus
        try {
            if(idBuku.isEmpty()) {
                msg.msgWarning("Mohon pilih data yang akan dihapus!");
            } else {
                int i = msg.msgQuestion("Apakah anda yakin ingin menghapus tamu ?");
                if(i == JOptionPane.YES_OPTION) {
                    con.setExecute("DELETE FROM BUKU_DETAIL_TAMU "
                            + "WHERE id_buku_tamu ='" + idBuku + "' AND "
                                + "id_tamu ='" + idTamu.get(index) + "' AND "
                                    + "id_penghuni ='" + idPenghuni.get(index) + "' AND "
                                        + "waktu_kunjung ='" + waktu + "'");
                }
                showTabel("");
            }
        } catch (Exception e) {
            msg.msgError("Error hapus : " + e.getMessage());
        }
    }//GEN-LAST:event_onHapus

    private void onKeluarkan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onKeluarkan
        try {
            if(idBuku.isEmpty()) {
                msg.msgWarning("Mohon pilih data yang akan dikeluarkan!");
            } else {
                if(filterStatus.getSelectedIndex() == 1) {
                    msg.msgWarning("Tamu yang anda pilih telah keluar!");
                } else {
                    con.setExecute("UPDATE BUKU_DETAIL_TAMU SET status ='Keluar' "
                            + "WHERE id_buku_tamu ='" + idBuku + "' AND "
                                + "id_tamu ='" + idTamu.get(index) + "' AND "
                                    + "id_penghuni ='" + idPenghuni.get(index) + "'");
                }
                this.idBuku = "";
                showTabel("");
            }
        } catch (Exception e) {
            msg.msgError("Error keluarkan : " + e.getMessage());
        }
    }//GEN-LAST:event_onKeluarkan

    private void onPilihStatus(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onPilihStatus
        showTabel("");
    }//GEN-LAST:event_onPilihStatus

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogDetailBukuTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            DialogDetailBukuTamu dialog = new DialogDetailBukuTamu(new javax.swing.JFrame(), true);
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
    private static javax.swing.JLabel btnHapus;
    private static javax.swing.JLabel btnKeluarkan;
    private javax.swing.JLabel btnReload;
    private javax.swing.JComboBox<String> filterStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
