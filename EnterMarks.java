/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
/**
 *
 * @author akky
 */
public class EnterMarks extends JFrame implements ActionListener {
    JLabel l,l1,l2,l3;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JButton b;
    Font f=new Font("raleway",Font.ITALIC,22);
    Font f1=new Font("tahoma",Font.BOLD,17);
    Font f2=new Font("monospaced",Font.BOLD,17);
    EnterMarks()
    {
        getContentPane().setBackground(Color.WHITE);
        setLocation(300,100);
        setSize(500,700);
        setLayout(null);
        
        l=new JLabel("Enter Marks Of Student");
        l.setForeground(Color.BLUE);
        l.setBounds(50,50,300,100);
        l.setFont(f);
        add(l);
        
        l1=new JLabel("Enter Roll Number");
        l1.setBounds(50,180,180,30);
        l1.setFont(f1);
        add(l1);
        
        t=new JTextField();
        t.setBounds(240,180,150,30);
        t.setFont(f2);
        add(t);
        
        l2=new JLabel("Enter Subject");
        l2.setFont(f1);
        l2.setBounds(50,250,150,30);
        add(l2);
        
        t1=new JTextField();
        t1.setFont(f2);
        t1.setBounds(50,300,180,30);
        add(t1);
        
        t2=new JTextField();
        t2.setFont(f2);
        t2.setBounds(50,350,180,30);
        add(t2);
        
        t3=new JTextField();
        t3.setFont(f2);
        t3.setBounds(50,400,180,30);
        add(t3);
        
        t4=new JTextField();
        t4.setFont(f2);
        t4.setBounds(50,450,180,30);
        add(t4);
        
        t5=new JTextField();
        t5.setFont(f2);
        t5.setBounds(50,500,180,30);
        add(t5);
                
        l3=new JLabel("Enter Marks");
        l3.setFont(f1);
        l3.setBounds(250,250,150,30);
        add(l3);
        
        t6=new JTextField();
        t6.setFont(f2);
        t6.setBounds(250,300,180,30);
        add(t6);
        
        t7=new JTextField();
        t7.setFont(f2);
        t7.setBounds(250,350,180,30);
        add(t7);
        
        t8=new JTextField();
        t8.setFont(f2);
        t8.setBounds(250,400,180,30);
        add(t8);
        
        t9=new JTextField();
        t9.setFont(f2);
        t9.setBounds(250,450,180,30);
        add(t9);
        
        t10=new JTextField();
        t10.setFont(f2);
        t10.setBounds(250,500,180,30);
        add(t10);
        
        b=new JButton("Submit");
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(150,560,180,30);
        b.setFont(f1);
        add(b);
        
        b.addActionListener(this);
        }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b)
        {
            int s=Integer.parseInt(t.getText());
            String s1=t1.getText();
            String s2=t2.getText();
            String s3=t3.getText();
            String s4=t4.getText();
            String s5=t5.getText();
            String s6=t6.getText();
            String s7=t7.getText();
            String s8=t8.getText();
            String s9=t9.getText();
            String s10=t10.getText();
            
            
            try{
            connection conn=new connection();
            conn.s.executeUpdate("insert into subjects values ('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
            conn.s.executeUpdate("insert into marks values('"+s+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"')");
            JOptionPane.showMessageDialog(null,"Marks Added Successfully");
            }
            catch(SQLException en)
            {
                en.getStackTrace();
            }
        }
    }
    public static void main(String[] args){
        new EnterMarks().setVisible(true);
    }
}
