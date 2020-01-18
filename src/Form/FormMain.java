package Form;

import Admin.Dialog.Database.FormBackUp;
import Admin.Dialog.Database.FormRestore;
import Admin.Dialog.Tentang.DialogTentangPengembang;
import Admin.Dialog.Tentang.DialogTentangProgram;
import Library.LookNFeel;
import Library.Message;
import Admin.Panel.Buku.PnlBukuPenghuniKost;
import Admin.Panel.Buku.PnlBukuRiwayatPenghuniKost;
import Admin.Panel.Buku.PnlBukuTamu;
import Admin.Panel.Buku.PnlBukuVerifikasiPenghuniKost;
import Admin.Panel.Laporan.PnlLaporanBukuPenghuni;
import Admin.Panel.Main.PnlBlacklist;
import Admin.Panel.Main.PnlKompleks;
import Admin.Panel.Main.PnlKetuaRT;
import Admin.Panel.Main.PnlKost;
import Admin.Panel.Laporan.PnlLaporanBukuTamu;
import Admin.Panel.Laporan.PnlLaporanKompleks;
import Admin.Panel.Laporan.PnlLaporanKost;
import Admin.Panel.Laporan.PnlLaporanNoParam;
import Admin.Panel.Main.PnlPenghuniKost;
import Admin.Panel.Main.PnlSatpam;
import Admin.Panel.Main.PnlTamu;
import Admin.Panel.Main.PnlTuanKost;
import Library.TempData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.Timer;

public class FormMain extends javax.swing.JFrame {

    private final PnlKetuaRT ketuaRt = new PnlKetuaRT();
    private final PnlSatpam satpam = new PnlSatpam();
    private final PnlTuanKost tuanKost = new PnlTuanKost();
    private final PnlKost kost = new PnlKost();
    private final PnlPenghuniKost penghuniKost = new PnlPenghuniKost();
    private final PnlKompleks kompleks = new PnlKompleks();
    private final PnlTamu tamu = new PnlTamu();
    private final PnlBukuTamu bukuTamu = new PnlBukuTamu();
    private final PnlBukuPenghuniKost bukuPenghuni = new PnlBukuPenghuniKost();
    private final PnlBukuRiwayatPenghuniKost bukuRiwayat = new PnlBukuRiwayatPenghuniKost();
    private final PnlBlacklist blacklist = new PnlBlacklist();
    private final PnlBukuVerifikasiPenghuniKost bukuVerifikasi = new PnlBukuVerifikasiPenghuniKost();
    private final Message msg = new Message();
    
    public FormMain() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        showDate();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void addTab(String title, JPanel form, JTabbedPane tab) {
        boolean found = false;
        int index = 0;
        for (int i = 0; i < tab.getTabCount(); i++) {
            if (tab.getTitleAt(i).equals(title)) {
                found = true;
                index = i;
                break;
            }
        }
        
        if(found) {
            tab.setSelectedIndex(index);
        } else {
            if(tab.getTabCount() > 7) {
                tab.removeTabAt(1);
            }
            tab.addTab(title, form);
            tab.setSelectedIndex(tab.getTabCount() - 1);
        }
        
    }
    
    private String getTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
    
    private String getDate() {
        return new SimpleDateFormat("EE, MMM dd, yyyy").format(new Date());
    }
    
