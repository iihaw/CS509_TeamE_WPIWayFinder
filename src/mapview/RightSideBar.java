/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapview;

import java.awt.Color;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author GaoYifei
 */
public class RightSideBar extends JPanel implements MouseListener, ActionListener{

    public MainPanel mainPanel = null;
    public SecRightSideBar secRightSideBar = null;
    private JLabel backButton;
    
    /**
     * Creates new form RightSideBar
     * @param mapView
     */
    public RightSideBar() {
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

        clearButton = new javax.swing.JButton();
        showButton = new javax.swing.JButton();
        classroomLabel = new javax.swing.JLabel();
        restroomLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();

        clearButton.setText("Clear Pins");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        showButton.setText("Show Pins");

        classroomLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/classrooml.png"))); // NOI18N
        classroomLabel.setBounds(new java.awt.Rectangle(100, 200, 45, 16));
        classroomLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classroomLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classroomLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classroomLabelMouseEntered(evt);
            }
        });

        restroomLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/restrooml.png"))); // NOI18N
        restroomLabel.setBounds(new java.awt.Rectangle(200, 300, 45, 16));
        restroomLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restroomLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                restroomLabelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                restroomLabelMouseEntered(evt);
            }
        });

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Left Arrow.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showButton)
                            .addComponent(clearButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classroomLabel)
                            .addComponent(restroomLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabel)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(classroomLabel)
                .addGap(34, 34, 34)
                .addComponent(restroomLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(clearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showButton)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.clearPins();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void classroomLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomLabelMouseClicked
        // TODO add your handling code here:
       //System.out.println("classroom clicked");
        // change the color of Second Right side bar 
        secRightSideBar.setBackground(new java.awt.Color(231,0,102)); // 1 for red
        // show pins of selected locations in the map 
       // mainPanel.repaint();
        mainPanel.showLocationPin("CLASSROOM");
        // show list of location name in second right side bar
        try {
            secRightSideBar.ShowLocationName("CLASSROOM");
        } catch (SQLException ex) {
            Logger.getLogger(RightSideBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }//GEN-LAST:event_classroomLabelMouseClicked

    private void restroomLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restroomLabelMouseClicked
        // TODO add your handling code here:
       // System.out.println("restroom clicked");
        
        secRightSideBar.setBackground(new java.awt.Color(38,195,194)); // 2 for yellow
        
        //mainPanel.repaint();
        mainPanel.showLocationPin("RESTROOM");
        
        try {
            
            secRightSideBar.ShowLocationName("RESTROOM");
        } catch (SQLException ex) {
            Logger.getLogger(RightSideBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_restroomLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        secRightSideBar.setBackground(Color.white);
    }//GEN-LAST:event_backLabelMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_clearButtonMouseClicked

    private void classroomLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomLabelMouseEntered
        // TODO add your handling code here:
        
        this.classroomLabel.setBounds(this.classroomLabel.getX() - 5, this.classroomLabel.getY() - 5,
           this.classroomLabel.getHeight() , this.classroomLabel.getWidth() );
        this.classroomLabel.setToolTipText("Classrooms");
        this.repaint();
    }//GEN-LAST:event_classroomLabelMouseEntered

    private void classroomLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classroomLabelMouseExited
        // TODO add your handling code here:
         this.classroomLabel.setBounds(this.classroomLabel.getX() + 5, this.classroomLabel.getY() + 5,
           this.classroomLabel.getHeight() , this.classroomLabel.getWidth() );
        this.repaint();
    }//GEN-LAST:event_classroomLabelMouseExited

    private void restroomLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restroomLabelMouseEntered
        // TODO add your handling code here:
        this.restroomLabel.setBounds(this.restroomLabel.getX() - 5, this.restroomLabel.getY() - 5,
           this.restroomLabel.getHeight() , this.restroomLabel.getWidth() );
        this.restroomLabel.setToolTipText("Restrooms");
        this.repaint();
    }//GEN-LAST:event_restroomLabelMouseEntered

    private void restroomLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restroomLabelMouseExited
        // TODO add your handling code here:
        this.restroomLabel.setBounds(this.restroomLabel.getX() + 5, this.restroomLabel.getY() + 5,
           this.restroomLabel.getHeight() , this.restroomLabel.getWidth() );
        this.repaint();
    }//GEN-LAST:event_restroomLabelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel classroomLabel;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel restroomLabel;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
