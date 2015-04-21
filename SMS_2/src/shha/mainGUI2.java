
package shha;


import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.swing.*;
import java.util.regex.*;
import javax.swing.table.AbstractTableModel;
import static shha.TimeClockPanel.punchInButton;
import static shha.TimeClockPanel.punchOutButton;

/**
 *
 * @author Sheldon
 */
public class mainGUI2 extends javax.swing.JFrame {
  
    public static TimeClockPanel tcPanel = new TimeClockPanel();
    
    public void populateEmployee(ResultSet rs) {
        initComponents();
        
        try {
           empFirstNameText.setText(rs.getString("firstName"));
           empLastNameText.setText(rs.getString("lastName"));
           empAddress1Text.setText("test123");
           
        } catch(SQLException e) {
            
        }
    }
    //Build Main GUI
    public mainGUI2() {
        initComponents();
         
         employeeIdent1.setText(
                            Authentication.firstName + " " +

                            Authentication.lastName

                 );
         int accessLevel = Authentication.accessLevel;
         String position = Authentication.position;
         String lastName = Authentication.lastName;
         String sex = Authentication.sex;

                         

         
        
         switch(accessLevel) {
             case 1:    adminButton.setEnabled(false);
                        break;
             case 2:    adminButton.setEnabled(false);
                        break;
             case 3:    
                        break;
             case 4:
                        break;
             case 5:
                        break;
         }

         
         switch(sex){
             case "Male":   
                    switch(position){
                case "Doctor":     empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/doctorsm.png")));
                            break;
                case "Nurse":      empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/nursemalesm.png")));
                            break;
                case "Receptionist":   empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/repmalesm.png")));
                            break;
                case "Administrator":  empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/adminsm.png")));
                            break;
            }
             
                case "Female":
                    switch(position){
                case "Doctor":     empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/femalesm.png")));
                            break;
                case "Nurse":      empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/nursesm.png")));
                            break;
                case "Receptionist":   empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/repsm.png")));
                            break;
                case "Administrator":  empImageTopLabel.setIcon(
                        new javax.swing.ImageIcon(getClass().getResource("/adminfemalesm.png")));
                            break;
            }
                 
         }
         
        
         switch(lastName){
             case "Bhola":  empImageTopLabel.setIcon(
                     new javax.swing.ImageIcon(getClass().getResource("/bholasm.png")));
                         break;
         }
         

        

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        empGenderButtonGroup = new javax.swing.ButtonGroup();
        logoLabel = new javax.swing.JLabel();
        patientsButton = new javax.swing.JButton();
        apptButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        billButton = new javax.swing.JButton();
        empButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        containerPanel = new javax.swing.JPanel();
        patientsPanel = new javax.swing.JPanel();
        patientsContainerPanel = new javax.swing.JPanel();
        defaultPatientPanel = new javax.swing.JTabbedPane();
        bulletinTabPanel = new javax.swing.JPanel();
        subLabel = new javax.swing.JLabel();
        bloodImageLabel = new javax.swing.JLabel();
        title3Label = new javax.swing.JLabel();
        coffeeImageLabel = new javax.swing.JLabel();
        muffinImageLabel = new javax.swing.JLabel();
        title2Label = new javax.swing.JLabel();
        title1Label = new javax.swing.JLabel();
        employeeImageLabel = new javax.swing.JLabel();
        sub2Label = new javax.swing.JLabel();
        articleTabPanel = new javax.swing.JPanel();
        articleScrollPane = new javax.swing.JScrollPane();
        articleEditorPane = new javax.swing.JEditorPane();
        patientTablePanel = new javax.swing.JPanel();
        chartTablePanel = new javax.swing.JPanel();
        addNewPatientButton = new javax.swing.JButton();
        viewPatientButton = new javax.swing.JButton();
        viewYourPatientButton = new javax.swing.JButton();
        patImageLabel = new javax.swing.JLabel();
        adminPanel = new javax.swing.JPanel();
        adminContainerPanel = new javax.swing.JPanel();
        defaultAdminPanel = new javax.swing.JTabbedPane();
        bulletinTabPanel2 = new javax.swing.JPanel();
        subLabel2 = new javax.swing.JLabel();
        bloodImageLabel2 = new javax.swing.JLabel();
        title3Label2 = new javax.swing.JLabel();
        coffeeImageLabel2 = new javax.swing.JLabel();
        muffinImageLabel2 = new javax.swing.JLabel();
        title2Label2 = new javax.swing.JLabel();
        title1Label2 = new javax.swing.JLabel();
        employeeImageLabel2 = new javax.swing.JLabel();
        sub2Label2 = new javax.swing.JLabel();
        articleTabPanel2 = new javax.swing.JPanel();
        articleScrollPane2 = new javax.swing.JScrollPane();
        articleEditorPane2 = new javax.swing.JEditorPane();
        addUserPanel = new javax.swing.JPanel();
        firstNameText = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        middleIntText = new javax.swing.JTextField();
        middleIntLabel = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        ssnText = new javax.swing.JTextField();
        address1Text = new javax.swing.JTextField();
        address1Label = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        zipLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        address2Label = new javax.swing.JLabel();
        address2Text = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        positionComboBox = new javax.swing.JComboBox();
        positionLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        stateComboBox = new javax.swing.JComboBox();
        positionLabel1 = new javax.swing.JLabel();
        accessLevelComboBox = new javax.swing.JComboBox();
        monthComboBox = new javax.swing.JComboBox();
        dayComboBox = new javax.swing.JComboBox();
        yearComboBox = new javax.swing.JComboBox();
        adminTablePanel = new javax.swing.JPanel();
        addNewUserButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        viewEmployeesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empPanel = new javax.swing.JPanel();
        empContainerPanel = new javax.swing.JPanel();
        defaultEmpPanel = new javax.swing.JPanel();
        viewEmpPanel = new javax.swing.JPanel();
        empFirstNameText = new javax.swing.JTextField();
        empFirstNameLabel = new javax.swing.JLabel();
        empLastNameText = new javax.swing.JTextField();
        empLastNameLabel = new javax.swing.JLabel();
        empMiddleIntText = new javax.swing.JTextField();
        empMiddleIntLabel = new javax.swing.JLabel();
        empSSNLabel = new javax.swing.JLabel();
        empSSNText = new javax.swing.JTextField();
        empAddress1Text = new javax.swing.JTextField();
        empAddress1Label = new javax.swing.JLabel();
        empCityText = new javax.swing.JTextField();
        empCityLabel = new javax.swing.JLabel();
        empStateLabel = new javax.swing.JLabel();
        empZipText = new javax.swing.JTextField();
        empZipLabel = new javax.swing.JLabel();
        empMaleRadioButton = new javax.swing.JRadioButton();
        empFemaleRadioButton = new javax.swing.JRadioButton();
        empGenderLabel = new javax.swing.JLabel();
        empDOBLabel = new javax.swing.JLabel();
        empEmailLabel = new javax.swing.JLabel();
        empEmailText = new javax.swing.JTextField();
        empAddress2Label = new javax.swing.JLabel();
        empAddress2Text = new javax.swing.JTextField();
        empPhoneLabel = new javax.swing.JLabel();
        empPhoneText = new javax.swing.JTextField();
        empPositionComboBox = new javax.swing.JComboBox();
        empPositionLabel = new javax.swing.JLabel();
        empSaveButton = new javax.swing.JButton();
        empCancelButton = new javax.swing.JButton();
        empEditButton = new javax.swing.JButton();
        empMonthComboBox = new javax.swing.JComboBox();
        empDayComboBox = new javax.swing.JComboBox();
        yearComboBox1 = new javax.swing.JComboBox();
        stateComboBox1 = new javax.swing.JComboBox();
        empPositionComboBox1 = new javax.swing.JComboBox();
        empPositionLabel1 = new javax.swing.JLabel();
        empTablePanel = new javax.swing.JPanel();
        empImageLabel = new javax.swing.JLabel();
        apptPanel = new javax.swing.JPanel();
        apptContainerPanel = new javax.swing.JPanel();
        defaultApptPanel = new javax.swing.JTabbedPane();
        bulletinTabPanel1 = new javax.swing.JPanel();
        subLabel1 = new javax.swing.JLabel();
        bloodImageLabel1 = new javax.swing.JLabel();
        title3Label1 = new javax.swing.JLabel();
        coffeeImageLabel1 = new javax.swing.JLabel();
        muffinImageLabel1 = new javax.swing.JLabel();
        title2Label1 = new javax.swing.JLabel();
        title1Label1 = new javax.swing.JLabel();
        employeeImageLabel1 = new javax.swing.JLabel();
        sub2Label1 = new javax.swing.JLabel();
        articleTabPanel1 = new javax.swing.JPanel();
        articleScrollPane1 = new javax.swing.JScrollPane();
        articleEditorPane1 = new javax.swing.JEditorPane();
        apptTablePanel = new javax.swing.JPanel();
        createApptButton = new javax.swing.JButton();
        viewApptButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        timeCPanel = new javax.swing.JPanel();
        timeContainerPanel = new javax.swing.JPanel();
        defaultTimePanel = new javax.swing.JPanel();
        timePanel = new javax.swing.JPanel();
        timeImageLabel = new javax.swing.JLabel();
        buildLabel = new javax.swing.JLabel();
        timeClockButton = new javax.swing.JButton();
        employeeIdent1 = new java.awt.Label();
        timeLabel = new javax.swing.JLabel();
        empImageTopLabel = new javax.swing.JLabel();
        smsMenuBar = new javax.swing.JMenuBar();
        patientsMenu = new javax.swing.JMenu();
        addPatientMenuItem = new javax.swing.JMenuItem();
        viewPatientMenuItem = new javax.swing.JMenuItem();
        assignedMenuItem = new javax.swing.JMenuItem();
        apptMenu = new javax.swing.JMenu();
        createApptMenuItem = new javax.swing.JMenuItem();
        viewApptMenuItem = new javax.swing.JMenuItem();
        reportsMenu = new javax.swing.JMenu();
        billingMenu = new javax.swing.JMenu();
        TimeClockMenu = new javax.swing.JMenu();
        employeesMenu = new javax.swing.JMenu();
        adminMenu = new javax.swing.JMenu();
        addUserMenuItem = new javax.swing.JMenuItem();
        removeUserMenuItem = new javax.swing.JMenuItem();
        viewUsersMenuItem = new javax.swing.JMenuItem();
        logOutMenu = new javax.swing.JMenu();
        logOutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        patientsButton.setText("Patients");
        patientsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButtonActionPerformed(evt);
            }
        });

        apptButton.setText("Appointments");
        apptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        apptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptButtonActionPerformed(evt);
            }
        });

        reportsButton.setText("Reports");
        reportsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });

        billButton.setText("Billing");
        billButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        empButton.setText("Employees");
        empButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empButtonActionPerformed(evt);
            }
        });

        adminButton.setText("Admin");
        adminButton.setToolTipText("");
        adminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        containerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Patients"));
        containerPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        containerPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        containerPanel.setLayout(new java.awt.CardLayout());

        patientsPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        patientsPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        patientsPanel.setPreferredSize(new java.awt.Dimension(1170, 613));

        patientsContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        patientsContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
        patientsContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
        patientsContainerPanel.setLayout(new java.awt.CardLayout());

        defaultPatientPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        subLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subLabel.setText("<html><div style=\"text-align: center\"><h3>Free Muffin w/Coffee Purchase!</h3></div></html>");

        bloodImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood.png"))); // NOI18N

        title3Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title3Label.setText("<html><div style=\"text-align: center\">Employee Of The Month<br>\nApril 2015</div></html>");

        coffeeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeesm.png"))); // NOI18N

        muffinImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muffinsm.png"))); // NOI18N

        title2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title2Label.setText("<html><div style=\"text-align: center\">Today's Cafeteria<br>Special</div></html>");

        title1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title1Label.setText("<html><div style=\"text-align: center\">Blood Drive: Friday, May 1, 2015<br>\nFrom 10 AM until 2 PM</div></html>");

        employeeImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/female.png"))); // NOI18N

        sub2Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub2Label.setText("Dr. Sara Cruz");

        javax.swing.GroupLayout bulletinTabPanelLayout = new javax.swing.GroupLayout(bulletinTabPanel);
        bulletinTabPanel.setLayout(bulletinTabPanelLayout);
        bulletinTabPanelLayout.setHorizontalGroup(
            bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(bloodImageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title2Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                                .addComponent(coffeeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(muffinImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanelLayout.createSequentialGroup()
                        .addComponent(sub2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanelLayout.createSequentialGroup()
                        .addComponent(employeeImageLabel)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanelLayout.createSequentialGroup()
                        .addComponent(title3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(title1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(622, Short.MAX_VALUE)))
        );
        bulletinTabPanelLayout.setVerticalGroup(
            bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bloodImageLabel)
                .addGap(59, 59, 59))
            .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(title3Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(employeeImageLabel)
                .addGap(18, 18, 18)
                .addComponent(sub2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title2Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(muffinImageLabel))
                    .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(coffeeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(bulletinTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bulletinTabPanelLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(title1Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        defaultPatientPanel.addTab("Bulletin Board", bulletinTabPanel);

        articleTabPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        articleTabPanel.setMaximumSize(new java.awt.Dimension(995, 577));
        articleTabPanel.setMinimumSize(new java.awt.Dimension(995, 577));

        articleEditorPane.setEditable(false);
        articleEditorPane.setContentType("text/html"); // NOI18N
        articleEditorPane.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n\t<h1>Wellness Solutions: A Healthy Solution</h1>\n    <p>\r\r\n Have you ever wondered how many calories are in that full chicken basket? A whopping 1137.5\ncalories with 57 grams of fat. (That does not include the dipping sauces). The average American gets 45 %\nof their calories from fat. No wonder we have problems with weight and cholesterol. Depending on caloric\nintake, one should keep their fat intake between 30-40 grams of fat per day. Do the math…. That full\nchicken basket just exceeded your daily limit. A half a basket will bring you in around 31 grams of fat.</p>\n <p>Crave that donut for breakfast or snack. Here is some information to chew on when making your\nchoice. A chocolate cake donut has 480 cal and 23 fat grams. A glazed donut is 299 calories with 14 fat\ngrams. The delicious cinnamon rolls are 620 calories and 29 fat grams. Yikes!! Sadly, you will be hungry\nbefore noon.</p>\n <p>Even our health conscious superintendent was surprised to find out that he was suffering from\n“portion distortion” when estimating his food intake. To make matters worse, he was shocked to discover\nthat his jumbo movie popcorn without butter (which he thought was a low cal choice) was around 1,650\ncalories. Wash that down with a super-sized soda…. Not a pretty sight.</p>\n <p>On average 61 percent of Americans are overweight. We have a problem… but we also have a\nsolution for all of us to improve our health. What an encouraging sight to participate with patients and staff\nworking together to achieve total body wellness using the Wellness Solutions material provided by Eli Lilly.\nThe Forensic building implemented a wellness group last fall. The group meets weekly for 12-13 weeks with\na success celebration activity at the end. A half hour support group occurs weekly for graduates of the initial\ngroup. We have several patients who repeat the group because it helps them stay on their own health track,\nplus it is fun. We are all about having fun learning together.</p>\n <p>An added bonus of the group is that the participants sign up for Lilly’s Solutions for Wellness\npersonalized program for six months. With participation, members receive free binders to store their\ninformation, pedometers, walking and exercise videos and DVD, walkman, magnets and lots of recipes that\nare nutritional, easy and low cost. As a bonus many community mental health centers are providing the\nsame program so our patients can continue on their wellness journey in the community.</p>\n <p>The group is headed by Leslie Miles, APRN, CNS and Julie Wright, UND. Other staff members\nprovide group and on unit support: Marta Bitten, Environmentalist, Chris Jackson, LPN and Lynne Wright,\nLPN. Kori Richins, Occupational Therapist joined in on the adventure and is using the recipes in cooking\ngroups so our clients are familiar with preparing healthy meals.</p>\n <p>Weekly group topics are educational and fitness related. Group members learn about the new food\npyramid, portion sizes, fats & cholesterol, how to read labels, sugar, general health, exercise, stretching, tai\nchi and walking. Weekly goals are a must and individualized from walking 45 minutes a day to trying just 5\npeas. It is all about making small changes that helps each member reach their individual goals. Mister “I\ndon’t do vegetables” went from 5 peas to eating 2 servings a day and liking it. One group member met their\ngoal of getting to a size 34 pants. Another patient group member presented for Forensic Family Day about\nthe group and commented that his family has now joined in the health quest. His phone calls home revolve\naround new information and checking on individual family member’s progress.</p>\n <p>You might be wondering about how we know the calorie count and nutrition of all the canteen and\nvending machine items. The group members measured, weighed and researched each item to learn hands\non about food choices. Most group members can tell you better choices in the vending machines. Group\nmembers can also tell you how to make choices on their food trays that will help them stay within their\ncalorie limit and meet their nutrition needs. Old forensic rules have been challenged with the death of\nordering a whole pepperoni pizza and having to eat it in one sitting (over 2800 calories and not including the\nsoda).</p>\n <p>Wellness Solutions is about individual choice, accountability, collaboration and commitment to not\nonly our patient’s health but our own. We have had great success. Our last group of 13 participants lost 54.8\npounds and dropped 16.2% body fat from baseline. This program is helping to significantly improve the\noverall wellness of patients, staff and extended others. Come join in our healthy fun. Try it; you’ll like it. ♦</p>\n  </body>\r\n</html>\r\n");
        articleEditorPane.setCaretPosition(0);
        articleScrollPane.setViewportView(articleEditorPane);

        javax.swing.GroupLayout articleTabPanelLayout = new javax.swing.GroupLayout(articleTabPanel);
        articleTabPanel.setLayout(articleTabPanelLayout);
        articleTabPanelLayout.setHorizontalGroup(
            articleTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(articleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        articleTabPanelLayout.setVerticalGroup(
            articleTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(articleScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        defaultPatientPanel.addTab("Wellness Article", articleTabPanel);

        patientsContainerPanel.add(defaultPatientPanel, "card1");

        patientTablePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientTablePanel.setAutoscrolls(true);
        patientTablePanel.setMaximumSize(new java.awt.Dimension(991, 573));
        patientTablePanel.setMinimumSize(new java.awt.Dimension(991, 573));
        patientTablePanel.setLayout(new java.awt.CardLayout());
        patientsContainerPanel.add(patientTablePanel, "card2");

        chartTablePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chartTablePanel.setAutoscrolls(true);
        chartTablePanel.setMaximumSize(new java.awt.Dimension(991, 573));
        chartTablePanel.setMinimumSize(new java.awt.Dimension(991, 573));
        chartTablePanel.setLayout(new java.awt.CardLayout());
        patientsContainerPanel.add(chartTablePanel, "card2");

        addNewPatientButton.setText("<html><div style=\"text-align: center\">Add<br>Patients</div></html>");
        addNewPatientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewPatientButton.setPreferredSize(new java.awt.Dimension(110, 47));
        addNewPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientButtonActionPerformed(evt);
            }
        });

        viewPatientButton.setText("<html><div style=\"text-align: center\">View<br>Patients</div></html>");
        viewPatientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientButtonActionPerformed(evt);
            }
        });

        viewYourPatientButton.setText("<html><div style=\"text-align: center\">Assigned<br>Patients</div></html>");
        viewYourPatientButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewYourPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewYourPatientButtonActionPerformed(evt);
            }
        });

        patImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        patImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fempatsm.png"))); // NOI18N

        javax.swing.GroupLayout patientsPanelLayout = new javax.swing.GroupLayout(patientsPanel);
        patientsPanel.setLayout(patientsPanelLayout);
        patientsPanelLayout.setHorizontalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientsPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(viewPatientButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewYourPatientButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(patientsContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        patientsPanelLayout.setVerticalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(patientsPanelLayout.createSequentialGroup()
                        .addComponent(addNewPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(viewPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(viewYourPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(patImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addComponent(patientsContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );

        containerPanel.add(patientsPanel, "card2");

        adminPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        adminPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        adminPanel.setPreferredSize(new java.awt.Dimension(1170, 613));

        adminContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adminContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
        adminContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
        adminContainerPanel.setLayout(new java.awt.CardLayout());

        defaultAdminPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        subLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subLabel2.setText("<html><div style=\"text-align: center\"><h3>Free Muffin w/Coffee Purchase!</h3></div></html>");

        bloodImageLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood.png"))); // NOI18N

        title3Label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title3Label2.setText("<html><div style=\"text-align: center\">Employee Of The Month<br>\nApril 2015</div></html>");

        coffeeImageLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeesm.png"))); // NOI18N

        muffinImageLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muffinsm.png"))); // NOI18N

        title2Label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title2Label2.setText("<html><div style=\"text-align: center\">Today's Cafeteria<br>Special</div></html>");

        title1Label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title1Label2.setText("<html><div style=\"text-align: center\">Blood Drive: Friday, May 1, 2015<br>\nFrom 10 AM until 2 PM</div></html>");

        employeeImageLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeImageLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/female.png"))); // NOI18N

        sub2Label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sub2Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sub2Label2.setText("Dr. Sara Cruz");

        javax.swing.GroupLayout bulletinTabPanel2Layout = new javax.swing.GroupLayout(bulletinTabPanel2);
        bulletinTabPanel2.setLayout(bulletinTabPanel2Layout);
        bulletinTabPanel2Layout.setHorizontalGroup(
            bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(bloodImageLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(title2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                                .addComponent(coffeeImageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(muffinImageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel2Layout.createSequentialGroup()
                        .addComponent(sub2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel2Layout.createSequentialGroup()
                        .addComponent(employeeImageLabel2)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel2Layout.createSequentialGroup()
                        .addComponent(title3Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addComponent(title1Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(622, Short.MAX_VALUE)))
        );
        bulletinTabPanel2Layout.setVerticalGroup(
            bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bloodImageLabel2)
                .addGap(59, 59, 59))
            .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(title3Label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(employeeImageLabel2)
                .addGap(18, 18, 18)
                .addComponent(sub2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title2Label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(muffinImageLabel2))
                    .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(coffeeImageLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(bulletinTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bulletinTabPanel2Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(title1Label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(317, Short.MAX_VALUE)))
        );

        defaultAdminPanel.addTab("Bulletin Board", bulletinTabPanel2);

        articleTabPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        articleTabPanel2.setMaximumSize(new java.awt.Dimension(995, 577));
        articleTabPanel2.setMinimumSize(new java.awt.Dimension(995, 577));

        articleEditorPane2.setEditable(false);
        articleEditorPane2.setContentType("text/html"); // NOI18N
        articleEditorPane2.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n\t<h1>Wellness Solutions: A Healthy Solution</h1>\n    <p>\r\r\n Have you ever wondered how many calories are in that full chicken basket? A whopping 1137.5\ncalories with 57 grams of fat. (That does not include the dipping sauces). The average American gets 45 %\nof their calories from fat. No wonder we have problems with weight and cholesterol. Depending on caloric\nintake, one should keep their fat intake between 30-40 grams of fat per day. Do the math…. That full\nchicken basket just exceeded your daily limit. A half a basket will bring you in around 31 grams of fat.</p>\n <p>Crave that donut for breakfast or snack. Here is some information to chew on when making your\nchoice. A chocolate cake donut has 480 cal and 23 fat grams. A glazed donut is 299 calories with 14 fat\ngrams. The delicious cinnamon rolls are 620 calories and 29 fat grams. Yikes!! Sadly, you will be hungry\nbefore noon.</p>\n <p>Even our health conscious superintendent was surprised to find out that he was suffering from\n“portion distortion” when estimating his food intake. To make matters worse, he was shocked to discover\nthat his jumbo movie popcorn without butter (which he thought was a low cal choice) was around 1,650\ncalories. Wash that down with a super-sized soda…. Not a pretty sight.</p>\n <p>On average 61 percent of Americans are overweight. We have a problem… but we also have a\nsolution for all of us to improve our health. What an encouraging sight to participate with patients and staff\nworking together to achieve total body wellness using the Wellness Solutions material provided by Eli Lilly.\nThe Forensic building implemented a wellness group last fall. The group meets weekly for 12-13 weeks with\na success celebration activity at the end. A half hour support group occurs weekly for graduates of the initial\ngroup. We have several patients who repeat the group because it helps them stay on their own health track,\nplus it is fun. We are all about having fun learning together.</p>\n <p>An added bonus of the group is that the participants sign up for Lilly’s Solutions for Wellness\npersonalized program for six months. With participation, members receive free binders to store their\ninformation, pedometers, walking and exercise videos and DVD, walkman, magnets and lots of recipes that\nare nutritional, easy and low cost. As a bonus many community mental health centers are providing the\nsame program so our patients can continue on their wellness journey in the community.</p>\n <p>The group is headed by Leslie Miles, APRN, CNS and Julie Wright, UND. Other staff members\nprovide group and on unit support: Marta Bitten, Environmentalist, Chris Jackson, LPN and Lynne Wright,\nLPN. Kori Richins, Occupational Therapist joined in on the adventure and is using the recipes in cooking\ngroups so our clients are familiar with preparing healthy meals.</p>\n <p>Weekly group topics are educational and fitness related. Group members learn about the new food\npyramid, portion sizes, fats & cholesterol, how to read labels, sugar, general health, exercise, stretching, tai\nchi and walking. Weekly goals are a must and individualized from walking 45 minutes a day to trying just 5\npeas. It is all about making small changes that helps each member reach their individual goals. Mister “I\ndon’t do vegetables” went from 5 peas to eating 2 servings a day and liking it. One group member met their\ngoal of getting to a size 34 pants. Another patient group member presented for Forensic Family Day about\nthe group and commented that his family has now joined in the health quest. His phone calls home revolve\naround new information and checking on individual family member’s progress.</p>\n <p>You might be wondering about how we know the calorie count and nutrition of all the canteen and\nvending machine items. The group members measured, weighed and researched each item to learn hands\non about food choices. Most group members can tell you better choices in the vending machines. Group\nmembers can also tell you how to make choices on their food trays that will help them stay within their\ncalorie limit and meet their nutrition needs. Old forensic rules have been challenged with the death of\nordering a whole pepperoni pizza and having to eat it in one sitting (over 2800 calories and not including the\nsoda).</p>\n <p>Wellness Solutions is about individual choice, accountability, collaboration and commitment to not\nonly our patient’s health but our own. We have had great success. Our last group of 13 participants lost 54.8\npounds and dropped 16.2% body fat from baseline. This program is helping to significantly improve the\noverall wellness of patients, staff and extended others. Come join in our healthy fun. Try it; you’ll like it. ♦</p>\n  </body>\r\n</html>\r\n");
        articleEditorPane2.setCaretPosition(0);
        articleScrollPane2.setViewportView(articleEditorPane2);

        javax.swing.GroupLayout articleTabPanel2Layout = new javax.swing.GroupLayout(articleTabPanel2);
        articleTabPanel2.setLayout(articleTabPanel2Layout);
        articleTabPanel2Layout.setHorizontalGroup(
            articleTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(articleScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        articleTabPanel2Layout.setVerticalGroup(
            articleTabPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(articleScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        defaultAdminPanel.addTab("Wellness Article", articleTabPanel2);

        adminContainerPanel.add(defaultAdminPanel, "card5");

        addUserPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addUserPanel.setMaximumSize(new java.awt.Dimension(991, 573));
        addUserPanel.setMinimumSize(new java.awt.Dimension(991, 573));

        firstNameLabel.setLabelFor(firstNameText);
        firstNameLabel.setText(" First Name");

        lastNameLabel.setLabelFor(lastNameText);
        lastNameLabel.setText(" Last Name");

        middleIntLabel.setLabelFor(middleIntText);
        middleIntLabel.setText("Middle Int.");

        ssnLabel.setLabelFor(ssnText);
        ssnLabel.setText(" Social Security #");

        ssnText.setText("###-##-####");
        ssnText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ssnTextFocusGained(evt);
            }
        });
        ssnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssnTextMouseClicked(evt);
            }
        });

        address1Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address1TextMouseClicked(evt);
            }
        });

        address1Label.setLabelFor(address1Text);
        address1Label.setText(" Address 1");

        cityText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityTextMouseClicked(evt);
            }
        });

        cityLabel.setLabelFor(cityText);
        cityLabel.setText(" City");

        stateLabel.setText(" State");

        zipText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zipTextMouseClicked(evt);
            }
        });

        zipLabel.setText(" Zip Code");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        genderLabel.setText(" Sex");

        dobLabel.setText(" Date of Birth");

        address2Label.setLabelFor(address2Text);
        address2Label.setText(" Address 2");

        address2Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address2TextMouseClicked(evt);
            }
        });

        phoneLabel.setText(" Phone");

        phoneText.setText("###-###-####");
        phoneText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTextFocusGained(evt);
            }
        });
        phoneText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTextMouseClicked(evt);
            }
        });

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Administrator", "Doctor", "Nurse", "Receptionist", "IT", "Janitorial", "Maintenance", "Other" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        positionLabel.setLabelFor(positionComboBox);
        positionLabel.setText("Position");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas",
            "California", "Colorado", "Connecticut",
            "Delaware", "Dist. of Columbia","Florida","Georgia",
            "Hawaii","Idaho","Illinois","Indiana", "Iowa",
            "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
            "Massachusetts", "Michigan", "Minnesota", "Mississippi",
            "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
            "New Jersey", "New Mexico", "New York", "North Carolina",
            "North Dakota", "Ohio", "Oklahoma","Oregon","Pennsylvania",
            "Rhode Island","South Carolina","South Dakota","Tennessee",
            "Texas","Utah","Vermont","Virginia","Washington","West Virginia",
            "Wyoming"}));
