package Js;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_Jdbc {

	public static void main(String[] args) throws SQLException,Exception {
		 String name="Mohan";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","Hr","hr");
		
		  PreparedStatement st=con.prepareStatement("Update employees set first_name=? where employee_id=100");
		  st.setString(1, name);
		  int count=st.executeUpdate();
		  
		  if(count>0) {
			  System.out.println("Updated sucsessfully");
		  }
		  else {
			  System.out.println("Failed");
		  }
		
		

	}

}
