package exercises.technology.Main;

public class Program {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(1500, 500, "2021", true);
        mySmartPhone.makePhoneCall("314-555-0123");
       int result = mySmartPhone.processTwoPlusTwo();
        System.out.println("The result is: " + result);
        System.out.println(mySmartPhone.getId());

        Laptop myLaptop = new Laptop(2500, 1500, "2021");
        System.out.println(myLaptop.getId());
        myLaptop.openIntelliJ();
       int result2 = myLaptop.processTwoPlusTwo();
        System.out.println("The result is: " + result2);
        Computer myComputer = new Computer(3000, 3000, "2021");
        System.out.println(myComputer.getId());
        int result3 = myComputer.processTwoPlusTwo();
        System.out.println("The result is: " + result3);
        myComputer.tellMeAJoke();
    }
}
