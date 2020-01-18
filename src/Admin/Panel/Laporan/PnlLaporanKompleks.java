package Admin.Panel.Laporan;

import Library.JasperView;
import Library.Koneksi;
import Library.Message;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class PnlLaporanKompleks extends javax.swing.JPanel {

    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private ResultSet rs;
    private String file, query;
    
    private ArrayList<String> id = new ArrayList<>();

    public PnlLaporanKompleks(String file) {
        initComponents();
        this.file = file;
    }
        
    private void queryToArray(String sql) {
        try {
            id.clear();
            boxFilter.removeAllItems();
            rs = con.getQuery(sql);
            while(rs.next()) {
                id.add(rs.getString(1));
                boxFilter.addItem(rs.getString(2));
            }
        } catch (SQLException e) {
            msg.msgError("Error filter : " + e.getMessage());
        }
    }
    
    private String getID(int index) {
        return id.get(index);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnReload = new javax.swing.JLabel();
        boxKategori = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        boxFilter = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(254, 254, 254));

        pnlContainer.setBackground(new java.awt.Color(254, 254, 254));
        pnlContainer.setBorder(null);

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

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

        btnReload.setBackground(new java.awt.Color(22, 160, 133));
        btnReload.setForeground(new java.awt.Color(254, 254, 254));
        btnReload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_laporan.png"))); // NOI18N
        btnReload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReload.setOpaque(true);
        btnReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onReload(evt);
            }
        });

        boxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Ketua RT" }));
        boxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onFilter(evt);
            }
        });

        jLabel1.setText("Filter Laporan Berdasarkan : ");

        boxFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=====" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(boxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(btnReload, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClose
        getParent().remove(this);
    }//GEN-LAST:event_onClose

    private void onReload(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onReload
        switch(boxKategori.getSelectedIndex()) {
            case 0 :
                query = "WHERE 1";
                break;
            case 1 :
                query = "WHERE id_ketua_rt ='" + getID(boxFilter.getSelectedIndex()) + "'";
                break;
        }
        HashMap hash = new HashMap();
        hash.put("filter", query);
        new JasperView().showReportToPanel(file, hash, pnlContainer, con.getCon());
    }//GEN-LAST:event_onReload

    private void onFilter(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFilter
        switch(boxKategori.getSelectedIndex()) {
            case 0 :
                boxFilter.removeAllItems();
                boxFilter.addItem("=====");
                break;
            case 1 :
                queryToArray("SELECT id_ketua_rt, nama_ketua FROM KETUA_RT");
                break;
        }
    }//GEN-LAST:event_onFilter


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxFilter;
    private javax.swing.JComboBox<String> boxKategori;
    private static javax.swing.JLabel btnClose;
    private static javax.swing.JLabel btnReload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
