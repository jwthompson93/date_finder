/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thompson.james.datetest;

import com.thompson.james.datetest.object.DateFinder;
import com.thompson.james.datetest.structs.Month;
import java.util.List;

/**
 *
 * @author James Thompson
 */
public class Main {
    public static void main(String[] args) {
        DateFinder dateFinder = new DateFinder();
        List<String> sundayFirstDates =  dateFinder.findSpecificDayOnDayInMonth("SUNDAY", 1, Month.DECEMBER, 2000);
        
        for(String dates : sundayFirstDates)
        {
            System.out.println(dates);
        }
    }
}
