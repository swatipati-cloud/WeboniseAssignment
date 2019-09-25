package com.company;

import java.util.Scanner;

//Contains the methods which will call respctive cellphones methods after selection of cellphone
class CellphoneChoice {
    private Scanner scan = new Scanner(System.in);
    private DelayProvision delay = new DelayProvision();

    //To call the functionality of samsung's cellphone after operation selection
    public void samsungInfo() {
        char ch = 'y';
        //For the repetitive selections of samsung's operation.
        do {
            System.out.println("Samsung features : ");
            delay.doDelay(500);
            System.out.println("1.Call\n2.SMS\n3.MMS\n4.Samsung Pay\n5.Samsung galary\n6.Display Samsung features.");
            System.out.print("choose the operation you want to do : ");
            int opn = scan.nextInt();
            delay.doDelay(500);
            Samsung samsung = new Samsung();
            switch (opn) {
                case 1:
                    samsung.doCall();
                    break;
                case 2:
                    samsung.doSms();
                    break;
                case 3:
                    samsung.doMms();
                    break;
                case 4:
                    samsung.samsungPay();
                    break;
                case 5:
                    samsung.samsungGalary();
                    break;
                case 6:
                    samsung.displaySamsung();
                    break;
                default:
                    System.out.println("Operation not available .");
            }
            delay.doDelay(500);
            System.out.println("Do you want to use another operation of samsung : (y/n) ");
            ch = scan.next().charAt(0);
        }
        while (ch == 'y');
    }

    //To call the functionality of oppo's cellphone after operation selection
    public void oppoInfo() {
        char ch = 'y';
        //For the repetitive selections of oppo's operation.
        do {
            System.out.println("Oppo features :- ");
            delay.doDelay(500);
            System.out.println("1.Call\n2.SMS\n3.MMS\n4.Face Unlock\n5.GPS Track\n6.FM Radio\n7.Display Oppo features.");
            System.out.print("choose the operation you want to do : ");
            int opn = scan.nextInt();
            delay.doDelay(500);
            Oppo oppo = new Oppo();
            switch (opn) {
                case 1:
                    oppo.doCall();
                    break;
                case 2:
                    oppo.doSms();
                    break;
                case 3:
                    oppo.doMms();
                    break;
                case 4:
                    oppo.faceUnlock();
                    break;
                case 5:
                    oppo.GPSTrack();
                    break;
                case 6:
                    oppo.FMRadio();
                    break;
                case 7:
                    oppo.displayOppo();
                    break;
                default:
                    System.out.println("Operation not available .");
            }
            delay.doDelay(500);
            System.out.println("Do you want to use another operation of oppo : (y/n) ");
            ch = scan.next().charAt(0);
        }
        while (ch == 'y');
    }

    //To call the functionality of mi's cellphone after operation selection
    public void miInfo() {
        char ch = 'y';
        //For the repetitive selections of mi's operation.
        do {
            System.out.println("Mi features :- ");
            delay.doDelay(500);
            System.out.println("1.Call\n2.SMS\n3.MMS\n4.Face Recognation\n5.Display MI features.");
            System.out.print("choose the operation you want to do : ");
            int opn = scan.nextInt();
            delay.doDelay(500);
            Mi mi = new Mi();
            switch (opn) {
                case 1:
                    mi.doCall();
                    break;
                case 2:
                    mi.doSms();
                    break;
                case 3:
                    mi.doMms();
                    break;
                case 4:
                    mi.faceRecognation();
                    break;
                case 5:
                    mi.displayMi();
                    break;
                default:
                    System.out.println("Operation not available .");
            }
            delay.doDelay(500);
            System.out.println("Do you want to use another operation of MI : (y/n) ");
            ch = scan.next().charAt(0);
        }
        while (ch == 'y');
    }
}