stateComboBox.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        stateComboBoxActionPerformed(evt);
    }
    });

    positionLabel1.setLabelFor(positionComboBox);
    positionLabel1.setText("Access Level");

    accessLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
    accessLevelComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            accessLevelComboBoxActionPerformed(evt);
        }
    });

    monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month:", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    monthComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            monthComboBoxActionPerformed(evt);
        }
    });

    dayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
        "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
dayComboBox.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    dayComboBoxActionPerformed(evt);
    }
    });

    yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year:", "1900","1901","1902","1903","1904",
        "1905","1906","1907","1908","1909","1910","1911",
        "1912","1913","1914","1915","1916","1917","1918",
        "1919","1920","1921","1922","1923","1924","1925",
        "1926","1927","1928","1929","1930","1931","1932",
        "1933","1934","1935","1936","1937","1938","1939",
        "1940","1941","1942","1943","1944","1945","1946",
        "1947","1948","1949","1950","1951","1952","1953",
        "1954","1955","1956","1957","1958","1959","1960",
        "1961","1962","1963","1964","1965","1966","1967",
        "1968","1969","1970","1971","1972","1973","1974",
        "1975","1976","1977","1978","1979","1980","1981",
        "1982","1983","1984","1985","1986","1987","1988",
        "1989","1990","1991","1992","1993","1994","1995",
        "1996","1997","1998","1999","2000","2001","2002",
        "2003","2004","2005","2006","2007","2008","2009",
        "2010","2011","2012","2013","2014","2015"}));
