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
public class Marks extends JFrame implements ActionListener{
    TextArea t1;
    JPanel p1;
    JButton b;
    Marks()
    {}
    Marks(String s)
    {
        setLayout(new BorderLayout());
        setSize(500,500);
        String str=s;
        
        p1=new JPanel();
        t1=new TextArea(70,35);
        t1.setBackground(Color.white);
        
        JScrollPane js=new JScrollPane();
        t1.setFont(new Font("serif",Font.ITALIC,18));
        
        add(p1,"North");
        add(js,"Center");
        
        setLocation(450,200);
        
        mark(str);
        b=new JButton("PRINT");
        js.add(b);
        p1.add(t1);
        b.addActionListener(this);
    }
    public void mark(String s)
    {
        try{
                connection conn=new connection();
                t1.setText("\n\t\tMarks Statement\n\nSubjects");
                ResultSet rs=conn.s.executeQuery("select * from subjects where roll='"+s+"'");
                if(rs.next()){
                t1.append("\n\t"+rs.getString("sub1"));
                t1.append("\n\t"+rs.getString("sub2"));
                t1.append("\n\t"+rs.getString("sub3"));
                t1.append("\n\t"+rs.getString("sub4"));
                t1.append("\n\t"+rs.getString("sub5"));
                t1.append("\n");
                t1.append("---------------------------");
                t1.append("\n\n");
                }
                t1.append("Marks");
                ResultSet rs1=conn.s.executeQuery("select * from marks where roll='"+s+"'");
                if(rs1.next())
                {
                    int i=Integer.parseInt(rs1.getString("sub1"));
                    int i1=Integer.parseInt(rs1.getString("sub2"));
                    int i2=Integer.parseInt(rs1.getString("sub3"));
                    int i3=Integer.parseInt(rs1.getString("sub4"));
                    int i4=Integer.parseInt(rs1.getString("sub5"));
                    
                    t1.append("\n\t"+i);
                    t1.append("\n\t"+i1);
                    t1.append("\n\t"+i2);
                    t1.append("\n\t"+i3);
                    t1.append("\n\t"+i4);
                    int total=i+i1+i2+i3+i4;
                    t1.append("\n");
                    t1.append("-------------------------");
                    t1.append("\nTotal \t"+total+"/500");
                    t1.append("\n End of Statement");
                    t1.append("\n-----------------------------------------");
                    
                }
        
        }
        catch(Exception  e)
        {
            e.getMessage();
        }
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            //p1.print()
        }
    }
    public static void main(String[] args){
        new Marks().setVisible(true);
    }
}