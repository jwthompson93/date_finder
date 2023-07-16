/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thompson.james.datetest.handlers;

import com.thompson.james.datetest.structs.Month;

/**
 *
 * @author James Thompson
 */
public class MonthHandler {
    public Month incrementMonth(Month currentMonth) throws Exception{
        switch(currentMonth) {
            case JANUARY -> {
                return Month.FEBRUARY;
            }
            case FEBRUARY -> {
                return Month.MARCH;
            }
            case MARCH -> {
                return Month.APRIL;
            }
            case APRIL -> {
                return Month.MAY;
            }
            case MAY -> {
                return Month.JUNE;
            }
            case JUNE -> {
                return Month.JULY;
            }
            case JULY -> {
                return Month.AUGUST;
            }
            case AUGUST -> {
                return Month.SEPTEMBER;
            }
            case SEPTEMBER -> {
                return Month.OCTOBER;
            }
            case OCTOBER -> {
                return Month.NOVEMBER;
            }
            case NOVEMBER -> {
                return Month.DECEMBER;
            }
            case DECEMBER -> {
                return Month.JANUARY;
            }
            default -> {
                throw new Exception("Month not found: " + currentMonth);
            }
        }
    }
}
