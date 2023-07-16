
import com.thompson.james.datetest.handlers.DayHandler;
import com.thompson.james.datetest.handlers.MonthHandler;
import com.thompson.james.datetest.structs.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James Thompson
 */
public class DayTests {
    private DayHandler dayHandler;
    
    public DayTests() {
        dayHandler = new DayHandler();
    }

    @Test
    public void testGetDayNumber() throws Exception {
        Integer dayNumberMonday = dayHandler.getDayNumber("MONDAY");
        assertEquals(0, dayNumberMonday, "Get day number MONDAY");
        
        Integer dayNumberSunday = dayHandler.getDayNumber("SUNDAY");
        assertEquals(6, dayNumberSunday, "Get day number MONDAY");
        
        Integer dayNumberThursday = dayHandler.getDayNumber("THURSDAY");
        assertEquals(3, dayNumberThursday, "Get day number THURSDAY");
    }
    

    @Test
    public void testAddDays() throws Exception {
        String dayAddFourMonday = dayHandler.addDays("MONDAY", 4);
        assertEquals("FRIDAY", dayAddFourMonday, "Add Days Four days from Monday");
        System.out.println(dayAddFourMonday);
        
        String dayAddSevenMonday = dayHandler.addDays("MONDAY", 7);
        assertEquals("MONDAY", dayAddSevenMonday, "Add Days Seven days from Monday");
        System.out.println(dayAddSevenMonday);
        
        String dayAddFourFriday = dayHandler.addDays("FRIDAY", 4);
        assertEquals("TUESDAY", dayAddFourFriday, "Add Days Four days from Friday");
        System.out.println(dayAddFourFriday);
        
        String dayAddLargeNumber = dayHandler.addDays("WEDNESDAY", 35);
        assertEquals("WEDNESDAY", dayAddLargeNumber, "Add 35 Days from Wednesday");
        System.out.println(dayAddLargeNumber);
    }
}
