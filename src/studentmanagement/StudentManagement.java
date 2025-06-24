/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;
import java.sql.*;

/**
 *
 * @author umrstn
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        StudentManagement.Home();
    }
    
    
    // ADMIN
    //login page visible
    public static void Home(){
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }
    
    //Admi_Login visible
    public static void AdminLoginAccess(){
        Admin_Login adminForm = new Admin_Login();
        adminForm.setVisible(true);
    }
    
    //Admin dashboard visible
    public static void AdminDashboard(){
        Admin_Dashboard adminDashboard = new Admin_Dashboard();
        adminDashboard.setVisible(true);
    }
    
    //add student page
    public static void AddStudent(){
        Add_Student addStudent = new Add_Student();
        addStudent.setVisible(true);
    }
    
    //View student details
    public static void ViewStudent(){
        Student_Details viewStudent = new Student_Details();
        viewStudent.setVisible(true);
    }
    
    //Add student page for students
    public static void AddstudentStd(){
        Add_studentStd addStudentStd = new Add_studentStd();
        addStudentStd.setVisible(true);
    }
    
    //delete page
    public static void DeleteDetails(){
        Delete deleteDetails = new Delete();
        deleteDetails.setVisible(true);
    }
}
