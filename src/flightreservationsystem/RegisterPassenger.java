/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightreservationsystem;

/**
 *
 * @author Nim
 */
public class RegisterPassenger extends javax.swing.JFrame {

    /**
     * Creates new form RegisterPassenger
     */
    public RegisterPassenger() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstname_lbl = new javax.swing.JLabel();
        lastname_lbl = new javax.swing.JLabel();
        street_lbl = new javax.swing.JLabel();
        city_lbl = new javax.swing.JLabel();
        tel_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        fname_txt = new javax.swing.JTextField();
        lname_txt = new javax.swing.JTextField();
        street_txt = new javax.swing.JTextField();
        city_txt = new javax.swing.JTextField();
        tel_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainlbl2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1368, 765));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/home icon.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 6, 51, 46);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/personal-information-icon.png"))); // NOI18N
        jLabel3.setText("Passenger Information");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 160, 200, 50);

        firstname_lbl.setText("First Name");
        getContentPane().add(firstname_lbl);
        firstname_lbl.setBounds(90, 250, 61, 16);

        lastname_lbl.setText("Last Name");
        getContentPane().add(lastname_lbl);
        lastname_lbl.setBounds(90, 290, 80, 16);

        street_lbl.setText("Street");
        getContentPane().add(street_lbl);
        street_lbl.setBounds(90, 330, 41, 16);

        city_lbl.setText("City");
        getContentPane().add(city_lbl);
        city_lbl.setBounds(90, 370, 21, 16);

        tel_lbl.setText("Telephone");
        getContentPane().add(tel_lbl);
        tel_lbl.setBounds(90, 410, 80, 16);

        email_lbl.setText("email");
        getContentPane().add(email_lbl);
        email_lbl.setBounds(90, 450, 31, 16);
        getContentPane().add(fname_txt);
        fname_txt.setBounds(220, 240, 210, 24);
        getContentPane().add(lname_txt);
        lname_txt.setBounds(220, 280, 210, 24);
        getContentPane().add(street_txt);
        street_txt.setBounds(220, 320, 210, 24);
        getContentPane().add(city_txt);
        city_txt.setBounds(220, 360, 210, 24);
        getContentPane().add(tel_txt);
        tel_txt.setBounds(220, 400, 210, 24);
        getContentPane().add(email_txt);
        email_txt.setBounds(220, 440, 210, 24);

        jButton1.setText("Add");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 510, 60, 32);

        jButton2.setText("Reset");
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 510, 63, 32);

        jLabel4.setText("LANKA Flight REservation System");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 20, 310, 50);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(560, 280, 41, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/line_glare_light_color_background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 140, 460, 470);

        mainlbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/dark-cyan-color-wallpaper-3.jpg"))); // NOI18N
        getContentPane().add(mainlbl2);
        mainlbl2.setBounds(0, 0, 2560, 1600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPassenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPassenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city_lbl;
    private javax.swing.JTextField city_txt;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel firstname_lbl;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lastname_lbl;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JLabel mainlbl2;
    private javax.swing.JLabel street_lbl;
    private javax.swing.JTextField street_txt;
    private javax.swing.JLabel tel_lbl;
    private javax.swing.JTextField tel_txt;
    // End of variables declaration//GEN-END:variables
}
