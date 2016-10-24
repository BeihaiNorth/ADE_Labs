/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.City;
import Business.Community;
import Business.CommunityDirectory;
import Business.Family;
import Business.FamilyDirectory;
import Business.House;
import Business.HouseDirectory;
import Business.Patient;
import Business.Person;
import Business.PersonDirectory;
import Business.VitalSigns;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import sun.font.SunFontManager;

/**
 *
 * @author leslie
 */
public class Configuration {

    /**
     * List of Strings for male first names.
     */
    private List<String> maleFirstNamesArr;
    /**
     * List of Strings for female first names.
     */
    private List<String> femaleFirstNamesArr;

    private PersonDirectory personDirectory;
    private FamilyDirectory familyDirectory;
    private HouseDirectory houseDirectory;
    private CommunityDirectory communityDirectory;

    public Configuration() {
        maleFirstNamesArr = new ArrayList<String>();
        femaleFirstNamesArr = new ArrayList<String>();
        personDirectory = new PersonDirectory();
        familyDirectory = new FamilyDirectory();
        houseDirectory = new HouseDirectory();
        communityDirectory = new CommunityDirectory();
    }

       
    public static double randDouble(double min, double max) {
        // Usually this can be a field rather than a method variable
        Random rand = new Random();
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        double randomNum = rand.nextDouble()*(max-min) + min;
        return randomNum;
    }
            
