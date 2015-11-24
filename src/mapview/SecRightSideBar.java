/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapview;

import adminmodule.Location;
import adminmodule.Map;
import adminmodule.MapInfo;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import jdbc.JDBC;

/**
 *
 * @author GaoYifei
 */
public class SecRightSideBar extends javax.swing.JPanel implements MouseListener, ActionListener {

    private JDBC db = new JDBC();
    private Map m = new Map();
    private ArrayList<Location> locationList = new ArrayList<Location>();
    private ArrayList<JLabel> labelList = new ArrayList<JLabel>();
    private ArrayList<JLabel> pinList = new ArrayList<JLabel>();
    private Boolean click = false;
    public MainPanel mainPanel;
    public Timer timer;
    private int index = 0;

    public MapModel mapModel = null;

    /**
     * Creates new form SecRightSideBar
     */
    public SecRightSideBar() {
        initComponents();
        timer = new Timer(100, this);
        timer.setInitialDelay(200);

    }

    public void ShowLocationName(String category) throws SQLException {
        this.removeAll();

        int mapIndex = mainPanel.getMapIndex();
        m.mapID = mapIndex;
        MapInfo info = db.getMapInfo(mapIndex, m);
//        locationList = info.locations;
        locationList = mapModel.getAllLocationList();
        labelList.clear();

        for (Location l : locationList) {

            switch (l.category) {
                case CLASSROOM:
                    if (category.equals("CLASSROOM")) {
                        JLabel label = new JLabel();
                        label.setText(l.name);

                        labelList.add(label);

                    }
                    break;
                case RESTROOM:

                    if (category.equals("RESTROOM")) {
                        JLabel label = new JLabel();
                        label.setText(l.name);

                        labelList.add(label);

                    }
                    break;
                case PARKING:
                    if (category.equals("PARKING")) {
                        JLabel label = new JLabel();
                        label.setText(l.name);

                        labelList.add(label);

                    }
                    break;
                case ATM:
                    if (category.equals("ATM")) {
                        JLabel label = new JLabel();
                        label.setText(l.name);

                        labelList.add(label);

                    }

                    break;
                case DINING:
                    if (category.equals("DINING")) {
                        JLabel label = new JLabel();
                        label.setText(l.name);

                        labelList.add(label);

                    }
                case ADMIN:
                    if (category.equals("ADMIN")){
                        JLabel label = new JLabel();
                        label.setText(l.name);

                        labelList.add(label);
                    }

                    break;

                default:
                    break;
//                
            }

        }
        int y = 0;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(170, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
//    @Override
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        this.setBackground(Color.red);
//    }
    @Override
    public void mouseClicked(MouseEvent e) {
        click = true;
        int n = 0;
        int m = 0;
        JLabel pinLabel = new JLabel();
        // set all label to null
        for (JLabel j : pinList) {
            // j.setIcon(null);
            j.setIcon(null);

        }

        for (m = 0; m < labelList.size(); m++) {

            labelList.get(m).setForeground(Color.white);

            this.repaint();
        }

        for (n = 0; n < labelList.size(); n++) {
            if (e.getSource().equals(labelList.get(n))) {

                mainPanel.showSinglePin(labelList.get(n).getText());

            }

        }

        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        int n = 0;

        for (n = 0; n < labelList.size(); n++) {
            if (e.getSource().equals(labelList.get(n))) {

                labelList.get(n).setForeground(Color.black);

                this.repaint();
            }
        }
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int m = 0;

        for (m = 0; m < labelList.size(); m++) {
            if (e.getSource().equals(labelList.get(m))) {

                if (click == false) {

                    labelList.get(m).setForeground(Color.white);

                    this.repaint();
                }

            }

        }
        click = false;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource() == timer && !labelList.isEmpty() ) {
            System.out.print("timer !");
            int y = index * 30; // hieght change 

            JLabel label = labelList.get(index);

            Font font = new Font("Roboto", Font.BOLD, 16);
            label.setFont(font);
            label.setBounds(30, 90 + y, 160, 30);
            label.setForeground(Color.white);
            label.addMouseListener(this);

            this.add(label);

            BorderLayout layout;
            layout = new BorderLayout();
            this.setLayout(layout);

            this.validate();
            this.repaint();

            index++;
            if (index == labelList.size()) {
                this.timer.stop();
                index = 0;
            }

        }

    }
}
