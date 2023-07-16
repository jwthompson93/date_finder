/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thompson.james.datetest.structs;

/**
 *
 * @author James Thompson
 */
public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    
    private final Integer monthLength;
    
    Month(Integer monthLength)
    {
        this.monthLength = monthLength;
    }
    
    public Integer getMonthLength(Boolean isLeapYear)
    {
        if(isLeapYear && this == Month.FEBRUARY) {
            return (monthLength + 1);
        }
        
        return monthLength;
    }
}