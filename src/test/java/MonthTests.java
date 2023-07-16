/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.thompson.james.datetest.handlers.MonthHandler;
import com.thompson.james.datetest.structs.Month;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author James Thompson
 */
public class MonthTests {
    private MonthHandler monthHandler;
    
    public MonthTests() {
        monthHandler = new MonthHandler();
    }

    @Test
    public void testIncrementMonth() throws Exception {
        Month newMonth = this.monthHandler.incrementMonth(Month.MARCH);
        assertEquals(Month.APRIL, newMonth, "Increment Months from MARCH");
        
        Month newMonth2 = this.monthHandler.incrementMonth(Month.DECEMBER);
        assertEquals(Month.JANUARY, newMonth2, "Increment Months from DECEMBER");
    }
    

    @Test
    public void testGetMonthLength() throws Exception {
        Integer monthLengthMarch = Month.MARCH.getMonthLength(false);
        assertEquals(31, monthLengthMarch, "Get Month Length MARCH");
        
        Integer monthLengthFeb = Month.FEBRUARY.getMonthLength(false);
        assertEquals(28, monthLengthFeb, "Get Month Length FEBRUARY non-leap");
        
        Integer monthLengthFebLeap = Month.FEBRUARY.getMonthLength(true);
        assertEquals(29, monthLengthFebLeap, "Get Month Length FEBRUARY non-leap");
    }
    
}
