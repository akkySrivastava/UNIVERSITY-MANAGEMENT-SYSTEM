/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author akky
 */
public class StudentAttendanceDetails extends JFrame implements ActionListener {
        JLabel l;
        JTable jt;
        JButton b;
        String top[]={"Roll NO.","Date","First Half","Second Half"};
        String down[][]=new String[15][4];
        int i=0,j=0;
        StudentAttendanceDetails()
        {
            getContentPane().setBackground(Color.white);
            //setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(250,100);
            setSize(800,200);
            setLayout(new BorderLayout());
            
                     
            l=new JLabel("STUDENT ATTENDANCE DETAILS");
            l.setForeground(Color.BLUE);
            l.setFont(new Font("verdana",Font.BOLD | Font.ITALIC,20));
            add(l,"North");
            
                       
            try{
                    connection c=new connection();
                    ResultSet rs=c.s.executeQuery("select * from s_attendance");
                    while(rs.next())
                    {
                        down[i][j++]=String.valueOf(rs.getInt("roll"));
                        down[i][j++]=rs.getString("dated");
                        down[i][j++]=rs.getString("firsthalf");
                        down[i][j++]=rs.getString("secondhalf");
                        
                        j=0;
                        i++;
                    }
                    jt=new JTable(down,top);
                    jt.setFont(new Font("serif",Font.BOLD,14));
                    jt.setForeground(Color.blue);
                    jt.setBackground(Color.white);
                    add(jt,"Center");
            }
            catch(SQLException ej){
                    ej.getErrorCode();
            }
            b=new JButton("PRINT");
            add(b,"South");
            JScrollPane js=new JScrollPane(jt);
            add(js);
            
                       
            b.addActionListener(this);
            
        }
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b){
                try {
                    jt.print();
                    this.setVisible(false);
                } catch (PrinterException ex) {
                    Logger.getLogger(StudentAttendanceDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
        public static void main(String[] args){
            new StudentAttendanceDetails().setVisible(true);
        }
}