yearComboBox.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    yearComboBoxActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
    addUserPanel.setLayout(addUserPanelLayout);
    addUserPanelLayout.setHorizontalGroup(
        addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(addUserPanelLayout.createSequentialGroup()
            .addGap(98, 98, 98)
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address1Text)
                    .addComponent(address2Text)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleIntText)
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addComponent(middleIntLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address2Label)
                            .addComponent(address1Label)
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobLabel)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addComponent(cancelButton)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(zipText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityText)
                                    .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(zipLabel)
                                .addComponent(phoneLabel))
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(accessLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(stateLabel)
                                                .addComponent(ssnLabel)
                                                .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(positionLabel)))
                                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(femaleRadioButton)
                                                .addComponent(maleRadioButton)
                                                .addComponent(genderLabel)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(positionLabel1)
                                            .addGap(8, 8, 8))))))
                        .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(110, Short.MAX_VALUE))))
    );

    addUserPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, saveButton});

    addUserPanelLayout.setVerticalGroup(
        addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(addUserPanelLayout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(ssnLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addComponent(middleIntLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(middleIntText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addComponent(lastNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addComponent(firstNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(address1Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(address1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(stateLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                            .addComponent(cityLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addComponent(address2Label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(address2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zipLabel)
                                .addComponent(positionLabel)
                                .addComponent(positionLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accessLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(dobLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(phoneLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(88, 88, 88))
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addComponent(genderLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(maleRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(femaleRadioButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cancelButton)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(138, Short.MAX_VALUE))
    );

    addUserPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, saveButton});

    adminContainerPanel.add(addUserPanel, "card3");

    adminTablePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    adminTablePanel.setAutoscrolls(true);
    adminTablePanel.setMaximumSize(new java.awt.Dimension(991, 573));
    adminTablePanel.setMinimumSize(new java.awt.Dimension(991, 573));
    adminTablePanel.setLayout(new java.awt.CardLayout());
    adminContainerPanel.add(adminTablePanel, "card2");

    addNewUserButton.setText("<html><div style=\"text-align: center\">Add<br>Employee</html>");
    addNewUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    addNewUserButton.setPreferredSize(new java.awt.Dimension(110, 47));
    addNewUserButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addNewUserButtonActionPerformed(evt);
        }
    });

    removeUserButton.setText("<html><div style=\"text-align: center\">Remove<br>Employee</html>");
    removeUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    removeUserButton.setPreferredSize(new java.awt.Dimension(110, 47));
    removeUserButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeUserButtonActionPerformed(evt);
        }
    });

    viewEmployeesButton.setText("<html><div style=\"text-align: center\">View<br>Employees</html>");
    viewEmployeesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    viewEmployeesButton.setPreferredSize(new java.awt.Dimension(110, 47));
    viewEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewEmployeesButtonActionPerformed(evt);
        }
    });

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fempatsm.png"))); // NOI18N

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminsm.png"))); // NOI18N

    javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
    adminPanel.setLayout(adminPanelLayout);
    adminPanelLayout.setHorizontalGroup(
        adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(addNewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addComponent(removeUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(29, 29, 29)
            .addComponent(adminContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    adminPanelLayout.setVerticalGroup(
        adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(adminPanelLayout.createSequentialGroup()
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(adminContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(addNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(viewEmployeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(133, 133, 133))
        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE)))
    );

    adminPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addNewUserButton, removeUserButton});

    containerPanel.add(adminPanel, "card2");

    empPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
    empPanel.setMinimumSize(new java.awt.Dimension(1170, 613));

    empContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    empContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
    empContainerPanel.setMinimumSize(new java.awt.Dimension(995, 577));
    empContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
    empContainerPanel.setLayout(new java.awt.CardLayout());

    defaultEmpPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    defaultEmpPanel.setMaximumSize(new java.awt.Dimension(995, 577));
    defaultEmpPanel.setMinimumSize(new java.awt.Dimension(995, 577));

    javax.swing.GroupLayout defaultEmpPanelLayout = new javax.swing.GroupLayout(defaultEmpPanel);
    defaultEmpPanel.setLayout(defaultEmpPanelLayout);
    defaultEmpPanelLayout.setHorizontalGroup(
        defaultEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 989, Short.MAX_VALUE)
    );
    defaultEmpPanelLayout.setVerticalGroup(
        defaultEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 571, Short.MAX_VALUE)
    );

    empContainerPanel.add(defaultEmpPanel, "card3");

    viewEmpPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    viewEmpPanel.setMaximumSize(new java.awt.Dimension(991, 573));
    viewEmpPanel.setMinimumSize(new java.awt.Dimension(991, 573));

    empFirstNameText.setEnabled(false);

    empFirstNameLabel.setLabelFor(firstNameText);
    empFirstNameLabel.setText(" First Name");

    empLastNameText.setEnabled(false);

    empLastNameLabel.setLabelFor(lastNameText);
    empLastNameLabel.setText(" Last Name");

    empMiddleIntText.setEnabled(false);

    empMiddleIntLabel.setLabelFor(middleIntText);
    empMiddleIntLabel.setText(" Middle Name");

    empSSNLabel.setLabelFor(ssnText);
    empSSNLabel.setText(" Social Security #");

    empSSNText.setEnabled(false);
    empSSNText.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            empSSNTextFocusGained(evt);
        }
    });
    empSSNText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empSSNTextMouseClicked(evt);
        }
    });

    empAddress1Text.setEnabled(false);
    empAddress1Text.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empAddress1TextMouseClicked(evt);
        }
    });

    empAddress1Label.setLabelFor(address1Text);
    empAddress1Label.setText(" Address 1");

    empCityText.setEnabled(false);
    empCityText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empCityTextMouseClicked(evt);
        }
    });

    empCityLabel.setLabelFor(cityText);
    empCityLabel.setText(" City");

    empStateLabel.setText(" State");

    empZipText.setEnabled(false);
    empZipText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empZipTextMouseClicked(evt);
        }
    });

    empZipLabel.setText(" Zip Code");

    empGenderButtonGroup.add(empMaleRadioButton);
    empMaleRadioButton.setText("Male");
    empMaleRadioButton.setEnabled(false);

    empGenderButtonGroup.add(empFemaleRadioButton);
    empFemaleRadioButton.setText("Female");
    empFemaleRadioButton.setEnabled(false);

    empGenderLabel.setText(" Sex");

    empDOBLabel.setText(" Date of Birth");

    empEmailLabel.setText(" Email");

    empEmailText.setEnabled(false);
    empEmailText.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            empEmailTextFocusGained(evt);
        }
    });
    empEmailText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empEmailTextMouseClicked(evt);
        }
    });

    empAddress2Label.setLabelFor(address2Text);
    empAddress2Label.setText(" Address 2");

    empAddress2Text.setEnabled(false);
    empAddress2Text.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empAddress2TextMouseClicked(evt);
        }
    });

    empPhoneLabel.setText(" Phone");

    empPhoneText.setEnabled(false);
    empPhoneText.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            empPhoneTextFocusGained(evt);
        }
    });
    empPhoneText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empPhoneTextMouseClicked(evt);
        }
    });

    empPositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Administrator", "Doctor", "Nurse", "Receptionist", "IT", "Janitorial", "Maintenance", "Other" }));
    empPositionComboBox.setEnabled(false);
    empPositionComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empPositionComboBoxActionPerformed(evt);
        }
    });

    empPositionLabel.setLabelFor(positionComboBox);
    empPositionLabel.setText("Position");

    empSaveButton.setText("Save");
    empSaveButton.setEnabled(false);
    empSaveButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empSaveButtonActionPerformed(evt);
        }
    });

    empCancelButton.setText("Cancel");
    empCancelButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empCancelButtonActionPerformed(evt);
        }
    });

    empEditButton.setText("Edit");
    empEditButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empEditButtonActionPerformed(evt);
        }
    });

    empMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month:", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    empMonthComboBox.setEnabled(false);
    empMonthComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empMonthComboBoxActionPerformed(evt);
        }
    });

    empDayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
        "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
