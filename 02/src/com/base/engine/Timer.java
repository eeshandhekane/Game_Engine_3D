/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

/**
 *
 * @author eeshan
 */
public class Timer {
    
    
    // Define attributes
    public static final long SECOND = 1000000000L; // Time is in nano seconds
    private static double d_delta; // Double to keep track of time lag
    
    
    // Define a function to get the time now
    public static long GetTime() {
	
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	l_time (implicit) :
	    The long representing the time
	*/
    
	return System.nanoTime();
    
    }
    
    
    // Define a function to get the delta value
    public static double GetDelta() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	d_delta :
	    The time difference, which is requested
	*/
	
	return d_delta;
	
    }
    
    
    // Define a function to set the delta value
    public static void SetDelta(double d_delta) {
    
	/*
	inputs--
	
	d_delta :
	    The double representing the new delta value
	*/
	
	Timer.d_delta = d_delta; // Note that the static variables can be accessed using the class name inside the class functions
    
    }
    
}