    public void initNameArray() {
        // use InputStreams for files for JAR use
        InputStream is1 = getClass().getResourceAsStream("male_first_names.txt");
        InputStream is2 = getClass().getResourceAsStream("female_first_names.txt");
        // use BufferedReader to get text from InputStream objects
        BufferedReader bfMaleFirstNames = new BufferedReader(new InputStreamReader(is1));
        BufferedReader bfFemaleFirstNames = new BufferedReader(new InputStreamReader(is2));
        StringBuilder out = new StringBuilder();
        String line;

        try {
            while ((line = bfMaleFirstNames.readLine()) != null) {
                out.delete(0, out.length());
                out.append(line);
                maleFirstNamesArr.add(out.toString());
            }
            while ((line = bfFemaleFirstNames.readLine()) != null) {
                out.delete(0, out.length());
                out.append(line);
                femaleFirstNamesArr.add(out.toString());
            }
            bfMaleFirstNames.close();
            bfFemaleFirstNames.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error - Files not properly loaded. Quiting program...", "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public PersonDirectory initPersonDirectory() {
        Random rand1 = new Random(1);
        Random rand2 = new Random(2);
        Random rand3 = new Random(3);
        Random rand4 = new Random(4);
        //turn ArrayList to Array
        int sizeM = maleFirstNamesArr.size();
        String[] arrMale = (String[]) maleFirstNamesArr.toArray(new String[sizeM]);
        int sizeF = femaleFirstNamesArr.size();
        String[] arrFemale = (String[]) femaleFirstNamesArr.toArray(new String[sizeF]);

        //Generate 1000 childen age from 0 ~30       
        for (int i = 0; i < 1000; i++) {
            //add a new person to personDirectory
            Person person = personDirectory.addPerson();
            boolean isMale = rand1.nextBoolean();
            if (isMale == true) {  // male
                person.setIsMale(isMale);
                String name = arrMale[rand1.nextInt(sizeM)];
                person.setName(name);
            } else // if female
            {
                person.setIsMale(isMale);
                String name = arrFemale[rand1.nextInt(sizeF)];
                person.setName(name);
            }
            int n = rand2.nextInt(30) + 1;
            person.setAge(n);
        }

        //Generate 500 males ,age from 31~60
        for (int i = 0; i < 500; i++) {
            Person person = personDirectory.addPerson();
            person.setIsMale(true);
            String name = arrMale[rand3.nextInt(sizeM)];
            person.setName(name);
            int n = rand2.nextInt(30) + 31;
            person.setAge(n);
            if (i % 5 == 0) {
                person.getPatient().setSmoker(true);
            }
            if (i % 6 == 0) {
                person.getPatient().setDiabetes(true);
            }
            long ts = Timestamp.valueOf("2016-10-21 00:00:00").getTime();
            for(int j = 0; j < 10; j++){
                double bp = randDouble(90,200);
                double total = randDouble(3.6,10.3);
                double high = randDouble(0.8,4.0);
                ts = ts + 1000*60*60;
                Timestamp times = new Timestamp(ts);
                person.getPatient().addVitalSigns(bp, total, high, times);
            }
        }

        //Generate 500 females ,age from 31~60
        for (int i = 0; i < 500; i++) {
            Person person = personDirectory.addPerson();
            person.setIsMale(false);
            String name = arrFemale[rand3.nextInt(sizeF)];
            person.setName(name);
            int n = rand2.nextInt(30) + 31;
            person.setAge(n);
            if (i % 10 == 0) {
                person.getPatient().setSmoker(true);
            }
            if (i % 6 == 0) {
                person.getPatient().setDiabetes(true);
            }
            long ts = Timestamp.valueOf("2016-10-21 00:00:00").getTime();
            for(int j = 0; j < 10; j++){
                double bp = randDouble(90,200);
                double total = randDouble(3.6,10.3);
                double high = randDouble(0.8,4.0);
                ts = ts + 1000*60*60;
                Timestamp times = new Timestamp(ts);
                person.getPatient().addVitalSigns(bp, total, high, times);
            }

            
        }

        //Generate 500 males ,age from 61~90
        for (int i = 0; i < 500; i++) {
            Person person = personDirectory.addPerson();
            person.setIsMale(true);
            String name = arrMale[rand4.nextInt(sizeM)];
            person.setName(name);
            int n = rand2.nextInt(30) + 61;
            person.setAge(n);
            if (i % 5 == 0) {
                person.getPatient().setSmoker(true);
            }
            if (i % 4 == 0) {
                person.getPatient().setDiabetes(true);
            }
           long ts = Timestamp.valueOf("2016-10-21 00:00:00").getTime();
            for(int j = 0; j < 10; j++){
                double bp = randDouble(90,200);
                double total = randDouble(3.6,10.3);
                double high = randDouble(0.8,4.0);
                ts = ts + 1000*60*60;
                Timestamp times = new Timestamp(ts);
                person.getPatient().addVitalSigns(bp, total, high, times);
            }
        }

        //Generate 500 females ,age from 61~90
        for (int i = 0; i < 500; i++) {
            Person person = personDirectory.addPerson();
            person.setIsMale(false);
            String name = arrFemale[rand4.nextInt(sizeF)];
            person.setName(name);
            int n = rand2.nextInt(30) + 61;
            person.setAge(n);
            if (i % 10 == 0) {
                person.getPatient().setSmoker(true);
            }
            if (i % 4 == 0) {
                person.getPatient().setDiabetes(true);
            }
            long ts = Timestamp.valueOf("2016-10-21 00:00:00").getTime();
            for(int j = 0; j < 10; j++){
                double bp = randDouble(90,200);
                double total = randDouble(3.6,10.3);
                double high = randDouble(0.8,4.0);
                ts = ts + 1000*60*60;
                Timestamp times = new Timestamp(ts);
                person.getPatient().addVitalSigns(bp, total, high, times);
            }
        }

        return personDirectory;
    }

    //init FamilyDirectory
    //assumption: 2 children(1boy 1girl) and their father mother form a family;
    //assumption: 2 grandparent form a family
    //500 young families + 500 old families = 1000 families in total
    public FamilyDirectory initFamilyDirectory() {

        //init 500 families with: 1 father + 1 mother + 2 children
        for (int i = 0; i < 500; i++) {
            Family family = familyDirectory.addFamily();
            
            Person father = family.addFamilyMember( personDirectory.getPersonDirectory().get(i + 1000));
            Person mother = family.addFamilyMember(personDirectory.getPersonDirectory().get(i + 1500));
            Person child1 = family.addFamilyMember(personDirectory.getPersonDirectory().get(2 * i));
            Person child2 = family.addFamilyMember( personDirectory.getPersonDirectory().get(2 * i + 1));
//            father = personDirectory.getPersonDirectory().get(i + 1000);
//            mother = personDirectory.getPersonDirectory().get(i + 1500);
//            child1 = personDirectory.getPersonDirectory().get(2 * i);
//            child2 = personDirectory.getPersonDirectory().get(2 * i + 1);
            child1.setFather(father);
            child1.setMother(mother);
            child1.setSiblings(child2);
            child2.setFather(father);
            child2.setMother(mother);
            child2.setSiblings(child1);
            
            father.setChild1(child1);
            father.setChild2(child2);
            mother.setChild1(child1);
            mother.setChild2(child2);
            
            father.setFamily(family);
            mother.setFamily(family);
            child1.setFamily(family);
            child2.setFamily(family);
        }

        //init 500 families with: 1 grandma + 1 grandpa
        for (int i = 0; i < 500; i++) {

            Family family = familyDirectory.addFamily();
            Person grandma = family.addFamilyMember(personDirectory.getPersonDirectory().get(2999 - i));
            Person grandpa = family.addFamilyMember(personDirectory.getPersonDirectory().get(2000 + i));
            Person son = personDirectory.getPersonDirectory().get(i + 1000);
            Person daughter = personDirectory.getPersonDirectory().get(1999 - i);
//            grandma = personDirectory.getPersonDirectory().get(2999 - i);
//            grandpa = personDirectory.getPersonDirectory().get(2000 + i);
            son.setFather(grandpa);
            son.setMother(grandma);
            son.setSiblings(daughter);
            daughter.setFather(grandpa);
            daughter.setMother(grandma);
            daughter.setSiblings(son);
            
            grandpa.setFamily(family);
            grandpa.setChild1(son);
            grandpa.setChild2(daughter);
            grandma.setFamily(family);
            grandma.setChild1(son);
            grandma.setChild2(daughter);
        }

        return familyDirectory;
    }

    //init HouseDirectory
    //assumption: each house has 10 family inside
    //100 houses in total
    public HouseDirectory initHouseDirectory() {

        for (int i = 0; i < 100; i++) {
            House house = houseDirectory.addHouse();
//            Family family1 = house.addFamily();
//            family1 = familyDirectory.getFamilyDirectory().get(i * 10);
//            Family family2 = house.addFamily();
//            family2 = familyDirectory.getFamilyDirectory().get(i * 10 + 1);
//            Family family3 = house.addFamily();
//            family3 = familyDirectory.getFamilyDirectory().get(i * 10 + 2);
//            Family family4 = house.addFamily();
//            family4 = familyDirectory.getFamilyDirectory().get(i * 10 + 3);
//            Family family5 = house.addFamily();
//            family5 = familyDirectory.getFamilyDirectory().get(i * 10 + 4);
//            Family family6 = house.addFamily();
//            family6 = familyDirectory.getFamilyDirectory().get(i * 10 + 5);
//            Family family7 = house.addFamily();
//            family7 = familyDirectory.getFamilyDirectory().get(i * 10 + 6);
//            Family family8 = house.addFamily();
//            family8 = familyDirectory.getFamilyDirectory().get(i * 10 + 7);
//            Family family9 = house.addFamily();
//            family9 = familyDirectory.getFamilyDirectory().get(i * 10 + 8);
//            Family family10 = house.addFamily();
//            family10 = familyDirectory.getFamilyDirectory().get(i * 10 + 9);

  
            Family family1 = familyDirectory.getFamilyDirectory().get(i * 10);
            house.addFamily(family1);
            Family family = familyDirectory.getFamilyDirectory().get(i * 10 + 1);
            house.addFamily(family);
            family = familyDirectory.getFamilyDirectory().get(i * 10 + 2);
            house.addFamily(family);
            family = familyDirectory.getFamilyDirectory().get(i * 10 + 3);
            house.addFamily(family);
            family = familyDirectory.getFamilyDirectory().get(i * 10 + 4);
            house.addFamily(family);
            family = familyDirectory.getFamilyDirectory().get(i * 10 + 5);
            house.addFamily(family);
            family = familyDirectory.getFamilyDirectory().get(i * 10 + 6);
            house.addFamily(family);
            family = familyDirectory.getFamilyDirectory().get(i * 10 + 8);
            house.addFamily(family);
            family = familyDirectory.getFamilyDirectory().get(i * 10 + 9);
            house.addFamily(family);
            
        }

        return houseDirectory;
    }

    public CommunityDirectory initCommunityDirectory() {

        for (int i = 0; i < 10; i++) {
            Community community = communityDirectory.addCommunity();
            
//            House h1 = community.addHouse();
//            h1 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h2 = community.addHouse();
//            h2 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h3 = community.addHouse();
//            h3 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h4 = community.addHouse();
//            h4 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h5 = community.addHouse();
//            h5 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h6 = community.addHouse();
//            h6 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h7 = community.addHouse();
//            h7 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h8 = community.addHouse();
//            h8 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h9 = community.addHouse();
//            h9 = houseDirectory.getHouseDirectory().get(i * 10);
//            House h10 = community.addHouse();
//            h10 = houseDirectory.getHouseDirectory().get(i * 10);

            House h1 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10));
            House h2 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 1));
            House h3 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 2));
            House h4 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 3));
            House h5 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 4));
            House h6 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 5));
            House h7 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 6));
            House h8 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 7));
            House h9 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 8));
            House h10 = community.addHouse(houseDirectory.getHouseDirectory().get(i * 10 + 9));
 
        }
        return communityDirectory;
    }
    
     public City initCity() {
        City city = new City(communityDirectory);
        city.setCityName("Framingham");
        return city;
     }
}
