/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.business.Course;

import java.util.ArrayList;

/**
 *
 * @author leslie
 */
public class Seat {
    
    private int seatNumber;
    private static int count =0;
    
    public Seat() {
        count++;
        seatNumber = count;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Seat.count = count;
    }
    
}
