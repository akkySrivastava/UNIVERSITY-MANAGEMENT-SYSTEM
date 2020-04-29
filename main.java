/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author akky
 */
public class main extends JFrame implements ActionListener {
    JMenuBar m1;
    JMenu master,user,attendance,attendance_details,exam,report,fee,utility,about,exit;
    JMenuItem t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19;
    public main() throws IOException
    {
        
        
        super("UNIVERSITY MANAGEMENT SYSTEM 2.0");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1000);
        ImageIcon I=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/main.jpg"));
        Image I1=I.getImage().getScaledInstance(1920,1000,Image.SCALE_DEFAULT);
        ImageIcon I2=new ImageIcon(I1);
        JLabel l=new JLabel(I2);
        add(l);
        
              
        m1=new JMenuBar();
        m1.setBackground(Color.YELLOW);
        
        master=new JMenu("MASTER");
        t1=new JMenuItem("New Faculty");
        t2=new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);
        
        t1.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon1.png"));
        Image image=icon.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t1.setIcon(new ImageIcon(image));
        t1.setMnemonic('A');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        
        t2.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon2.png"));
        Image image1=icon1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        t2.setIcon(new ImageIcon(image1));
        t2.setMnemonic('B');
        t2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        
        t1.addActionListener(this);
        t2.addActionListener(this);
        
        master.add(t1);
        master.add(t2);
        
        user=new JMenu("DETAILS");
        t3=new JMenuItem("Student Details");
        t4=new JMenuItem("Teacher Details");
        user.setForeground(Color.BLACK);
        
        t3.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon3.png"));
        Image image2=icon2.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t3.setIcon(new ImageIcon(image2));
        t3.setMnemonic('C');
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        
        t4.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon4.jpg"));
        Image image3=icon3.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t4.setIcon(new ImageIcon(image3));
        t4.setMnemonic('D');
        t4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
        
        t3.addActionListener(this);
        t4.addActionListener(this);
        
        user.add(t3);
        user.add(t4);
        
        attendance=new JMenu("ATTENDANCE");
        t5=new JMenuItem("Student Attendance");
        t6=new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.blue);
        
        t5.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon14.jpg"));
        Image image4=icon4.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t5.setIcon(new ImageIcon(image4));
        t5.setMnemonic('E');
        t5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
        
        t6.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon15.png"));
        Image image5=icon5.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t6.setIcon(new ImageIcon(image5));
        t6.setMnemonic('F');
        t6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.ALT_MASK));
        
        t5.addActionListener(this);
        t6.addActionListener(this);
        
        attendance.add(t5);
        attendance.add(t6);
        
        attendance_details=new JMenu("ATTENDANCE_DETAILS");
        t7=new JMenuItem("Student Attendance Details");
        t8=new JMenuItem("Teacher Attendance Details");
        attendance_details.setForeground(Color.RED);
        
        t7.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon15.png"));
        Image image6=icon6.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t7.setIcon(new ImageIcon(image6));
        t7.setMnemonic('G');
        t7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        
        t8.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon14.jpg"));
        Image image7=icon7.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t8.setIcon(new ImageIcon(image7));
        t8.setMnemonic('H');
        t8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.CTRL_MASK));
        
        t7.addActionListener(this);
        t8.addActionListener(this);
        
        attendance_details.add(t7);
        attendance_details.add(t8);
        
        exam=new JMenu("EXAMINATION");
        t9=new JMenuItem("Examination Details");
        t10=new JMenuItem("Enter Marks");
        exam.setForeground(Color.GREEN);
        
        t9.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon16.png"));
        Image image8=icon8.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t9.setIcon(new ImageIcon(image8));
        t9.setMnemonic('I');
        t9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        
        t10.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon17.png"));
        Image image9=icon9.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t10.setIcon(new ImageIcon(image9));
        t10.setMnemonic('J');
        t10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        
        t9.addActionListener(this);
        t10.addActionListener(this);
        
        exam.add(t9);
        exam.add(t10);
        
        report=new JMenu("UDATE DETAILS");
        t11=new JMenuItem("Update Students");
        t12=new JMenuItem("Update Teachers");
        report.setForeground(Color.RED);
        
        t11.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon5.png"));
        Image image10=icon10.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t11.setIcon(new ImageIcon(image10));
        t11.setMnemonic('K');
        t11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
        
        t12.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon6.png"));
        Image image11=icon11.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t12.setIcon(new ImageIcon(image11));
        t12.setMnemonic('L');
        t12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        
        t11.addActionListener(this);
        t12.addActionListener(this);
        
        report.add(t11);
        report.add(t12);
        
        fee=new JMenu("FEE DETAILS");
        t13=new JMenuItem("Fee Structure");
        t14=new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLUE);
        
        t13.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon12=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon1.png"));
        Image image12=icon12.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t13.setIcon(new ImageIcon(image12));
        t13.setMnemonic('M');
        t13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        
        t14.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon13=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon1.png"));
        Image image13=icon13.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t14.setIcon(new ImageIcon(image13));
        t14.setMnemonic('N');
        t14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        
        t13.addActionListener(this);
        t14.addActionListener(this);
        
        fee.add(t13);
        fee.add(t14);
        
        utility=new JMenu("UTILITY");
        t15=new JMenuItem("NotePad");
        t16=new JMenuItem("Calculator");
        t17=new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);
        
        t15.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon14=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon9.png"));
        Image image14=icon14.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t15.setIcon(new ImageIcon(image14));
        t15.setMnemonic('O');
        t15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        
        t16.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon15=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon10.png"));
        Image image15=icon15.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t16.setIcon(new ImageIcon(image15));
        t16.setMnemonic('P');
        t16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        
        t17.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon16=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon11.png"));
        Image image16=icon16.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t17.setIcon(new ImageIcon(image16));
        t17.setMnemonic('Q');
        t17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        
        t15.addActionListener(this);
        t16.addActionListener(this);
        t17.addActionListener(this);
        
        utility.add(t15);
        utility.add(t16);
        utility.add(t17);
        
        
        about=new JMenu("About");
        about.setForeground(Color.GREEN);
        
        t18=new JMenuItem("About Us");
        t18.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon17=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon13.jpg"));
        Image image17=icon17.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t18.setIcon(new ImageIcon(image17));
        t18.setMnemonic('R');
        t18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
        
        t18.addActionListener(this);
        
        about.add(t18);
        
        exit=new JMenu("EXIT");
        exit.setForeground(Color.RED);
        
        t19=new JMenuItem("Exit");
        t19.setFont(new Font("courier",Font.BOLD,16));
        ImageIcon icon18=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icons/icon12.png"));
        Image image18=icon18.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        t19.setIcon(new ImageIcon(image18));
        t19.setMnemonic('X');
        t19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        
        t19.addActionListener(this);
        
        exit.add(t19);
        
        m1.add(master);
        m1.add(user);
        m1.add(attendance);
        m1.add(attendance_details);
        m1.add(exam);
        m1.add(report);
        m1.add(fee);
        m1.add(utility);
        m1.add(about);
        m1.add(exit);
        
        setJMenuBar(m1);
        setFont(new Font("Sans-Serif",Font.BOLD,17));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String msg=ae.getActionCommand();
        switch (msg) {
            case "New Faculty":
                new AddTeacher().setVisible(true);
                break;
            case "New Student Admission":
                new AddStudent().setVisible(true);
                break;
            case "Student Details":
                new StudentDetails().setVisible(true);
                break;
            case "Teacher Details":
                new TeacherDetails().setVisible(true);
                break;
            case "Update Students":
                new UpdateStudent().setVisible(true);
                break;
            case "Update Teachers":
                new UpdateTeacher().setVisible(true);
                break;
            case "Fee Structure":
                new FeeStructure().setVisible(true);
                break;
            case "Student Fee Form":
                new StudentFeeForm().setVisible(true);
                break;
            case "NotePad":
                try{
                    Runtime.getRuntime().exec("notepad.exe");
                }
                catch(Exception e){
                    e.getMessage();
                }   break;
            case "Calculator":
                try{
                    
                    Runtime.getRuntime().exec("calc.exe");
                }
                catch(Exception e){
                    e.getMessage();
                }   break;
            case "Web Browser":
                try {
                    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }   break;
            case "Exit":
                System.exit(0);
            case "About Us":
                new AboutUs().setVisible(true);
                break;
            case "Student Attendance":
                new StudentAttendance().setVisible(true);
                break;
            case "Teacher Attendance":
                new TeacherAttendance().setVisible(true);
                break;
            case "Student Attendance Details":
                new StudentAttendanceDetails().setVisible(true);
                break;
            case "Teacher Attendance Details":
                new TeacherAttendanceDetails().setVisible(true);
                break;
            case "Examination Details":
                new ExaminationDetails().setVisible(true);
                break;
            case "Enter Marks":
                new EnterMarks().setVisible(true);
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) throws IOException
    {
        new main().setVisible(true);
    }
}
