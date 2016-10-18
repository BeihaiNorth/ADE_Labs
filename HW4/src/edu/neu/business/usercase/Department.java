/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.usercase;

import edu.neu.business.Course.CourseCatalog;
import edu.neu.business.Course.CourseSchedule;
import edu.neu.business.Course.Degree;
import edu.neu.business.faculty.JobPosition;
import edu.neu.business.faculty.Teacher;
import edu.neu.business.student.Alumni;
import edu.neu.business.student.AlumniDirectory;
import edu.neu.business.student.Student;
import edu.neu.business.student.StudentDirectory;

/**
 *
 * @author mwhai_000
 */
public class Department {
    private String departmentName;
    
    private StudentDirectory studentDirectory;
    private AlumniDirectory alumniDirectory;
    private JobPosition teacherDirectory;
    private JobPosition staffDirectory;
    private CourseSchedule courseSchedule;
    private CourseCatalog courseCatalog;
    private Degree degree;
    
    public Department(){
        studentDirectory = new StudentDirectory();
        alumniDirectory = new AlumniDirectory();
        teacherDirectory = new JobPosition();
        staffDirectory = new JobPosition();
        courseSchedule = new CourseSchedule();
        courseCatalog = new CourseCatalog();
        degree = new Degree();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public JobPosition getTeacherDirectory(){
        return teacherDirectory;
    }

    public AlumniDirectory getAlumniDirectory() {
        return alumniDirectory;
    }

    public JobPosition getStaffDirectory() {
        return staffDirectory;
    }

    public CourseSchedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(CourseSchedule courseSchedule) {
        this.courseSchedule = courseSchedule;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    
    
    
    public int getStudentNum() {
        int count = studentDirectory.getStudentDirectory().size();
        return count;
    }
    
    public double gpaAvg(){
        double gpaSum = 0.0;
        double sum = 0;
        for (Student s :studentDirectory.getStudentDirectory()) {
                sum++;
                gpaSum += s.getTranscript().calSemesterGPA();
        }         
        double salaryAvg = gpaSum / sum;
        return salaryAvg;
    }
    
    public double costAvg(){
        double costSum = 0.0;
        double sum = 0;
        for (Student s :studentDirectory.getStudentDirectory()) {
                sum++;
                costSum += s.getTranscript().calSemesterCost();
        }         
        double salaryAvg = costSum / sum;
        return salaryAvg;
    }
    
    
    public int alumniCount(){
        int count = 0;
        count = alumniDirectory.getAlumniDirectory().size();
        return count;
    }
    
    public double salaryAvg(){
        double salarySum = 0.0;
        double sum = 0;
        for (Alumni a :alumniDirectory.getAlumniDirectory()) {
            if(a.isEmployed())
            {
                sum++;
                salarySum += a.getSalary();
            }
        }         
        double salaryAvg = salarySum / sum;
        return salaryAvg;
    }
    
        public double employmentRate(){
        double count = 0;
        double sum = 0;
         for (Alumni a : alumniDirectory.getAlumniDirectory()) {
            sum++;
            if(a.isEmployed()){
                count++;
            }         
         }
        double rate = count / sum *100;
          return rate;
    }
    
    public double promotionRate(){
        double count = 0;
        double sum = 0;
         for (Alumni a : alumniDirectory.getAlumniDirectory()) {
            if(a.isEmployed()){
                sum++;
                if(a.isPromoted()){
                count++;
                } 
            }                     
         }
        double rate = count / sum *100;
        return rate;
    }
    
    public int getTeacherNum() {
        int count = teacherDirectory.getTeacherDirectory().size();
        return count;
    }
    
    public int getStaffNum() {
        int count = staffDirectory.getStaffDirectory().size();
        return count;
    }
    
    public int ResearchNum(){
        int researchSum = 0;
        for (Teacher t :teacherDirectory.getTeacherDirectory()) {
                researchSum += t.getResearchNum();
            }
        return researchSum;
    }
    
    public double ResearchMoney(){
        double researchMoney = 0;
        for (Teacher t :teacherDirectory.getTeacherDirectory()) {
                researchMoney += t.getResearchMoney();
            }
        return researchMoney;
    }
}
