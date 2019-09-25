package com.company;

import java.util.Scanner;

public class CellphoneApp {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        DelayProvision delay = new DelayProvision();
        CellphoneChoice cellphone = new CellphoneChoice();
        char c = 'y';
        //For the repetitive selections of cellphone.
        do {
            System.out.println("Following are available cellphones : ");
            System.out.println("1.Samsung\n2.Oppo\n3.MI");
            System.out.print("Enter your choice : ");
            int choice = scan.nextInt();
            delay.doDelay(100);
            char ch = 'y';
            switch (choice) {
                case 1:
                    cellphone.samsungInfo();
                    break;

                case 2:
                    cellphone.oppoInfo();
                    break;

                case 3:
                    cellphone.miInfo();
                    break;

                default:
                    System.out.println("Cellphone not available .");

            }
            System.out.println("Do you want try other cellphones (y/n): ");
            c = scan.next().charAt(0);
        }
        while (c == 'y');
    }
}
