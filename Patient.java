/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilivev2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Omnya
 */
public class Patient implements User {

    private String patientName;
    private String patientGender;
    private String patientBloodType;
    private int patientPhone;
    private String patientAdress;
    private double patientWeight;
    private String patientPassword;
    private int patientAge;

    public Patient() {
    }

    public Patient(String patientName, String patientGender, String patientBloodType, int patientPhone, String patientAdress, double patientWeight, String patientPassword, int patientAge) {
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.patientBloodType = patientBloodType;
        this.patientPhone = patientPhone;
        this.patientAdress = patientAdress;
        this.patientWeight = patientWeight;
        this.patientPassword = patientPassword;
        this.patientAge = patientAge;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientBloodType() {
        return patientBloodType;
    }

    public void setPatientBloodType(String patientBloodType) {
        this.patientBloodType = patientBloodType;
    }

    public int getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(int patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientAdress() {
        return patientAdress;
    }

    public void setPatientAdress(String patientAdress) {
        this.patientAdress = patientAdress;
    }

    public double getPatientWeight() {
        return patientWeight;
    }

    public void setPatientWeight(double patientWeight) {
        this.patientWeight = patientWeight;
    }

    public String getPatientPassword() {
        return patientPassword;
    }

    public void setPatientPassword(String patientPassword) {
        this.patientPassword = patientPassword;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    @Override
    public void register() {
        String phone;
        String select;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = scan.next();
        System.out.println("");
        System.out.print("Enter your gender = ");
        String gender = scan.next();
        System.out.println("");
        System.out.println("");
        do{
         System.out.println("Enter your mobile munber (10 digits) = ");
         phone = scan.next();
        if (isValid(phone)){ 
            System.out.println("Valid Number"); 
            System.out.println("");
            break;
        }      
        else
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
            }
            
        }while(!isValid(phone));
        System.out.println("");
        System.out.print("Enter your address = ");
        String add = scan.next();
        System.out.println("");
        System.out.print("Enter your Weight = ");
        double Weight = scan.nextDouble();
        System.out.println("");
        System.out.print("Enter your age = ");
        int age = scan.nextInt();
        System.out.println("");
        System.out.print("Enter your password = ");
        String pass = scan.next();
        System.out.println("");
        System.out.println("Ptaient : "+name +", age : "+age +", adress : "+add+", gender"+gender +", phone : "+phone +", Weight : "+Weight +", password : "+pass);
    }

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = scan.next();
         System.out.print("Enter your password = ");
        String pass = scan.next();
        System.out.println("");
        System.out.println("welcome dear patient "+name );
        
    }

    public void requestBloodType() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDear patient do you want blood ? (yes or no)");
        String ans =scan.next();
        if(ans.equals("yes")){
            System.out.print("Enter your blood type : ");
            String blood = scan.next();
            System.out.println("We are searching for a donor ....");
            System.out.println("the hospital location that has a donor is King Faisal Specialist Hospital");
        }
        else if (ans.equals("no")){
            System.out.println("You loged out");
        }
    }
    
public static boolean isValid(String s)
    {
      
        Pattern p = Pattern.compile("[0-9]{10}");
 
        // Pattern class contains matcher() method
        // to find matching between given number 
        // and regular expression
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }  

}
