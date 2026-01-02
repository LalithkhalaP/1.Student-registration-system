package studentregistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentRegistrationSystem2 {

 public static void main(String[] args) throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db", "root", "lalli@2007");
            System.out.println("=== Student Registration System ===\n");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();
             

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            
           
           PreparedStatement ps = con.prepareStatement("INSERT INTO students (name, roll, dept) VALUES (?, ?, ?)");

          
            ps.setString(1, name);
            ps.setInt(2, roll);
            ps.setString(3, dept);

            ps.executeUpdate();

           System.out.println("\nResources closed successfully.");
            
            con.close(); 
            }
}
               
