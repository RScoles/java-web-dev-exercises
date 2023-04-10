package exercises.technology.Main;

public class Computer extends AbstractEntity {
    //parent class add 3 properties, 2 methods, and a constructor.
    private int screenWidth;
    private int screenHeight;
    private String manufactureYear;
    //constructor
    public Computer(int screenWidth, int screenHeight, String manufactureYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;
    }
    //methods


    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public int processTwoPlusTwo() {
        return 2 + 2;
    }
    public void tellMeAJoke() {
        System.out.println("Why did the computer show up at work late? It had a hard drive!");
    }
}
