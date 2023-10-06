/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import common.Manage;
import java.util.ArrayList;
import model.Doctor;
import view.Menu;

/**
 *
 * @author Admin
 */
public class DoctorManagement extends Menu {

    private static ArrayList<Doctor> arr = new ArrayList();

    public DoctorManagement() {
    }

    public DoctorManagement(String title, String[] s) {
        super(title, s);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                Manage.createDoctor(arr);
                break;
            case 2:
                Manage.updateDoctor(arr);
                break;
            case 3:
                Manage.deleteDoctor(arr);
                break;
            case 4:
                Manage.searchDoctor(arr);
                break;    
            case 5:
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-5");
                break;
        }
    }
}