empDayComboBox.setEnabled(false);
empDayComboBox.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    empDayComboBoxActionPerformed(evt);
    }
    });

    yearComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year:", "1900","1901","1902","1903","1904",
        "1905","1906","1907","1908","1909","1910","1911",
        "1912","1913","1914","1915","1916","1917","1918",
        "1919","1920","1921","1922","1923","1924","1925",
        "1926","1927","1928","1929","1930","1931","1932",
        "1933","1934","1935","1936","1937","1938","1939",
        "1940","1941","1942","1943","1944","1945","1946",
        "1947","1948","1949","1950","1951","1952","1953",
        "1954","1955","1956","1957","1958","1959","1960",
        "1961","1962","1963","1964","1965","1966","1967",
        "1968","1969","1970","1971","1972","1973","1974",
        "1975","1976","1977","1978","1979","1980","1981",
        "1982","1983","1984","1985","1986","1987","1988",
        "1989","1990","1991","1992","1993","1994","1995",
        "1996","1997","1998","1999","2000","2001","2002",
        "2003","2004","2005","2006","2007","2008","2009",
        "2010","2011","2012","2013","2014","2015"}));
yearComboBox1.setEnabled(false);
yearComboBox1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    yearComboBox1ActionPerformed(evt);
    }
    });

    stateComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas",
        "California", "Colorado", "Connecticut",
        "Delaware", "Dist. of Columbia","Florida","Georgia",
        "Hawaii","Idaho","Illinois","Indiana", "Iowa",
        "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
        "Massachusetts", "Michigan", "Minnesota", "Mississippi",
        "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
        "New Jersey", "New Mexico", "New York", "North Carolina",
        "North Dakota", "Ohio", "Oklahoma","Oregon","Pennsylvania",
        "Rhode Island","South Carolina","South Dakota","Tennessee",
        "Texas","Utah","Vermont","Virginia","Washington","West Virginia",
        "Wyoming"}));
