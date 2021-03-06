/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import Business.Airliners;
import Business.AirlinersDirectory;
import Business.FlightScheDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import static javax.swing.GroupLayout.Alignment.values;
import userInterface.ManageTravelAgency.mngTravelAgencyFrontPageJPanel;
import userInterface.manageAirlinersJPanel.manageAirlinersJPanel;

/**
 *
 * @author hp
 */
public class TravelAgencyMainJFrame extends javax.swing.JFrame {
    private FlightScheDirectory flightScheduleDirectory;
    private AirlinersDirectory airlinersDirectory;
    private Airliners airliners;
    

    /**
     * Creates new form TravelAgencyMainJFrame
     */
    public TravelAgencyMainJFrame() {
        initComponents();
        this.airliners = airliners;
        this.flightScheduleDirectory = new FlightScheDirectory();
        this.airlinersDirectory = new AirlinersDirectory();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        rightJPanel = new javax.swing.JPanel();
        leftJPanel = new javax.swing.JPanel();
        mngTravelAgencyBtn = new javax.swing.JButton();
        regMngAirlinerBtn = new javax.swing.JButton();
        mngCustomerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rightJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightJPanel);

        mngTravelAgencyBtn.setText("Manage Travel Agency");
        mngTravelAgencyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngTravelAgencyBtnActionPerformed(evt);
            }
        });

        regMngAirlinerBtn.setText("Register / Manage Airliner");
        regMngAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regMngAirlinerBtnActionPerformed(evt);
            }
        });

        mngCustomerBtn.setText("Manage Customer");

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mngTravelAgencyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mngCustomerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(regMngAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(mngTravelAgencyBtn)
                .addGap(109, 109, 109)
                .addComponent(regMngAirlinerBtn)
                .addGap(157, 157, 157)
                .addComponent(mngCustomerBtn)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mngTravelAgencyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngTravelAgencyBtnActionPerformed
        // TODO add your handling code here:
        mngTravelAgencyFrontPageJPanel panel = new mngTravelAgencyFrontPageJPanel(rightJPanel, flightScheduleDirectory );
        rightJPanel.add("mngTravelAgencyFrontPageJPanel", panel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_mngTravelAgencyBtnActionPerformed

    private void regMngAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regMngAirlinerBtnActionPerformed
        // TODO add your handling code here:
        manageAirlinersJPanel panel = new manageAirlinersJPanel(rightJPanel, airlinersDirectory );
        rightJPanel.add("manageAirlinersJPanel", panel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_regMngAirlinerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton mngCustomerBtn;
    private javax.swing.JButton mngTravelAgencyBtn;
    private javax.swing.JButton regMngAirlinerBtn;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
