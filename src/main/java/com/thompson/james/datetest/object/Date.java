/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thompson.james.datetest.object;

import com.thompson.james.datetest.structs.Month;

/**
 *
 * @author James Thompson
 */
public class Date {
    
    private String day;
    private Integer dayOfMonth;
    private Month month;
    private Integer year;
    
    public Date() {
        this.day = "MONDAY";
        this.dayOfMonth = 1;
        this.month = Month.JANUARY;
        this.year = 1900;
    }
    
    public Date(String day, Integer dayNumber, Month month, Integer year) {
        this.day = day;
        this.dayOfMonth = dayNumber;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    
    
}
