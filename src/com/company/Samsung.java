package com.company;

import java.util.Scanner;

class Samsung extends Cellphone {
    private String irisScanner;
    private String fingerPrintPosition;
    private String fingerprintSensor;
    private String simSlot;
    private Scanner scan = new Scanner(System.in);

    public Samsung() {
        this.plateform = "android 1.5";
        this.display = "5.8 cm";
        this.storage = "64 GB";
        this.battery = "3000 MAH";
        this.camera = "12 mp";
        this.performance = "medium";
        this.model = "Samsung galaxy j7";
        this.irisScanner = "yes";
        this.fingerPrintPosition = "rear";
        this.fingerprintSensor = "yes";
        this.simSlot = "dual sim";
    }

    public void samsungPay() {
        System.out.println("Enter the amount u want to pay : ");
        int amount = scan.nextInt();
        delay.doDelay(1000);
        System.out.println(amount + " is deducted from your account .");
    }

    public void samsungGalary() {
        System.out.println("Viewing photos...wait");
        delay.doDelay(1000);
        System.out.println("Photos viewed.");
    }

    public void displaySamsung() {
        System.out.println("Samsung have follwing properties : ");
        displayCellphone();
        System.out.println("IrisScanner = " + this.irisScanner +
                "\nFingerPrintPosition = " + this.fingerPrintPosition +
                "\nFingerprintSensor = " + this.fingerprintSensor +
                "\nSimSlot = " + this.simSlot);
    }

}



