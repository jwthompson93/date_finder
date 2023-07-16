/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.thompson.james.datetest.object.DateFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author James Thompson
 */
public class DateFinderTests {
    
    private DateFinder dateFinder;
    
    public DateFinderTests() {
        dateFinder = new DateFinder();
    }
    
    @Test
    public void testPrintDate() throws Exception {
        System.out.println(dateFinder.printCurrentDate());
    }
}
