/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilivev2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Donor implements User {

    private String donorName;
    private String donorGender;
    private char donorBloodType;
    private int donorPhone;
    private String donorMedicalStatus;
    private double donorWeight;
    private String donorPassword;
    private int donorAge;

    public Donor() {
    }

    public Donor(String donorName, String donorGender, char donorBloodType, int donorPhone, String donorMedicalStatus, double donorWeight, String donorPassword, int donorAge) {
        this.donorName = donorName;
        this.donorGender = donorGender;
        this.donorBloodType = donorBloodType;
        this.donorPhone = donorPhone;
        this.donorMedicalStatus = donorMedicalStatus;
        this.donorWeight = donorWeight;
        this.donorPassword = donorPassword;
        this.donorAge = donorAge;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorGender() {
        return donorGender;
    }

    public void setDonorGender(String donorGender) {
        this.donorGender = donorGender;
    }

    public char getDonorBloodType() {
        return donorBloodType;
    }

    public void setDonorBloodType(char donorBloodType) {
        this.donorBloodType = donorBloodType;
    }

    public int getDonorPhone() {
        return donorPhone;
    }

    public void setDonorPhone(int donorPhone) {
        this.donorPhone = donorPhone;
    }

    public String getDonorMedicalStatus() {
        return donorMedicalStatus;
    }

    public void setDonorMedicalStatus(String donorMedicalStatus) {
        this.donorMedicalStatus = donorMedicalStatus;
    }

    public double getDonorWeight() {
        return donorWeight;
    }

    public void setDonorWeight(double donorWeight) {
        this.donorWeight = donorWeight;
    }

    public String getDonorPassword() {
        return donorPassword;
    }

    public void setDonorPassword(String donorPassword) {
        this.donorPassword = donorPassword;
    }

    public int getDonorAge() {
        return donorAge;
    }

    public void setDonorAge(int donorAge) {
        this.donorAge = donorAge;
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
        System.out.print("Enter your bloodType = ");
        String bloodType = scan.next();
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
        System.out.print("Enter your MedicalStatus = ");
        String MedicalStatus = scan.next();
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
        System.out.println("DONOR : " + name + ", age : " + age + ", MedicalStatus : " + MedicalStatus + ", gender : " + gender + ", bloodType : " + bloodType + ", phone : " + phone + ", Weight : " + Weight + ", password : " + pass);
    }

    @Override
    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = scan.next();
        System.out.print("Enter your password = ");
        String pass = scan.next();
        System.out.println("");
        System.out.println("welcome dear Donor " + name);
    }

    public void decideToDonate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nDear Donor do you want to donate ? (yes or no)");
        String ans = scan.next();
        if (ans.equals("yes")) {
            System.out.println(" We are looking for the hospital .... \n");
            System.out.println("the nearest hospital location to you is King Faisal Specialist Hospital");
        } else if (ans.equals("no")) {
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
