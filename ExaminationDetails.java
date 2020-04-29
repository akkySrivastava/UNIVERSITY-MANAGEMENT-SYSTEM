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
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author akky
 */
public class ExaminationDetails extends JFrame implements ActionListener{
    private final JPanel contentPane;
    private JTable table;
    private JTextField search;
    private final JButton b1;
    
    public void Book()
    {
        try{
                connection conn=new connection();
                String sql="select * from studentdetails";
                PreparedStatement st=conn.c.prepareStatement(sql);
                ResultSet rs=st.executeQuery();
                
                table.setModel(DbUtils.resultSetToTableModel(rs));
                rs.close();
                st.close();
                conn.c.close();
        }
        catch(SQLException en)
        {
            en.getMessage();
        }
    }
    ExaminationDetails(){
        setBounds(350,200,930,475);
       // setLocation(200,100);
        //setSize(800,400);
        setTitle("Check Grades and Marks");
        contentPane=new JPanel();
        contentPane.setBackground(Color.white);
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane js=new JScrollPane();
        js.setBounds(79,133,1080,282);
        contentPane.add(js);
        
        table=new JTable();
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                int row=table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row,12).toString());
            }
        });
        
        table.setBackground(Color.ORANGE);
        table.setForeground(Color.GRAY);
        table.setFont(new Font("verdana",Font.CENTER_BASELINE,17));
        js.setViewportView(table);
        
        b1=new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255,20,147),2,true));
        b1.setForeground(Color.blue);
        b1.setFont(new Font("monospaced",Font.BOLD,18));
        b1.setBounds(564,89,138,33);
        contentPane.add(b1);
        
        JLabel l1=new JLabel("Check Result");
        l1.setForeground(new Color(107,142,35));
        l1.setFont(new Font("raleway",Font.BOLD | Font.ITALIC ,30));
        l1.setBounds(300,15,357,33);
        contentPane.add(l1);
        
        search=new JTextField();
        search.setBackground(Color.white);
        search.setBorder(new LineBorder(new Color(255,105,180), 2,true));
        search.setForeground(Color.BLACK);
        search.setFont(new Font("raleway",Font.BOLD,17));
        search.setBounds(189,89,357,33);
        contentPane.add(search);
        search.setColumns(10);
        
        JLabel l3=new JLabel("Back");
        l3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ms)
            {
                setVisible(false);
            }
        });
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Helvetica",Font.BOLD | Font.ITALIC, 18));
        l3.setBounds(97,89,72,33);
        contentPane.add(l3);
        
        JPanel panel=new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0,120,120),3,true), "Student-Details" , TitledBorder.LEADING, TitledBorder.TOP,null, new Color(0,120,0)));
        panel.setBounds(67,60,1100,360);
        contentPane.add(panel);
        panel.setBackground(Color.white);
        Book();
        setSize(1200,500);
    }
    public void actionPerformed(ActionEvent ae){
        try{
                connection conn=new connection();
                if(ae.getSource()==b1)
                {
                    new Marks(search.getText()).setVisible(true);
                }
        }
        catch(Exception e)
        {
            e.getMessage();
        }
    }
    public static void main(String[] args){
        new ExaminationDetails().setVisible(true);
    }
    
}
