/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author akky
 */
public class AddStudent extends JFrame implements ActionListener  {
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,ls;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JComboBox c,c1;
    JButton b1,b2;
    Font f=new Font("tahoma",Font.BOLD,15);
    Font f1=new Font("monospaced",Font.BOLD,15);
    
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    long first=Math.abs(first4);
    AddStudent()
    {
        super("Add Student Details");
        getContentPane().setBackground(Color.white);
        setLocation(300,80);
        setSize(900,750);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        ls=new JLabel();
        ls.setBounds(0,0,900,800);
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/fourth.jpg"));
        Image I=i.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(I);
        ls.setIcon(i1);
        
        
        l=new JLabel("New Student Details");
        l.setFont(new Font("Helvetica",Font.ITALIC,20));
        l.setBounds(350,30,400,40);
        l.setForeground(Color.BLUE);
        add(l);
        
        l1=new JLabel("Name");
        l1.setFont(f);
        l1.setBounds(50,90,100,50);
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
        
        l6=new JLabel("Roll No.");
        l6.setFont(f);
        l6.setBounds(50,490,100,50);
        add(l6);
        
        t5=new JTextField();
        t5.setBounds(180,500,180,30);
        t5.setFont(f1);
        String ss=String.valueOf(first);
        String sn="1553".concat(ss);
        t5.setText(sn);
        add(t5);
        
        l7=new JLabel("Branch");
        l7.setFont(f);
        l7.setBounds(50,570,100,50);
        add(l7);
        
        c=new JComboBox();
        c.addItem("COMPUTER SCIENCE ENGINEERING");
        c.addItem("ELECTRIC AND COMMUNICATION ENGINEERING");
        c.addItem("MECHANICAL ENGINEERING");
        c.addItem("CIVIL ENGINEERING");
        c.addItem("METALLURICAL ENGINEERING");
        c.addItem("INFORMATION TECHNOLOGY");
        c.addItem("BIOTECHNOLOGY");
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
        
        l13=new JLabel("Course");
        l13.setFont(f);
        l13.setBounds(420,490,100,50);
        add(l13);
        
        c1=new JComboBox();
        c1.addItem("B.TECH");
        c1.addItem("M.TECH");
        c1.addItem("BCA");
        c1.addItem("MCA");
        c1.addItem("PGDCA");
        c1.addItem("PGDPC");
        c1.addItem("BscIT");
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
        add(ls);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
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
            int s5=Integer.parseInt(t5.getText());//roll
            String s6=t6.getText();//father
            String s7=t7.getText();//dob
            String s8=t8.getText();//phone
            Float s9=Float.parseFloat(t9.getText());//X
            String s10=t10.getText();//aadhar
            String s11=String.valueOf(c1.getSelectedItem());//course
            String s12=String.valueOf(c.getSelectedItem());///branch
            
            try{
                connection conn=new connection();
                if(conn!=null){
                conn.s.executeUpdate("insert into studentdetails values ('"+s+"','"+s6+"','"+s1+"','"+s2+"','"+s3+"','"+s7+"','"+s8+"','"+s9+"','"+s4+"','"+s12+"','"+s10+"','"+s11+"','"+s5+"')");
                JOptionPane.showMessageDialog(null,"Student Added Sucessfully");
                this.setVisible(false);
                }
            }
            catch(Exception en)
            {
                en.getStackTrace();
            }
        }
        if(e.getSource()==b2)
        {
            this.setVisible(false);
            
        }
    }
    public static  void main(String[] args)
    {
        new AddStudent().setVisible(true);
    }
}
