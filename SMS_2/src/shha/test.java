
package shha;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


/**
 *
 * @author MooseMoose
 */
public class test {
//     
        private static Database db;
        //private static void testString(String name, String ... setOfStrings) {
//            System.out.println(name);
//            
//            for(String s : setOfStrings) {
//                System.out.print(s);
//            }
//                    
//        }
//     
//     //need to cylce through the setOfStrings array and add it to one string
//     //in the string builder
//      private static void addDataToTable(String tableName, String... setOfStrings) {
//        String sql;
//        System.out.print("INSERT INTO " + tableName + " ");
//        StringBuilder stringS = new StringBuilder();
//        for(String s : setOfStrings) {
//                stringS.append(s);
//            }
//        
//        System.out.print(stringS);
//                
//      }
      
//      private static void generateYears() {
//          for (int i = 1900; i <= 2015; i++) {
//              System.out.print("\"" + i + "\",");
//          }
//      }
       
    
    private static void dropEmployeesTable() {
       
       System.out.println("Dropping employees table");
       db.dropTable("employees");
       System.out.println("Employees table dropped");
    }
    
    private static void createEmployeesTable() {
       
        System.out.println("Creating employees table");
        db.createTable("employees", "(firstName varchar(20), middleInt varchar(10), " +
                        "lastName varchar(20), username varchar(20), password varchar(20), " +
                        "position varchar(20), accessLevel int, " +
                       "ssn varchar(20), sex varchar(10), address1 varchar(100), " +
                       "address2 varchar(100), city varchar(20), state varchar(20), " +
                        "zip varchar(5), month varchar(20), day int, " +
                        "birthYear int, phone varchar(15), " +
                        "email varchar(20))");
        System.out.println("Employees table created");
    }
    
    private static void createDatabase() {
        System.out.println("Creating SMSDB2 dataBase");
        Database db = new Database("SMSDB2","create");
        System.out.println("Exiting creating SMSDB2 dataBase");
    }
    
    private static void dropPatientsTable() {
        db.dropTable("patients");
    }
    
    private static void addEmployeesToDB() {
        String values =  "VALUES ('Test', 'T', 'Tester', 'Admin1', 'Password1', " +
                                 "'Administrator', 5, '555-55-5555', 'M', '555 The Code Way', " +
                                "'', 'Atlanta', 'Georgia', '30303', 'December', 12, 1964, " +
                                "'404-555-5555', 'admin1@sms.com')";
        db.addDataToTable("employees", values);
    }
    
    private static void createPatientsTable() {        
        db.createTable("patients", "(firstName varchar(20), middleInt varchar(10), " +
                        "lastName varchar(20), " +
                       "ssn varchar(20), sex varchar(10), address1 varchar(100), " +
                       "address2 varchar(100), city varchar(20), state varchar(20), " +
                        "zip varchar(5), month varchar(20), day int, " +
                        "birthYear int, phone varchar(15), " +
                        "email varchar(20), doctorAssign varchar(20), comments varchar(200)  )");
        System.out.println("Patients table created");
    }
    
    private static void addPatientsToTable() {
         String values2 =  "VALUES ('Test', 'T', 'Tester', '555-55-5555', " + 
                               " 'M', '555 The Code Way', " +
                                "'', 'Atlanta', 'Georgia', '30303', 'December', 12, 1964, " +
                                "'404-555-5555', 'admin1@sms.com', 'DR. Chuma Obi', 'Severe allergy to computers')";
        db.addDataToTable("patients", values2);
    }
    
    private static void createAppointmentsTable() {
          db.createTable("appointments", "(patient_fname varchar(20), patient_lname varchar(20), " +
                        "patient_ssn varchar(12), doctor_fname varchar(20), " +
                        "doctor_lname varchar(20), doctor_email varchar(20), " +
                        "time varchar(60) )");
        System.out.println("Appointments table created");
    }
    
    private static void printDatabaseInfo() {
        /*
               ResultSet rs = db.queryEmployees();
         ResultSetMetaData rsmd = null;
        int columnsNumber = 0;
         try {
             rsmd = rs.getMetaData();
             rsmd.getColumnCount();
             while (rs.next()) {
        for (int i = 1; i <= columnsNumber; i++) {
            if (i > 1) System.out.print(",  ");
            String columnValue = rs.getString(i);
            System.out.print(columnValue + " " + rsmd.getColumnName(i));
        }
        System.out.println("");
    }
        } catch (Exception e) {
            
        }
        */
        
        //        String query = "select * from SYS.SYSTABLES";
//        ResultSet rs = db.executeQuery(query);
//        db.printResultSet(rs);
        
    }
    
    private static void createPatientChartTable() {
     db.createTable("patient_chart", "(patient_ssn varchar(20), general varchar(200), " +
                     "allergies varchar(200), rountine_meds varchar(200), " +
                    " reffered_by varchar(30), insurance varchar(50), prior_visits varchar(100)," +
                     " doctor varchar(50), chart varchar(100) )");
    }
    
    private static void fixDatabase() {
        
        db = new Database("SMSDB2", "create");
        createEmployeesTable();
        addEmployeesToDB();
        createPatientsTable();
        addPatientsToTable();
        createAppointmentsTable();
        createPatientChartTable();  
    }
    
    public static void main(String[] args) {
        //just run the file onceb and the database will be good to go
        //note that in order to create a patient you will first have
        //to create an employee that's a doctor. The login is still the 
        //same Admin1 Password1
       // fixDatabase();
        
       String query = "UPDATE employees set firstName='Admin' where email ='admin1@sms.com'";
       db = new Database("SMSDB2");
       db.executeEmpUpdate(query);
                 
    }
    
}
