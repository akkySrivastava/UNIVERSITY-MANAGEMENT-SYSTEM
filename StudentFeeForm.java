/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author akky
 */
public class StudentFeeForm extends JFrame implements ActionListener, ItemListener{
    JLabel l,l1,l2,l3,l4,l5,l6;
    JComboBox c1,c2;
    JTextField t,t1,t2,t3,t4,okfee;
    JPanel contentpane;
    JButton b1,b2,ok;
    Font font=new Font("Helvetica",Font.BOLD,18);
    Font font1=new Font("monospaced",Font.BOLD,17);
    StudentFeeForm()
    {
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(100,100);
        setSize(550,500);
        
        
        contentpane=new JPanel();
        contentpane.setBounds(20,20,546,496);
        contentpane.setLayout(null);
        
        l=new JLabel("Select Roll No");
        l.setFont(font);
        l.setForeground(Color.blue);
        l.setBounds(30,30,180,30);
        contentpane.add(l);
        
        c1=new JComboBox();
        try{
               connection c=new connection();
               ResultSet rs=c.s.executeQuery("select roll from studentdetails");
               while(rs.next())
               {
                   c1.addItem(rs.getInt("roll"));
               }
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        c1.setBounds(250,30,230,30);
        c1.setFont(font);
        contentpane.add(c1);
        
        l1=new JLabel("Name");
        l1.setFont(font);
        l1.setForeground(Color.blue);
        l1.setBounds(30,70,180,30);
        contentpane.add(l1);
        
        t=new JTextField();
        t.setEditable(false);
        t.setBounds(250,70,230,30);
        t.setFont(font1);
        t.setEditable(false);
        contentpane.add(t);
        
        l2=new JLabel("Father's Name");
        l2.setFont(font);
        l2.setForeground(Color.blue);
        l2.setBounds(30,110,180,30);
        contentpane.add(l2);
        
        t1=new JTextField();
        t1.setEditable(false);
        t1.setBounds(250,110,230,30);
        t1.setFont(font1);
        t1.setEditable(false);
        contentpane.add(t1);
        
        l3=new JLabel("Course");
        l3.setFont(font);
        l3.setForeground(Color.blue);
        l3.setBounds(30,150,180,30);
        contentpane.add(l3);
        
        t2=new JTextField();
        t2.setEditable(false);
        t2.setBounds(250,150,230,30);
        t2.setFont(font1);
        t2.setEditable(false);
        contentpane.add(t2);
        
        l4=new JLabel("Branch");
        l4.setFont(font);
        l4.setForeground(Color.blue);
        l4.setBounds(30,190,180,30);
        contentpane.add(l4);
        
        t3=new JTextField();
        t3.setEditable(false);
        t3.setBounds(250,190,230,30);
        t3.setFont(font1);
        t3.setEditable(false);
        contentpane.add(t3);
        
        l5=new JLabel("Semester");
        l5.setFont(font);
        l5.setForeground(Color.blue);
        l5.setBounds(30,230,180,30);
        contentpane.add(l5);
        
        c2=new JComboBox();
        c2.setBounds(250,230,230,30);
        c2.setFont(font1);
        c2.addItem("1st");
        c2.addItem("2nd");
        c2.addItem("3rd");
        c2.addItem("4th");
        c2.addItem("5th");
        c2.addItem("6th");
        c2.addItem("7th");
        c2.addItem("8th");
        contentpane.add(c2);
        
        l6=new JLabel("TotalPayable");
        l6.setFont(font);
        l6.setForeground(Color.blue);
        l6.setBounds(30,270,180,30);
        contentpane.add(l6);
        
        t4=new JTextField();
         
        t4.setBounds(250,270,230,30);
        t4.setFont(font1);
        contentpane.add(t4);
        
        b1=new JButton("Pay");
        b1.setBounds(30,350,180,30);
        b1.setFont(font);
        contentpane.add(b1);
        
        b2=new JButton("Cancel");
        b2.setBounds(250,350,230,30);
        b2.setFont(font1);
        contentpane.add(b2);
        
        
        
        add(contentpane);
        
       
        c1.addItemListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            int s=Integer.parseInt(c1.getSelectedItem().toString());
            String s1=t.getText();
            String s2=t1.getText();
            String s3=t2.getText();
            String s4=t3.getText();
            String s6=c2.getSelectedItem().toString();
            float s5=Float.parseFloat(t4.getText());
            try{
                    connection cnn=new connection();
                    cnn.s.executeUpdate("insert into fee values('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
                    JOptionPane.showMessageDialog(null,"Fee Deposited\n Amount="+t4.getText()+"received");
                    this.setVisible(false);
            }
            catch(Exception e)
            {
                e.getMessage();
            }
        }
        else if(ae.getSource()==b2)
        {
            this.setVisible(false);
            
        }
    }
    @Override
    public void itemStateChanged(ItemEvent ie){
        
           connection css=new connection();
            try {
                
                ResultSet st= css.s.executeQuery("select s_name, father_name, course, branch from studentdetails where roll='"+Integer.parseInt(c1.getSelectedItem().toString())+"'");
                if(st.next())
                {
                    t.setText(st.getString("s_name"));
                    t1.setText(st.getString("father_name"));
                    t2.setText(st.getString("course"));
                    t3.setText(st.getString("branch"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(StudentFeeForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    public static void main(String[] args){
        new StudentFeeForm().setVisible(true);
    }
}
