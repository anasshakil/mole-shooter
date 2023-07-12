
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class MainGameGUI extends javax.swing.JFrame {

    public static MainGameGUI mainG = new MainGameGUI();
    private Clip clip;
    private boolean isMute;
    private int currentMutePosition;
    private boolean isPlaying = false;
    private boolean isFirstPlay = true;
    private int score = 0;
    public int tempHighScore;
    private int chances = 5;
    private Random random = new Random();
    private Cursor c;

    public MainGameGUI() {
        initComponents();
        setTitle("Mole Shooter");
        setResizable(false);
        setLocationRelativeTo(null);
        resizeBgImage();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        moleLabel.setVisible(false);
        jLabel3.setVisible(false);
        chancesLabel.setVisible(false);
        lblScore.setVisible(false);
        jLabel1.setVisible(false);
        jLabel8.setVisible(false);
        lblPlyrName.setVisible(false);
        btnStart.setLocation((getScreenSize().width / 2) - btnStart.getWidth(), (getScreenSize().height / 2) - 60);
        btnHighScore.setLocation((getScreenSize().width / 2) - btnHighScore.getWidth(), (getScreenSize().height / 2) + 40);
        Image im = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/gun-sight-clipart-7vv.png"));
        c = Toolkit.getDefaultToolkit().createCustomCursor(im, new Point(30, 30), "img");
        this.setCursor(c);
        setVisible(true);
    }

    public void StartGame() {
        Thread thread = new Thread() {
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(700);
                        int y = random.nextInt(900) + 500;
                        int x = random.nextInt(700) + 40;
                        moleLabel.setLocation(x, y);
                    }
                } catch (Exception e) {
                }
            }
        };
        thread.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moleLabel = new javax.swing.JLabel();
        soundLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPlyrName = new javax.swing.JLabel();
        chancesLabel = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnHighScore = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        bgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        moleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_mole_cartoonz1.png"))); // NOI18N
        moleLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moleLabelMouseClicked(evt);
            }
        });
        getContentPane().add(moleLabel);
        moleLabel.setBounds(139, 556, 120, 120);
        moleLabel.getAccessibleContext().setAccessibleName("jLabel1");

        soundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unmute.png"))); // NOI18N
        soundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soundLabelMouseClicked(evt);
            }
        });
        getContentPane().add(soundLabel);
        soundLabel.setBounds(10, 10, 60, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Chances:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(850, 8, 68, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Score:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1041, 8, 60, 25);

        lblPlyrName.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblPlyrName.setText("-");
        getContentPane().add(lblPlyrName);
        lblPlyrName.setBounds(150, 10, 450, 25);

        chancesLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        chancesLabel.setText("3");
        getContentPane().add(chancesLabel);
        chancesLabel.setBounds(927, 8, 100, 25);

        lblScore.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblScore.setText("0");
        getContentPane().add(lblScore);
        lblScore.setBounds(1098, 8, 80, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Player: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(85, 10, 60, 25);

        btnHighScore.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnHighScore.setText("HighScore");
        btnHighScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnHighScore.setContentAreaFilled(false);
        btnHighScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighScoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnHighScore);
        btnHighScore.setBounds(520, 490, 142, 66);

        btnStart.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnStart.setText("Start");
        btnStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnStart.setContentAreaFilled(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart);
        btnStart.setBounds(520, 410, 142, 66);
        getContentPane().add(bgLabel);
        bgLabel.setBounds(0, 0, 1200, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnStartActionPerformed
        NameGui name1 = new NameGui();
        name1.setCursor(c);
        name1.setVisible(true);
        MainGameGUI.mainG.setVisible(false);
        btnHighScore.setVisible(false);
        if (isFirstPlay == true) {
            isFirstPlay = false;
            StartGame();
        }
        isPlaying = true;
        jLabel3.setVisible(true);
        chancesLabel.setVisible(true);
        lblScore.setVisible(true);
        jLabel1.setVisible(true);
        chances = 5;
        score = 0;
        chancesLabel.setText("" + chances);
        lblScore.setText("" + score);
        moleLabel.setVisible(true);
        btnStart.setVisible(false);
        btnHighScore.setVisible(false);
        jLabel8.setVisible(true);
    }// GEN-LAST:event_btnStartActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseClicked
        if (isPlaying == true) {
            if (chances > 1) {
                chances--;
                chancesLabel.setText("" + chances);
            } else {
                chances = 0;
                isPlaying = false;
                moleLabel.setVisible(false);
                chancesLabel.setText("" + chances);
                btnStart.setVisible(true);
                btnHighScore.setVisible(true);
                File_Class f = new File_Class();
                f.setScore(NameGui.PlyrName, score);
                JOptionPane.showMessageDialog(this, "you scored: " + score + " points");
                jLabel8.setVisible(false);
                jLabel3.setVisible(false);
                chancesLabel.setVisible(false);
                lblScore.setVisible(false);
                jLabel1.setVisible(false);
            }
        }
    }// GEN-LAST:event_formMouseClicked

    private void moleLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked
        if (isPlaying == true) {
            score += 10;
            lblScore.setText("" + score);
        }
    }// GEN-LAST:event_jLabel2MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing

        File_Class file = new File_Class();
        file.setScore(lblPlyrName.getText(), score);
    }// GEN-LAST:event_formWindowClosing

    private void btnHighScoreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHighScoreActionPerformed
        if (!lblPlyrName.getText().equals("-") && !lblPlyrName.getText().equals("")) {
            File_Class file = new File_Class();
            file.getScore(lblPlyrName.getText());
        } else {
            NameGui name1 = new NameGui();
            this.setVisible(false);
            name1.getScore(true);
            name1.setNeedScore(true);
            name1.setCursor(c);
            name1.setVisible(true);
        }
    }// GEN-LAST:event_btnHighScoreActionPerformed

    private void soundLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel5MouseClicked
        if (isMute == false) {
            isMute = true;
            mute();
            try {
                ImageIcon im = new ImageIcon(getClass().getResource("/mute.png"));
                soundLabel.setIcon(im);
            } catch (Exception e) {
            }
        } else {
            isMute = false;
            unMute();
            try {
                ImageIcon im = new ImageIcon(getClass().getResource("/unmute.png"));
                soundLabel.setIcon(im);
            } catch (Exception e) {
            }
        }
    }// GEN-LAST:event_jLabel5MouseClicked

    private String x = "";

    public void Restart() {
        moleLabel.setVisible(false);
        jLabel3.setVisible(false);
        chancesLabel.setVisible(false);
        lblScore.setVisible(false);
        jLabel1.setVisible(false);
        jLabel8.setVisible(false);
        lblPlyrName.setVisible(false);
        isPlaying = false;
        btnStart.setVisible(true);
        btnHighScore.setVisible(true);
    }

    public void backgroundMusic() {
        Thread t = new Thread() {
            public void run() {
                try {
                    clip = AudioSystem.getClip();
                    AudioInputStream ais = AudioSystem
                            .getAudioInputStream(getClass().getResourceAsStream("/background-music.wav"));
                    clip.open(ais);
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                    clip.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGameGUI().mainG.setVisible(true);
            }
        });
    }

    private void mute() {
        try {
            currentMutePosition = clip.getFramePosition();
            clip.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void unMute() {
        try {
            clip.setFramePosition(currentMutePosition);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private Dimension getScreenSize() {
        Toolkit tk=Toolkit.getDefaultToolkit();
        return tk.getScreenSize();
    }
    
    private void resizeBgImage() {
        BufferedImage img = null;
        try {
            bgLabel.setSize(getScreenSize());
            img = ImageIO.read(getClass().getResource("/backgroundImage.png"));
            Image dimg = img.getScaledInstance(bgLabel.getWidth(), bgLabel.getHeight(),
        Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            bgLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgLabel;
    private javax.swing.JButton btnHighScore;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel chancesLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel lblPlyrName;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel moleLabel;
    private javax.swing.JLabel soundLabel;
    // End of variables declaration//GEN-END:variables
}
