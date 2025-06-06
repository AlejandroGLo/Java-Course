package Databases;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DbDemo2 {
    public static void main(String agrs)throws Exception{
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C//sqlite/univ");

        Statement stm = con.createStatement();

        stm.executeUpdate("insert into dept values(70, 'Chem')");
        stm.executeUpdate("delete from dept values(70, 'Chem')");
        stm.executeUpdate("update dept set dname='Chem' where deptno=50");

        PreparedStatement pstm = con.prepareStatement("insert into students values(?,?,?,?)");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student data");

        int r = sc.nextInt();
        String name = sc.next();
        String city=sc.next();
        int dno = sc.nextInt();

        pstm.setInt(1,r);
        pstm.setString(2, name);
        pstm.setString(3, city);
        pstm.setInt(4, dno);


        stm.close();
        con.close();
    }
    
}
