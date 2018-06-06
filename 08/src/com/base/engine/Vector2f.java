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
    
    
    // Define a function to get the entire vector in a new vector2f instance
    public Vector2f GetVector2f() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	vec2f_self (implicit) :
	    The self vector, returned in new instance
	*/
	
	return new Vector2f(this.x, this.y);
    
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
    
    
    // Define a function to get length of a vector
    public float GetLength() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	f_length (implicit) :
	    The length of the vector
	*/
	
	return (float)Math.sqrt(this.x*this.x + this.y*this.y);
    
    }
    
    
    // Define a function to get the dot product of a vector
    public float GetDotProduct(Vector2f v) {
    
	/*
	inputs--
	
	v :
	    A vetor instance of the class Vector2f
	*/
	
	/*
	outputs--
	
	f_dot :
	    The dot product of this and v
	*/
    
	return v.GetX()*this.x + v.GetY()*this.y;
	
    }
    
    
    // Define a function to get the normalized vector
    public void Normalize() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	float f_len = GetLength();
	
	this.x /= f_len;
	this.y /= f_len;
    
    }
    
    
    // Define a function to rotate the vector through an angle
    public void Rotate(float f_theta) {
    
	/*
	inputs--
	
	f_theta :
	    The angle of rotation
	*/
    
	/*
	outputs--
	*/
	
	float f_rad = (float)Math.toRadians(f_theta);
	double f_cos = Math.cos(f_rad);
	double f_sin = Math.sin(f_rad);
	
	float x_ = (float)(f_cos*this.x - f_sin*this.y);
	float y_ = (float)(f_sin*this.x + f_cos*this.y);
	
	this.x = x_;
	this.y = y_;
	
    }
    
    
    // Define a function to get rotated vector through an angle
    public Vector2f GetRotatedVector(float f_theta) {
    
	/*
	inputs--
	
	f_theta :
	    The angle of rotation
	*/
    
	/*
	outputs--
	
	vec2f_rotated :
	    Rotated vector, a Vector2f instance
	*/
	
	// Get the angle in rad
	float f_rad = (float)Math.toRadians(f_theta);
	double f_cos = Math.cos(f_rad);
	double f_sin = Math.sin(f_rad);
	
	// Get the rotated vector through the standard formula of rotation
	return new Vector2f((float)(f_cos*this.x - f_sin*this.y), (float)(f_sin*this.x + f_cos*this.y));
	
    }
    
    
    // Define a function to get the added vector
    public Vector2f GetAddedVector(Vector2f vec2f_v) {
    
	/*
	inputs--
	
	vec2f_v :   
	    An instance of Vector2f, to be added to this
	*/
	
	/*
	outputs--
	
	vec2f_add (implicit) :
	    Added vector
	*/
	
	return new Vector2f(vec2f_v.GetX() + this.x, vec2f_v.GetY() + this.y);
    
    }
    
    
    // Define a function to get the added vector
    public Vector2f GetAddedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should be added to both components
	*/
	
	/*
	outputs--
	
	vec2f_add (implicit) :
	    Added vector
	*/
	
	return new Vector2f(f_v + this.x, f_v + this.y);
    
    }
    
    
    // Define a function to get the subtracted vector
    public Vector2f GetSubtractedVector(Vector2f vec2f_v) {
    
	/*
	inputs--
	
	vec2f_v :   
	    An instance of Vector2f, to be subtracted from this
	*/
	
	/*
	outputs--
	
	vec2f_sub (implicit) :
	    Subtracted vector
	*/
	
	return new Vector2f(this.x - vec2f_v.GetX(), this.y - vec2f_v.GetY());
    
    }
    
    
    // Define a function to get the subtracted vector
    public Vector2f GetSubtractedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should be subtracted from both components
	*/
	
	/*
	outputs--
	
	vec2f_sub (implicit) :
	    Subtracted vector
	*/
	
	return new Vector2f(this.x - f_v, this.y - f_v);
    
    }
    
    
    // Define a function to get the multiplied vector
    public Vector2f GetMultipliedVector(Vector2f vec2f_v) {
    
	/*
	inputs--
	
	vec2f_v :   
	    An instance of Vector2f, to be multiplied to this
	*/
	
	/*
	outputs--
	
	vec2f_mul (implicit) :
	    Multiplied vector
	*/
	
	return new Vector2f(this.x * vec2f_v.GetX(), this.y * vec2f_v.GetY());
    
    }
    
    
    // Define a function to get the multiplied vector
    public Vector2f GetMultipliedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should be multiplied to both components
	*/
	
	/*
	outputs--
	
	vec2f_mul (implicit) :
	    Multiplied vector
	*/
	
	return new Vector2f(this.x * f_v, this.y * f_v);
    
    }
    
    
    // Define a function to get the divided vector
    public Vector2f GetDividedVector(Vector2f vec2f_v) {
    
	/*
	inputs--
	
	vec2f_v :   
	    An instance of Vector2f, to divide this
	*/
	
	/*
	outputs--
	
	vec2f_div (implicit) :
	    Divided vector
	*/
	
	return new Vector2f(this.x / vec2f_v.GetX(), this.y / vec2f_v.GetY());
    
    }
    
    
    // Define a function to get the divided vector
    public Vector2f GetDividedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should divide both components
	*/
	
	/*
	outputs--
	
	vec2f_div (implicit) :
	    Divided vector
	*/
	
	return new Vector2f(this.x / f_v, this.y / f_v);
    
    }
    
}
