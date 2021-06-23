// Import required packages
import java.sql.*;
import java.lang.*;

         String CREATE_TABLE_SQL="CREATE TABLE patient (SN INT, Aadhar_number VARCHAR(45), First_Name VARCHAR(45), Last_Name VARCHAR(45),Phone_Number VARCHAR(45), Age INT, Symptoms VARCHAR(45));";
         String query = "insert into patient (SN, Aadhar_number, first_name, last_name, Phone_Number, age, Symptoms)"  + " values (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);//uid
         preparedStmt.setString (2, "1234567891234567");
			preparedStmt.setString (3, "Ram");//name
			preparedStmt.setString (4, "Gopal");//lastname
         preparedStmt.setString (5, "8448172782");
			preparedStmt.setInt(6, 26);//age
         preparedStmt.setString (7, "Dry Cough");
			preparedStmt.execute();
			preparedStmt.setInt (1, 2);//uid
         preparedStmt.setString (2, "1234567891234568");
			preparedStmt.setString (3, "Sanju");//name
			preparedStmt.setString (4, "Samson");//lastname
         preparedStmt.setString (5, "8448172782");
			preparedStmt.setInt(6, 29);//age
         preparedStmt.setString (7, "Dry Cough, Vomit");
			preparedStmt.execute();

public class Question101 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              
              // JDBC Codes in the hidden section

              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              System.out.print(conn.isValid(1));
              conn.close();

// JDBC Codes in the visible section

        }
       catch(Exception e){ System.out.println(e);}  
    }
}





//Write the JDBC codes needed to create a Connection interface 
//using the DriverManager class and the variable DB_URL.  Check 
//whether the connection is successful using 'isAlive(timeout)' 
//method to generate the output, which is either 'true' or 'false'.

import java.sql.*;
import java.lang.*;
import java.util.Scanner;
public class Question102 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              conn = DriverManager.getConnection(DB_URL);
              System.out.print(conn.isValid(1));
	        }
       catch(Exception e){ System.out.println(e);}  
    }
}


import java.sql.*;  // All sql classes are imported
import java.lang.*; // Semicolon is added
import java.util.Scanner;
public class Question103 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              // Connection object is created
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();

              String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
              // Execute the statement containing SQL command
              stmt.executeUpdate(CREATE_TABLE_SQL);

              String alter ="ALTER TABLE players RENAME TO sports;";          
              stmt.executeUpdate(alter);

              conn.close();
              System.out.print(conn.isClosed());
       }
       catch(Exception e){ System.out.println(e);}  
    }
}




              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
// The statement containing SQL command to create table "players"
String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
// Execute the statement containing SQL command
stmt.executeUpdate(CREATE_TABLE_SQL);
String query = " insert into PLAYERS (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Ram");
			preparedStmt.setString (3, "Gopal");
			preparedStmt.setInt(4, 26);

			preparedStmt.execute();
	  
			preparedStmt.setInt (1, 2);
			preparedStmt.setString (2, "John");
			preparedStmt.setString   (3, "Mayer");
			preparedStmt.setInt(4, 22);
			
			preparedStmt.execute();

//Evaluation Portion
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			conn.close();
			

		}catch(Exception e){ System.out.println(e);}  
	}  
} 



 query = " insert into PLAYERS (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";

			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Ram");
			preparedStmt.setString (3, "Gopal");
			preparedStmt.setInt(4, 26);

			preparedStmt.execute();
	  
			preparedStmt.setInt (1, 2);
			preparedStmt.setString (2, "John");
			preparedStmt.setString   (3, "Mayer");
			preparedStmt.setInt(4, 22);
			
			preparedStmt.execute();
// write SQL command to update table data
query = " UPDATE Players SET First_name ='Rama',Last_name = 'Gopala', Age = 24  WHERE UID=1;";

// Execute the SQL command to update the table data
stmt.executeUpdate(query);
ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			conn.close();
			

		}
                catch(Exception e){ System.out.println(e);}  
	}  
} 


String CREATE_TABLE_SQL="CREATE TABLE players ( UID INT, first_name VARCHAR(45), last_name VARCHAR(45), age INT);";
			stmt.executeUpdate(CREATE_TABLE_SQL);			
			query = " insert into Players (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Rama");
			preparedStmt.setString (3, "Gopala");
			preparedStmt.setInt(4, 24);
			preparedStmt.execute();
			preparedStmt.setInt (1, 2);
			preparedStmt.setString (2, "John");
			preparedStmt.setString   (3, "Mayer");
			preparedStmt.setInt(4, 22);
			preparedStmt.execute();

// Execute the command to delete a row form the table
stmt.executeUpdate("DELETE FROM Players WHERE UID = 1;");  	
ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			conn.close();
			


		}
      
      
String CREATE_TABLE_SQL="CREATE TABLE players ( UID INT, first_name VARCHAR(45), last_name VARCHAR(45), age INT);";
			stmt.executeUpdate(CREATE_TABLE_SQL);			
			query = " insert into Players (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);
			preparedStmt.setString (2, "Rama");
			preparedStmt.setString (3, "Gopala");
			preparedStmt.setInt(4, 24);
			preparedStmt.execute();
			preparedStmt.setInt (1, 2);
			preparedStmt.setString (2, "John");
			preparedStmt.setString   (3, "Mayer");
			preparedStmt.setInt(4, 22);
			preparedStmt.execute();
			preparedStmt.setInt (1, 3);
			preparedStmt.setString (2, "Leo");
			preparedStmt.setString   (3, "Martin");
			preparedStmt.setInt(4, 27);
			preparedStmt.execute();

			ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			int count=0,total=0;
			while(rs.next()){
				count++;
				total = total + Integer.parseInt(rs.getString(4));
			}
			
			//Output
			System.out.println("Average age of players is " +(total/count));
				

			conn.close();


			
		}
                catch(Exception e){ System.out.println(e);}  
	}  
}  


String CREATE_TABLE_SQL="CREATE TABLE players (UID INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
// Execute the statement containing SQL command
stmt.executeUpdate(CREATE_TABLE_SQL);

// Write the SQL command to drop a table
    query = "DROP TABLE players;";

// Execute the SQL command to drop a table
    stmt.executeUpdate(query);
			ResultSet rs = stmt.executeQuery("SELECT * FROM players;");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("No. of columns : " + rsmd.getColumnCount());
					
			conn.close();
			

		}
                catch(Exception e){ System.out.println(e);}  
	}  
}  