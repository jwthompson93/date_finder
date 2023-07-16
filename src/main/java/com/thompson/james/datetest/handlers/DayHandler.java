/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thompson.james.datetest.handlers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author James Thompson
 */
public class DayHandler {
    public final List<String> days;
    
    public DayHandler() {
        days = new ArrayList<>(Arrays.asList(
            new String[]{"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", 
                "FRIDAY", "SATURDAY", "SUNDAY"}));
    }
    
    public String addDays(String currentDay, Integer numberOfAddedDays) {
        Integer startDayNumber = getDayNumber(currentDay);
        
        Integer remainderDays = numberOfAddedDays % days.size();
        
        Integer finalDayNumber = startDayNumber + remainderDays;
        
        if(finalDayNumber >= days.size()) 
        {
            finalDayNumber = finalDayNumber - days.size();
        }
        
        return days.get(finalDayNumber);
    }
    
    public Integer getDayNumber(String day) {
        return days.indexOf(day);
    }
}
