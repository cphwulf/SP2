package sp1;

import java.util.Scanner;

public class MainController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);

    public void runProgram() {
        while(choice != 9) {
            printMainMenu();
            System.out.println("Indtast dit valg:");
            switch (choice) {
                case 1: orderCar();
                case 2: System.out.println("Exiting ..");choice=9;break;
            }
        }
    }

    public void orderCar() {
        int carChoice = 0;
        while(choice!= 9) {
            printCarOrderMenu();
            System.out.println("Indtast dit valg:");
            switch (choice) {
                case 1: String b
                case 2: System.out.println("Exiting ..");choice=9;break;
        }
    }

    public void printMainMenu() {
        System.out.println("1: find bil");
        System.out.println("2: exit");
    }

    public void printCarOrderMenu() {
        System.out.println("1: Vælg mærke");
        System.out.println("2: Antal personer");
        System.out.println("3: Antal dage");
        System.out.println("9: tilbage ");
    }
}
