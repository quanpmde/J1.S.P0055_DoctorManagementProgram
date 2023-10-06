/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import model.Doctor;
import view.Validation;

/**
 *
 * @author Admin
 */
public class Manage {

    //allow user create doctor
    public static void createDoctor(ArrayList<Doctor> doctors) {
        System.out.println("---------- Add Doctor -----------");
        System.out.println("Enter Code: ");
        String code = Validation.checkInputString();
         if (!Validation.checkCodeExist(doctors, code)) {
            System.err.println("Code is duplicate.");
            return;
        }
        System.out.println("Enter Name: ");
        String name = Validation.checkInputString();
        System.out.println("Enter Specialization: ");
        String specialization = Validation.checkInputString();
        System.out.println("Enter Availability");
        int availability = Validation.checkInputInt();
        doctors.add(new Doctor(code, name, specialization, availability));
        System.err.println("Add successfull.");
    }

    //get doctor by code
    public static Doctor getDoctorByCode(ArrayList<Doctor> doctors, String code) {
        for (Doctor doctor : doctors) {
            if (doctor.getCode().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    //allow user update doctor
    public static void updateDoctor(ArrayList<Doctor> doctors) {
        if (doctors.isEmpty()) {
            System.err.println("List is empty. You must add a new doctor.");
        } else {
            System.out.println("---------- Update Doctor -----------");
            System.out.println("Enter Code: ");
            String code = Validation.checkInputString();
            if (Validation.checkCodeExist(doctors, code)) {
                System.err.println("Doctor code dose not exist.");
                return;
            } else {
                Doctor doctor = getDoctorByCode(doctors, code);
                System.out.println("Enter Name: ");
                String newName = Validation.checkNewInputString(doctor.getName());
                System.out.println("Enter Specialization: ");
                String newSpecialization = Validation.checkNewInputString(doctor.getSpecialization());
                System.out.println("Enter Availability");
                int newAvailability = Validation.checkNewInputInt(doctor.getAvailability());
                doctor.setName(newName);
                doctor.setSpecialization(newSpecialization);
                doctor.setAvailability(newAvailability);
            }
        }
    }

    //allow user delete doctor
    public static void deleteDoctor(ArrayList<Doctor> doctors) {
        if (doctors.isEmpty()) {
            System.err.println("List is empty. You must add a new doctor.");
        } else {
            System.out.println("---------- Delete Doctor -----------");
            System.out.println("Enter Code: ");
            String code = Validation.checkInputString();
            if (Validation.checkCodeExist(doctors, code)) {
                System.err.println("Doctor code dose not exist.");
                return;
            } else {
                Doctor doctor = getDoctorByCode(doctors, code);
                if (doctor == null) {
                    System.err.println("Not found doctor.");
                    return;
                } else {
                    doctors.remove(doctor);
                }
                System.err.println("Delete successful.");
            }
        }
    }

    //allow user search doctor
    public static void searchDoctor(ArrayList<Doctor> doctors) {
        if (doctors.isEmpty()) {
            System.err.println("List is empty. You must add a new doctor.");
        } else {
            System.out.print("Enter name: ");
            String name = Validation.checkInputString();
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name", "Specialization", "Availability");
            for (Doctor doctor : doctors) {
                if (doctor.getName().contains(name)) {
                    System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability());
                }
            }
        }
    }
}
