package exercises.technology.test;

import exercises.technology.Main.Computer;
import exercises.technology.Main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop  myLaptop;
    @Before
    public void beforeTests() {
        myLaptop = new Laptop(5000, 3000, "2021", true);
    }



    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, myLaptop.getScreenWidth());
        assertEquals(5000, myLaptop.getScreenHeight());
        assertEquals("2021", myLaptop.getManufactureYear());
        assertEquals(true, this.myLaptop.getIsIntelliJOpen());
    }
    @Test
    public void twoPlusTwoReturnsFour() {
        int result = myLaptop.processTwoPlusTwo();
        assertEquals(4, result);

    }
    @Test
    public void openIntelliJSetIsIntelliJOpenedToTrue() {
        this.myLaptop.setIntelliJOpen(false);
        assertEquals(false, this.myLaptop.getIsIntelliJOpen());
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.myLaptop.getIsIntelliJOpen());
    }
}

