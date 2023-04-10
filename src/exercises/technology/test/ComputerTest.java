package exercises.technology.test;


import exercises.technology.Main.Computer;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class ComputerTest {
Computer myComputer;
    @Before
    public void beforeTests() {
        myComputer = new Computer(3000, 5000, "2021");
    }



    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, myComputer.getScreenWidth());
        assertEquals(5000, myComputer.getScreenHeight());
        assertEquals("2021", myComputer.getManufactureYear());
    }
    @Test
    public void twoPlusTwoReturnsFour() {
        int result = myComputer.processTwoPlusTwo();
        assertEquals(4, result);

    }
}
