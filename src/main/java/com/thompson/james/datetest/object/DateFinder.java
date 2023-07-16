/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thompson.james.datetest.object;

import com.thompson.james.datetest.handlers.DayHandler;
import com.thompson.james.datetest.handlers.MonthHandler;
import com.thompson.james.datetest.handlers.YearHandler;
import com.thompson.james.datetest.structs.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author James Thompson
 */
public class DateFinder {
    
    private Date date;
    
    private DayHandler dayHandler;
    private MonthHandler monthHandler;
    private YearHandler yearHandler;
    
    public DateFinder() {
        date = new Date();
        
        this.dayHandler = new DayHandler();
        this.monthHandler = new MonthHandler();
        this.yearHandler = new YearHandler(1900);
    }
    
    public DateFinder(String day, Integer dayNumber, Month month, Integer year) {
        date = new Date(day, dayNumber, month, year);
        
        this.dayHandler = new DayHandler();
        this.monthHandler = new MonthHandler();
        this.yearHandler = new YearHandler(year);
    }
    
    public List<String> findSpecificDayOnDayInMonth(String day, Integer dayOfMonth, Month finalMonth, Integer finalYear) {
        List<String> foundDates = new ArrayList();
        
        while((!Objects.equals(date.getYear(), finalYear)))
        {
            try {
                
                if(date.getDay().equals(day) && Objects.equals(date.getDayOfMonth(), dayOfMonth)) {
                    foundDates.add(printCurrentDate());
                }
                
                IncrementDateByMonth();
            }
            catch (Exception exception) {
                System.out.println(exception.getLocalizedMessage());
            }
        }
        
        return foundDates;
    }
    
    public void IncrementDateByMonth() throws Exception {
        date.setDay(dayHandler.addDays(date.getDay(), date.getMonth().getMonthLength(this.yearHandler.getIsLeapYear())));
        date.setMonth(monthHandler.incrementMonth(date.getMonth()));
        if(date.getMonth() == Month.JANUARY) {
            date.setYear(date.getYear() + 1);
            yearHandler.setYear(date.getYear());
        }
    }
    
    private void getOffsetDate()
    {
        // Sets the date to another date at the start of the date finder function
    }
    
    public String printCurrentDate() {
        return "%s %d %s %d".formatted(date.getDay(), date.getDayOfMonth(), date.getMonth(), yearHandler.getYear());
    }
}
