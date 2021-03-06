/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shha;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import static shha.mainGUI2.apptContainerPanel;
import static shha.mainGUI2.defaultApptPanel;

/**
 *
 * @author Sheldon
 */
public class CreateApptPanel extends javax.swing.JPanel {
    private static long  millTime;
    private static String returnDate;
    /**
     * Creates new form CreateApptPanel
     */
    public CreateApptPanel() {
        initComponents();
        String[] doctorsArray = grabDoctors();
        String[] patientsArray = grabPatients(); 
       doctorEmailComboBox.setVisible(false);
       patientSSNComboBox.setVisible(false);
       doctortComboBox.setModel(new javax.swing.DefaultComboBoxModel(doctorsArray));
       patientComboBox.setModel(new javax.swing.DefaultComboBoxModel(patientsArray));
       confirmMessage.setText("Please create an appointment");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        patientComboBox = new javax.swing.JComboBox();
        patientLabel1 = new javax.swing.JLabel();
        doctorLabel = new javax.swing.JLabel();
        doctortComboBox = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        apptCalendar = new com.toedter.calendar.JCalendar();
        confirmMessage = new javax.swing.JLabel();
        timeScrollPane = new javax.swing.JScrollPane();
        timeTable = new javax.swing.JTable();
        dateSelectedLabel = new javax.swing.JLabel();
        doctorEmailComboBox = new javax.swing.JComboBox();
        patientSSNComboBox = new javax.swing.JComboBox();
        dateSelectedLabel2 = new javax.swing.JLabel();

        containerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        patientComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        patientLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        patientLabel1.setText("Patient:");

        doctorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doctorLabel.setText("Doctor:");

        doctortComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctortComboBoxActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        apptCalendar.setMaxSelectableDate(new java.util.Date(1483246799000L));
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        apptCalendar.setMinSelectableDate(now);
        apptCalendar.setTodayButtonVisible(true);
        apptCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                apptCalendarPropertyChange(evt);
            }
        });

        confirmMessage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        confirmMessage.setForeground(java.awt.Color.red);
        confirmMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmMessage.setText(" Available or not!");

        timeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7:00 AM"},
                {"8:00 AM"},
                {"9:00 AM"},
                {"10:00 AM"},
                {"11:00 AM"},
                {"12:00 PM"},
                {"1:00 PM"},
                {"2:00 PM"},
                {"3:00 PM"},
                {"4:00 PM"},
                {"5:00 PM"}
            },
            new String [] {
                "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        timeScrollPane.setViewportView(timeTable);

        dateSelectedLabel.setVisible(false);
        dateSelectedLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateSelectedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateSelectedLabel.setText("Date Label");

        doctorEmailComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctorEmailComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorEmailComboBoxActionPerformed(evt);
            }
        });

        patientSSNComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientSSNComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSSNComboBoxActionPerformed(evt);
            }
        });

        dateSelectedLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateSelectedLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateSelectedLabel2.setText("Date Label");

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(patientLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(containerPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(doctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(apptCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientSSNComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorEmailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateSelectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateSelectedLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(confirmMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        containerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {doctortComboBox, patientComboBox});

        containerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, confirmButton});

        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patientLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateSelectedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(doctortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                                .addComponent(dateSelectedLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                        .addComponent(apptCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(patientSSNComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorEmailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(timeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, confirmButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(840, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed

        doctorEmailComboBox.setSelectedIndex(doctortComboBox.getSelectedIndex());
        patientSSNComboBox.setSelectedIndex(patientComboBox.getSelectedIndex());

        String date = dateSelectedLabel.getText();
        
        millTime = dateToMill(date);
        
        returnDate = millToDate(millTime);
        
        System.out.println("The milliseconds for the date is: " + millTime);
        System.out.println("The return date is: " + returnDate);
        
        createAppointment();
       
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void apptCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_apptCalendarPropertyChange
       
        
        dateSelectedLabel.setText(apptCalendar.getDate().toString());
        
        String delim = "[ ]";
        String[] tokens = apptCalendar.getDate().toString().split(delim);
        dateSelectedLabel2.setText(tokens[0] + " " + tokens[1] + " " + tokens[2] + " " + tokens[5]);
        
    }//GEN-LAST:event_apptCalendarPropertyChange

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        apptContainerPanel.removeAll();
        apptContainerPanel.repaint();
        apptContainerPanel.revalidate();
        apptContainerPanel.add(defaultApptPanel);
        apptContainerPanel.repaint();
        apptContainerPanel.revalidate();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void doctortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctortComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctortComboBoxActionPerformed

    private void doctorEmailComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorEmailComboBoxActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_doctorEmailComboBoxActionPerformed

    private void patientSSNComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSSNComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientSSNComboBoxActionPerformed
    
    //Precondition: THe database is in an accessible state
    //Postcondition: The doctor's textbox is populated with the doctors in the
    //               database
    private String[] grabDoctors() {
        String[] doctors = null;
        String[] doctorEmail = null;
        Database db = new Database("SMSDB2");
        ResultSet doctorsResult = db.queryDoctors();
        String arr = null;
                
        try {
            doctorsResult.last();
            int rowCount = doctorsResult.getRow();
            doctors = new String[rowCount];
            doctorEmail = new String[rowCount];
            doctorsResult.beforeFirst();
            String firstName= null;
            String lastName = null;
            String fullName = null;
            String email = null;
            int counter = 0;
            
            while (doctorsResult.next()) {
                firstName = doctorsResult.getString(1);
                lastName = doctorsResult.getString(2);
                email = doctorsResult.getString(3);
                fullName = lastName + "," + firstName;
                doctors[counter] = fullName;
                doctorEmail[counter] = email;
                counter++;
        }           
            
        }catch(SQLException e) {
            System.out.println("Error parsing doctors");
            System.out.println(e.toString());
        }
        
        doctorEmailComboBox.setModel(new javax.swing.DefaultComboBoxModel(doctorEmail));
        return doctors;
        
    }
    
    //Precondition: THe database is in an accessible state
    //Postcondition: The doctor's textbox is populated with the doctors in the
    //               database
    private String[] grabPatients() {
        String[] doctors = null;
        String[] patientSSN = null;
        Database db = new Database("SMSDB2");
        ResultSet doctorsResult = db.queryPatientsForAppointment();
        String arr = null;
                
        try {
            doctorsResult.last();
            int rowCount = doctorsResult.getRow();
            doctors = new String[rowCount];
            patientSSN = new String[rowCount];
            doctorsResult.beforeFirst();
            String firstName= null;
            String lastName = null;
            String fullName = null;
            String ssn = null;
            int counter = 0;
            
            while (doctorsResult.next()) {
                firstName = doctorsResult.getString(1);
                lastName = doctorsResult.getString(2);
                ssn = doctorsResult.getString(3);
                fullName = lastName + "," + firstName;
                doctors[counter] = fullName;
                patientSSN[counter] = ssn;
                counter++;
        }           
            
        }catch(SQLException e) {
            System.out.println("Error parsing doctors");
            System.out.println(e.toString());
        }
        
        patientSSNComboBox.setModel(new javax.swing.DefaultComboBoxModel(patientSSN));
        
        return doctors;
        
    }
    
    private boolean appointmentExists() {
        Database db = new Database("SMSDB2");
        String time = String.valueOf(returnDate);
        return db.appointmentExists(time);
    }
    
    private void createAppointment() {
        String patientFullName = patientComboBox.getSelectedItem().toString();
        int patientComma = patientFullName.indexOf(",");
        String patientFirstName = patientFullName.substring(patientComma + 1);
        String patientLastName = patientFullName.substring(0, patientComma);
        String patientSSN = patientSSNComboBox.getSelectedItem().toString();
        
        String doctorFullName = doctortComboBox.getSelectedItem().toString();
        int doctorComma = doctorFullName.indexOf(",");
        String doctorFirstName = doctorFullName.substring(doctorComma + 1);
        String doctorLastName = doctorFullName.substring(0, doctorComma);
        String doctorEmail = doctorEmailComboBox.getSelectedItem().toString();
        
        String time = returnDate;
        
        
        String query = "INSERT INTO appointments " +
                        "VALUES ('" + patientFirstName + "','" + patientLastName + "','" +
                        patientSSN + "','" + doctorFirstName + "','" + doctorLastName + "','" +
                        doctorEmail + "','" + time + "')";
        
        if(!appointmentExists()) {
            Database db = new Database("SMSDB2");
            db.executePatientUpdate(query);
            //create appointment
            confirmMessage.setText(" Appointment has been scheduled.");
            db.printAll("appointments");
        } else {
            //display message that the time slot is take
            confirmMessage.setText(" That time slot is taken.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar apptCalendar;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel confirmMessage;
    private javax.swing.JPanel containerPanel;
    public static javax.swing.JLabel dateSelectedLabel;
    private javax.swing.JLabel dateSelectedLabel2;
    private javax.swing.JComboBox doctorEmailComboBox;
    private javax.swing.JLabel doctorLabel;
    private javax.swing.JComboBox doctortComboBox;
    private javax.swing.JComboBox patientComboBox;
    private javax.swing.JLabel patientLabel1;
    private javax.swing.JComboBox patientSSNComboBox;
    private javax.swing.JScrollPane timeScrollPane;
    private javax.swing.JTable timeTable;
    // End of variables declaration//GEN-END:variables

    
    private long dateToMill(String date){
        String delim = "[ ]";
        String[] tokens = date.split(delim);
               
        String month;
        int day = Integer.parseInt(tokens[2]);
        int year = Integer.parseInt(tokens[5]);
        
        switch (tokens[1]) {
            case "Jan":  month = "0";
                     break;
            case "Feb":  month = "1";
                     break;
            case "Mar":  month = "2";
                     break;
            case "Apr":  month = "3";
                     break;
            case "May":  month = "4";
                     break;
            case "Jun":  month = "5";
                     break;
            case "Jul":  month = "6";
                     break;
            case "Aug":  month = "7";
                     break;
            case "Sep":  month = "8";
                     break;
            case "Oct":  month = "9";
                     break;
            case "Nov":  month = "10";
                     break;
            case "Dec":  month = "11";
                     break;
            default: month = "Invalid month";
                     break;
        }
        
        int monthObj = Integer.parseInt(month);
        
       

        String selectedTime = timeTable.getValueAt(timeTable.getSelectedRow(), timeTable.getSelectedColumn()).toString();
      
        
        String hour = selectedTime;
        switch (hour){
            case "7:00 AM":  hour = "07"; 
                    break;
            case "8:00 AM":  hour = "08";
                    break;
            case "9:00 AM":  hour = "09";
                    break;
            case "10:00 AM":  hour = "10";
                    break;
            case "11:00 AM":  hour = "11";
                    break;
            case "12:00 PM":  hour = "12";
                    break;
            case "1:00 PM":   hour = "13";
                    break;
            case "2:00 PM":   hour = "14";
                    break;
            case "3:00 PM":   hour = "15";
                    break;
            case "4:00 PM":   hour = "16";
                    break;
            case "5:00 PM":   hour = "17";
                    break;
            default: hour = "Invalid time";
        }
        
        int hourObj = Integer.parseInt(hour);
        
     //   System.out.println("Date is " + tokens[1] + " " + day + " " + year + " " + hour);
        
        Calendar cal = Calendar.getInstance();
        cal.set(year, monthObj, day, hourObj, 00, 00); //Year, month, day of month, hours, minutes and seconds
        Date dateObj = cal.getTime();
        
        long millTime = dateObj.getTime();
        
        return millTime;
    }
    
    private String millToDate(long date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date);
        String dateStr = calendar.getTime().toString();
        
        
        String delim = "[ ]";
        String[] tokens = dateStr.split(delim);
          
        String month2 = tokens[1];
        
        String day2 = tokens[2];
        String year2 = tokens[5];
       
        int mYear = calendar.get(Calendar.YEAR);
        int mMonth = calendar.get(Calendar.MONTH);
        int mDay = calendar.get(Calendar.DAY_OF_MONTH);
        int mHour = calendar.get(Calendar.HOUR_OF_DAY);
        
        
        
        String amPM;
        switch (mHour){
            case 7:  amPM = "A"; 
                    break;
            case 8:  amPM = "A";
                    break;
            case 9:  amPM = "A";
                    break;
            case 10:  amPM = "A";
                    break;
            case 11:  amPM = "A";
                    break;
            case 12:  amPM = "P";
                    break;
            case 13:  amPM = "P";
                      mHour = 1;
                    break;
            case 14:  amPM = "P";
                      mHour = 2;  
                    break;
            case 15:  amPM = "P";
                      mHour = 3;  
                    break;
            case 16:  amPM = "P";
                      mHour = 4;
                    break;
            case 17:  amPM = "P";
                      mHour = 5;
                    break;
            default: amPM = "Invalid time";
        }
        
        String displayDate = month2 + " " + day2 + " " + year2 + " " + mHour +":00 " + amPM + "M";
        return displayDate;
    }
}
