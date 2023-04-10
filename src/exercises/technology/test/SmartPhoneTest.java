package exercises.technology.test;

import exercises.technology.Main.Laptop;
import exercises.technology.Main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone mySmartPhone;
    @Before
    public void beforeTests() {
        mySmartPhone = new SmartPhone(5000, 3000, "2021", true);
    }



    @Test
    public void constructorSetsValuesTest() {
        assertEquals(3000, mySmartPhone.getScreenWidth());
        assertEquals(5000, mySmartPhone.getScreenHeight());
        assertEquals("2021", mySmartPhone.getManufactureYear());
        assertEquals(true, this.mySmartPhone.getIsConnectedTo5G());
    }
    @Test
    public void twoPlusTwoReturnsFour() {
        int result = mySmartPhone.processTwoPlusTwo();
        assertEquals(4, result);

    }
}
