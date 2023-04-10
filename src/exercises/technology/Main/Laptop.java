package exercises.technology.Main;

import exercises.technology.Main.Computer;

public class Laptop extends Computer {
    private boolean isIntelliJOpen;
    public Laptop(int screenHeight, int screenWidth, String manufactureYear) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpen = false;
    }
    public Laptop(int screenHeight, int screenWidth, String manufactureYear, boolean isIntelliJOpen) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpen = isIntelliJOpen;
    }
    //methods


    public void setIntelliJOpen(boolean intelliJOpen) {isIntelliJOpen = intelliJOpen;} {this.isIntelliJOpen =isIntelliJOpen;}

    public boolean getIsIntelliJOpen() {
        return isIntelliJOpen;
    }

    public void openIntelliJ() {
        this.isIntelliJOpen = true;
        System.out.println("IntelliJ is now open!");
    }
}
