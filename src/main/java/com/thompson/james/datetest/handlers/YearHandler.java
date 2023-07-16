/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thompson.james.datetest.handlers;

/**
 *
 * @author James Thompson
 */
public class YearHandler {
    private Integer year;
    private Boolean isLeapYear;
    
    public YearHandler(Integer year) {
        this.year = year;
        yearChange();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
        this.yearChange();
    }

    public Boolean getIsLeapYear() {
        return isLeapYear;
    }
    
    // Handles any changes for the year
    private void yearChange() {
        this.isLeapYear = this.isLeapYear();
    }
    
    private Boolean isLeapYear() {
        // Checks if year is divisible by 4
        if(year % 4 == 0) {
            // Checks if either the year is a century or is divisible by 400
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        
        return false;
    }
}
