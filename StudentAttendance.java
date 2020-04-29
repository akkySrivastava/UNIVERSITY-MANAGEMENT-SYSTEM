/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author akky
 */
public class StudentAttendance extends JFrame implements ActionListener {
        JLabel l1,l2,l3;
        Choice c,c1,c2;
        JButton b,b1;
        StudentAttendance()
        {
            getContentPane().setBackground(Color.white);
            setLocation(250,100);
            setSize(600,550);
            setLayout(new GridLayout(4,2,50,50));
            
                        
            l1=new JLabel("Select Roll No:");
            l1.setFont(new Font("tahoma",Font.BOLD,16));
            add(l1);
            
            c=new Choice();
            try{
                    connection cnn=new connection();
                    ResultSet rs=cnn.s.executeQuery("select roll from studentdetails");
                    while(rs.next())
                            {
                                c.add(""+rs.getInt("roll"));
                            }
            }
            catch(Exception e)
            {
                e.getMessage();
            }
            add(c);
            
            l2=new JLabel("First Half");
            l2.setFont(new Font("tahoma",Font.BOLD,16));
            add(l2);
            
            c1=new Choice();
            c1.add("Present");
            c1.add("Absent");
            c1.add("Leave");
            add(c1);
            
            l3=new JLabel("Second Half");
            l3.setFont(new Font("tahoma",Font.BOLD,16));
            add(l3);
            
            c2=new Choice();
            c2.add("Present");
            c2.add("Absent");
            c2.add("Leave");
            add(c2);
            
            b=new JButton("Submit");
            b.setForeground(Color.white);
            b.setBackground(Color.black);
            b.setFont(new Font("tahoma",Font.BOLD,15));
            add(b);
            
            b1=new JButton("Cancel");
            b1.setForeground(Color.white);
            b1.setBackground(Color.black);
            b1.setFont(new Font("tahoma",Font.BOLD,15));
            add(b1);
            
            b.addActionListener(this);
            b1.addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b)
            {
                try{
                connection conn=new connection();
                String dt=new java.util.Date().toString();
                int s=Integer.parseInt(c.getSelectedItem());
                String s1=c1.getSelectedItem();
                String s2=c2.getSelectedItem();
                conn.s.executeUpdate("insert into s_attendance values('"+s+"','"+dt+"','"+s1+"','"+s2+"')");
                JOptionPane.showMessageDialog(null,"Attendance Confirmed at:"+dt);
                this.setVisible(false);
            }
            
            catch(SQLException el)
                    {
                        el.getMessage();
                    }
            }
            if(ae.getSource()==b1)
            {
                this.setVisible(false);
            }
        }
      public static void main(String[] args)
      {
          new StudentAttendance().setVisible(true);
      }
}
