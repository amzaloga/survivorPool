import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      Connection conn = DriverManager.getConnection(
        "jdbc:mysql://localhost/survivorpool?user=root&password=Football31*");
    } catch (Exception ex) {
      System.out.println("LocalizedMessage: " +
	  ex.getLocalizedMessage());
      System.out.println("Message: " + ex.getMessage());
      System.out.println("Cause: " + ex.getCause());
      System.out.println("Class: " + ex.getClass());
      System.out.println("StackTrace: " + ex.getStackTrace());
      System.exit(0);
    }
    System.out.println("Program terminated with no error. gucci gang");
  }
}
