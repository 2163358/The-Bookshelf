/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itomarevised;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class Newuser extends javax.swing.JFrame {

    /**
     * Creates new form Newuser
     */
    public Newuser() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createButton = new java.awt.Button();
        jLabel8 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        midname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        borrowerComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        year = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("The Bookshelf");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 500));

        createButton.setBackground(new java.awt.Color(255, 255, 51));
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        createButton.setLabel("CREATE");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("BORROWER TYPE:");

        lastname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        contactno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        midname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        firstname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("CREATE ACCOUNT");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("FIRST NAME:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("LAST NAME:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("MIDDLE NAME:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("E-MAIL:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("CONTACT NO.:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("ADDRESS:");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("GENDER:");

        borrowerComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        borrowerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Borrower Type", "Instructor", "Student" }));
        borrowerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowerComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("ID No.:");

        idno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idnoKeyReleased(evt);
            }
        });

        genderComboBox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "Female", "Male" }));
        genderComboBox.setPreferredSize(new java.awt.Dimension(107, 27));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("If the borrower is an instructor:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("DEPARTMENT:");

        dept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("If the borrower is a student:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("COURSE:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("YEAR:");

        course.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(216, 216, 216)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(borrowerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7))
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(40, 40, 40)
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(midname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(borrowerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(midname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        Connection con = getConnection();
        String subquery = null;
        
        PreparedStatement psi1;
        PreparedStatement psi2;
        
        String query = "INSERT INTO `borrowers`(`fname`,`lname`,`mname`,`gender`,"
                + "`email_address`,`contact_no`,`current_address`,`borrower_type`) "
                + "VALUES ('"+firstname.getText()+"','"+lastname.getText()+"','"+
                midname.getText()+"','"+gender()+"','"+email.getText()+"','"
                +contactno.getText()+"','"+address.getText()+"','"+borrowerType()+"')";        
                
        try{
            psi1 = con.prepareStatement(query);
            psi1.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            
            int generatedkey = 0;
            ResultSet rs = psi1.getGeneratedKeys();
            if(rs.next()){
                generatedkey = rs.getInt(1);
            }
            
            if(borrowerType() == "student"){
                subquery = "INSERT INTO student(stud_id,course,year,borrower_id) VALUES('"+Integer.parseInt(idno.getText())+
                        "', '"+course.getText()+"','"+year.getText()+"','"+generatedkey+"')";
            }else if(borrowerType() == "instructor"){
                subquery = "INSERT INTO instructor(inst_id,department,borrower_id) VALUES('"+Integer.parseInt(idno.getText())+
                        "', '"+dept.getText()+"','"+generatedkey+"')";
            }else{
                this.dispose();
            }
            
            psi2 = con.prepareStatement(subquery);
            psi2.executeUpdate(subquery);
            
            JOptionPane.showMessageDialog(null, "User registered successfully\n Borrower ID: "+generatedkey, "Register User", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception ex){
            ex.printStackTrace();
        }        
        this.dispose();
    }//GEN-LAST:event_createButtonActionPerformed

    private void borrowerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrowerComboBoxActionPerformed
        dept.setEditable(true);
        if(borrowerComboBox.getSelectedItem().toString().equals("Instructor")){
            dept.setEditable(true);        
        }else{
            dept.setEditable(false);
        }
        
        if(borrowerComboBox.getSelectedItem().toString().equals("Student")){
            course.setEditable(true);
            year.setEditable(true);
        }else{
            course.setEditable(false);
            year.setEditable(false);
        }
    }//GEN-LAST:event_borrowerComboBoxActionPerformed

    private void idnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idnoKeyReleased
        boolean stud = false;
        stud = studFound(Integer.parseInt(idno.getText()), stud);
        boolean inst = false;
        inst = instructorFound(Integer.parseInt(idno.getText()), inst);
        
        if(stud == true || inst == true){
            JOptionPane.showMessageDialog(null, "ID Number already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            idno.setText(null);
       }
    }//GEN-LAST:event_idnoKeyReleased
    
    public boolean studFound(int search, boolean found){        
        ArrayList<Student> list = new ArrayList<Student>();
        Connection connection = getConnection();
        
        Statement stmnt;
        ResultSet result;
        
        String query = "SELECT * FROM student";
        
        try{
            stmnt = connection.createStatement();
            result = stmnt.executeQuery(query);
            Student s;
            while(result.next()){
                s = new Student(result.getInt("stud_id"),
                        result.getString("course"),result.getInt("year"),
                        result.getInt("borrower_id"));
                list.add(s);
            }
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getStudid() == search){
                    found =  true;           
                } 
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return found;        
    }
    
    public boolean instructorFound(int search, boolean found){        
        ArrayList<Instructor> list = new ArrayList<Instructor>();
        Connection connection = getConnection();
        
        Statement stmnt;
        ResultSet result;
        
        String query = "SELECT * FROM instructor";
        
        try{
            stmnt = connection.createStatement();
            result = stmnt.executeQuery(query);
            Instructor x;
            while(result.next()){
                x = new Instructor(result.getInt("inst_id"),
                        result.getString("department"),result.getInt("borrower_id"));
                list.add(x);
            }
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getInst_id() == search){
                    found =  true;           
                } 
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return found;        
    }
    
    public String borrowerType() {
        String type = null;
        if(borrowerComboBox.getSelectedItem().toString() == "Instructor"){
            type = "instructor";
        }else if(borrowerComboBox.getSelectedItem().toString() == "Student"){
            type = "student";
        }else{
            type = "undefined";
        }
        return type;
    }
    
    public String gender() {
        String gender = null;
        if(genderComboBox.getSelectedItem().toString() == "Female"){
            gender = "F";
        }else if(genderComboBox.getSelectedItem().toString() == "Male"){
            gender = "M";
        }else{
            gender = "undefined";
        }
        return gender;
    }
    
    public Connection getConnection(){
        Connection connection;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itoma?user=root&password=");
            return connection;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> borrowerComboBox;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField course;
    private java.awt.Button createButton;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField idno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField midname;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("/icons/frameicon2.png")));
    }
}

