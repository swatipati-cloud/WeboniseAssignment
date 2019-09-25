package com.company;

import java.util.Scanner;

//Parent of all cellphones with common features and properties.
class Cellphone {
    protected String plateform;
    protected String display;
    protected String storage;
    protected String battery;
    protected String camera;
    protected String performance;
    protected String model;
    private Scanner scan = new Scanner(System.in);
    protected DelayProvision delay = new DelayProvision();

    public void doSms() {
        System.out.println("Enter your sms : ");
        String sms = scan.nextLine();
        System.out.println("Sending your sms...");
        delay.doDelay(2000);
        System.out.println("sms sent.");
    }

    public void doMms() {
        System.out.println("browse the multimedia : ");
        String mms = scan.nextLine();
        System.out.println("Sending your mms...");
        delay.doDelay(2000);
        System.out.println("mms sent.");
    }

    public void doCall() {
        System.out.println("Enter number you want to call : ");
        String sms = scan.nextLine();
        System.out.println("Calling...");
        delay.doDelay(2000);
        System.out.println("call connected..");
        delay.doDelay(500);
        System.out.println("Please speak..");
        delay.doDelay(2000);
        System.out.println("call disconnected..");
    }

    public void displayCellphone() {
        System.out.println("Plateform = " + this.plateform +
                "\nDisplay = " + this.display +
                "\nStorage = " + this.storage +
                "\nBattery = " + this.battery +
                "\nCamera = " + this.camera +
                "\nPerformance = " + this.performance +
                "\nModel = " + this.model);
    }
}
