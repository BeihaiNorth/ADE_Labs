/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.usercase;

import edu.neu.business.usercase.DepartmentCatalog;
import edu.neu.business.usercase.Department;
import edu.neu.business.usercase.CollegeCatalog;
import edu.neu.business.faculty.Teacher;
import edu.neu.business.student.Alumni;
import edu.neu.business.student.Student;

/**
 *
 * @author mwhai_000
 */
public class University {

    private String universityName;
//    private DepartmentCatalog departmentCatalog;
    private CollegeCatalog collegeCatalog;

    public University() {
//        departmentCatalog = new DepartmentCatalog();
        collegeCatalog = new CollegeCatalog();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public CollegeCatalog getCollegeCatalog() {
        return collegeCatalog;
    }

    public void setCollegeCatalog(CollegeCatalog collegeCatalog) {
        this.collegeCatalog = collegeCatalog;
    }

//    public DepartmentCatalog getDepartmentCatalog() {
//        return departmentCatalog;
//    }
//
//    public int getStudentNum() {
//        int count = 0;
//        for (Department depart : getDepartmentCatalog().getDepartmentCatalog()) {
//            count += depart.getStudentNum();
//        }
//        return count;
//    }

    public int getStudentNum() {
        int count = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            count += c.getStudentNum();
        }
        return count;
    }

    public int getAlumniNum() {
        int count = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            count += c.getAlumniNum();
        }
        return count;
    }

    public int getTeacherNum() {
        int count = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            count += c.getTeacherNum();
        }
        return count;
    }

    public int getStaffNum() {
        int count = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            count += c.getStaffNum();
        }
        return count;
    }

    public int ResearchNum() {
        int researchSum = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            researchSum += c.ResearchNum();
        }
        return researchSum;
    }

    public double getResearchMoney() {
        double researchMoney = 0.0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            researchMoney += c.getResearchMoney();
        }
        return researchMoney;
    }

    public double salaryAvg() {
        double salarySum = 0.0;
        double sum = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                    if (a.isEmployed()) {
                        sum++;
                        salarySum += a.getSalary();
                    }
                }
            }
        }
        double salaryAvg = salarySum / sum;
        return salaryAvg;
    }

    public double employmentRate() {
        double count = 0;
        double sum = 0;
        double rate = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            sum += c.getAlumniNum();
            for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                    if (a.isEmployed()) {
                        count++;
                    }
                }
            }
        }
        rate = count / sum * 100;
        return rate;
    }

    public double promotionRate() {
        double count = 0;
        double sum = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                    if (a.isEmployed()) {
                        sum++;
                        if (a.isPromoted()) {
                            count++;
                        }
                    }
                }
            }
        }
        double rate = count / sum * 100;
        return rate;
    }

    public double gpaAvg() {
        double gpaSum = 0.0;
        double sum = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                for (Student s : d.getStudentDirectory().getStudentDirectory()) {
                    sum++;
                    gpaSum += s.getTranscript().calSemesterGPA();
                }
            }
        }
        double salaryAvg = gpaSum / sum;
        return salaryAvg;
    }

    public double costAvg() {
        double costSum = 0.0;
        double sum = 0;
        for (College c : getCollegeCatalog().getCollegeCatalog()) {
            for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                for (Student s : d.getStudentDirectory().getStudentDirectory()) {
                    sum++;
                    costSum += s.getTranscript().calSemesterCost();
                }
            }
        }
        double salaryAvg = costSum / sum;
        return salaryAvg;
    }
}
