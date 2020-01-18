package Form;

import Library.Koneksi;
import Library.LibNavigation;
import Library.LookNFeel;
import Library.Message;
import Library.TempUser;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    private final Message msg = new Message();
    private final LibNavigation nav = new LibNavigation();
    private final Random random = new Random();
    private ResultSet rs;
    private final Koneksi con;
    private String chap = "";
    
    public FormLogin() {
        initComponents();
        this.setExtendedState(MAXIMIZED_HORIZ);
        con = new Koneksi();
    }
    
    private String getCaptcha() {
        String charr = "", character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for(int i = 0; i < 5; i++) {
            charr += character.charAt(random.nextInt(character.length()));
        }
        return charr;
    }
    
    private void reloadCaptcha() {
        chap = getCaptcha();
        boxCaptcha.setText("( " + chap + " )");
    }
    
    private void kosongkan() {
        boxLpUsername.setText("");
        boxPertanyataan.setText("");
        boxJawaban.setText("");
        boxLpPassword.setText("");
        boxLpRePassword.setText("");
        boxReCaptcha.setText("");
        reloadCaptcha();
        boxCaptcha.setText(chap);
        boxPertanyataan.setEnabled(false);
        boxJawaban.setEnabled(false);
        boxUsername.setText("");
        boxPassword.setText("");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        pnlContainer = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxUsername = new javax.swing.JTextField();
        boxPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Judul1 = new javax.swing.JLabel();
        pnlLupasPass1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Judul2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        boxPertanyataan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Judul3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        boxJawaban = new javax.swing.JTextField();
        boxLpUsername = new javax.swing.JTextField();
        pnlLupasPass2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Judul4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Judul5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        boxCaptcha = new javax.swing.JTextField();
        boxReCaptcha = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        boxLpPassword = new javax.swing.JPasswordField();
        boxLpRePassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(22, 160, 133));

        pnlContainer.setBackground(new java.awt.Color(22, 160, 133));
        pnlContainer.setLayout(new java.awt.CardLayout());

        pnlLogin.setBackground(new java.awt.Color(114, 166, 156));
        pnlLogin.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_login_200.png"))); // NOI18N

        Judul.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Judul.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        Judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul.setText("AMANIN");

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 0, 12)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("pusat informasi keamanan kost");

        boxUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onFocusPass(evt);
            }
        });
        boxUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onValidUsername(evt);
            }
        });

        boxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLogin1(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel5.setText("Password");

        jButton2.setText("Cancel");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCancel(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onLogin(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lohit Devanagari", 0, 12)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Lupa password ?klik");

        jLabel7.setFont(new java.awt.Font("Lohit Devanagari", 0, 12)); // NOI18N
        jLabel7.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Disini");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onLupaPass(evt);
            }
        });

        Judul1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Judul1.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        Judul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul1.setText("FORM LOGIN");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(Judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(boxPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))
                    .addComponent(Judul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(Judul)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Judul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(boxUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(boxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(3, 3, 3))
        );

        pnlContainer.add(pnlLogin, "card2");

        pnlLupasPass1.setBackground(new java.awt.Color(114, 166, 156));
        pnlLupasPass1.setOpaque(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_login_200.png"))); // NOI18N

        Judul2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Judul2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        Judul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul2.setText("AMANIN");

        jLabel10.setFont(new java.awt.Font("Lohit Devanagari", 0, 12)); // NOI18N
        jLabel10.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("pusat informasi keamanan kost");

        boxPertanyataan.setDisabledTextColor(new java.awt.Color(48, 48, 48));
        boxPertanyataan.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel11.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel11.setText("Username (*Enter)");

        jLabel12.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel12.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel12.setText("Pertanyaan");

        jButton3.setText("Masuk");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onMasuk(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Lanjut");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onLanjut(evt);
            }
        });

        Judul3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Judul3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        Judul3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul3.setText("FORM LUPA PASSWORD");

        jLabel16.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel16.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel16.setText("Jawaban");

        boxJawaban.setDisabledTextColor(new java.awt.Color(48, 48, 48));
        boxJawaban.setEnabled(false);

        boxLpUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onUsername(evt);
            }
        });

        javax.swing.GroupLayout pnlLupasPass1Layout = new javax.swing.GroupLayout(pnlLupasPass1);
        pnlLupasPass1.setLayout(pnlLupasPass1Layout);
        pnlLupasPass1Layout.setHorizontalGroup(
            pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                        .addComponent(Judul2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Judul3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxLpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(boxPertanyataan, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(boxJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        pnlLupasPass1Layout.setVerticalGroup(
            pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Judul2)
                    .addComponent(Judul3))
                .addGap(6, 6, 6)
                .addGroup(pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9))
                    .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                        .addComponent(boxLpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(boxPertanyataan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLupasPass1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(boxJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(pnlLupasPass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pnlContainer.add(pnlLupasPass1, "card2");

        pnlLupasPass2.setBackground(new java.awt.Color(114, 166, 156));
        pnlLupasPass2.setOpaque(false);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_login_200.png"))); // NOI18N

        Judul4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Judul4.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        Judul4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul4.setText("AMANIN");

        jLabel15.setFont(new java.awt.Font("Lohit Devanagari", 0, 12)); // NOI18N
        jLabel15.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("pusat informasi keamanan kost");

        jLabel17.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel17.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel17.setText("Password Baru");

        jLabel18.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel18.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel18.setText("Masukkan Password Baru Lagi");

        jButton4.setText("Kembali");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onKembali(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(254, 254, 254));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Simpan");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSimpan(evt);
            }
        });

        Judul5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Judul5.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        Judul5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Judul5.setText("FORM LUPA PASSWORD");

        jLabel20.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel20.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel20.setText("Captcha");

        boxCaptcha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        boxCaptcha.setDisabledTextColor(new java.awt.Color(48, 48, 48));
        boxCaptcha.setEnabled(false);
        boxCaptcha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onReloadCaptcha(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel21.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel21.setText("Masukkan Captcha");

        javax.swing.GroupLayout pnlLupasPass2Layout = new javax.swing.GroupLayout(pnlLupasPass2);
        pnlLupasPass2.setLayout(pnlLupasPass2Layout);
        pnlLupasPass2Layout.setHorizontalGroup(
            pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                                .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(boxCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxReCaptcha)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxLpPassword)
                            .addComponent(boxLpRePassword)))
                    .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                        .addComponent(Judul4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Judul5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlLupasPass2Layout.setVerticalGroup(
            pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Judul4)
                    .addComponent(Judul5))
                .addGap(6, 6, 6)
                .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                        .addComponent(boxLpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(boxLpRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(1, 1, 1)
                        .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxReCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlLupasPass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLupasPass2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pnlContainer.add(pnlLupasPass2, "card2");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(855, 302));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onLogin(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onLogin
        try {
            if(boxUsername.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom username!");
                boxUsername.requestFocus();
            } else if(boxPassword.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom password!");
                boxPassword.requestFocus();
            } else {
                rs = con.getQuery("SELECT * FROM USER WHERE username='" + boxUsername.getText() + "'");
                if(rs.next()) {
                    rs = con.getQuery("SELECT * FROM USER WHERE username='" + boxUsername.getText() + "' AND password='" + boxPassword.getText() + "'");
                    if(rs.next()){
                        TempUser.setId(rs.getString("id_user"));
                        TempUser.setLevel(rs.getString("level"));
                        TempUser.setUsername(rs.getString("username"));
                        switch(rs.getString("level")) {
                            case "Admin" :
                                new FormMain().setVisible(true);
                                break;
                            case "Satpam" :
                                new FormMainSatpam().setVisible(true);
                                break;
                            case "Ketua RT" :
                                new FormMainKetuaRT().setVisible(true);
                                break;
                            case "Pemilik Kost" :
                                new FormMainPemilikKost().setVisible(true);
                                break;
                        }
                        this.hide();
                    } else {
                        msg.msgWarning("Password anda salah!");
                        boxPassword.requestFocus();
                    }
                } else {
                    msg.msgWarning("Username anda salah!");
                    boxUsername.requestFocus();
                }
            }
        } catch (Exception e) {
            msg.msgError("Error Login : " +  e.getMessage());
        }
    }//GEN-LAST:event_onLogin

    private void onCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCancel
        int i = msg.msgQuestion("Apakah anda yakin ingin keluar?");
        if(i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_onCancel

    private void onValidUsername(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onValidUsername
        char c = evt.getKeyChar();
        if(boxUsername.getText().length() > 19) {
            msg.msgWarning("Username terlalu panjang!");
            evt.consume();
        } else {
            if(c == KeyEvent.VK_SPACE) {
                msg.msgWarning("Username tidak boleh terdapat spasi!");
                evt.consume();
            }
        }
    }//GEN-LAST:event_onValidUsername

    private void onFocusPass(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFocusPass
        boxPassword.requestFocus();
    }//GEN-LAST:event_onFocusPass

    private void onLogin1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLogin1
        onLogin(null);
    }//GEN-LAST:event_onLogin1

    private void onLupaPass(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onLupaPass
        nav.setActive(pnlContainer, pnlLupasPass1);
        kosongkan();
    }//GEN-LAST:event_onLupaPass

    private void onMasuk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onMasuk
        nav.setActive(pnlContainer, pnlLogin);
        kosongkan();
    }//GEN-LAST:event_onMasuk

    private void onKembali(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onKembali
        nav.setActive(pnlContainer, pnlLupasPass1);
    }//GEN-LAST:event_onKembali

    private void onLanjut(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onLanjut
        try {
            rs = con.getQuery("SELECT * FROM USER WHERE username ='" + boxLpUsername.getText() + "'");
            if(rs.next()) {
                rs = con.getQuery("SELECT * FROM USER WHERE "
                    + "username ='" + boxLpUsername.getText() + "' AND "
                            + "jawaban ='" + boxJawaban.getText() + "' AND "
                                    + "pertanyaan ='" + boxPertanyataan.getText() + "'");
                if(rs.next()) {
                    nav.setActive(pnlContainer, pnlLupasPass2);
                } else {
                    msg.msgWarning("Jawaban tidak cocok!");
                }
            } else {
                msg.msgWarning("Username tidak terdaftar!");
                boxPertanyataan.setText("");
                boxJawaban.setText("");
                boxJawaban.setEnabled(false);
            }
        } catch (Exception e) {
            msg.msgError("Error Username : " + e.getMessage());
        }
    }//GEN-LAST:event_onLanjut

    private void onUsername(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onUsername
        try {
            rs = con.getQuery("SELECT * FROM USER WHERE username ='" + boxLpUsername.getText() + "'");
            if(rs.next()) {
                boxPertanyataan.setText(rs.getString(5));
                boxJawaban.setEnabled(true);
                boxJawaban.requestFocus();
            } else {
                msg.msgWarning("Username tidak terdaftar!");
                boxPertanyataan.setText("");
                boxJawaban.setText("");
                boxJawaban.setEnabled(false);
            }
        } catch (Exception e) {
            msg.msgError("Error Username : " + e.getMessage());
        }
    }//GEN-LAST:event_onUsername

    private void onSimpan(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSimpan
        try {
            if(boxLpPassword.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom password!");
                boxLpPassword.requestFocus();
            } else if(boxLpRePassword.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom password baru!");
                boxLpRePassword.requestFocus();
            } else if(boxReCaptcha.getText().isEmpty()) {
                msg.msgWarning("Mohon isi kolom captcha!");
                boxReCaptcha.requestFocus();
            } else if(!boxLpRePassword.getText().equals(boxLpPassword.getText())) {
                msg.msgWarning("Password baru tidak sama!");
                boxLpRePassword.setText("");
                boxLpRePassword.requestFocus();
            } else if(!boxReCaptcha.getText().equals(chap)) {
                msg.msgWarning("Captcha anda salah!");
                reloadCaptcha();
                boxCaptcha.setText(chap);
                boxReCaptcha.setText("");
                boxReCaptcha.requestFocus();
            }  else {
                con.setExecute("UPDATE USER SET "
                        + "password ='" + boxLpPassword.getText() + "' WHERE "
                                + "username ='" + boxLpUsername.getText() + "'");
                msg.msgInformation("Password berhasil diubah, silahkan masuk!");
                nav.setActive(pnlContainer, pnlLogin);
                kosongkan();
            }
        } catch (Exception e) {
            msg.msgError("Error Simpan : " + e.getMessage());
        }
    }//GEN-LAST:event_onSimpan

    private void onReloadCaptcha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onReloadCaptcha
        reloadCaptcha();
        boxCaptcha.setText(chap);
    }//GEN-LAST:event_onReloadCaptcha

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new FormLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Judul1;
    private javax.swing.JLabel Judul2;
    private javax.swing.JLabel Judul3;
    private javax.swing.JLabel Judul4;
    private javax.swing.JLabel Judul5;
    private javax.swing.JTextField boxCaptcha;
    private javax.swing.JTextField boxJawaban;
    private javax.swing.JPasswordField boxLpPassword;
    private javax.swing.JPasswordField boxLpRePassword;
    private javax.swing.JTextField boxLpUsername;
    private javax.swing.JPasswordField boxPassword;
    private javax.swing.JTextField boxPertanyataan;
    private javax.swing.JTextField boxReCaptcha;
    private javax.swing.JTextField boxUsername;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLupasPass1;
    private javax.swing.JPanel pnlLupasPass2;
    // End of variables declaration//GEN-END:variables
}
