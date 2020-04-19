import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection
{
   public static void main(String arg[])
   {
	   Connection con=null;
	   try
	   {
		   Class.forName("com.mysql.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","tiger");
		   System.out.println("Connected");
		   //jdbc:mysql://localhost:3306/mysq
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }finally
	   {
		   try
		   {
			   con.close();
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
	   }
   }
}
