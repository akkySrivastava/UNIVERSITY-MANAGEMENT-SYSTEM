/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author akky
 */
public class StudentDetails extends JFrame implements ActionListener {
    JLabel l,l1,l3,l2;
    JTable jt;
    JTextField t;
    JButton b,b1,b3,b4;
    Font f=new Font("Serif",Font.BOLD,18);
    String top[]={"Name","Father's Name","Age","Address","Email","DOB","Phone","X_Marks","XII_Marks","Branch","Aadhar_NO","Course","Roll"};
    String down[][]=new String[25][13];
    int i=0,j=0;
    StudentDetails()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setSize(1300,800);
        setLocation(100,100);
        setLayout(null);
        
        l=new JLabel("STUDENT DETAILS");
        l.setFont(f);
        l.setForeground(new Color(0,0,200));
        l.setBounds(550,50,200,30);
        add(l);
        try{
                connection c=new connection();
                ResultSet rs=c.s.executeQuery("select * from studentdetails");
                while(rs.next())
                {
                    down[i][j++]=rs.getString("s_name");
                    down[i][j++]=rs.getString("father_name");
                    down[i][j++]=String.valueOf(rs.getInt("age"));
                    down[i][j++]=rs.getString("address");
                    down[i][j++]=rs.getString("email");
                    down[i][j++]=rs.getString("dob");
                    down[i][j++]=rs.getString("phone");
                    down[i][j++]=String.valueOf(rs.getFloat("X_marks"));
                    down[i][j++]=String.valueOf(rs.getString("XII_marks"));
                    down[i][j++]=rs.getString("branch");
                    down[i][j++]=rs.getString("aadhar_no");
                    down[i][j++]=rs.getString("course");
                    down[i][j++]=String.valueOf(rs.getInt("roll"));
                    i++;
                    j=0;
                }
                jt=new JTable(down,top);
                jt.setFont(f);
                JScrollPane js=new JScrollPane(jt);
                js.setBounds(50,100,1190,400);
                add(js);
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        l2=new JLabel("Enter Roll No of Student: ");
        l2.setFont(f);
        l2.setBounds(50,550,250,30);
        add(l2);
        
        t=new JTextField();
        t.setFont(f);
        t.setBounds(330,550,180,30);
        add(t);
        
        b=new JButton("Delete");
        b.setFont(f);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(580,550,180,30);
        add(b);
        
        l3=new JLabel("Add New Students: ");
        l3.setFont(f);
        l3.setForeground(Color.green);
        l3.setBounds(50,600,250,30);
        add(l3);
        
        b1=new JButton("Add");
        b1.setFont(f);
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setBounds(330,600,180,30);
        add(b1);
        
        l1=new JLabel("Update Students Details: ");
        l1.setFont(f);
        l1.setBounds(50,650,250,30);
        add(l1);
        
        b3=new JButton("Update");
        b3.setForeground(Color.white);
        b3.setBackground(Color.BLACK);
        b3.setFont(f);
        b3.setBounds(330,650,180,30);
        add(b3);
        
        b4=new JButton("EXIT");
        b4.setForeground(Color.RED);
        b4.setFont(f);
        b4.setBounds(580,650,180,30);
        add(b4);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b)
        {
            try{
            connection conn=new connection ();
            int roll=Integer.parseInt(t.getText());
            conn.s.executeUpdate("delete from studentdetails where roll='"+roll+"'");
                JOptionPane.showMessageDialog(null,"Deleted Successfully");
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            
        }
        
        catch(Exception e)
                {   
                    e.getMessage();
                }
    }
        if(ae.getSource()==b1)
        {
            new AddStudent().setVisible(true);
            this.setVisible(false);
        }
        if(ae.getSource()==b3)
        {
            new UpdateStudent().setVisible(true);
            this.setVisible(false);
        }
        if(ae.getSource()==b4)
        {
            dispose();
        }
    }
    public static void main(String[] args){
        new StudentDetails().setVisible(true);
    }
}
