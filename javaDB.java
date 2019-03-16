import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class javaDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try {
					Class.forName("com.mysql.jdbc.Driver");
				
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
					     Statement st=con.createStatement();
					     System.out.println("done");
					     
    ResultSet rs=st.executeQuery("Select * from student");
					     
					     while(rs.next())
					     {
					    	System.out.println(rs.getString(1));
					     }
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
	}



}
