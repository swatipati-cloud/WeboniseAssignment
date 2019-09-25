package com.company;

class DelayProvision {
    //To provide the delay or interval for the user convinence.
    public void doDelay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