    private void showDate() {
        try {
            Timer t = new Timer(0, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    date.setText(getDate() + " " + getTime());
                }
            });
            t.setDelay(1000);
            t.setCoalesce(true);
            t.setRepeats(true);
            t.start();
        } catch (Exception e) {
            msg.msgError("Error show date : " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Footer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Tab = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuKetua = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        menuSatpam = new javax.swing.JMenuItem();
        menuPemilik = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuKompleks = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        laporanKetua = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        laporanSatpam = new javax.swing.JMenuItem();
        laporanPemilik = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        laporanKompleks = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Aplikasi Manajemen Kost");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                onClosing(evt);
            }
        });

        Header.setBackground(new java.awt.Color(22, 160, 133));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAJEMEN KOST");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Footer.setBackground(new java.awt.Color(22, 160, 133));

        jLabel4.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("User : Admin");

        jLabel5.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Aktif Sebagai : Administrator");

        date.setFont(new java.awt.Font("Lohit Devanagari", 0, 11)); // NOI18N
        date.setForeground(new java.awt.Color(254, 254, 254));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Nov, 07 2019, 09:20:44");

        javax.swing.GroupLayout FooterLayout = new javax.swing.GroupLayout(Footer);
        Footer.setLayout(FooterLayout);
        FooterLayout.setHorizontalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FooterLayout.setVerticalGroup(
            FooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tab.setBackground(new java.awt.Color(254, 254, 254));
        Tab.setBorder(null);
        Tab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tab.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Aplikasi Manajemen Kost");

        jLabel7.setFont(new java.awt.Font("Lohit Devanagari", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("v.0.1.1");

        jLabel9.setFont(new java.awt.Font("Lohit Devanagari", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 1, 1));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Kelurahan Tulus Rejo");

        jLabel10.setFont(new java.awt.Font("Lohit Devanagari", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(1, 1, 1));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/mansion.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tab.addTab("      HOME      ", jPanel3);

        menuBar.setBackground(new java.awt.Color(2, 175, 134));
        menuBar.setBorder(null);
        menuBar.setBorderPainted(false);

        jMenu1.setMnemonic('M');
        jMenu1.setText("  Master Data  ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuKetua.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuKetua.setBackground(new java.awt.Color(254, 254, 254));
        menuKetua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_1.png"))); // NOI18N
        menuKetua.setText("    Data Ketua RT    ");
        menuKetua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataKetuaRT(evt);
            }
        });
        jMenu1.add(menuKetua);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem23.setBackground(new java.awt.Color(254, 254, 254));
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_0.png"))); // NOI18N
        jMenuItem23.setText("    Data Tamu");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataTamu(evt);
            }
        });
        jMenu1.add(jMenuItem23);

        menuSatpam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuSatpam.setBackground(new java.awt.Color(254, 254, 254));
        menuSatpam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_2.png"))); // NOI18N
        menuSatpam.setText("    Data Satpam    ");
        menuSatpam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataSatpam(evt);
            }
        });
        jMenu1.add(menuSatpam);

        menuPemilik.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuPemilik.setBackground(new java.awt.Color(254, 254, 254));
        menuPemilik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_3.png"))); // NOI18N
        menuPemilik.setText("    Data Pemilik Kost    ");
        menuPemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataTuanKost(evt);
            }
        });
        jMenu1.add(menuPemilik);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setBackground(new java.awt.Color(254, 254, 254));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_4.png"))); // NOI18N
        jMenuItem4.setText("    Data Kost    ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataKost(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_5.png"))); // NOI18N
        jMenuItem5.setText("    Data Penghuni Kost    ");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataPenghuniKost(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        menuKompleks.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menuKompleks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_6.png"))); // NOI18N
        menuKompleks.setText("    Data Kompleks    ");
        menuKompleks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataKompleks(evt);
            }
        });
        jMenu1.add(menuKompleks);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_24.png"))); // NOI18N
        jMenuItem1.setText("    Data Blacklist");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDataBlacklist(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBar.add(jMenu1);

        jMenu2.setMnemonic('T');
        jMenu2.setText("  Tulis Buku  ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_7.png"))); // NOI18N
        jMenuItem7.setText("   Buku Tamu   ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBukuTamu(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_8.png"))); // NOI18N
        jMenuItem8.setText("   Buku Penghuni Kost   ");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBukuPenghuni(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_verif_30.png"))); // NOI18N
        jMenuItem6.setText("   Buku Verifikasi Penghuni Kost");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onVerifikasi(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_riwayat.png"))); // NOI18N
        jMenuItem3.setText("   Buku Riwayat Penghuni Kost   ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBukuRiwayat(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        jMenu3.setMnemonic('L');
        jMenu3.setText("  Laporan  ");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanBlacklist(evt);
            }
        });

        laporanKetua.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        laporanKetua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_9.png"))); // NOI18N
        laporanKetua.setText("   Laporan Data Ketua RT   ");
        laporanKetua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanKetua(evt);
            }
        });
        jMenu3.add(laporanKetua);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_0.png"))); // NOI18N
        jMenuItem24.setText("   Laporan Data Tamu   ");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanTamu(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        laporanSatpam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        laporanSatpam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_10.png"))); // NOI18N
        laporanSatpam.setText("   Laporan Data Satpam   ");
        laporanSatpam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanSatpam(evt);
            }
        });
        jMenu3.add(laporanSatpam);

        laporanPemilik.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        laporanPemilik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_11.png"))); // NOI18N
        laporanPemilik.setText("   Laporan Data Pemilik Kost");
        laporanPemilik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanPemilik(evt);
            }
        });
        jMenu3.add(laporanPemilik);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_12.png"))); // NOI18N
        jMenuItem12.setText("   Laporan Data Kost   ");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanKost(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_13.png"))); // NOI18N
        jMenuItem13.setText("   Laporan Data Penghuni Kost   ");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanPenghuni(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        laporanKompleks.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        laporanKompleks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_14.png"))); // NOI18N
        laporanKompleks.setText("   Laporan Data Kompleks   ");
        laporanKompleks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanKompleks(evt);
            }
        });
        jMenu3.add(laporanKompleks);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_16.png"))); // NOI18N
        jMenuItem15.setText("   Laporan Buku tamu   ");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanBukuTamu(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_17.png"))); // NOI18N
        jMenuItem16.setText("   Laporan Buku Penghuni Kost     ");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanBukuPenghuni(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_riwayat.png"))); // NOI18N
        jMenuItem9.setText("   Laporan Buku Riwayat Penghuni Kost");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanBukuRiwayat(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_24.png"))); // NOI18N
        jMenuItem2.setText("   Laporan Blacklist   ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLaporanBlacklist(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        menuBar.add(jMenu3);

        jMenu7.setMnemonic('D');
        jMenu7.setText("   Databases   ");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_22.png"))); // NOI18N
        jMenuItem21.setText("   Backup   ");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBackUp(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_23.png"))); // NOI18N
        jMenuItem22.setText("   Restore   ");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRestore(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        menuBar.add(jMenu7);

        jMenu6.setMnemonic('G');
        jMenu6.setText("   Tentang   ");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_20.png"))); // NOI18N
        jMenuItem19.setText("   Tentang Program   ");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTentangProgram(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a_21.png"))); // NOI18N
        jMenuItem20.setText("   Tentang Pengembang   ");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTentangPengembang(evt);
            }
        });
        jMenu6.add(jMenuItem20);

        menuBar.add(jMenu6);

        jMenu4.setMnemonic('K');
        jMenu4.setText("   Log Out   ");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images1/a_keluar.png"))); // NOI18N
        jMenuItem25.setText("     Log Out     ");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLogOut(evt);
            }
        });
        jMenu4.add(jMenuItem25);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Tab)
                .addGap(0, 0, 0)
                .addComponent(Footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onDataKetuaRT(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataKetuaRT
        addTab("   Data Ketua RT   ", ketuaRt, Tab);
    }//GEN-LAST:event_onDataKetuaRT

    private void onDataSatpam(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataSatpam
        addTab("   Data Satpam   ", satpam, Tab);
    }//GEN-LAST:event_onDataSatpam

    private void onDataTuanKost(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataTuanKost
        addTab("   Data Tuan Kost   ", tuanKost, Tab);
    }//GEN-LAST:event_onDataTuanKost

    private void onDataKost(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataKost
        addTab("   Data Kost   ", kost, Tab);
    }//GEN-LAST:event_onDataKost

    private void onDataPenghuniKost(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataPenghuniKost
        addTab("   Data Penghuni Kost   ", penghuniKost, Tab);
    }//GEN-LAST:event_onDataPenghuniKost

    private void onDataKompleks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataKompleks
        addTab("   Data Kompleks   ", kompleks, Tab);
    }//GEN-LAST:event_onDataKompleks

    private void onDataTamu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataTamu
        addTab("   Data Tamu   ", tamu, Tab);
    }//GEN-LAST:event_onDataTamu

    private void onClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onClosing
        int i = msg.msgQuestion("Apakah anda yakin ingin keluar?");
        if(i == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            
        }
    }//GEN-LAST:event_onClosing

    private void onLogOut(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLogOut
        TempData.setId("");
        TempData.setId1("");
        TempData.setId2("");
        TempData.setNama("");
        new FormLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onLogOut

    private void onBukuTamu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBukuTamu
        addTab("   Buku Tamu   ", bukuTamu, Tab);
    }//GEN-LAST:event_onBukuTamu

    private void onBukuPenghuni(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBukuPenghuni
        addTab("   Buku Penghuni Kost   ", bukuPenghuni, Tab);
    }//GEN-LAST:event_onBukuPenghuni

    private void onTentangPengembang(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTentangPengembang
        new DialogTentangPengembang(this, true).setVisible(true);
    }//GEN-LAST:event_onTentangPengembang

    private void onTentangProgram(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTentangProgram
        new DialogTentangProgram(this, true).setVisible(true);
    }//GEN-LAST:event_onTentangProgram

    private void onDataBlacklist(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDataBlacklist
        addTab("   Data Blacklist   ", blacklist, Tab);
    }//GEN-LAST:event_onDataBlacklist

    private void onBackUp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBackUp
        new FormBackUp(this, true).setVisible(true);
    }//GEN-LAST:event_onBackUp

    private void onBukuRiwayat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBukuRiwayat
        addTab("   Buku Riwayat Penghuni Kost   ", bukuRiwayat, Tab);
    }//GEN-LAST:event_onBukuRiwayat

    private void onRestore(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRestore
        new FormRestore(this, true).setVisible(true);
    }//GEN-LAST:event_onRestore

    private void onVerifikasi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onVerifikasi
        addTab("   Buku Verifikasi Penghuni Kost   ", bukuVerifikasi, Tab);
    }//GEN-LAST:event_onVerifikasi

    private void onLaporanKetua(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanKetua
        addTab("   Laporan Ketua RT   ", new PnlLaporanNoParam("LaporanKetuaRT"), Tab);
    }//GEN-LAST:event_onLaporanKetua

    private void onLaporanTamu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanTamu
        addTab("   Laporan Tamu   ", new PnlLaporanNoParam("LaporanTamu"), Tab);
    }//GEN-LAST:event_onLaporanTamu

    private void onLaporanSatpam(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanSatpam
        addTab("   Laporan Satpam   ", new PnlLaporanNoParam("LaporanSatpam"), Tab);
    }//GEN-LAST:event_onLaporanSatpam

    private void onLaporanPemilik(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanPemilik
        addTab("   Laporan Pemilik Kost   ", new PnlLaporanNoParam("LaporanPemilikKost"), Tab);
    }//GEN-LAST:event_onLaporanPemilik

    private void onLaporanKost(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanKost
        addTab("   Laporan Kost   ", new PnlLaporanKost("LaporanKost"), Tab);
    }//GEN-LAST:event_onLaporanKost

    private void onLaporanPenghuni(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanPenghuni
        addTab("   Laporan Penghuni Kost   ", new PnlLaporanNoParam("LaporanPenghuniKost"), Tab);
    }//GEN-LAST:event_onLaporanPenghuni

    private void onLaporanKompleks(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanKompleks
        addTab("   Laporan Kompleks   ", new PnlLaporanKompleks("LaporanKompleks"), Tab);
    }//GEN-LAST:event_onLaporanKompleks

    private void onLaporanBukuTamu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanBukuTamu
        addTab("   Laporan Buku Tamu   ", new PnlLaporanBukuTamu("LaporanBukuTamu"), Tab);
    }//GEN-LAST:event_onLaporanBukuTamu

    private void onLaporanBukuPenghuni(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanBukuPenghuni
        addTab("   Laporan Buku Penghuni   ", new PnlLaporanBukuPenghuni("LaporanBukuPenghuni"), Tab);
    }//GEN-LAST:event_onLaporanBukuPenghuni

    private void onLaporanBukuRiwayat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanBukuRiwayat
        addTab("   Laporan Riwayat Buku Penghuni   ", new PnlLaporanBukuPenghuni("LaporanBukuRiwayatPenghuni"), Tab);
    }//GEN-LAST:event_onLaporanBukuRiwayat

    private void onLaporanBlacklist(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLaporanBlacklist
        addTab("   Laporan Blacklist   ", new PnlLaporanNoParam("LaporanBlackList"), Tab);
    }//GEN-LAST:event_onLaporanBlacklist

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (new LookNFeel().getLnF().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new FormMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel Footer;
    private static javax.swing.JPanel Header;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem laporanKetua;
    private javax.swing.JMenuItem laporanKompleks;
    private javax.swing.JMenuItem laporanPemilik;
    private javax.swing.JMenuItem laporanSatpam;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuKetua;
    private javax.swing.JMenuItem menuKompleks;
    private javax.swing.JMenuItem menuPemilik;
    private javax.swing.JMenuItem menuSatpam;
    // End of variables declaration//GEN-END:variables
}
