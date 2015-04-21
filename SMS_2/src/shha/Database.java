package shha;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MooseMoose
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Database {

    public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public static String JDBC_URL;
    public static Connection connection;

    //Constructor
    //When we make an instance of the Database we need to connect to
    //the database
    public Database(String name) {
        JDBC_URL = "jdbc:derby:" + name + ";";

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            //we're screwed if we get here
        }

        try {

            connection = DriverManager.getConnection(JDBC_URL);

        } catch (SQLException e) {
            //we're even more screwed if we're here
        }

    }

    public Database(String name, String create) {
        JDBC_URL = "jdbc:derby:" + name + ";create=true";
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            //we're screwed if we get here
        }

        try {

            connection = DriverManager.getConnection(JDBC_URL);

        } catch (SQLException e) {
            //we're even more screwed if we're here
        }
    }

    //Precondtion: The connection to the database was sucessful and the database
    //              is in a a ready state
    //Postcondition: A new table is created in the database 
    public void createTable(String tableName, String setOfStrings) {
        String query = "create table " + tableName + setOfStrings;
        try {
            connection.createStatement().execute(query);
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());

        }

    }

    //Precondition: The table already exisits in the database
    //Postcondition: The table gets removed from the database
    public void dropTable(String tableName) {

        try {

            connection.createStatement().execute("drop table " + tableName);

        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }

    }

    //Alter table methods
    //Add column requires that you enter both the column name and datatype. EX: ALTER TABLE abc ADD dad varchar(50)
    public void addColumn(String tableName, String columnName) {
        String add = "ALTER TABLE " + tableName + " ADD " + columnName;
        try {
            connection.createStatement().execute(add);
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());

        }

    }

    //Delete column only requires the column name. EX: ALTER TABLE abc DROP dad
    public void deleteColumn(String tableName, String columnName) {
        String delete = "ALTER TABLE " + tableName + " DROP " + columnName;
        try {
            connection.createStatement().execute(delete);
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());

        }

    }

    //Deletes employee from employee db using email as primary key
    public void deleteEmployee(String email) {
        String delete = "DELETE FROM employees WHERE email='" + email + "'";
        try {
            connection.createStatement().execute(delete);
        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());

        }

    }

    public void dropDatabase(String dataBaseName) {
        String statement = "DROP DATABASE " + dataBaseName;

        try {
            connection.createStatement().execute(statement);

        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }
    }

    //Precondition: The requested tableName already exists in the database
    //Postcondition: Values are added to the table
    public void addDataToTable(String tableName, String... setOfStrings) {
        String sql;
        StringBuilder stringS = new StringBuilder();
        for (String s : setOfStrings) {
            stringS.append(s);
        }

        try {
            sql = "INSERT INTO " + tableName + "  " + stringS;
            System.out.println(sql);
            connection.createStatement().execute(sql);

        } catch (SQLException e) {
            System.out.println("Error in add data to table method");
            System.out.println(e.toString());

        }

    }

    //Precondition: The table exists and there is data in it
    //Postcondition: The method returns a ResultSet collection
    //              with all columns in the table
    public ResultSet selectAll(String tableName) {
        ResultSet results = null;
        try {
            results = connection.createStatement().executeQuery("Select * from " + tableName);

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return results;
    }

    public void ensureConnection() {
        try {
            connection = DriverManager.getConnection(JDBC_URL);

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.out.println(JDBC_URL);
        }
    }

    public void printResultSet(ResultSet rs){
        

        try {
            if (connection == null) {
                System.out.println("Connection is null");
            }
            ResultSetMetaData resultSetMetaData = rs.getMetaData();

            int coulmCount = resultSetMetaData.getColumnCount();

            for (int i = 1; i <= coulmCount; i++) {
                System.out.format("%15s", resultSetMetaData.getColumnName(i) + " |");
            }

            System.out.println("");

            while (rs.next()) {
                for (int i = 1; i <= coulmCount; i++) {
                    System.out.format("%15s", rs.getString(i) + " |");

                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }

    }
    public void printAll(String tableName) {
        String statement = "SELECT * From " + tableName;
        ResultSet results;

        ensureConnection();

        try {
            if (connection == null) {
                System.out.println("Connection is null");
            }
            results = connection.createStatement().executeQuery(statement);
            ResultSetMetaData resultSetMetaData = results.getMetaData();

            int coulmCount = resultSetMetaData.getColumnCount();

            for (int i = 1; i <= coulmCount; i++) {
                System.out.format("%15s", resultSetMetaData.getColumnName(i) + " |");
            }

            System.out.println("");

            while (results.next()) {
                for (int i = 1; i <= coulmCount; i++) {
                    System.out.format("%15s", results.getString(i) + " |");

                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }

    }

    public void removeAllFromTable(String tableName) {
        String statement = "TRUNCATE TABLE " + tableName;
        ensureConnection();

        try {
            connection.createStatement().execute(statement);

        } catch (SQLException e) {
            System.out.println("we're screwed");
            System.out.println(e.toString());
        }
    }

    public ResultSet executeQuery(String query) {
        ResultSet results = null;

        try {
            results = connection.createStatement().executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return results;
    }

    //Precondition: The database is accessible
    //Postcondition: The jTable in the view employees tabe will show the results
    //                 of the search
    public ResultSet searchForEmployee(String employee) {
        ResultSet employeeResults = null;
        String query = "select firstName, lastName, position, phone, email FROM employees "
                + " WHERE firstName='" + employee + "' OR"
                + " lastName='" + employee + "' ORDER BY lastName";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            employeeResults = myStatement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return employeeResults;
    }

    //Precondition: The database is accessible
    //Postcondition: The jTable in the view employees tab will show all employees
    public ResultSet queryEmployees() {
        ResultSet employeeResults = null;
        String query = "select firstName, lastName, position, phone, email FROM employees ORDER BY lastName ASC";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            employeeResults = myStatement.executeQuery(query);
            // results = connection.createStatement().executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return employeeResults;
    }

    public ResultSet queryEmployeeInfo(String employeeEmail) {
        ResultSet doctorResults = null;
        String query = "select * from employees WHERE email='" + employeeEmail + "'";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            doctorResults = myStatement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return doctorResults;

    }

    public ResultSet queryPatients() {
        ResultSet rs = null;
        String query = "SELECT firstName, lastName, sex, phone, email,ssn FROM patients ORDER BY lastName ASC";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = myStatement.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return rs;
    }

    public ResultSet searchForPatient(String patient) {
        ResultSet rs = null;
        String query = "SELECT firstName, lastName, sex, phone, email, ssn FROM patients ORDER BY lastName ASC "
                + "WHERE firstName='" + patient + "' OR lastName='" + patient
                + "' OR ssn='" + patient + "'";
        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = myStatement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return rs;
    }
    
    public ResultSet searchForAppointments(String appointment) {
        ResultSet rs = null;
        String query = "SELECT * from appointments " 
               +  "WHERE patient_fname='"  + appointment + "' OR "
               +  "patient_lname='"  + appointment + "' OR "
               + "patient_ssn='"  + appointment + "' OR "
               + "doctor_fname='"  + appointment + "' OR "
                + "doctor_lname='"  + appointment + "' OR "
                + "doctor_email='"  + appointment + "'";
        
         try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = myStatement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return rs;
                
               
    }

    public ResultSet queryPatientInfo(String patientSSN) {
        ResultSet rs = null;
        String query = "select * from patients WHERE ssn='" + patientSSN + "'";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = myStatement.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return rs;
    }

    public ResultSet queryDoctors() {
        ResultSet doctorResults = null;
        String query = "select firstName, lastName, email from employees WHERE position='Doctor' ORDER BY lastName ASC";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            doctorResults = myStatement.executeQuery(query);
        } catch (SQLException e) {

        }

        return doctorResults;
    }
    
    public ResultSet queryPatientsForAppointment() {
        ResultSet doctorResults = null;
        String query = "select firstName, lastName, ssn from patients ORDER BY lastName ASC";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            doctorResults = myStatement.executeQuery(query);
        } catch (SQLException e) {

        }

        return doctorResults;
    }

    public boolean uniqueSSN(String ssn) {
        ResultSet rs = null;
        String query = "select * from patients where ssn='" + ssn + "'";
        boolean isUnique = true;

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = myStatement.executeQuery(query);
            isUnique = rs.next();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return isUnique;
    }

    public void executePatientUpdate(String query) {
        try {
            System.out.println(query);
            connection.createStatement().executeUpdate(query);
            
        } catch(SQLException e) {
            System.out.println(e.toString());
        }

    }
    
    public void executeEmpUpdate(String query) {
        try {
            System.out.println(query);
            connection.createStatement().executeUpdate(query);
            
        } catch(SQLException e) {
            System.out.println(e.toString());
        }

    }
   

    //Precondition: The database is accessible 
    //PostCondition
    //Take a user name and see if it exists in the database
    //If it does not exist return true, saying that it is a valid user name
    //If it does exist in the database return false
    public boolean validateUserName(String userName) {
        String statement = "select username from employees where "
                + "username='" + userName + "'";
        ResultSet results = null;
        Boolean found = null;
        try {
            results = connection.createStatement().executeQuery(statement);
            found = results.next();
        } catch (SQLException e) {
            System.out.println("Error in validate user name method");
            System.out.println(e.toString());
        }

        //no match, nothinig returned
        return !found;
        //****Throwing infinite loop ***//
        /*
         if(results == null) {
         System.out.println("No match");
         return true;
         } else {
         System.out.println("We found a match");
         return false;
         }*/

    }
    
    public boolean appointmentExists(String time) {
        ResultSet rs = null;
        String query = "SELECT * from appointments WHERE time='" +
                        time + "'";
        boolean exists = true;
     
        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = myStatement.executeQuery(query);
            exists = rs.next();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        
        return exists;
    }
    
    public ResultSet queryAppointments() {
        ResultSet rs = null;
        String query = "SELECT * from appointments";

        try {
            Statement myStatement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = myStatement.executeQuery(query);

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return rs;
    }
    

}
