
import com.thompson.james.datetest.handlers.YearHandler;
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
public class YearTests {
    private YearHandler yearHandler;
    
    public YearTests() {
        this.yearHandler = new YearHandler(1900);
    }
    
    @Test
    public void testIsLeapYear() throws Exception {
        yearHandler.setYear(1900);
        Boolean ninteenHundredLeapCheck = yearHandler.getIsLeapYear();
        assertEquals(false, ninteenHundredLeapCheck, "Is leap year 1900");
        
        yearHandler.setYear(1901);
        Boolean ninteenHundredOneLeapCheck = yearHandler.getIsLeapYear();
        assertEquals(false, ninteenHundredOneLeapCheck, "Is leap year 1901");
        
        yearHandler.setYear(2000);
        Boolean twoThousandLeapCheck = yearHandler.getIsLeapYear();
        assertEquals(true, twoThousandLeapCheck, "Is leap year 2000");
        
        yearHandler.setYear(1904);
        Boolean ninteenHundredAndFourLeapCheck = yearHandler.getIsLeapYear();
        assertEquals(true, ninteenHundredAndFourLeapCheck, "Is leap year 1904");
    }
}
