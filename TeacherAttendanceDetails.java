/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author akky
 */
public class TeacherAttendanceDetails extends JFrame implements ActionListener {
        JLabel l;
        JTable jt;
        JButton b;
        String top[]={"Emp_ID.","Date","First Half","Second Half"};
        String down[][]=new String[15][4];
        int i=0,j=0;
        TeacherAttendanceDetails()
        {
            getContentPane().setBackground(Color.white);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocation(250,100);
            setSize(800,200);
            setLayout(new BorderLayout());
            
                     
            l=new JLabel("TECHER ATTENDANCE DETAILS");
            l.setForeground(Color.BLUE);
            l.setFont(new Font("verdana",Font.BOLD | Font.ITALIC,20));
            add(l,"North");
            
                       
            try{
                    connection c=new connection();
                    ResultSet rs=c.s.executeQuery("select * from t_attendance");
                    while(rs.next())
                    {
                        down[i][j++]=String.valueOf(rs.getInt("emp_id"));
                        down[i][j++]=rs.getString("dated");
                        down[i][j++]=rs.getString("firsthalf");
                        down[i][j++]=rs.getString("secondhalf");
                        
                        j=0;
                        i++;
                    }
                    jt=new JTable(down,top);
                    jt.setFont(new Font("serif",Font.BOLD,12));
                    jt.setForeground(Color.blue);
                    jt.setBackground(Color.gray);
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
            new TeacherAttendanceDetails().setVisible(true);
        }    
}
