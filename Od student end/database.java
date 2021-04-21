import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class database {
   public void db(String dept,String rollno,String nod,String link,String date,String email,String year,int premission,String reason) throws Exception{
      //Registering the Driver
      DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver ());
      //Getting the connection
      String oracleUrl = "jdbc:oracle:thin:@localhost:1521/xe";
      Connection con = DriverManager.getConnection(oracleUrl, "lab", "sri");
      System.out.println("Connected to Oracle database.....");
      PreparedStatement pstmt = con.prepareStatement("INSERT INTO OD_REQUEST VALUES(?,?,?,?,?,?,?,?,?)");
      pstmt.setString(1, dept);
      pstmt.setString(2, rollno);
      pstmt.setString(3, nod);
      pstmt.setString(4, link);
      pstmt.setString(5, date);
      pstmt.setString(6, email);
      pstmt.setString(7, year);
      pstmt.setInt(8, premission);
      pstmt.setString(9, reason);	
      pstmt.execute();
      System.out.println("Record inserted");
   }
}