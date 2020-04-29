/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.sql.*;
/**
 *
 * @author akky
 */
public class connection {
    Connection c;
    Statement s;
    public connection()
    {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                c=DriverManager.getConnection("jdbc:mysql://localhost:3306/university?autoReconnect=true&useSSL=false&user=root&password=Azadyadav123");
                s=c.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
                System.out.println(e);
        }
    }
    public static void main(String [] args)
    {
        connection conn=new connection();
        System.out.println("Connection Succeed");
    }
}
