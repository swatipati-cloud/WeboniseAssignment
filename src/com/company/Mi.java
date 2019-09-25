package com.company;

class Mi extends Cellphone {
    private String selfieCamera;

    public Mi() {
        this.model = "MI note 5 pro";
        this.plateform = "android 1.8";
        this.display = "6.8 cm";
        this.storage = "32 GB";
        this.battery = "4000 MAH";
        this.camera = "14 mp";
        this.performance = "High";
        this.selfieCamera = "yes";
    }

    public void faceRecognation() {
        System.out.println("capturing your face : ");
        delay.doDelay(1000);
        System.out.println("Face recognised.");
    }

    public void displayMi() {
        System.out.println(this.model + " have follwing properties : ");
        displayCellphone();
        System.out.println("SelfieCamera = " + this.selfieCamera);
    }
}
