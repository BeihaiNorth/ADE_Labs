/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business;

import edu.neu.business.Course.Classroom;
import edu.neu.business.Course.Course;
import edu.neu.business.Course.CourseCatalog;
import edu.neu.business.Course.CourseLoad;
import edu.neu.business.Course.CourseOffering;
import edu.neu.business.Course.Degree;
import edu.neu.business.Course.Seat;
import edu.neu.business.Course.SeatAssignment;
import edu.neu.business.usercase.EcoSystem;
import edu.neu.business.usercase.UniversityCatalog;
import edu.neu.business.usercase.University;
import edu.neu.business.usercase.Department;
import edu.neu.business.faculty.Staff;
import edu.neu.business.faculty.Teacher;
import edu.neu.business.student.Alumni;
import edu.neu.business.student.AlumniDirectory;
import edu.neu.business.student.Student;
import edu.neu.business.student.StudentDirectory;
import edu.neu.business.usercase.College;

/**
 *
 * @author mwhai_000
 */
public class Initialization {
    
     public static EcoSystem initializeEcoSystem() {
        EcoSystem ecosystem = new EcoSystem();
        ecosystem.setEcoSystemName("Boston");
        
        UniversityCatalog universityList = new UniversityCatalog();
        
        
        //NEU
        University u1= universityList.addUniversity();
        u1.setUniversityName("NEU");
        
        College u1c1 =  u1.getCollegeCatalog().addCollege();
        u1c1.setCollegeName("COE");
                
        Department u1c1d1 = u1c1.getDepartmentCatalog().addDepartment();
        u1c1d1.setDepartmentName("IS");
        Student u1c1d1s1 = u1c1d1.getStudentDirectory().addStudent();
        u1c1d1s1.setStudentName("Hailie");
        u1c1d1s1.setId("NEU1");   
        Student u1c1d1s2 = u1c1d1.getStudentDirectory().addStudent();
        u1c1d1s2.setStudentName("Leslie");
        u1c1d1s2.setId("NEU2");   
        
        Alumni u1c1d1s1a1 = u1c1d1.getAlumniDirectory().addAlumni();
        u1c1d1s1a1.setAlunmiName("A");
        u1c1d1s1a1.setSalary(1000);
        u1c1d1s1a1.setEmployed(true);
        u1c1d1s1a1.setPromoted(true);
        Alumni u1c1d1s1a2 = u1c1d1.getAlumniDirectory().addAlumni();
        u1c1d1s1a2.setAlunmiName("B");
        u1c1d1s1a2.setSalary(1500);
        u1c1d1s1a2.setEmployed(true);
        u1c1d1s1a2.setPromoted(false);
        Alumni u1c1d1s1a3 = u1c1d1.getAlumniDirectory().addAlumni();
        u1c1d1s1a3.setAlunmiName("C");
        u1c1d1s1a3.setSalary(0);
        u1c1d1s1a3.setEmployed(false);
        u1c1d1s1a3.setPromoted(true);
        
        Teacher t = u1c1d1.getTeacherDirectory().addTeacher();
        t.setTeacherName("Prof. Bugrara");
        t.setId("1");
        t.setResearchNum(10);
        t.setResearchMoney(10000);
        t = u1c1d1.getTeacherDirectory().addTeacher();
        t.setTeacherName("Prof. Ozbek");
        t.setId("2");
        t.setResearchNum(5);
        t.setResearchMoney(10000);
        t = u1c1d1.getTeacherDirectory().addTeacher();
        t.setTeacherName("Prof. Chawla");
        t.setId("3");
        t.setResearchNum(5);
        t.setResearchMoney(10000);
        
        Staff staff = u1c1d1.getStaffDirectory().addStaff();
        staff.setStaffName("Trica");
        staff.setId("1");
        staff = u1c1d1.getStaffDirectory().addStaff();
        staff.setStaffName("Hayley");
        staff.setId("2");
        
        Department u1c1d2 = u1c1.getDepartmentCatalog().addDepartment();
        u1c1d2.setDepartmentName("EE");
        
        Student u1c1d2s1 = u1c1d2.getStudentDirectory().addStudent();
        u1c1d2s1.setStudentName("Charles");
        u1c1d2s1.setId("NEU3");

        Student u1c1d2s2 = u1c1d2.getStudentDirectory().addStudent();
        u1c1d2s2.setStudentName("Erik");
        u1c1d2s2.setId("NEU4"); 
        
        Alumni a = u1c1d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("D");
        a.setSalary(1000);
        a.setEmployed(true);
        a.setPromoted(true);
        a = u1c1d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("E");
        a.setSalary(1500);
        a.setEmployed(true);
        a.setPromoted(false);
        a = u1c1d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("F");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(true);
        
        Teacher t2 = u1c1d1.getTeacherDirectory().addTeacher();
        t2 = u1c1d2.getTeacherDirectory().addTeacher();
        t2.setTeacherName("Prof. A");
        t2.setId("4");
        t2.setResearchNum(8);
        t2.setResearchMoney(10000);

        staff = u1c1d2.getStaffDirectory().addStaff();
        staff.setStaffName("Bobby");
        staff.setId("3");
        
        College u1c2 =  u1.getCollegeCatalog().addCollege();
        u1c2.setCollegeName("CIS");
                
        Department u1c2d1 = u1c2.getDepartmentCatalog().addDepartment();
        u1c2d1.setDepartmentName("Com");
        Student u1c2d1s1 = u1c2d1.getStudentDirectory().addStudent();
        u1c2d1s1.setStudentName("Hank");
        u1c2d1s1.setId("NEU5");
        
        Student u1c2d1s2 = u1c2d1.getStudentDirectory().addStudent();
        u1c2d1s2.setStudentName("Alex");
        u1c2d1s2.setId("NEU6");      
        
        a = u1c2d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("G");
        a.setSalary(1000);
        a.setEmployed(true);
        a.setPromoted(true);
        a = u1c2d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("H");
        a.setSalary(1500);
        a.setEmployed(true);
        a.setPromoted(false);
        a = u1c1d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("I");
        a.setSalary(0);
        a.setEmployed(false);
        a.setPromoted(true);
        
        Teacher t3 = u1c2d1.getTeacherDirectory().addTeacher();
        t3.setTeacherName("Prof. Xavier");
        t3.setId("5");
        t3.setResearchNum(10);
        t3.setResearchMoney(10000);
        Teacher t7= u1c2d1.getTeacherDirectory().addTeacher();
        t7.setTeacherName("Prof. Ororo");
        t7.setId("6");
        t7.setResearchNum(5);
        t7.setResearchMoney(10000);
        
        staff = u1c2d1.getStaffDirectory().addStaff();
        staff.setStaffName("Emma");
        staff.setId("4");

        Department u1c2d2 = u1c2.getDepartmentCatalog().addDepartment();
        u1c2d2.setDepartmentName("Info");
        
        Student u1c2d2s1 = u1c2d2.getStudentDirectory().addStudent();
        u1c2d2s1.setStudentName("Angel");
        u1c2d2s1.setId("NEU7");
        Student u1c2d2s2 = u1c2d2.getStudentDirectory().addStudent();
        u1c2d2s2.setStudentName("Armando");
        u1c2d2s2.setId("NEU8"); 
        
        a = u1c2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("J");
        a.setSalary(1000);
        a.setEmployed(true);
        a.setPromoted(true);
        a = u1c2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("K");
        a.setSalary(1500);
        a.setEmployed(true);
        a.setPromoted(false);
        a = u1c2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("L");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(true);
        
        Teacher t4 = u1c2d2.getTeacherDirectory().addTeacher();
        t4.setTeacherName("Prof. B");
        t4.setId("7");
        t4.setResearchNum(1);
        t4.setResearchMoney(3000);
        Teacher t8 = u1c2d2.getTeacherDirectory().addTeacher();
        t8.setTeacherName("Prof. C");
        t8.setId("8");
        t8.setResearchNum(5);
        t8.setResearchMoney(5000);
        
        staff = u1c2d2.getStaffDirectory().addStaff();
        staff.setStaffName("Emma");
        staff.setId("4");
        
        
        
        
        
        //NEU course
        Course applicationEngineering = new Course();
        Course webDesign = new Course();
        Course webTool = new Course();
        Course basicdesign = new Course();
        Course uidesign = new Course();
        
        
        applicationEngineering.setName("Application Development Engineering");
        applicationEngineering.setCredit(4);
        applicationEngineering.setID(5100);
        applicationEngineering.setDescription("Application engineering with java");
        applicationEngineering.setPrice(4000);
        applicationEngineering.addFollowCourse(webDesign);
        
        webDesign.setName("Web Design");
        webDesign.setCredit(4);
        webDesign.setID(5120);
        webDesign.setDescription("html css js");
        webDesign.setPrice(4000);
        webDesign.addPreCourse(applicationEngineering);
        webDesign.addFollowCourse(webTool);
        
        webTool.setName("Web Tool");
        webTool.setCredit(4);
        webTool.setID(5130);
        webTool.setDescription("web server side");
        webTool.setPrice(4000);
        webTool.addPreCourse(applicationEngineering);
        webTool.addPreCourse(webDesign);
        
        basicdesign.setName("Design basic");
        basicdesign.setCredit(4);
        basicdesign.setID(5140);
        basicdesign.setDescription("Design basis");
        basicdesign.setPrice(4500);
        basicdesign.addFollowCourse(uidesign);
        
        uidesign.setName("UI Design");
        uidesign.setCredit(4);
        uidesign.setID(5150);
        uidesign.setDescription("design ui ux");
        uidesign.setPrice(4500);
        uidesign.addPreCourse(basicdesign);
        
        
        Degree MSIS = new Degree();  
        Degree MSCS = new Degree();
        Degree MSCE = new Degree();
        Degree MFA1 = new Degree();
        Degree MFA2 = new Degree();
        
        MSIS.setName("MS of Info System");
        MSCS.setName("MS of Computer Science");
        MSCE.setName("MS of Computer Engineering");
        MFA1.setName("MFA in Informatic Visualization");
        MFA2.setName("MFA in Graphic Design");
        
        MSIS.addCoreCourse(applicationEngineering);
        MSIS.addElectiveCourse(webDesign);
        MSIS.addElectiveCourse(webTool);
        MSCS.addCoreCourse(applicationEngineering);
        MSCE.addCoreCourse(applicationEngineering);
        MFA1.addCoreCourse(basicdesign);
        MFA1.addElectiveCourse(uidesign);
        MFA2.addCoreCourse(basicdesign);
        MFA2.addElectiveCourse(uidesign);
        
        u1c1d1.setDegree(MSIS);
        u1c1d1.setDegree(MSCE);
        u1c1d2.setDegree(MSCS);
        u1c2d1.setDegree(MFA1);
        u1c2d2.setDegree(MFA2);
        
        CourseCatalog c1d1CourseCatalog = new CourseCatalog();
        CourseCatalog c1d2CourseCatalog = new CourseCatalog();
        CourseCatalog c2d1CourseCatalog = new CourseCatalog();
        CourseCatalog c2d2CourseCatalog = new CourseCatalog();
        
        c1d1CourseCatalog.addCourse(applicationEngineering);
        c1d1CourseCatalog.addCourse(webDesign);
        c1d1CourseCatalog.addCourse(webTool);
        c2d1CourseCatalog.addCourse(basicdesign);
        c2d1CourseCatalog.addCourse(uidesign);
        
        
        u1c1d1.setCourseCatalog(c1d1CourseCatalog);
        u1c2d2.setCourseCatalog(c2d2CourseCatalog);
        
        CourseOffering co1 = new CourseOffering();
        CourseOffering co2 = new CourseOffering();
        CourseOffering co3 = new CourseOffering();
        
        Classroom classroom1 = new Classroom();
        Classroom classroom2 = new Classroom();
        Classroom classroom3 = new Classroom();
        classroom1.setBuilding("A hall");
        classroom1.setRoomNum("101");
        classroom2.setBuilding("A hall");
        classroom2.setRoomNum("201");
        classroom3.setBuilding("B hall");
        classroom3.setRoomNum("305");
        
        
        co1.setCourse(applicationEngineering);
        co1.setTeacher(t);
        co1.setClassroom(classroom1);
        co2.setCourse(webDesign);
        co2.setTeacher(t2);
        co2.setClassroom(classroom2);
        co3.setCourse(basicdesign);
        co3.setTeacher(t8);
        co3.setClassroom(classroom3);
    
        
        //seat & transcript
        //Hailie
        Seat seat1 = co1.addSeat();
        SeatAssignment sa1 = u1c1d1s1.getTranscript().getCourseload().AddSeatAssignment(seat1, 3.6, 4800);
        Seat seat2 = co2.addSeat();
        sa1 = u1c1d1s1.getTranscript().getCourseload().AddSeatAssignment(seat2, 3.7, 4800);
        //Leslie
        Seat seat3 = co2.addSeat();
        u1c1d1s2.getTranscript().getCourseload().AddSeatAssignment(seat3, 3.8, 4800);
        Seat seat4 = co3.addSeat();
        u1c1d1s2.getTranscript().getCourseload().AddSeatAssignment(seat4, 3.6, 4800);
        
        //Charles
        Seat seat = co1.addSeat();
        u1c1d2s1.getTranscript().getCourseload().AddSeatAssignment(seat, 3.3, 4800);
        seat = co3.addSeat();
        u1c1d2s1.getTranscript().getCourseload().AddSeatAssignment(seat, 3.2, 4800);
        //Erik
        seat = co1.addSeat();
        u1c1d2s2.getTranscript().getCourseload().AddSeatAssignment(seat, 3.6, 4800);
        seat = co3.addSeat();
        u1c1d2s2.getTranscript().getCourseload().AddSeatAssignment(seat, 3.5, 4800);
        //Hank
        seat = co2.addSeat();
        u1c2d1s1.getTranscript().getCourseload().AddSeatAssignment(seat, 4.0, 2000);
        seat = co3.addSeat();
        u1c2d1s1.getTranscript().getCourseload().AddSeatAssignment(seat, 3.8, 4000);
        //Alex
        seat = co2.addSeat();
        u1c2d1s2.getTranscript().getCourseload().AddSeatAssignment(seat, 3.0, 4800);
        seat = co3.addSeat();
        u1c2d1s2.getTranscript().getCourseload().AddSeatAssignment(seat, 3.2, 4800);
        
        //Angel
       seat = co1.addSeat();
        u1c2d2s1.getTranscript().getCourseload().AddSeatAssignment(seat, 3.3, 4800);
        seat = co2.addSeat();
        u1c2d2s1.getTranscript().getCourseload().AddSeatAssignment(seat, 3.4, 4800);
        
        //Armando
       seat = co1.addSeat();
        u1c2d2s2.getTranscript().getCourseload().AddSeatAssignment(seat, 3.5, 4800);
        seat = co2.addSeat();
        u1c2d2s2.getTranscript().getCourseload().AddSeatAssignment(seat, 3.6, 4800);

        
        

        
        
        //BU
        University u2= universityList.addUniversity();
        u2.setUniversityName("BU");
        
        College u2c1 = u2.getCollegeCatalog().addCollege();
        u2c1.setCollegeName("Art");
        
        Department u2d1 = u2c1.getDepartmentCatalog().addDepartment();
        u2d1.setDepartmentName("His");
        
        Student s = u2d1.getStudentDirectory().addStudent();
        s.setStudentName("Bucky");
        s.setId("BU111111111");
        s = u2d1.getStudentDirectory().addStudent();
        s.setStudentName("Steve");
        s.setId("BU22222222");  
        s = u2d1.getStudentDirectory().addStudent();
        s.setStudentName("Natasha");
        s.setId("BU333333333");  
        
        a = u2d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("a");
        a.setSalary(3000);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u2d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("b");
        a.setSalary(2500);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u2d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("c");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(false);
        
        t = u2d1.getTeacherDirectory().addTeacher();
        t.setTeacherName("Prof. a");
        t.setId("1");
        t.setResearchNum(2);
        t.setResearchMoney(5000);

        
        staff = u2d1.getStaffDirectory().addStaff();
        staff.setStaffName("Kitty");
        staff.setId("1");
        
        Department u2d2 = u2c1.getDepartmentCatalog().addDepartment();
        u2d2.setDepartmentName("Music");
        
        s = u2d2.getStudentDirectory().addStudent();
        s.setStudentName("Tony");
        s.setId("BU444444444");
        s = u2d2.getStudentDirectory().addStudent();
        s.setStudentName("Peter");
        s.setId("BU555555555");  
        s = u2d2.getStudentDirectory().addStudent();
        s.setStudentName("Rodey");
        s.setId("BU666666666");  
        
        a = u2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("d");
        a.setSalary(3000);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("e");
        a.setSalary(2500);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("f");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(false);
        a = u2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("g");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(true);
        a = u2d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("h");
        a.setSalary(1000);
        a.setEmployed(true);
        a.setPromoted(false);
        
        t = u2d2.getTeacherDirectory().addTeacher();
        t.setTeacherName("Prof. b");
        t.setId("2");
        t.setResearchNum(8);
        t.setResearchMoney(10000);

        
        staff = u2d2.getStaffDirectory().addStaff();
        staff.setStaffName("Logan");
        staff.setId("2");
        
        //BU course
        Course buC1 = new Course();
        Course buC2 = new Course();
        Course buC3 = new Course();
        Course buC4 = new Course();
        Course buC5 = new Course();
        Course buC6 = new Course();

        buC1.setName("BUc1");
        buC1.setID(3000);
        buC1.setCredit(3);
        buC1.setPrice(4500);
        buC1.setDescription("basic");
        buC1.addFollowCourse(buC2);

        buC2.setName("BUc2");
        buC2.setID(3001);
        buC2.setCredit(3);
        buC2.setPrice(4500);
        buC2.setDescription("basic mftcvgbh");
        buC2.addPreCourse(buC1);


        buC3.setName("BUc3");
        buC3.setID(3002);
        buC3.setCredit(3);
        buC3.setPrice(4000);
        buC3.setDescription("basic hbjn");
        buC3.addPreCourse(buC1);
        buC3.addPreCourse(buC2);
        buC3.addFollowCourse(buC4);


        buC4.setName("BUc4");
        buC4.setID(3003);
        buC4.setCredit(2);
        buC4.setPrice(2000);
        buC4.setDescription("basic bjnkm");
        buC4.addPreCourse(buC1);
        buC4.addFollowCourse(buC6);

        buC5.setName("BUc5");
        buC5.setID(3004);
        buC5.setCredit(3);
        buC5.setPrice(3000);
        buC5.setDescription("basic bjn");
        buC5.addPreCourse(buC1);
        buC5.addFollowCourse(buC6);

        buC6.setName("BUc6");
        buC6.setID(3005);
        buC6.setCredit(4);
        buC6.setPrice(5000);
        buC6.setDescription("basic bhjk");
        buC6.addPreCourse(buC1);
        buC6.addPreCourse(buC5);

        Degree buDegree1 = new Degree();
        Degree buDegree2 = new Degree();
        Degree buDegree3 = new Degree();

        buDegree1.setName("bud1");
        buDegree2.setName("bud2");
        buDegree3.setName("bud3");

        buDegree1.addCoreCourse(buC1);
        buDegree1.addCoreCourse(buC2);
        buDegree1.addElectiveCourse(buC3);
        buDegree1.addElectiveCourse(buC4);

        buDegree2.addCoreCourse(buC1);
        buDegree2.addCoreCourse(buC2);
        buDegree2.addElectiveCourse(buC3);
        buDegree3.addElectiveCourse(buC5);

        buDegree3.addCoreCourse(buC1);
        buDegree3.addCoreCourse(buC5);
        buDegree3.addElectiveCourse(buC6);

        u2d1.setDegree(buDegree1);
        u2d1.setDegree(buDegree2);
        u2d2.setDegree(buDegree3);

        CourseCatalog u1d1CourseCatalog = new CourseCatalog();
        CourseCatalog u2d2CourseCatalog = new CourseCatalog();
        
        //MIT
        University u3= universityList.addUniversity();
        u3.setUniversityName("MIT");
        
        College u3c1 = u3.getCollegeCatalog().addCollege();
        u3c1.setCollegeName("Sci");
        
        Department u3d1 = u3c1.getDepartmentCatalog().addDepartment();
        u3d1.setDepartmentName("Chem");
        
        s = u3d1.getStudentDirectory().addStudent();
        s.setStudentName("Mark");
        s.setId("MIT1");
        s = u3d1.getStudentDirectory().addStudent();
        s.setStudentName("Edward");
        s.setId("MIT2");  
        s = u3d1.getStudentDirectory().addStudent();
        s.setStudentName("Emma");
        s.setId("MIT3");  
        
        a = u3d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("z");
        a.setSalary(3000);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u3d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("y");
        a.setSalary(2500);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u3d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("x");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(false);
        a = u3d1.getAlumniDirectory().addAlumni();
        a.setAlunmiName("w");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(true);
        
        t = u3d1.getTeacherDirectory().addTeacher();
        t.setTeacherName("Prof. Z");
        t.setId("1");
        t.setResearchNum(20);
        t.setResearchMoney(20000);

        
        staff = u3d1.getStaffDirectory().addStaff();
        staff.setStaffName("Scott");
        staff.setId("1");
        
        Department u3d2 = u3c1.getDepartmentCatalog().addDepartment();
        u3d2.setDepartmentName("Phy");
        s = u3d2.getStudentDirectory().addStudent();
        s.setStudentName("Bruce");
        s.setId("MIT4");
        s = u3d2.getStudentDirectory().addStudent();
        s.setStudentName("Clark");
        s.setId("MIT5");

        
        a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("o");
        a.setSalary(3000);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("p");
        a.setSalary(2500);
        a.setEmployed(false);
        a.setPromoted(false);
        a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("q");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(false);
        a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("r");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(true);
        a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("s");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(true);
        a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("t");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(true);
        a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("u");
        a.setSalary(2000);
        a.setEmployed(true);
        a.setPromoted(false);
         a = u3d2.getAlumniDirectory().addAlumni();
        a.setAlunmiName("u");
        a.setSalary(0);
        a.setEmployed(false);
        a.setPromoted(false);
        
        
        t = u3d2.getTeacherDirectory().addTeacher();
        t.setTeacherName("Prof. Y");
        t.setId("2");
        t.setResearchNum(30);
        t.setResearchMoney(50000);

        
        staff = u3d2.getStaffDirectory().addStaff();
        staff.setStaffName("Jean");
        staff.setId("2");
        
        ecosystem.setUniversityCatalog(universityList);
        
        return ecosystem;
        
    }

}