stateComboBox1.setEnabled(false);
stateComboBox1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    stateComboBox1ActionPerformed(evt);
    }
    });

    empPositionComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Administrator", "Doctor", "Nurse", "Receptionist", "IT", "Janitorial", "Maintenance", "Other" }));
    empPositionComboBox1.setEnabled(false);
    empPositionComboBox1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empPositionComboBox1ActionPerformed(evt);
        }
    });

    empPositionLabel1.setLabelFor(positionComboBox);
    empPositionLabel1.setText("Access Lvl");

    javax.swing.GroupLayout viewEmpPanelLayout = new javax.swing.GroupLayout(viewEmpPanel);
    viewEmpPanel.setLayout(viewEmpPanelLayout);
    viewEmpPanelLayout.setHorizontalGroup(
        viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(viewEmpPanelLayout.createSequentialGroup()
            .addGap(98, 98, 98)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empAddress1Text)
                    .addComponent(empAddress2Text)
                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empFirstNameLabel)
                            .addComponent(empFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empMiddleIntText)
                            .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                .addComponent(empMiddleIntLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empDOBLabel)
                                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                        .addComponent(empMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(empDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(empAddress2Label)
                            .addComponent(empAddress1Label))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addComponent(empSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewEmpPanelLayout.createSequentialGroup()
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(empZipText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(empLastNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empCityLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empCityText)
                            .addComponent(empLastNameText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(empZipLabel))
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(empStateLabel)
                                        .addComponent(empSSNLabel)
                                        .addComponent(empSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(13, 13, 13)
                                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(empGenderLabel)
                                        .addComponent(empFemaleRadioButton)
                                        .addComponent(empMaleRadioButton)))
                                .addComponent(stateComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(empPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(empPositionLabel)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(empPositionLabel1)
                                .addComponent(empPositionComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewEmpPanelLayout.createSequentialGroup()
                        .addComponent(empEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empCancelButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewEmpPanelLayout.createSequentialGroup()
                        .addComponent(empPhoneLabel)
                        .addGap(143, 143, 143)
                        .addComponent(empEmailLabel))
                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                        .addComponent(empPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(37, Short.MAX_VALUE))
    );

    viewEmpPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {empCancelButton, empSaveButton});

    viewEmpPanelLayout.setVerticalGroup(
        viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(viewEmpPanelLayout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                .addComponent(empSSNLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addComponent(empMiddleIntLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empMiddleIntText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                        .addComponent(empLastNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(empLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                        .addComponent(empFirstNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(empFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(27, 27, 27)
                        .addComponent(empAddress1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empAddress1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmpPanelLayout.createSequentialGroup()
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empCityLabel)
                            .addComponent(empStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                    .addComponent(empGenderLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(empMaleRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(empFemaleRadioButton)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                    .addComponent(empAddress2Label)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(empAddress2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empZipLabel)
                        .addComponent(empPositionLabel)
                        .addComponent(empPositionLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empPositionComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(empDOBLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmpPanelLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(empEmailLabel)
                        .addComponent(empPhoneLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yearComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(empPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(45, 45, 45)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(empCancelButton)
                .addComponent(empSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(empEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(163, Short.MAX_VALUE))
    );

    viewEmpPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {empCancelButton, empSaveButton});

    empContainerPanel.add(viewEmpPanel, "card2");

    empTablePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    empTablePanel.setAutoscrolls(true);
    empTablePanel.setMaximumSize(new java.awt.Dimension(991, 573));
    empTablePanel.setMinimumSize(new java.awt.Dimension(991, 573));
    empTablePanel.setLayout(new java.awt.CardLayout());
    empContainerPanel.add(empTablePanel, "card2");

    empImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee2sm.png"))); // NOI18N

    javax.swing.GroupLayout empPanelLayout = new javax.swing.GroupLayout(empPanel);
    empPanel.setLayout(empPanelLayout);
    empPanelLayout.setHorizontalGroup(
        empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empPanelLayout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(empImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(23, 23, 23)
            .addComponent(empContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25))
    );
    empPanelLayout.setVerticalGroup(
        empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(empPanelLayout.createSequentialGroup()
            .addGroup(empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(empPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(empContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(empPanelLayout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(empImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(133, 133, 133))
    );

    containerPanel.add(empPanel, "card2");

    apptPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
    apptPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
    apptPanel.setPreferredSize(new java.awt.Dimension(1170, 613));

    apptContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    apptContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
    apptContainerPanel.setMinimumSize(new java.awt.Dimension(995, 577));
    apptContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
    apptContainerPanel.setLayout(new java.awt.CardLayout());

    defaultApptPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    subLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    subLabel1.setText("<html><div style=\"text-align: center\"><h3>Free Muffin w/Coffee Purchase!</h3></div></html>");

    bloodImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood.png"))); // NOI18N

    title3Label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    title3Label1.setText("<html><div style=\"text-align: center\">Employee Of The Month<br>\nApril 2015</div></html>");

    coffeeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffeesm.png"))); // NOI18N

    muffinImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muffinsm.png"))); // NOI18N

    title2Label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    title2Label1.setText("<html><div style=\"text-align: center\">Today's Cafeteria<br>Special</div></html>");

    title1Label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    title1Label1.setText("<html><div style=\"text-align: center\">Blood Drive: Friday, May 1, 2015<br>\nFrom 10 AM until 2 PM</div></html>");

    employeeImageLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    employeeImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/female.png"))); // NOI18N

    sub2Label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    sub2Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    sub2Label1.setText("Dr. Sara Cruz");

    javax.swing.GroupLayout bulletinTabPanel1Layout = new javax.swing.GroupLayout(bulletinTabPanel1);
    bulletinTabPanel1.setLayout(bulletinTabPanel1Layout);
    bulletinTabPanel1Layout.setHorizontalGroup(
        bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
            .addGap(123, 123, 123)
            .addComponent(bloodImageLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
            .addGroup(bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(subLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(title2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
                            .addComponent(coffeeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(muffinImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(60, 60, 60)
            .addGroup(bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel1Layout.createSequentialGroup()
                    .addComponent(sub2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(115, 115, 115))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel1Layout.createSequentialGroup()
                    .addComponent(employeeImageLabel1)
                    .addGap(86, 86, 86))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel1Layout.createSequentialGroup()
                    .addComponent(title3Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73))))
        .addGroup(bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(title1Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(622, Short.MAX_VALUE)))
    );
    bulletinTabPanel1Layout.setVerticalGroup(
        bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(bloodImageLabel1)
            .addGap(59, 59, 59))
        .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addComponent(title3Label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20)
            .addComponent(employeeImageLabel1)
            .addGap(18, 18, 18)
            .addComponent(sub2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(53, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bulletinTabPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title2Label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(muffinImageLabel1))
                .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(coffeeImageLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(subLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(77, 77, 77))
        .addGroup(bulletinTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bulletinTabPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(title1Label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE)))
    );

    defaultApptPanel.addTab("Bulletin Board", bulletinTabPanel1);

    articleTabPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    articleTabPanel1.setMaximumSize(new java.awt.Dimension(995, 577));
    articleTabPanel1.setMinimumSize(new java.awt.Dimension(995, 577));

    articleEditorPane1.setEditable(false);
    articleEditorPane1.setContentType("text/html"); // NOI18N
    articleEditorPane1.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n\t<h1>Wellness Solutions: A Healthy Solution</h1>\n    <p>\r\r\n Have you ever wondered how many calories are in that full chicken basket? A whopping 1137.5\ncalories with 57 grams of fat. (That does not include the dipping sauces). The average American gets 45 %\nof their calories from fat. No wonder we have problems with weight and cholesterol. Depending on caloric\nintake, one should keep their fat intake between 30-40 grams of fat per day. Do the math…. That full\nchicken basket just exceeded your daily limit. A half a basket will bring you in around 31 grams of fat.</p>\n <p>Crave that donut for breakfast or snack. Here is some information to chew on when making your\nchoice. A chocolate cake donut has 480 cal and 23 fat grams. A glazed donut is 299 calories with 14 fat\ngrams. The delicious cinnamon rolls are 620 calories and 29 fat grams. Yikes!! Sadly, you will be hungry\nbefore noon.</p>\n <p>Even our health conscious superintendent was surprised to find out that he was suffering from\n“portion distortion” when estimating his food intake. To make matters worse, he was shocked to discover\nthat his jumbo movie popcorn without butter (which he thought was a low cal choice) was around 1,650\ncalories. Wash that down with a super-sized soda…. Not a pretty sight.</p>\n <p>On average 61 percent of Americans are overweight. We have a problem… but we also have a\nsolution for all of us to improve our health. What an encouraging sight to participate with patients and staff\nworking together to achieve total body wellness using the Wellness Solutions material provided by Eli Lilly.\nThe Forensic building implemented a wellness group last fall. The group meets weekly for 12-13 weeks with\na success celebration activity at the end. A half hour support group occurs weekly for graduates of the initial\ngroup. We have several patients who repeat the group because it helps them stay on their own health track,\nplus it is fun. We are all about having fun learning together.</p>\n <p>An added bonus of the group is that the participants sign up for Lilly’s Solutions for Wellness\npersonalized program for six months. With participation, members receive free binders to store their\ninformation, pedometers, walking and exercise videos and DVD, walkman, magnets and lots of recipes that\nare nutritional, easy and low cost. As a bonus many community mental health centers are providing the\nsame program so our patients can continue on their wellness journey in the community.</p>\n <p>The group is headed by Leslie Miles, APRN, CNS and Julie Wright, UND. Other staff members\nprovide group and on unit support: Marta Bitten, Environmentalist, Chris Jackson, LPN and Lynne Wright,\nLPN. Kori Richins, Occupational Therapist joined in on the adventure and is using the recipes in cooking\ngroups so our clients are familiar with preparing healthy meals.</p>\n <p>Weekly group topics are educational and fitness related. Group members learn about the new food\npyramid, portion sizes, fats & cholesterol, how to read labels, sugar, general health, exercise, stretching, tai\nchi and walking. Weekly goals are a must and individualized from walking 45 minutes a day to trying just 5\npeas. It is all about making small changes that helps each member reach their individual goals. Mister “I\ndon’t do vegetables” went from 5 peas to eating 2 servings a day and liking it. One group member met their\ngoal of getting to a size 34 pants. Another patient group member presented for Forensic Family Day about\nthe group and commented that his family has now joined in the health quest. His phone calls home revolve\naround new information and checking on individual family member’s progress.</p>\n <p>You might be wondering about how we know the calorie count and nutrition of all the canteen and\nvending machine items. The group members measured, weighed and researched each item to learn hands\non about food choices. Most group members can tell you better choices in the vending machines. Group\nmembers can also tell you how to make choices on their food trays that will help them stay within their\ncalorie limit and meet their nutrition needs. Old forensic rules have been challenged with the death of\nordering a whole pepperoni pizza and having to eat it in one sitting (over 2800 calories and not including the\nsoda).</p>\n <p>Wellness Solutions is about individual choice, accountability, collaboration and commitment to not\nonly our patient’s health but our own. We have had great success. Our last group of 13 participants lost 54.8\npounds and dropped 16.2% body fat from baseline. This program is helping to significantly improve the\noverall wellness of patients, staff and extended others. Come join in our healthy fun. Try it; you’ll like it. ♦</p>\n  </body>\r\n</html>\r\n");
    articleEditorPane1.setCaretPosition(0);
    articleScrollPane1.setViewportView(articleEditorPane1);

    javax.swing.GroupLayout articleTabPanel1Layout = new javax.swing.GroupLayout(articleTabPanel1);
    articleTabPanel1.setLayout(articleTabPanel1Layout);
    articleTabPanel1Layout.setHorizontalGroup(
        articleTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(articleScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
    );
    articleTabPanel1Layout.setVerticalGroup(
        articleTabPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(articleScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
    );

    defaultApptPanel.addTab("Wellness Article", articleTabPanel1);

    apptContainerPanel.add(defaultApptPanel, "card5");

    apptTablePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    apptTablePanel.setMaximumSize(new java.awt.Dimension(995, 577));
    apptTablePanel.setMinimumSize(new java.awt.Dimension(995, 577));
    apptTablePanel.setLayout(new java.awt.CardLayout());
    apptContainerPanel.add(apptTablePanel, "card3");

    createApptButton.setText("<html><div style=\"text-align: center\">Create<br>Appointments</div></html>");
    createApptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    createApptButton.setPreferredSize(new java.awt.Dimension(110, 47));
    createApptButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            createApptButtonActionPerformed(evt);
        }
    });

    viewApptButton.setText("<html><div style=\"text-align: center\">View<br>Appointments</div></html>");
    viewApptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    viewApptButton.setPreferredSize(new java.awt.Dimension(110, 47));
    viewApptButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewApptButtonActionPerformed(evt);
        }
    });

    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendarsm.png"))); // NOI18N

    javax.swing.GroupLayout apptPanelLayout = new javax.swing.GroupLayout(apptPanel);
    apptPanel.setLayout(apptPanelLayout);
    apptPanelLayout.setHorizontalGroup(
        apptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, apptPanelLayout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(apptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(createApptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewApptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGap(30, 30, 30)
            .addComponent(apptContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26))
    );

    apptPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {createApptButton, viewApptButton});

    apptPanelLayout.setVerticalGroup(
        apptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(apptPanelLayout.createSequentialGroup()
            .addGroup(apptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(apptPanelLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(createApptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(viewApptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(apptPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(apptContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(133, 133, 133))
    );

    apptPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createApptButton, viewApptButton});

    containerPanel.add(apptPanel, "card2");

    timeCPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
    timeCPanel.setMinimumSize(new java.awt.Dimension(1170, 613));

    timeContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    timeContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
    timeContainerPanel.setMinimumSize(new java.awt.Dimension(995, 577));
    timeContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
    timeContainerPanel.setLayout(new java.awt.CardLayout());

    defaultTimePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    defaultTimePanel.setMaximumSize(new java.awt.Dimension(995, 577));
    defaultTimePanel.setMinimumSize(new java.awt.Dimension(995, 577));

    javax.swing.GroupLayout defaultTimePanelLayout = new javax.swing.GroupLayout(defaultTimePanel);
    defaultTimePanel.setLayout(defaultTimePanelLayout);
    defaultTimePanelLayout.setHorizontalGroup(
        defaultTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 989, Short.MAX_VALUE)
    );
    defaultTimePanelLayout.setVerticalGroup(
        defaultTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 571, Short.MAX_VALUE)
    );

    timeContainerPanel.add(defaultTimePanel, "card3");

    timePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    timePanel.setAutoscrolls(true);
    timePanel.setMaximumSize(new java.awt.Dimension(991, 573));
    timePanel.setMinimumSize(new java.awt.Dimension(991, 573));
    timePanel.setLayout(new java.awt.CardLayout());
    timeContainerPanel.add(timePanel, "card2");

    timeImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timesm.png"))); // NOI18N

    javax.swing.GroupLayout timeCPanelLayout = new javax.swing.GroupLayout(timeCPanel);
    timeCPanel.setLayout(timeCPanelLayout);
    timeCPanelLayout.setHorizontalGroup(
        timeCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timeCPanelLayout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(timeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(22, 22, 22)
            .addComponent(timeContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25))
    );
    timeCPanelLayout.setVerticalGroup(
        timeCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(timeCPanelLayout.createSequentialGroup()
            .addGroup(timeCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(timeCPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(timeContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(timeCPanelLayout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addComponent(timeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(133, 133, 133))
    );

    containerPanel.add(timeCPanel, "card2");

    buildLabel.setText("GreyTek International -- SMS Build Ver. 1.0");

    timeClockButton.setText("TimeClock");
    timeClockButton.setMaximumSize(new java.awt.Dimension(61, 25));
    timeClockButton.setPreferredSize(new java.awt.Dimension(61, 25));
    timeClockButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            timeClockButtonActionPerformed(evt);
        }
    });

    employeeIdent1.setAlignment(java.awt.Label.CENTER);
    employeeIdent1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
    employeeIdent1.setText("Sheldon Gray");

    timeLabel.setText("time");

    empImageTopLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/repsm.png"))); // NOI18N

    patientsMenu.setText("Patients");
    patientsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            patientsMenuMouseClicked(evt);
        }
    });

    addPatientMenuItem.setText("Add");
    addPatientMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addPatientMenuItemActionPerformed(evt);
        }
    });
    patientsMenu.add(addPatientMenuItem);

    viewPatientMenuItem.setText("View");
    viewPatientMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewPatientMenuItemActionPerformed(evt);
        }
    });
    patientsMenu.add(viewPatientMenuItem);

    assignedMenuItem.setText("Assigned");
    assignedMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            assignedMenuItemActionPerformed(evt);
        }
    });
    patientsMenu.add(assignedMenuItem);

    smsMenuBar.add(patientsMenu);

    apptMenu.setText("Appointments");
    apptMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            apptMenuMouseClicked(evt);
        }
    });
    apptMenu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            apptMenuActionPerformed(evt);
        }
    });

    createApptMenuItem.setText("Create");
    createApptMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            createApptMenuItemMouseClicked(evt);
        }
    });
    createApptMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            createApptMenuItemActionPerformed(evt);
        }
    });
    apptMenu.add(createApptMenuItem);

    viewApptMenuItem.setText("View");
    viewApptMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            viewApptMenuItemMouseClicked(evt);
        }
    });
    viewApptMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewApptMenuItemActionPerformed(evt);
        }
    });
    apptMenu.add(viewApptMenuItem);

    smsMenuBar.add(apptMenu);

    reportsMenu.setText("Reports");
    smsMenuBar.add(reportsMenu);

    billingMenu.setText("Billing");
    smsMenuBar.add(billingMenu);

    TimeClockMenu.setText("TimeClock");
    TimeClockMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            TimeClockMenuMouseClicked(evt);
        }
    });
    smsMenuBar.add(TimeClockMenu);

    employeesMenu.setText("Employees");
    employeesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            employeesMenuMouseClicked(evt);
        }
    });
    smsMenuBar.add(employeesMenu);

    adminMenu.setText("Administration");
    adminMenu.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            adminMenuMouseClicked(evt);
        }
    });

    addUserMenuItem.setText("Add User");
    addUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addUserMenuItemActionPerformed(evt);
        }
    });
    adminMenu.add(addUserMenuItem);

    removeUserMenuItem.setText("Remove User");
    removeUserMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeUserMenuItemActionPerformed(evt);
        }
    });
    adminMenu.add(removeUserMenuItem);

    viewUsersMenuItem.setText("View Users");
    viewUsersMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewUsersMenuItemActionPerformed(evt);
        }
    });
    adminMenu.add(viewUsersMenuItem);

    smsMenuBar.add(adminMenu);

    logOutMenu.setText("Log Out");

    logOutMenuItem.setText("Log Out");
    logOutMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    logOutMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    logOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            logOutMenuItemActionPerformed(evt);
        }
    });
    logOutMenu.add(logOutMenuItem);

    smsMenuBar.add(logOutMenu);

    setJMenuBar(smsMenuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(57, 57, 57)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(timeLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buildLabel))
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(57, 57, 57))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(apptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(logoLabel)
                    .addGap(305, 305, 305)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(timeClockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(100, 100, 100))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(empImageTopLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addComponent(employeeIdent1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38))))
    );

    layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {billButton, timeClockButton});

    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(empImageTopLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(employeeIdent1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(apptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(timeClockButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buildLabel)
                .addComponent(timeLabel))
            .addContainerGap())
    );

    layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {billButton, timeClockButton});

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        containerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Administration"));
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
       
        containerPanel.add(adminPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_adminButtonActionPerformed

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsButtonActionPerformed
        containerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Patients"));
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
        
        
        
        containerPanel.add(patientsPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_patientsButtonActionPerformed

    private void addNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewUserButtonActionPerformed
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();

        adminContainerPanel.add(addUserPanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        maleRadioButton.doClick(); //set default value to male radio button
    }//GEN-LAST:event_addNewUserButtonActionPerformed

    private void zipTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zipTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_zipTextMouseClicked

    private void cityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextMouseClicked

    private void address1TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address1TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_address1TextMouseClicked

    private void ssnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssnTextMouseClicked
        ssnText.setText("");
    }//GEN-LAST:event_ssnTextMouseClicked

    private void address2TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address2TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_address2TextMouseClicked

    private void phoneTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTextMouseClicked
        phoneText.setText("");
    }//GEN-LAST:event_phoneTextMouseClicked

    private void ssnTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ssnTextFocusGained
        ssnText.selectAll();
    }//GEN-LAST:event_ssnTextFocusGained

    private void phoneTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFocusGained
        phoneText.selectAll();
    }//GEN-LAST:event_phoneTextFocusGained
 
    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        //Add DB Calls before this method
        if(formValidation()) {
            createUserName();
            addUserToDB();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        clearAddUserPanel();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void empButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empButtonActionPerformed
        containerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Employees"));
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
       
        containerPanel.add(empPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
        
        ViewEmpDialog opForm = new ViewEmpDialog(new JFrame(), true);
        opForm.setVisible(true);

       
    }//GEN-LAST:event_empButtonActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void accessLevelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessLevelComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accessLevelComboBoxActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayComboBoxActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed


    private void empStateTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empStateTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empStateTextMouseClicked



    private void empPositionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPositionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empPositionComboBoxActionPerformed

    private void empSSNTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empSSNTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empSSNTextMouseClicked

    private void empSSNTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empSSNTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empSSNTextFocusGained

    private void empCityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empCityTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empCityTextMouseClicked

    private void empZipTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empZipTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empZipTextMouseClicked

    private void empEmailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empEmailTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empEmailTextMouseClicked

    private void empEmailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empEmailTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empEmailTextFocusGained

    private void empCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empCancelButtonActionPerformed
        //Disable Save Button
        empSaveButton.setEnabled(false);
        //Clear the employee view panel
        clearViewEmpPanel();
    }//GEN-LAST:event_empCancelButtonActionPerformed

    private void empEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEditButtonActionPerformed
        //Method call to allow the employee's inforamtion to be edited.
        editEmpInfo(true);
    }//GEN-LAST:event_empEditButtonActionPerformed

    private void empSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSaveButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        //Add DB Calls before this method
        Database db = new Database("SMSDB2");
        int day = parseInt(empDayComboBox.getSelectedItem().toString());
        int year = parseInt(yearComboBox1.getSelectedItem().toString());
        String gender = getSelectedButtonText(genderButtonGroup);
        String query = "UPDATE employees SET " +
                       "firstName='" + empFirstNameText.getText() +"', " +
                       "middleInt='" + empMiddleIntText.getText() + "', " +
                       "lastName='" + empLastNameText.getText() + "', " +
                       "address1='" + empAddress1Text.getText() + "', " +
                       "address2='" + empAddress2Text.getText() + "', " +
                       "city='" + empCityText.getText() + "', " +
                       "state='" + stateComboBox1.getSelectedItem() + "', " +
                       "zip='" + empZipText.getText() +"', " +
                       "month='" + empMonthComboBox.getSelectedItem () + "', " +
                       "day=" + day + ", " +
                       "birthYear=" + year + ", " +
                       "phone='" + empPhoneText.getText() + "' " +
                       "WHERE email='" + empEmailText.getText() + "'";
        db.executeEmpUpdate(query);
        JOptionPane.showMessageDialog(null, "Employee Updated");
        editEmpInfo(false);
        clearViewEmpPanel();
    }//GEN-LAST:event_empSaveButtonActionPerformed

    private void empPhoneTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empPhoneTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empPhoneTextMouseClicked

    private void empPhoneTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empPhoneTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empPhoneTextFocusGained

    private void empAddress2TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empAddress2TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empAddress2TextMouseClicked

    private void empAddress1TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empAddress1TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empAddress1TextMouseClicked

    private void logOutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMenuItemActionPerformed
        patientsContainerPanel.removeAll();
        patientsContainerPanel.repaint();
        patientsContainerPanel.revalidate();
        patientsContainerPanel.add(defaultPatientPanel);
        patientsContainerPanel.repaint();
        patientsContainerPanel.revalidate();
        
        apptContainerPanel.removeAll();
        apptContainerPanel.repaint();
        apptContainerPanel.revalidate();
        apptContainerPanel.add(defaultApptPanel);
        apptContainerPanel.repaint();
        apptContainerPanel.revalidate();
        
        timeContainerPanel.removeAll();
        timeContainerPanel.repaint();
        timeContainerPanel.revalidate();
        timeContainerPanel.add(defaultTimePanel);
        timeContainerPanel.repaint();
        timeContainerPanel.revalidate();
        
        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        empContainerPanel.add(defaultEmpPanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        adminContainerPanel.add(defaultAdminPanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        
        
        this.dispose();
        
        //Custom Look and Feel Style 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        //Run Program
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        }); 
    }//GEN-LAST:event_logOutMenuItemActionPerformed

    private void addNewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPatientButtonActionPerformed
        patientsContainerPanel.removeAll();
        patientsContainerPanel.repaint();
        patientsContainerPanel.revalidate();
        
        AddPatientPanel addPatientPanel = new AddPatientPanel();
        
       //patientsPanel.add(addPatientPanel);
        //patientsPanel.repaint();
        //patientsPanel.revalidate();
        
        patientsContainerPanel.add(addPatientPanel);
        patientsContainerPanel.repaint();
        patientsContainerPanel.revalidate(); 
    }//GEN-LAST:event_addNewPatientButtonActionPerformed

    private void viewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientButtonActionPerformed
        ViewPatientsDialog opForm = new ViewPatientsDialog(new JFrame(), true);
        opForm.setVisible(true);
    }//GEN-LAST:event_viewPatientButtonActionPerformed

    private void apptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptButtonActionPerformed
        containerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Appointments"));
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
       
        containerPanel.add(apptPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_apptButtonActionPerformed

    private void createApptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createApptButtonActionPerformed
        apptContainerPanel.removeAll();
        apptContainerPanel.repaint();
        apptContainerPanel.revalidate();
        
        CreateApptPanel createApptPanel = new CreateApptPanel();

        
        apptContainerPanel.add(createApptPanel);
        apptContainerPanel.repaint();
        apptContainerPanel.revalidate();
    }//GEN-LAST:event_createApptButtonActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        adminContainerPanel.add(adminTablePanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        
        ViewAdminDialog opForm = new ViewAdminDialog(new JFrame(), true);
        opForm.setVisible(true);
        
        
    }//GEN-LAST:event_removeUserButtonActionPerformed


    private void timeClockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeClockButtonActionPerformed
        containerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "TimeClock"));
        
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
       
        containerPanel.add(timeCPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
        
//        timeCPanel.removeAll();
//        timeCPanel.repaint();
//        timeCPanel.revalidate();
//        
//        timeCPanel.add(tcPanel);
//        timeCPanel.repaint();
//        timeCPanel.revalidate();
        
        timePanel.removeAll();
        timePanel.repaint();
        timePanel.revalidate();
        
        timePanel.add(tcPanel);
        timePanel.repaint();
        timePanel.revalidate();
        
        timeContainerPanel.removeAll();
        timeContainerPanel.repaint();
        timeContainerPanel.revalidate();

        timeContainerPanel.add(timePanel);
        timeContainerPanel.repaint();
        timeContainerPanel.revalidate();
        
    }//GEN-LAST:event_timeClockButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed



    private void viewYourPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewYourPatientButtonActionPerformed
        
        PatientTablePanel patientTable = new PatientTablePanel();
        JTable table = patientTable.getTable();
        AbstractTableModel model = (AbstractTableModel)table.getModel();
        model.fireTableDataChanged();
        
        Database db = new Database("SMSDB2");
        ResultSet rs = db.queryPatients();
        if(rs == null) {
            JOptionPane.showMessageDialog(null, "No patients found");
        }
        
        table.setModel((AbstractTableModel)DbUtils.resultSetToTableModel(rs));
        
       
        table.repaint();
        table.revalidate();
        patientTable.repaint();
        patientTable.revalidate();

        patientTablePanel.removeAll();
        patientTablePanel.repaint();
        patientTablePanel.revalidate();

        patientTablePanel.add(patientTable);
        patientTablePanel.repaint();
        patientTablePanel.revalidate();

        patientsContainerPanel.removeAll();
        patientsContainerPanel.repaint();
        patientsContainerPanel.revalidate();

        patientsContainerPanel.add(patientTablePanel);
        patientsContainerPanel.repaint();
        patientsContainerPanel.revalidate();
    }//GEN-LAST:event_viewYourPatientButtonActionPerformed


    private void viewEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeesButtonActionPerformed
        empButton.doClick();
    }//GEN-LAST:event_viewEmployeesButtonActionPerformed

    private void viewApptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewApptButtonActionPerformed
        ViewApptDialog opForm = new ViewApptDialog(new JFrame(), true);
        opForm.setVisible(true);
        
    }//GEN-LAST:event_viewApptButtonActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsButtonActionPerformed

    private void apptMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptMenuActionPerformed
     
    }//GEN-LAST:event_apptMenuActionPerformed

    private void apptMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apptMenuMouseClicked
        apptButton.doClick();
    }//GEN-LAST:event_apptMenuMouseClicked

    private void createApptMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createApptMenuItemMouseClicked
        
    }//GEN-LAST:event_createApptMenuItemMouseClicked

    private void viewApptMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewApptMenuItemMouseClicked
        
    }//GEN-LAST:event_viewApptMenuItemMouseClicked

    private void createApptMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createApptMenuItemActionPerformed
        createApptButton.doClick();
    }//GEN-LAST:event_createApptMenuItemActionPerformed

    private void viewApptMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewApptMenuItemActionPerformed
        viewApptButton.doClick();
    }//GEN-LAST:event_viewApptMenuItemActionPerformed

    private void viewPatientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientMenuItemActionPerformed
        viewPatientButton.doClick();
    }//GEN-LAST:event_viewPatientMenuItemActionPerformed

    private void patientsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientsMenuMouseClicked
        patientsButton.doClick();
    }//GEN-LAST:event_patientsMenuMouseClicked

    private void addPatientMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPatientMenuItemActionPerformed
        addNewPatientButton.doClick();
    }//GEN-LAST:event_addPatientMenuItemActionPerformed

    private void assignedMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignedMenuItemActionPerformed
        viewYourPatientButton.doClick();
    }//GEN-LAST:event_assignedMenuItemActionPerformed

    private void TimeClockMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeClockMenuMouseClicked
        timeClockButton.doClick();
    }//GEN-LAST:event_TimeClockMenuMouseClicked

    private void employeesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesMenuMouseClicked
        empButton.doClick();
    }//GEN-LAST:event_employeesMenuMouseClicked

    private void adminMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMenuMouseClicked
        adminButton.doClick();
    }//GEN-LAST:event_adminMenuMouseClicked

    private void addUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserMenuItemActionPerformed
        addNewUserButton.doClick();
    }//GEN-LAST:event_addUserMenuItemActionPerformed

    private void removeUserMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserMenuItemActionPerformed
        removeUserButton.doClick();
    }//GEN-LAST:event_removeUserMenuItemActionPerformed

    private void viewUsersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsersMenuItemActionPerformed
        viewEmployeesButton.doClick();
    }//GEN-LAST:event_viewUsersMenuItemActionPerformed

    private void empCountryTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empCountryTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empCountryTextMouseClicked

    private void empMonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empMonthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empMonthComboBoxActionPerformed

    private void empDayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDayComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empDayComboBoxActionPerformed

    private void yearComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBox1ActionPerformed

    private void stateComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboBox1ActionPerformed

    private void empPositionComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPositionComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empPositionComboBox1ActionPerformed




    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        //Run Main GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu TimeClockMenu;
    private javax.swing.JComboBox accessLevelComboBox;
    private javax.swing.JButton addNewPatientButton;
    private javax.swing.JButton addNewUserButton;
    private javax.swing.JMenuItem addPatientMenuItem;
    private javax.swing.JMenuItem addUserMenuItem;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JLabel address1Label;
    private javax.swing.JTextField address1Text;
    private javax.swing.JLabel address2Label;
    private javax.swing.JTextField address2Text;
    private javax.swing.JButton adminButton;
    public static javax.swing.JPanel adminContainerPanel;
    private javax.swing.JMenu adminMenu;
    private javax.swing.JPanel adminPanel;
    public static javax.swing.JPanel adminTablePanel;
    private javax.swing.JButton apptButton;
    public static javax.swing.JPanel apptContainerPanel;
    private javax.swing.JMenu apptMenu;
    private javax.swing.JPanel apptPanel;
    public static javax.swing.JPanel apptTablePanel;
    private javax.swing.JEditorPane articleEditorPane;
    private javax.swing.JEditorPane articleEditorPane1;
    private javax.swing.JEditorPane articleEditorPane2;
    private javax.swing.JScrollPane articleScrollPane;
    private javax.swing.JScrollPane articleScrollPane1;
    private javax.swing.JScrollPane articleScrollPane2;
    public static javax.swing.JPanel articleTabPanel;
    public static javax.swing.JPanel articleTabPanel1;
    public static javax.swing.JPanel articleTabPanel2;
    private javax.swing.JMenuItem assignedMenuItem;
    private javax.swing.JButton billButton;
    private javax.swing.JMenu billingMenu;
    private javax.swing.JLabel bloodImageLabel;
    private javax.swing.JLabel bloodImageLabel1;
    private javax.swing.JLabel bloodImageLabel2;
    private javax.swing.JLabel buildLabel;
    private javax.swing.JPanel bulletinTabPanel;
    private javax.swing.JPanel bulletinTabPanel1;
    private javax.swing.JPanel bulletinTabPanel2;
    private javax.swing.JButton cancelButton;
    public static javax.swing.JPanel chartTablePanel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JLabel coffeeImageLabel;
    private javax.swing.JLabel coffeeImageLabel1;
    private javax.swing.JLabel coffeeImageLabel2;
    public static javax.swing.JPanel containerPanel;
    private javax.swing.JButton createApptButton;
    private javax.swing.JMenuItem createApptMenuItem;
    private javax.swing.JComboBox dayComboBox;
    public static javax.swing.JTabbedPane defaultAdminPanel;
    public static javax.swing.JTabbedPane defaultApptPanel;
    public static javax.swing.JPanel defaultEmpPanel;
    public static javax.swing.JTabbedPane defaultPatientPanel;
    public static javax.swing.JPanel defaultTimePanel;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel empAddress1Label;
    public static javax.swing.JTextField empAddress1Text;
    private javax.swing.JLabel empAddress2Label;
    public static javax.swing.JTextField empAddress2Text;
    private javax.swing.JButton empButton;
    private javax.swing.JButton empCancelButton;
    private javax.swing.JLabel empCityLabel;
    public static javax.swing.JTextField empCityText;
    public static javax.swing.JPanel empContainerPanel;
    private javax.swing.JLabel empDOBLabel;
    public static javax.swing.JComboBox empDayComboBox;
    private javax.swing.JButton empEditButton;
    private javax.swing.JLabel empEmailLabel;
    public static javax.swing.JTextField empEmailText;
    public static javax.swing.JRadioButton empFemaleRadioButton;
    private javax.swing.JLabel empFirstNameLabel;
    public static javax.swing.JTextField empFirstNameText;
    private javax.swing.ButtonGroup empGenderButtonGroup;
    private javax.swing.JLabel empGenderLabel;
    private javax.swing.JLabel empImageLabel;
    private javax.swing.JLabel empImageTopLabel;
    private javax.swing.JLabel empLastNameLabel;
    public static javax.swing.JTextField empLastNameText;
    public static javax.swing.JRadioButton empMaleRadioButton;
    private javax.swing.JLabel empMiddleIntLabel;
    public static javax.swing.JTextField empMiddleIntText;
    public static javax.swing.JComboBox empMonthComboBox;
    private javax.swing.JPanel empPanel;
    private javax.swing.JLabel empPhoneLabel;
    public static javax.swing.JTextField empPhoneText;
    public static javax.swing.JComboBox empPositionComboBox;
    public static javax.swing.JComboBox empPositionComboBox1;
    private javax.swing.JLabel empPositionLabel;
    private javax.swing.JLabel empPositionLabel1;
    private javax.swing.JLabel empSSNLabel;
    public static javax.swing.JTextField empSSNText;
    private javax.swing.JButton empSaveButton;
    private javax.swing.JLabel empStateLabel;
    public static javax.swing.JPanel empTablePanel;
    private javax.swing.JLabel empZipLabel;
    public static javax.swing.JTextField empZipText;
    private java.awt.Label employeeIdent1;
    private javax.swing.JLabel employeeImageLabel;
    private javax.swing.JLabel employeeImageLabel1;
    private javax.swing.JLabel employeeImageLabel2;
    private javax.swing.JMenu employeesMenu;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JMenu logOutMenu;
    private javax.swing.JMenuItem logOutMenuItem;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel middleIntLabel;
    private javax.swing.JTextField middleIntText;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JLabel muffinImageLabel;
    private javax.swing.JLabel muffinImageLabel1;
    private javax.swing.JLabel muffinImageLabel2;
    private javax.swing.JLabel patImageLabel;
    public static javax.swing.JPanel patientTablePanel;
    private javax.swing.JButton patientsButton;
    public static javax.swing.JPanel patientsContainerPanel;
    private javax.swing.JMenu patientsMenu;
    private javax.swing.JPanel patientsPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JComboBox positionComboBox;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel positionLabel1;
    public static javax.swing.JButton removeUserButton;
    private javax.swing.JMenuItem removeUserMenuItem;
    private javax.swing.JButton reportsButton;
    private javax.swing.JMenu reportsMenu;
    private javax.swing.JButton saveButton;
    private javax.swing.JMenuBar smsMenuBar;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JTextField ssnText;
    private javax.swing.JComboBox stateComboBox;
    public static javax.swing.JComboBox stateComboBox1;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel sub2Label;
    private javax.swing.JLabel sub2Label1;
    private javax.swing.JLabel sub2Label2;
    private javax.swing.JLabel subLabel;
    private javax.swing.JLabel subLabel1;
    private javax.swing.JLabel subLabel2;
    private javax.swing.JPanel timeCPanel;
    private javax.swing.JButton timeClockButton;
    public static javax.swing.JPanel timeContainerPanel;
    private javax.swing.JLabel timeImageLabel;
    public static javax.swing.JLabel timeLabel;
    public static javax.swing.JPanel timePanel;
    private javax.swing.JLabel title1Label;
    private javax.swing.JLabel title1Label1;
    private javax.swing.JLabel title1Label2;
    private javax.swing.JLabel title2Label;
    private javax.swing.JLabel title2Label1;
    private javax.swing.JLabel title2Label2;
    private javax.swing.JLabel title3Label;
    private javax.swing.JLabel title3Label1;
    private javax.swing.JLabel title3Label2;
    private javax.swing.JButton viewApptButton;
    private javax.swing.JMenuItem viewApptMenuItem;
    public static javax.swing.JPanel viewEmpPanel;
    public static javax.swing.JButton viewEmployeesButton;
    private javax.swing.JButton viewPatientButton;
    private javax.swing.JMenuItem viewPatientMenuItem;
    private javax.swing.JMenuItem viewUsersMenuItem;
    private javax.swing.JButton viewYourPatientButton;
    private javax.swing.JComboBox yearComboBox;
    public static javax.swing.JComboBox yearComboBox1;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables

    //Method to clear Add User Panel
    private void clearAddUserPanel(){
        //Clear Panel
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        adminContainerPanel.add(defaultAdminPanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        
        //Reset text field values
        firstNameText.setText("");
        middleIntText.setText("");
        lastNameText.setText("");
        ssnText.setText("###-##-####");
        genderButtonGroup.clearSelection();
        address1Text.setText("");
        address2Text.setText("");
        cityText.setText("");
        zipText.setText("");
        phoneText.setText("###-###-####");
        positionComboBox.setSelectedIndex(0);
    }
    
    //Address 2 and Address1 need a regex pattern
    private boolean formValidation() {
        
        //User names need to be 1-20 upper and lower case numbers
        Pattern namePattern = Pattern.compile("[a-zA-Z]{1,20}");
        Matcher nameMatcher = namePattern.matcher(firstNameText.getText());
        
        //check if first name does not matche pattern
        if(!nameMatcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "First name can only contain " +
                                           "letters and must be 1-20 characthers long"); 
            return false;
        } 
            
        //check if middle int matches pattern, if present
        if(!middleIntText.getText().isEmpty()) {
            Pattern middleIntPattern = Pattern.compile("[A-Z]\\.{1}");
            Matcher middleIntMatch = middleIntPattern.matcher(middleIntText.getText());
        
            if(!nameMatcher.matches()) {
                 JOptionPane.showMessageDialog(rootPane, "Middle nint be must be a capital " +
                                               "letter followed by a period. (Ex: M."); 
                 return false;
            } 
        }
           
        //check if last name matches pattern
        nameMatcher = namePattern.matcher(lastNameText.getText());
        
        if(!nameMatcher.matches()) {
           JOptionPane.showMessageDialog(rootPane, "Last name can only contain " +
                                           "letters and must be 1-20 characthers long");
           return false;
        } 
           
      
        //check if ssn matches
        Pattern ssnPattern = Pattern.compile("\\d{3}[-]\\d{2}[-]\\d{4}");
        Matcher ssnMatcher = ssnPattern.matcher(ssnText.getText());
        
        if(!ssnMatcher.matches()) {
              JOptionPane.showMessageDialog(rootPane, "SSN must be of the format " +
                                            "###-##-## where # is a digit");
              return false;
        } 
        
        /*
        //check if address1 matches
        //*****Come back to ****
        Pattern address1 = Pattern.compile("\\d{1,5}\\s\\w.\\s(\\b\\w*\\b\\s){1,2}\\w*\\.");
        Matcher address1Matcher = address1.matcher(address1Text.getText());
        
        if(address1Matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Address 1 matches");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Address 1 does not match");
        } */
           
        
        //check if city is valid
        //can only be 1-3 words each a max of 20 characthers
        Pattern cityPattern = Pattern.compile("[a-zA-Z]{1,20}\\s?[a-zA-Z]{1,20}?\\s?[a-zA-Z]{1,20}?");
        Matcher cityMatcher = cityPattern.matcher(cityText.getText());
        
        if(!cityMatcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "City can only be 1-3 words " +
                                         "and a max of 20 characthers including spaces");
            return false;
        }
        
        //****for state we might want to change this to a combo box*******
      
        /*
         //check if address2 matches
        //*****Come back to ****
        Pattern address2 = Pattern.compile("\\d{1,5}\\s\\w.\\s(\\b\\w*\\b\\s){1,2}\\w*\\.");
        Matcher address2Matcher = address2.matcher(address1Text.getText());
        
        if(address2Matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Address 1 matches");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Address 1 does not match");
        }*/
        /*
        if(address2Text.getText().equals("")) {
            String address2 = "N/A";
        } else {
            String address = address2Text.getText();
        } */
       
        //check to see if zipcode is correct
        Pattern zipPattern = Pattern.compile("\\d{5}");
        Matcher zipMatcher = zipPattern.matcher(zipText.getText());
        
        if(!zipMatcher.matches()) {
             JOptionPane.showMessageDialog(rootPane, "Zip must be a 5 digit number" +
                                            " (Ex: 30303");
             return false;
        } 
        
      
        //check if month is selected
      if(monthComboBox.getSelectedItem().toString().equals("Month:")) {
          JOptionPane.showMessageDialog(rootPane, "Please select a month");
          return false;
      }
      
      if(dayComboBox.getSelectedItem().toString().equals("Day:")) {
          JOptionPane.showMessageDialog(rootPane, "Please select a day");
          return false;
      }
      
      if(yearComboBox.getSelectedItem().toString().equals("Year:")) {
          JOptionPane.showMessageDialog(rootPane, "Please select a year");
          return false;
      }
      
      if(positionComboBox.getSelectedItem().toString().equals("")) {
          JOptionPane.showMessageDialog(rootPane, "Please select a position");
          return false;
      }
      
      
        //check if phone is correct
        Pattern phonePattern = Pattern.compile("\\d{3}[-]\\d{3}[-]\\d{4}");
        Matcher phoneMatcher = phonePattern.matcher(phoneText.getText());
        
        if(!phoneMatcher.matches()) {
             JOptionPane.showMessageDialog(rootPane, "Phone does not match");
             return false;
        }
       
        //if we get down here we're fine
        return true;
       
    }
    
    //Precondition: The add user form has been filled out and the user clicks
    //              save
    //Postcondition: A user name and password is created for the user by grabbing
    //              the first letter of the first name and followed by the last name.
    
    //              Ex: John Doe --> jdoe
    
    //If jdoe exists in the database we will grab the first 2 letters of the first
    //name
    //              Ex: John Doe --> jodoe
    //We will repeat until we get a unique user name for the new employee
    
    
    
    String userName;
    void createUserName() {
        int i = 1;
        //grab the first letter in the first name:
        String firstLetter = firstNameText.getText().substring(0,1).toLowerCase();
        String lastName = lastNameText.getText().toLowerCase();
        
        //put them together
        userName = firstLetter + lastName;
        //JOptionPane.showMessageDialog(rootPane, userName);
        
  
        Database db = new Database("SMSDB2");
  
        if(db.validateUserName(userName) == false) {
            Boolean match = false;
            
            while(match == false) {
                userName = userName + String.valueOf(i);
                i++;
                match = db.validateUserName(userName);
                if (match == true) {
                    String email = userName + "@SMS.com";
                    stateComboBox.getSelectedItem().toString();
                    
                    break;
                }
            }
        }
        
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
    
    public int parseInt(String str) {
        int x = 0;
        
        try {
            x = Integer.parseInt(str);
        } catch (Exception e) {
            
        }
     return x;
    }
     
   
    //if valid form
    void addUserToDB() {
        String gender = getSelectedButtonText(genderButtonGroup);
        int accessLevel = parseInt(accessLevelComboBox.getSelectedItem().toString());
        int day = parseInt(dayComboBox.getSelectedItem().toString());
        int year = parseInt(yearComboBox.getSelectedItem().toString());
        String email = userName + "@sms.com";
        String values = "VALUES ( '"+ firstNameText.getText() +
                "', '" + middleIntText.getText() + 
                "', '" + lastNameText.getText() +
                "', '" + userName + "', 'Password1"  +  
                "', '" + positionComboBox.getSelectedItem().toString() +
                "', "  + accessLevel  +
                ", '" + ssnText.getText()+
                "', '" + gender +
                "', '" + address1Text.getText() +
                "', '" + address2Text.getText() +
                "', '" + cityText.getText() +
                "', '" + stateComboBox.getSelectedItem().toString() + 
                "', '" + zipText.getText() + 
                "', '" + monthComboBox.getSelectedItem().toString() +
                "', " + day + 
                ", " + year +
                ", '" + phoneText.getText() + "', '" + email + "')";
        Database db = new Database("SMSDB2");
        
        
        db.addDataToTable("employees", values);
        JOptionPane.showMessageDialog(rootPane, "Employee Added");
        clearAddUserPanel();
        
     
    } 
    
    //we need a method to generate the employee id
    //we can start with a 2 digit num followed by 3 zeros
    //and then the employee's index
    //that is 35 000 00
    //Does that mean we have to make a call to the database
    //to determine the employee's index?
    String createEmployeedID() {
        String empID = null;
        empID = "3500";
        return empID;
    }
    
    
    void viewCreatedEmployee(String ... setOfStrings) {
        
    }
    //Method to edit Employee Info
    private void editEmpInfo(Boolean str){
        empSaveButton.setEnabled(str);
        empFirstNameText.setEnabled(str);
        empMiddleIntText.setEnabled(str);
        empLastNameText.setEnabled(str);
        empSSNText.setEnabled(str);
        empMaleRadioButton.setEnabled(str);
        empFemaleRadioButton.setEnabled(str);
        empAddress1Text.setEnabled(str);
        empAddress2Text.setEnabled(str);
        empCityText.setEnabled(str);
        empZipText.setEnabled(str);
        empPositionComboBox.setEnabled(str);
        empPhoneText.setEnabled(str);
        empEmailText.setEnabled(str);
    }
    
    //Method to clear View Employee Panel
    private void clearViewEmpPanel(){
        //Clear Panel
        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        empContainerPanel.add(defaultEmpPanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        
        //Reset Textfield values
        empFirstNameText.setText("");
        empMiddleIntText.setText("");
        empLastNameText.setText("");
        empSSNText.setText("");
        empMaleRadioButton.setSelected(false);
        empFemaleRadioButton.setSelected(false);
        empAddress1Text.setText("");
        empAddress2Text.setText("");
        empCityText.setText("");        
        empZipText.setText("");
        empPositionComboBox.setSelectedIndex(0);
        empPhoneText.setText("");
        empEmailText.setText("");
        monthComboBox.setSelectedIndex(0);
        dayComboBox.setSelectedIndex(0);
        yearComboBox.setSelectedIndex(0);
        stateComboBox.setSelectedIndex(0);
        accessLevelComboBox.setSelectedIndex(0);
        
        //Disable fields
        editEmpInfo(false);
    }
    
    public TimeClockPanel getTCPanel(){
        return tcPanel;
    }
   
    Clock newBeep = new Clock();
    
    
}
