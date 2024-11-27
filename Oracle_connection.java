package Js;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Same {

	public static void main(String[] args) throws SQLException,Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb","hr","hr");
		
		java.sql.Statement st=con.createStatement();
		
		ResultSet rt=st.executeQuery("select first_name,last_name from employees");
		int count=0;
		while(rt.next()) {
			String name=rt.getString("first_name");
			String last=rt.getString("last_name");
			System.out.println(name+" "+last);
			count++;
		}
		System.out.println(count);
		

	}

}
