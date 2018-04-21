/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilivev2;

import static ilivev2.Donor.isValid;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lyla abdullah
 */
public class Hospital implements User {

    private String hospitalName;
    private int hospitalPhone;
    private String hospitalEmail;
    private String hospitalLocation;
    private String doctorInfo;
    private String labTestInfo;
    private char bloodTypeNeeded;
    private String departmentInfo;

    public Hospital() {
    }

    public Hospital(String hospitalName, int hospitalPhone, String hospitalEmail, String hospitalLocation, String doctrorInfo, String labTestInfo, char bloodTypeNeeded) {
        this.hospitalName = hospitalName;
        this.hospitalPhone = hospitalPhone;
        this.hospitalEmail = hospitalEmail;
        this.hospitalLocation = hospitalLocation;
        this.doctorInfo = doctrorInfo;
        this.labTestInfo = labTestInfo;
        this.bloodTypeNeeded = bloodTypeNeeded;
    }

    @Override
    public void register() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter hospital name = ");
        String name = scan.next();
        System.out.println("");
        String phone;String select;
        do {
            System.out.println("Enter your mobile munber (10 digits) = ");
            phone = scan.next();
            if (isValid(phone)) {
                System.out.println("Valid Number");
                System.out.println("");
                break;
            }
            
           else{
            System.out.println("Invalid Number");
            System.out.println("");
            System.out.println("Do you want to continue or exit?");
            System.out.println("1-continue          2-exit ");
            select = scan.next();
            if (select.equals("1")){
            System.out.println("Please enter a valid nubmer :");
            System.out.println("");
            }
            else{
            break;
            }}

        } while (!isValid(phone));

        System.out.println("");
        System.out.print("Enter hospital location = ");
        String location = scan.next();
        System.out.println("");
        System.out.print("Enter  doctor information = ");
        String doctorInformation = scan.next();
        System.out.println("");
        System.out.print("Enter  lab test information = ");
        String labTesteInfo = scan.next();
        System.out.println("");
        System.out.print("Enter hospital password = ");
        String pass = scan.next();
        System.out.println("");
        System.out.print("Enter bloodTypeNeeded = ");
        String bloodTypeNeeded = scan.next();
        System.out.println("");
        System.out.println("Hospital : " + name + ", phone : " + phone + ", location : " + location + ", doctor information : " + doctorInformation + ", lab test information : " + labTesteInfo + ", password : " + pass + ", bloodTypeNeeded : " + bloodTypeNeeded);
    }

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter hospital name = ");
        String name = scan.next();
        System.out.print("Enter hospital password = ");
        String pass = scan.next();
        System.out.println("");
        System.out.println("welcome hospital " + name);
    }

    public void askForDonor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Do you want a donor ?");
        String ans = scan.next();
        if (ans.equals("yes")) {
            String blood;

            System.out.print("Enter needed blood type : (AB,O,B or A)");
            blood = scan.next();

            System.out.println("We are searching for a donor ....");
            System.out.println("We will send the hospital location to the nearest donor");
        } else if (ans.equals("no")) {
            System.out.println("You loged out");
        }

    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getHospitalPhone() {
        return hospitalPhone;
    }

    public void setHospitalPhone(int hospitalPhone) {
        this.hospitalPhone = hospitalPhone;
    }

    public String getHospitalEmail() {
        return hospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        this.hospitalEmail = hospitalEmail;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public String getDoctrorInfo() {
        return doctorInfo;
    }

    public void setDoctrorInfo(String doctrorInfo) {
        this.doctorInfo = doctrorInfo;
    }

    public String getLabTestInfo() {
        return labTestInfo;
    }

    public void setLabTestInfo(String labTestInfo) {
        this.labTestInfo = labTestInfo;
    }

    public char getBloodTypeNeeded() {
        return bloodTypeNeeded;
    }

    public void setBloodTypeNeeded(char bloodTypeNeeded) {
        this.bloodTypeNeeded = bloodTypeNeeded;
    }

    public String getDepartmentInfo() {
        return departmentInfo;
    }

    public void setDepartmentInfo(String departmentInfo) {
        this.departmentInfo = departmentInfo;
    }

    public static boolean isValid(String s) {

        Pattern p = Pattern.compile("[0-9]{10}");

        // Pattern class contains matcher() method
        // to find matching between given number 
        // and regular expression
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
}
