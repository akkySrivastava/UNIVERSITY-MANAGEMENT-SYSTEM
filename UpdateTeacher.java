/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author akky
 */
public class UpdateTeacher extends JFrame implements ActionListener {
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,text;
    JTextField c,c1;
    JButton b1,b2,b3;
    Font f=new Font("tahoma",Font.BOLD,15);
    Font f1=new Font("monospaced",Font.BOLD,15);
    
    UpdateTeacher()
    {
        super("Add Teacher Details");
        getContentPane().setBackground(Color.white);
        setLocation(300,80);
        setSize(850,750);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        
        l=new JLabel("Enter Emp_ID of Teacher");
        l.setFont(new Font("Helvetica",Font.ITALIC,20));
        l.setBounds(50,30,250,30);
        l.setForeground(Color.BLUE);
        add(l);
        
        text=new JTextField();
        text.setFont(f1);
        text.setBounds(320,30,180,30);
        add(text);
        
        b3=new JButton("Search");
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.black);
        b3.setBounds(550,30,180,30);
        b3.setFont(f1);
        add(b3);
        
        l1=new JLabel("Name");
        l1.setFont(f);
        l1.setBounds(50,90,100,50);
        l1.setForeground(Color.GREEN);
        add(l1);
        
        t=new JTextField();
        t.setBounds(180,100,180,30);
        t.setFont(f1);
        add(t);
        
        l2=new JLabel("Age");
        l2.setFont(f);
        l2.setBounds(50,170,100,50);
        add(l2);
        
        t1=new JTextField();
        t1.setBounds(180,180,180,30);
        t1.setFont(f1);
        add(t1);
        
        l3=new JLabel("Address");
        l3.setFont(f);
        l3.setBounds(50,250,100,50);
        add(l3);
        
        t2=new JTextField();
        t2.setBounds(180,260,180,30);
        t2.setFont(f1);
        add(t2);
        
        l4=new JLabel("Email Id");
        l4.setFont(f);
        l4.setBounds(50,330,100,50);
        add(l4);
        
        t3=new JTextField();
        t3.setBounds(180,340,180,30);
        t3.setFont(f1);
        add(t3);
        
        l5=new JLabel("Class XII(%)");
        l5.setFont(f);
        l5.setBounds(50,410,100,50);
        add(l5);
        
        t4=new JTextField();
        t4.setBounds(180,420,180,30);
        t4.setFont(f1);
        add(t4);
        
        l6=new JLabel("Emp Id");
        l6.setFont(f);
        l6.setBounds(50,490,100,50);
        l6.setForeground(Color.red);
        add(l6);
        
        t5=new JTextField();
        t5.setBounds(180,500,180,30);
        t5.setFont(f1);
        t5.setEditable(false);
        add(t5);
        
        l7=new JLabel("Edu Qua.");
        l7.setFont(f);
        l7.setBounds(50,570,100,50);
        l7.setForeground(Color.ORANGE);
        add(l7);
        
        c=new JTextField();
        c.setBounds(180,575,180,30);
        add(c);
        
        l8=new JLabel("Father's Name");
        l8.setFont(f);
        l8.setBounds(420,90,150,50);
        add(l8);
        
        t6=new JTextField();
        t6.setBounds(580,100,180,30);
        t6.setFont(f1);
        add(t6);
        
        l9=new JLabel("DOB(dd/mm/yy)");
        l9.setFont(f);
        l9.setBounds(420,170,180,50);
        add(l9);
        
        t7=new JTextField();
        t7.setBounds(580,180,180,30);
        t7.setFont(f1);
        add(t7);
        
        l10=new JLabel("Phone");
        l10.setFont(f);
        l10.setBounds(420,250,100,50);
        add(l10);
        
        t8=new JTextField();
        t8.setBounds(580,260,180,30);
        t8.setFont(f1);
        add(t8);
        
        l11=new JLabel("Class X(%)");
        l11.setFont(f);
        l11.setBounds(420,330,100,50);
        add(l11);
        
        t9=new JTextField();
        t9.setBounds(580,340,180,30);
        t9.setFont(f1);
        add(t9);
        
        l12=new JLabel("Aadhar No.");
        l12.setFont(f);
        l12.setBounds(420,410,180,30);
        add(l12);
        
        t10=new JTextField();
        t10.setBounds(580,420,180,30);
        t10.setFont(f1);
        add(t10);
        
        l13=new JLabel("Department");
        l13.setFont(f);
        l13.setBounds(420,490,100,50);
        add(l13);
        
        c1=new JTextField();
        c1.setBounds(580,495,180,30);
        add(c1);
        
        b1=new JButton("Submit");
        b1.setForeground(Color.white);
        b1.setBackground(Color.BLACK);
        b1.setBounds(210,650,150,40);
        b1.setFont(f);
        add(b1);
        
        b2=new JButton("Cancel");
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLACK);
        b2.setBounds(420,650,150,40);
        b2.setFont(f);
        add(b2);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        {
            String s=t.getText();//name
            int s1=Integer.parseInt(t1.getText());//age
            String s2=t2.getText();//address
            String s3=t3.getText();//email
            Float s4=Float.parseFloat(t4.getText());//XII
            int s5=Integer.parseInt(text.getText());//empId
            String s6=t6.getText();//father
            String s7=t7.getText();//dob
            String s8=t8.getText();//phone
            Float s9=Float.parseFloat(t9.getText());//X
            String s10=t10.getText();//aadhar
            String s11=c1.getText();//departmt
            String s12=c.getText();///edu Q
            
            try{
                connection css=new connection();
                css.s.executeUpdate("update teacherdetails set s_name='"+s+"',father_name='"+s6+"',age='"+s1+"',address='"+s2+"',email='"+s3+"',emp_id='"+s5+"',dob='"+s7+"',phone='"+s8+"',X_marks='"+s9+"',XII_marks='"+s4+"',edu_Qua='"+s12+"',aadhar_no='"+s10+"',department='"+s11+"' where emp_id='"+s5+"'");
                JOptionPane.showMessageDialog(null,"Updation Sucessfull");
                new TeacherDetails().setVisible(true);
                this.setVisible(false);
                
            }
            catch(Exception en)
            {
                en.getStackTrace();
            }
        }
        else  if(e.getSource()==b2)
        {
            this.setVisible(false);
            
        }
        else if(e.getSource()==b3)
        {
            int str=Integer.parseInt(text.getText());
            try{
            connection conn=new connection();
            ResultSet rs=conn.s.executeQuery("select * from teacherdetails where emp_id='"+str+"'");
            if(rs.next())
            {
                t.setText(rs.getString("s_name"));
                t1.setText(String.valueOf(rs.getInt("age")));
                t2.setText(rs.getString("address"));
                t3.setText(rs.getString("email"));
                t4.setText(String.valueOf(rs.getFloat("XII_marks")));
                t5.setText(String.valueOf(rs.getInt("emp_id")));
                t6.setText(rs.getString("father_name"));
                t7.setText(rs.getString("dob"));
                t8.setText(rs.getString("phone"));
                t9.setText(String.valueOf(rs.getFloat("X_marks")));
                t10.setText(rs.getString("aadhar_no"));
                c.setText(rs.getString("edu_Qua"));
                c1.setText(rs.getString("department"));
                
            }
                
        }
            catch(Exception en)
            {
                en.getMessage();
            }
        }
    }
    public static  void main(String[] args)
    {
        new UpdateTeacher().setVisible(true);
    }
    
}
