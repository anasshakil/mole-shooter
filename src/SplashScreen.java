
import java.awt.Color;

public class SplashScreen extends javax.swing.JFrame {

    public static SplashScreen xx;

    public SplashScreen() {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setSize(1010, 1016);
        setResizable(false);
        setLocationRelativeTo(null);
        Thread t = new Thread() {
            public void run() {
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(40);
                        jLabel2.setText(i + "%");
                        if (i == 100) {
                            MainGameGUI.mainG = new MainGameGUI();
                            MainGameGUI.mainG.backgroundMusic();
                            MainGameGUI.mainG.setVisible(true);
                            dispose();
                        }
                    }
                } catch (Exception e) {
                }
            }
        };
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel2.setText("0%");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 670, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splash.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(5, 5, 1000, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                xx = new SplashScreen();
                xx.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}