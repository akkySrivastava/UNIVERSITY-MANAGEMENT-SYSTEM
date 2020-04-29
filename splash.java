/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author akky
 */
public class splash {
    public static void main(String[] args)
    {
        sframe s=new sframe("UNIVERSITY MANAGEMENT STYSTEM");
        s.setVisible(true);
        int i;
        int x=1;
        for(i=2;i<=800;i+=4,x+=1)
        {
            s.setLocation((700-((i+x)/2)), (500-(i/2)));
            s.setSize((i+x),i);
            try{
                    Thread.sleep(20);
            }
            catch(Exception e)
            {
                e.getMessage();
            }
        }
    }
    
}
     class sframe extends JFrame implements Runnable{
         Thread t1;
        sframe(String s){
            super(s);
            setLayout(new FlowLayout());
            ImageIcon I=new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/download.jpg"));
            Image e=I.getImage().getScaledInstance(1000,667,Image.SCALE_DEFAULT);
            ImageIcon I2=new ImageIcon(e);
            
            JLabel l=new JLabel(I2);
            add(l);
            t1=new Thread(this);
            t1.start();
        }
        @Override
        public void run()
        {
            try{
            Thread.sleep(7000);
            this.setVisible(false);
            new loginPage().setVisible(true);
            
        }
            catch(Exception e)
            {
                e.getMessage();
            }
        }
        
}
