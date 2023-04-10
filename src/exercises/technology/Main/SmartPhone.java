package exercises.technology.Main;

import exercises.technology.Main.Computer;

public class SmartPhone extends Computer {
    private boolean isConnectedTo5G;
    public SmartPhone(int screenHeight, int screenWidth, String manufactureYear, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufactureYear);

    }
    //method

    public boolean getIsConnectedTo5G(){return this.isConnectedTo5G;}
    public void makePhoneCall(String number) {
        System.out.println("Calling: " + number);
    }
}
