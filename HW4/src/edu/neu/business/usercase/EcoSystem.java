/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.usercase;

import edu.neu.business.usercase.UniversityCatalog;
import edu.neu.business.usercase.University;
import edu.neu.business.usercase.Department;
import edu.neu.business.student.Alumni;
import edu.neu.business.student.Student;

/**
 *
 * @author mwhai_000
 */
public class EcoSystem {

    private String ecoSystemName;
    private UniversityCatalog universityCatalog;

    public EcoSystem() {
        universityCatalog = new UniversityCatalog();
    }

    public String getEcoSystemName() {
        return ecoSystemName;
    }

    public void setEcoSystemName(String ecoSystemName) {
        this.ecoSystemName = ecoSystemName;
    }

    public UniversityCatalog getUniversityCatalog() {
        return universityCatalog;
    }

    public void setUniversityCatalog(UniversityCatalog universityCatalog) {
        this.universityCatalog = universityCatalog;
    }

    public int getStudentNum() {
        int count = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            count += u.getStudentNum();
        }
        return count;
    }

    public int getAlumniNum() {
        int count = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            count += u.getAlumniNum();
        }
        return count;
    }

    public int getTeacherNum() {
        int count = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            count += u.getTeacherNum();
        }
        return count;
    }

    public int getStaffNum() {
        int count = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            count += u.getStaffNum();
        }
        return count;
    }

    public int ResearchNum() {
        int researchSum = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            researchSum += u.ResearchNum();
        }
        return researchSum;
    }

    public double getResearchMoney() {
        double researchMoney = 0.0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            researchMoney += u.getResearchMoney();
        }
        return researchMoney;
    }

    public double salaryAvg() {
        double salarySum = 0.0;
        double sum = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
                for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                    for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                        if (a.isEmployed()) {
                            sum++;
                            salarySum += a.getSalary();
                        }
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
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            sum += u.getAlumniNum();
            for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
                for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                    for (Alumni a : d.getAlumniDirectory().getAlumniDirectory()) {
                        if (a.isEmployed()) {
                            count++;
                        }
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
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
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

        }
        double rate = count / sum * 100;
        return rate;
    }

    public double gpaAvg() {
        double gpaSum = 0.0;
        double sum = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
                for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                    for (Student s : d.getStudentDirectory().getStudentDirectory()) {
                        sum++;
                        gpaSum += s.getTranscript().calSemesterGPA();
                    }
                }
            }
        }
        double salaryAvg = gpaSum / sum;
        return salaryAvg;
    }

    public double costAvg() {
        double costSum = 0.0;
        double sum = 0;
        for (University u : getUniversityCatalog().getUniversityCatalog()) {
            for (College c : u.getCollegeCatalog().getCollegeCatalog()) {
                for (Department d : c.getDepartmentCatalog().getDepartmentCatalog()) {
                    for (Student s : d.getStudentDirectory().getStudentDirectory()) {
                        sum++;
                        costSum += s.getTranscript().calSemesterCost();
                    }
                }
            }
        }
        double salaryAvg = costSum / sum;
        return salaryAvg;
    }
}
