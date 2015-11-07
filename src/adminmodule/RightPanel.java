/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminmodule;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.JDBC;

/**
 *
 * @author Yihao
 */
public class RightPanel extends javax.swing.JPanel {
    
    AdminFrame frame;

    /**
     * Creates new form RightPanel
     * @param frame
     */
    public RightPanel(AdminFrame frame) {
        this.frame = frame;
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

        resetButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        pointButton = new javax.swing.JLabel();
        locationButton = new javax.swing.JLabel();
        edgeButton = new javax.swing.JLabel();

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        pointButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CircledDot-50.png"))); // NOI18N
        pointButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pointButtonMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pointButtonMouseClicked(evt);
            }
        });

        locationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/LocationFilled-50.png"))); // NOI18N
        locationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                locationButtonMouseReleased(evt);
            }
        });

        edgeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/WaypointMap-50.png"))); // NOI18N
        edgeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                edgeButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(locationButton)
                                .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edgeButton)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(pointButton)
                .addGap(132, 132, 132)
                .addComponent(locationButton)
                .addGap(149, 149, 149)
                .addComponent(edgeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        try {
            // TODO add your handling code here:
            frame.loadMapInfo();
        } catch (Exception ex) {
            Logger.getLogger(RightPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame.button = AdminFrame.Button.NULL;
        frame.map.repaint();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JDBC db = new JDBC();
        frame.button = AdminFrame.Button.NULL;
        try {
            db.addMap(frame.maps);
        } catch (SQLException | IOException ex) {
            System.out.println("problem saving");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void pointButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointButtonMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_pointButtonMouseClicked

    private void pointButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pointButtonMouseReleased
        // TODO add your handling code here:
        frame.button = AdminFrame.Button.POINT;
        //frame.map.addMouseListener(frame);
    }//GEN-LAST:event_pointButtonMouseReleased

    private void locationButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationButtonMouseReleased
        // TODO add your handling code here:
        frame.button = AdminFrame.Button.LOCATION;
        //frame.map.addMouseListener(frame);
    }//GEN-LAST:event_locationButtonMouseReleased

    private void edgeButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edgeButtonMouseReleased
        // TODO add your handling code here:
        frame.button = AdminFrame.Button.EDGE;
        //frame.map.addMouseListener(frame);
    }//GEN-LAST:event_edgeButtonMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel edgeButton;
    private javax.swing.JLabel locationButton;
    private javax.swing.JLabel pointButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
