package case_Study.controler;

import java.util.Scanner;

public class FuramaControler {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 2: {
                    customerManagement();
                    break;
                }
                case 3: {
                    facilityManagement();
                    break;
                }
                case 4: {
                    bookingManagerment();
                }
                case 5: {
                    promotionManagement();
                }
            }
        }
    }
    public static void displayEmployeeMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
    public static void customerManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
    public static void facilityManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
    public static void bookingManagerment() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list constracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
    public static void promotionManagement() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customes use service");
            System.out.println("2. Display list customes get voucher");
            System.out.println("3. Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1: {

                }
            }
        }
    }
}
