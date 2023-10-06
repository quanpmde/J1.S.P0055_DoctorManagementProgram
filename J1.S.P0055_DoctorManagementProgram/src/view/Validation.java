/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author Admin
 */
public class Validation {

    private final static Scanner in = new Scanner(System.in);

    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check user input int
    public static int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    //check code exist or not
    public static boolean checkCodeExist(ArrayList<Doctor> doctors, String code) {
        //check from first to last list doctor
        for (Doctor doctor : doctors) {
            if (code.equalsIgnoreCase(doctor.getCode())) {
                return false;
            }
        }
        return true;
    }
            
    //check user change infomation or not
    public static String checkNewInputString(String oldInfomation) {
        String result = in.nextLine().trim();
        if (result.isEmpty()) {
            return oldInfomation;
        } else {
            return result;
        }
    }

    //check user input int
    public static int checkNewInputInt(int oldInformation) {
        String result = in.nextLine().trim();
        if (result.isBlank()) {
            return oldInformation;
        } else {
            while (true) {
                try {
                    int newInformation = Integer.parseInt(result);
                    return newInformation;
                } catch (NumberFormatException e) {
                    System.err.println("Please input number integer");
                    System.out.print("Enter again: ");
                }
            }
        }
    }

    //check user change infomation or not
    public static boolean checkChangeInfo(Doctor doctor, String code,
            String name, String specialization, int availability) {
        if (doctor.getCode().equalsIgnoreCase(code)
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSpecialization().equalsIgnoreCase(specialization)
                && doctor.getAvailability() == availability) {
            return false;
        }
        return true;
    }
    
}

