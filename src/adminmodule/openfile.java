package adminmodule;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 *
 * @author Castro
 */

public class openfile extends JFrame {
    public static final int TEXT_ROWS = 20;
    public static final int TEXT_COLUMNS = 40;
    private JTextArea textArea;
    Location l;
   
    public openfile(Location l)
    {
        this.l = l;
        Information panel = new Information ();
        setLayout (new BorderLayout ());
        add (panel, BorderLayout.CENTER);
    }
   
    public class Information extends JPanel
    {
        private JTextField Name;
        private JTextField Description;
        private JButton openButton;
        private JButton saveButton;
        private JComboBox box;
        private String options[] = { "DINING", "ATM", "ADMIN","PARKING" };
        
       /* private JRadioButton jrb1 = new JRadioButton("DINING");// 定义一个单选按钮
        private JRadioButton jrb2 = new JRadioButton("ATM");// 定义一个单选按钮
        private JRadioButton jrb3 = new JRadioButton("ADMIN");// 定义一个单选按钮
        private JRadioButton jrb4 = new JRadioButton("PARKING");*/
        
        public Information()
        {
            setLayout(new BorderLayout());

      // construct a panel

            JPanel panel = new JPanel();
            
            panel.setLayout(new GridLayout(10, 50));
            panel.add(new JLabel("Name:"));
            panel.add(Name = new JTextField(""));
            panel.add(new JLabel("Description:"));
            panel.add(Description = new JTextField(""));
            panel.add(new JLabel("Category:"));
            JComboBox box = new JComboBox(options);
            panel.add(box);
            
            /*jrb1.setActionCommand("DINING");
            jrb2.setActionCommand("ATM");
            jrb3.setActionCommand("ADMIN");
            jrb4.setActionCommand("PARKING");

            panel.add(this.jrb1);// 加入组件
            panel.add(this.jrb2);
            panel.add(this.jrb3);
            panel.add(this.jrb4);
            ButtonGroup group = new ButtonGroup();
            group.add(this.jrb1);
            group.add(this.jrb2);
            group.add(this.jrb3);
            group.add(this.jrb4);*/
            add(panel, BorderLayout.CENTER);
            
            // create open and save buttons
            
            openButton = new JButton("Open");
            
            openButton.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    JFileChooser openFile = new JFileChooser();
                    openFile.showOpenDialog(null);
                    /*RoomInfo u = getRoom();
                    System.out.println("Name = " + u.getName() + ", Description = "
                  + (new String(u.getDescription())) + ", Category = "+ box.getSelectedItem());
                    dispose();
                    l.name = Name.getText();
                    l.description = Description.getText();
                    if(box.getSelectedItem() == "DINING") l.category = Location.Category.DINING;
                    else if(box.getSelectedItem() == "ATM") l.category = Location.Category.ATM;
                    else if(box.getSelectedItem() == "ADMIN") l.category = Location.Category.ADMIN;
                    else l.category = Location.Category.PARKING;
                    /*if(jrb1.isSelected()) l.category = Location.Category.DINING;
                    else if(jrb2.isSelected()) l.category = Location.Category.ATM;
                    else if(jrb3.isSelected()) l.category = Location.Category.ADMIN;
                    else l.category = Location.Category.PARKING;*/
                }
            });

            JButton saveButton = new JButton("Save");
            saveButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                
               //dispose();
            }
        });

            // add these buttons to southern border

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(openButton);
            buttonPanel.add(saveButton);
            add(buttonPanel, BorderLayout.SOUTH);
   }

   
    // Sets the Room defaults.
    
    public void setRoom(RoomInfo u)
    {
        Name.setText(u.getName());
    }
    
    
    //return a Room object
    
    public RoomInfo getRoom()
    {
        return new RoomInfo(Name.getText(), Description.getText());
    }
    
}
}