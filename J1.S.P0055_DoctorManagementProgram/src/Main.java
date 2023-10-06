
import controller.DoctorManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        String title = "========== Doctor Management ============";
        String[] s = new String[]{"Add a Doctor", "Update Doctor", "Delete Doctor", "Search Doctor", "Exit"};
        DoctorManagement manage = new DoctorManagement(title, s);
        manage.run();
    }
}
