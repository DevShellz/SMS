package shha;

/*
 * The authentication class is used to authenticate users
 */

/**
 * @author MooseMoose
 */

import java.sql.*;
public class Authentication {
    public static String firstName;
    public static String lastName;
    public static int accessLevel;

    public static String username;
    public static String position;
    public static String sex;



    
    private String SQL_STATEMENT, userName, passWord, connectionString;
    private final String userTable = "employees", usernameColumn = "username", 
                   passwordColumn= "password";
    private ResultSet results;
    
    public Authentication(String _userName, String _passWord) {
        userName = _userName;
        passWord = _passWord;
        connectionString = "jdbc:derby:SMSDB2;";
    }
    //Precondtion: The connection to the database is valid
    //             The u`dser has entered a user and password combination
    //Postcondition: The method returns a true value if the user name and
    //               password combination is in the database. Otherwise false
     boolean verifyAuth() {
        createSqlQuery();
        
        try {
            Database authDb = new Database("SMSDB2");
            results = authDb.executeQuery(SQL_STATEMENT);
            ResultSetMetaData resultSetMetaData = results.getMetaData();
            int coulmCount = resultSetMetaData.getColumnCount();

            while(results.next()) {
                
                if(results.getString(2).equals(passWord)) {
                   //we find a userName,passWord combination
         
                    username = results.getString(1);
                    firstName = results.getString(3);
                    lastName =  results.getString(4);
                    accessLevel = results.getInt(5);
                    position = results.getString(6);

                    sex = results.getString(7);

                    
                    return true;
                }
            }
        } catch(SQLException e) {
            
        }
       
        //we did not find a valid (userName, passWord combination)
       return false; 
        
    }
    
    //toDo check your web programming project to see how you guys checked
    //for a user name and password
    private void createSqlQuery() {
        SQL_STATEMENT = "select " + usernameColumn + ", " + passwordColumn +  

                        " ,firstName, lastName, accessLevel, position, sex from  " + 

                      

                        userTable + " where username='" + userName +"'";                    
    }
    
}

