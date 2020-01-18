package DIalog.Container;

import Library.ImageControl;
import Library.Koneksi;
import Library.LookNFeel;
import Library.Message;
import Library.TempUser;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FormShowProfile extends javax.swing.JDialog {

    private final Koneksi con = new Koneksi();
    private final Message msg = new Message();
    private final ImageControl imgCon = new ImageControl();
    private String tabel, field;
    private ResultSet rs;
    
    public FormShowProfile(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    
    public void applyQualityRenderingHints(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    }
    
    private void setImage(JLabel images, ImageIcon icon) {
        try {

            Image img = icon.getImage();
            
            int diameter = Math.min(images.getWidth(), images.getHeight());
            BufferedImage mask = new BufferedImage(images.getWidth(), images.getHeight(), BufferedImage.TYPE_INT_ARGB);

            Graphics2D g2d = mask.createGraphics();
            applyQualityRenderingHints(g2d);
            g2d.fillOval(0, 0, diameter, diameter);
            g2d.dispose();

            BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
            g2d = masked.createGraphics();
            applyQualityRenderingHints(g2d);
            int x = (diameter - images.getWidth()) / 2;
            int y = (diameter - images.getHeight()) / 2;
            g2d.drawImage(img, x, y, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
            g2d.drawImage(mask, 0, 0, null);
            g2d.dispose();
            
            images.setIcon(new ImageIcon(masked));
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Images = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Show Profile");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jPanel5.setBackground(new java.awt.Color(22, 160, 133));

        Images.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Images.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_home_200.png"))); // NOI18N
        Images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Images.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onGantiPhoto(evt);
            }
        });

        nama.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        nama.setForeground(new java.awt.Color(254, 254, 254));
        nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama.setText("Nama");

        alamat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        alamat.setForeground(new java.awt.Color(254, 254, 254));
        alamat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alamat.setText("Alamat");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addComponent(Images, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Images, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alamat)
                .addContainerGap())
        );

        btnSimpan.setBackground(new java.awt.Color(254, 254, 254));
        btnSimpan.setForeground(new java.awt.Color(1, 1, 1));
        btnSimpan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_edit.png"))); // NOI18N
        btnSimpan.setText("Ubah Profile");
        btnSimpan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134)));
        btnSimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimpan.setOpaque(true);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onUbah(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NO TELPON");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USERNAME");

        jenis.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jenis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jenis.setText("Laki - Laki");

        no.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setText("089728372812");

        user.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("aaaaa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jenis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(jenis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(no)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setSize(new java.awt.Dimension(404, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onOpened
        try {
            switch(TempUser.getLevel()) {
                case "Satpam" : 
                    tabel = "VIEW_SATPAM";
                    field = "id_satpam";
                    break;
                case "Pemilik Kost" :
                    tabel = "VIEW_PEMILIK";
                    field = "id_pemilik";
                    break;
                case "Ketua RT" :
                    tabel = "VIEW_KETUA_RT";
                    field = "id_ketua_rt";
                    break;
            }
            rs = con.getQuery("SELECT * FROM " + tabel + " WHERE " + field +" ='" + TempUser.getId() + "'");
            if(rs.next()) {
                if(rs.getBlob(8) != null) {
                    setImage(Images, imgCon.resizeImage(null, rs.getBytes(8), Images.getWidth(), Images.getHeight()));
                }
                nama.setText(rs.getString(2));
                alamat.setText(rs.getString(5));
                jenis.setText(rs.getString(3));
                no.setText(rs.getString(4));
                user.setText(rs.getString(6));
                
            } else {
                System.out.println("Gagl");
            }
        } catch (Exception e) {
            msg.msgError("Error Show Profile : " + e.getMessage());
        }
    }//GEN-LAST:event_onOpened

    private void onUbah(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onUbah
        this.dispose();
        new FormEditProfile(null, true).setVisible(true);
    }//GEN-LAST:event_onUbah

    private void onGantiPhoto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onGantiPhoto
        try {
            imgCon.showImage(new JLabel(), Images.getWidth(), Images.getHeight());
            if(imgCon.getPath() != null) {
                con.updateImage(imgCon.getFile(), tabel, "foto_profile", field, TempUser.getId());
                rs = con.getQuery("SELECT * FROM " + tabel + " WHERE " + field +" ='" + TempUser.getId() + "'");
                if(rs.next()) {
                    if(rs.getBlob(8) != null) {
                        setImage(Images, imgCon.resizeImage(null, rs.getBytes(8), Images.getWidth(), Images.getHeight()));
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("No file attached!");
        }
    }//GEN-LAST:event_onGantiPhoto

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormShowProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FormShowProfile dialog = new FormShowProfile(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Images;
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel btnSimpan;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel no;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
