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


// Define a class of 2D vectors
public class Vector2f {

    
    // Define attributes
    private float x;
    private float y;
    
    
    // Define the constructor
    public Vector2f(float x, float y) {
	
	/*
	inputs--
	
	x :
	    The x coordinate of the vector
	y :
	    The y coordinate of the vecotr
	*/
	
	// Set coordinates
	this.x = x;
	this.y = y;
	
    }
    
    
    // Define a function to get the x
    public float GetX() {
    
	/*
	inputs--
	*/	
	
	/*
	outputs--
	
	x :
	    The x coordinate of vector
	*/
	
	return this.x;	
    
    }
    
    
    // Define a function to get the y
    public float GetY() {
    
	/*
	inputs--
	*/	
	
	/*
	outputs--
	
	y :
	    The y coordinate of vector
	*/
	
	return this.y;	
    
    }
    
    
    // Define a function to set the x
    public void SetX(float x) {
    
	/*
	inputs--
		
	x :
	    The x coordinate of vector
	*/	
	
	/*
	outputs--
	*/
	
	this.x = x;	
    
    }
    
    // Define a function to set the y
    public void SetY(float y) {
    
	/*
	inputs--
		
	y :
	    The y coordinate of vector
	*/	
	
	/*
	outputs--
	*/
	
	this.y = y;	
    
    }
    
    
    // Define a function to convert a Vector2f instance into string
    public String ToString() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	st_ :
	    The string version of Vector2f instance for printing
	*/
	
	String st_ = "( ";
	st_ += Float.toString(this.x);
	st_ += " , ";
	st_ += Float.toString(this.y);
	st_ += " )";
	return st_;
	
    }
    
}
