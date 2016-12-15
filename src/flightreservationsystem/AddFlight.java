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
public class AddFlight extends javax.swing.JFrame {

    /**
     * Creates new form AddFlight
     */
    public AddFlight() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        flightno_txt = new javax.swing.JTextField();
        departuretime_txt = new javax.swing.JTextField();
        departureairport_txt = new javax.swing.JTextField();
        destinationairport_txt = new javax.swing.JTextField();
        session_combo = new javax.swing.JComboBox<>();
        add_flight_info_btn = new javax.swing.JButton();
        clear_flight_info_btn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        departuredate_dchooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1363, 765));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flight no", "Departure Time", "Departure airport", "Destibation airport", "Session"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(550, 160, 570, 130);

        jLabel9.setText("View Flight Information");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(550, 120, 140, 16);

        jLabel10.setText("Search Flights");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 450, 140, 16);

        jLabel11.setText("Enter Flight number");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(550, 490, 140, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(550, 510, 190, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/search-icon.png"))); // NOI18N
        jButton1.setText("Search");
        getContentPane().add(jButton1);
        jButton1.setBounds(770, 510, 110, 40);
        getContentPane().add(flightno_txt);
        flightno_txt.setBounds(210, 170, 260, 24);
        getContentPane().add(departuretime_txt);
        departuretime_txt.setBounds(210, 210, 260, 24);
        getContentPane().add(departureairport_txt);
        departureairport_txt.setBounds(210, 250, 260, 24);
        getContentPane().add(destinationairport_txt);
        destinationairport_txt.setBounds(210, 300, 260, 24);

        session_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "BUsiness", "Economy" }));
        getContentPane().add(session_combo);
        session_combo.setBounds(210, 350, 260, 26);

        add_flight_info_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/addicon.png"))); // NOI18N
        add_flight_info_btn.setText("Add");
        add_flight_info_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_flight_info_btnActionPerformed(evt);
            }
        });
        getContentPane().add(add_flight_info_btn);
        add_flight_info_btn.setBounds(210, 480, 110, 40);

        clear_flight_info_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/clear-icon.png"))); // NOI18N
        clear_flight_info_btn.setText("Clear");
        getContentPane().add(clear_flight_info_btn);
        clear_flight_info_btn.setBounds(360, 480, 110, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/Delete-icon.png"))); // NOI18N
        jButton6.setText("Delete");
        getContentPane().add(jButton6);
        jButton6.setBounds(550, 330, 130, 40);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/update-icon.png"))); // NOI18N
        jButton7.setText("Update");
        getContentPane().add(jButton7);
        jButton7.setBounds(730, 330, 130, 40);
        getContentPane().add(departuredate_dchooser);
        departuredate_dchooser.setBounds(210, 400, 260, 29);

        jLabel12.setText("Departure Date");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 410, 86, 16);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/line_glare_light_color_background.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(520, 430, 640, 180);

        jLabel3.setText("Flight Information");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 120, 140, 20);

        jLabel4.setText("Flight Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 180, 110, 16);

        jLabel5.setText("Departure Time");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 220, 88, 16);

        jLabel6.setText("Departure Airport");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 260, 99, 16);

        jLabel7.setText("Destination Airport");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 310, 106, 16);

        jLabel8.setText("Session");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 360, 46, 16);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/line_glare_light_color_background.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(520, 90, 640, 330);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(920, 430, 240, 180);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/background_solid_glare_light_color.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 500, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightreservationsystem/dark-cyan-color-wallpaper-3.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1380, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_flight_info_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_flight_info_btnActionPerformed
        String flight_no =flightno_txt.getText();
        String departure_time =flightno_txt.getText();
        String departure_airport =flightno_txt.getText();
        String destination_airport =flightno_txt.getText();
        String session= session_combo.getSelectedItem().toString();
        java.util.Date recived_date = departuredate_dchooser.getDate();
    }//GEN-LAST:event_add_flight_info_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_flight_info_btn;
    private javax.swing.JButton clear_flight_info_btn;
    private javax.swing.JTextField departureairport_txt;
    private com.toedter.calendar.JDateChooser departuredate_dchooser;
    private javax.swing.JTextField departuretime_txt;
    private javax.swing.JTextField destinationairport_txt;
    private javax.swing.JTextField flightno_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> session_combo;
    // End of variables declaration//GEN-END:variables
}
