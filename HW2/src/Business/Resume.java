/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Calendar;
import javax.swing.Icon;

/**
 *
 * @author Seagullbird
 */
public class Resume {
    /* AdditionalInfo */
    private String languages;
    private String certificates;
    private String hobbies;

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
    
    /* BasicInfo */
    private String firstName;
    private String lastName;
    private String gender;
    private String nationality;
    private String status;
    private String phone;
    private String affiliation;
    private String streetLine1;
    private String streetLine2;
    private String city;
    private String country;
    private Icon photo;
    
    private String techSkills;

    public String getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(String techSkills) {
        this.techSkills = techSkills;
    }
    
    

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Icon getPhoto() {
        return photo;
    }

    public void setPhoto(Icon photo) {
        this.photo = photo;
    }
    
    /* CareerObjStatement */
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    /* Education */
    private String EdudateFromM;
    private String EdudateFromY;
    private String EdudateToM;
    private String EdudateToY;
    
    private String collegeName;
    private String specialty;
    private String gpa;

    public String getEduDateFromM() {
        return EdudateFromM;
    }

    public void setEduDateFromM(String EdudateFromM) {
        this.EdudateFromM = EdudateFromM;
    }

    public String getEduDateFromY() {
        return EdudateFromY;
    }

    public void setEduDateFromY(String EdudateFromY) {
        this.EdudateFromY = EdudateFromY;
    }

    public String getEduDateToM() {
        return EdudateToM;
    }

    public void setEduDateToM(String EdudateToM) {
        this.EdudateToM = EdudateToM;
    }

    public String getEduDateToY() {
        return EdudateToY;
    }

    public void setEduDateToY(String EdudateToY) {
        this.EdudateToY = EdudateToY;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
    
    /* ProjectsandInternship */
    private String PNIDateFromM1;
    private String PNIDateFromY1;
    private String PNIDateToM1;
    private String PNIDateToY1;
    private String desctription1;
    private String PNIDateFromM2;
    private String PNIDateFromY2;
    private String PNIDateToM2;
    private String PNIDateToY2;
    private String desctription2;

    public String getPNIDateFromM1() {
        return PNIDateFromM1;
    }

    public void setPNIDateFromM1(String PNIDateFromM1) {
        this.PNIDateFromM1 = PNIDateFromM1;
    }

    public String getPNIDateFromY1() {
        return PNIDateFromY1;
    }

    public void setPNIDateFromY1(String PNIDateFromY1) {
        this.PNIDateFromY1 = PNIDateFromY1;
    }

    public String getPNIDateToM1() {
        return PNIDateToM1;
    }

    public void setPNIDateToM1(String PNIDateToM1) {
        this.PNIDateToM1 = PNIDateToM1;
    }

    public String getPNIDateToY1() {
        return PNIDateToY1;
    }

    public void setPNIDateToY1(String PNIDateToY1) {
        this.PNIDateToY1 = PNIDateToY1;
    }

    public String getDesctription1() {
        return desctription1;
    }

    public void setDesctription1(String desctription1) {
        this.desctription1 = desctription1;
    }

    public String getPNIDateFromM2() {
        return PNIDateFromM2;
    }

    public void setPNIDateFromM2(String PNIDateFromM2) {
        this.PNIDateFromM2 = PNIDateFromM2;
    }

    public String getPNIDateFromY2() {
        return PNIDateFromY2;
    }

    public void setPNIDateFromY2(String PNIDateFromY2) {
        this.PNIDateFromY2 = PNIDateFromY2;
    }

    public String getPNIDateToM2() {
        return PNIDateToM2;
    }

    public void setPNIDateToM2(String PNIDateToM2) {
        this.PNIDateToM2 = PNIDateToM2;
    }

    public String getPNIDateToY2() {
        return PNIDateToY2;
    }

    public void setPNIDateToY2(String PNIDateToY2) {
        this.PNIDateToY2 = PNIDateToY2;
    }

    public String getDesctription2() {
        return desctription2;
    }

    public void setDesctription2(String desctription2) {
        this.desctription2 = desctription2;
    }

    @Override
    public String toString(){
    return this.firstName;
    }
}
