/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author akky
 */
public class FeeStructure extends JFrame implements ActionListener {
    JLabel l,l1;
    JTextField l3;
    Choice c;
    JButton b,b1;
    FeeStructure()
    {
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100,300);
        setSize(600,200);
        
        setLayout(null);
        l=new JLabel("Select Course");
        l.setBounds(30,30,180,30);
        l.setFont(new Font("tahoma",Font.BOLD | Font.ITALIC, 20));
        l.setForeground(Color.BLUE);
        add(l);
        
        c=new Choice();
        c.setBounds(230,30,200,30);
        c.setFont(new Font("monospaced",Font.BOLD,18));
        try{
                connection conn=new connection();
                ResultSet rs=conn.s.executeQuery("select course from feestructures");
                while(rs.next())
                {
                    c.add(rs.getString("course"));
                    add(c);
                }
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        
        l1=new JLabel("Total Fee (per year)");
        l1.setBounds(30,100,180,30);
        l1.setFont(new Font("tahoma",Font.BOLD | Font.ITALIC ,17));
        l1.setForeground(Color.blue);
        add(l1);
        
        l3=new JTextField();
        l3.setBounds(230,100,180,30);
        l3.setFont(new Font("monospaced",Font.BOLD,15));
        l3.setEditable(false);
        add(l3);
        
        b=new JButton("Enquire");
        b.setBounds(450,30,120,30);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setFont(new Font("raleway",Font.BOLD,15));
        add(b);
        
        b1=new JButton("Exit");
        b1.setBounds(450,100,120,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setFont(new Font("raleway",Font.BOLD,15));
        add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ie){
        if(ie.getSource()==b){
        try{
                
                connection conn=new connection();
                String str=c.getSelectedItem();
                ResultSet rs=conn.s.executeQuery("select fee from feestructures where course='"+str+"'");
                if(rs.next())
                {
                    l3.setText(String.valueOf(rs.getFloat("fee")));
                }
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
        if(ie.getSource()==b1)
        {
            dispose();
        }
    }
    public static void main(String[] args)
    {
        new FeeStructure().setVisible(true);
    }
    
}
