package com.company;

import java.util.Scanner;

class Oppo extends Cellphone {
    private String headphoneJackType;
    private String connectivity;
    private Scanner scan = new Scanner(System.in);

    public Oppo() {
        this.model = "Oppo F3";
        this.plateform = "android 1.7";
        this.display = "6.8 cm";
        this.storage = "32 GB";
        this.battery = "3000 MAH";
        this.camera = "14 mp";
        this.performance = "medium";
        this.headphoneJackType = "3.5 mm";
        this.connectivity = "3G";

    }

    public void faceUnlock() {
        System.out.println("Unlocking face plz wait..");
        delay.doDelay(1000);
        System.out.println("Done.");

    }

    public void GPSTrack() {
        System.out.println("Plz turn on your location.");
        delay.doDelay(1000);
        System.out.println("Enter the destination : ");
        String destination = scan.nextLine();
        delay.doDelay(1000);
        System.out.println("Route selected ...\nyour location ----------------- " + destination);
    }

    public void FMRadio() {
        System.out.println("Fm started..");
    }

    public void displayOppo() {
        System.out.println(this.model + " have follwing properties : ");
        displayCellphone();
        System.out.println("HeadphoneJackType = " + this.headphoneJackType +
                "\nConnectivity = " + this.connectivity);
    }
}
