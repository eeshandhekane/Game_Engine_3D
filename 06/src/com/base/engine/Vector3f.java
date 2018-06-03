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


public class Vector3f {

    
    // Define attributes
    private float x;
    private float y;
    private float z;
    
    
    // Define a constructor
    public Vector3f(float x, float y, float z) {
    
	/*
	inputs--
	
	x :
	    The x component
	y :
	    The y component
	z :
	    The z component
	*/
	
	/*
	outputs--
	*/
	
	this.x = x;
	this.y = y;
	this.z = z;
    
    }
    
    
    // Define a function get length
    public float GetLength() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	f_len (implicit) :
	    The length of the vector
	*/
	
	return (float)(Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z));
    
    }
    
    
    // Define a function to normalize the vector
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
	this.z /= f_len;
    
    }
    
    
    // Define a function to compute dot product
    public float GetDotProduct(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :   
	    A new instance of Vector3f
	*/
	
	/*
	outputs--
	
	f_dot :
	    The dot product of the input vector and this
	*/
	
	return vec3f_v.GetX()*this.x + vec3f_v.GetY()*this.y + vec3f_v.GetZ()*this.z;
    
    }
    
    
    // Define a function to get x
    public float GetX() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	x :
	    The x coordinate of this
	*/
	
	return this.x;
    
    }
    
    
    // Define a function to get y
    public float GetY() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	y :
	    The y coordinate of this
	*/
	
	return this.y;
    
    }
    
    
    // Define a function to get z
    public float GetZ() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	z :
	    The z coordinate of this
	*/
	
	return this.z;
    
    }
    
    
    // Define a function to set x
    public void SetX(float x) {
    
	/*
	inputs--
	
	x :
	    The x coordinate for this
	*/
	
	/*
	outputs--
	*/
	
	this.x = x;
    
    }
    
    
    // Define a function to set y
    public void SetY(float y) {
    
	/*
	inputs--
	
	y :
	    The y coordinate for this
	*/
	
	/*
	outputs--
	*/
	
	this.y = y;
    
    }
    
    
    // Define a function to set z
    public void SetZ(float z) {
    
	/*
	inputs--
	
	z :
	    The z coordinate for this
	*/
	
	/*
	outputs--
	*/
	
	this.z = z;
    
    }
    
    
    // Define a function to get the added vector
    public Vector3f GetAddedVector(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :   
	    An instance of Vector3f, to be added to this
	*/
	
	/*
	outputs--
	
	vec3f_add (implicit) :
	    Added vector
	*/
	
	return new Vector3f(vec3f_v.GetX() + this.x, vec3f_v.GetY() + this.y, vec3f_v.GetZ() + this.z);
    
    }
    
    
    // Define a function to get the added vector
    public Vector3f GetAddedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should be added to all components
	*/
	
	/*
	outputs--
	
	vec3f_add (implicit) :
	    Added vector
	*/
	
	return new Vector3f(f_v + this.x, f_v + this.y, f_v + this.z);
    
    }
    
    
    // Define a function to get the subtracted vector
    public Vector3f GetSubtractedVector(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :   
	    An instance of Vector3f, to be subtracted from this
	*/
	
	/*
	outputs--
	
	vec3f_sub (implicit) :
	    Subtracted vector
	*/
	
	return new Vector3f(this.x - vec3f_v.GetX(), this.y - vec3f_v.GetY(), this.z - vec3f_v.GetZ());
    
    }
    
    
    // Define a function to get the subtracted vector
    public Vector3f GetSubtractedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should be subtracted from both components
	*/
	
	/*
	outputs--
	
	vec3f_sub (implicit) :
	    Subtracted vector
	*/
	
	return new Vector3f(this.x - f_v, this.y - f_v, this.z - f_v);
    
    }
    
    
    // Define a function to get the multiplied vector
    public Vector3f GetMultipliedVector(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :   
	    An instance of Vector2f, to be multiplied to this
	*/
	
	/*
	outputs--
	
	vec3f_mul (implicit) :
	    Multiplied vector
	*/
	
	return new Vector3f(this.x * vec3f_v.GetX(), this.y * vec3f_v.GetY(), this.z*vec3f_v.GetZ());
    
    }
    
    
    // Define a function to get the multiplied vector
    public Vector3f GetMultipliedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should be multiplied to both components
	*/
	
	/*
	outputs--
	
	vec3f_mul (implicit) :
	    Multiplied vector
	*/
	
	return new Vector3f(this.x * f_v, this.y * f_v, this.z * f_v);
    
    }
    
    
    // Define a function to get the divided vector
    public Vector3f GetDividedVector(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :   
	    An instance of Vector2f, to divide this
	*/
	
	/*
	outputs--
	
	vec3f_div (implicit) :
	    Divided vector
	*/
	
	return new Vector3f(this.x / vec3f_v.GetX(), this.y / vec3f_v.GetY(), this.z / vec3f_v.GetZ());
    
    }
    
    
    // Define a function to get the divided vector
    public Vector3f GetDividedVector(float f_v) {
    
	/*
	inputs--
	
	f_v :   
	    A float value that should divide both components
	*/
	
	/*
	outputs--
	
	vec3f_div (implicit) :
	    Divided vector
	*/
	
 	return new Vector3f(this.x / f_v, this.y / f_v, this.z / f_v);
    
    }
    
    
    // Define a function to get the cross product
    public Vector3f GetCrossProduct(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :
	    The vector with which this needs to be left crossed
	*/
	
	/*
	outputs--
	
	vec3f_crossed :
	    The cross product
	*/
	
	return new Vector3f(this.y*vec3f_v.GetZ() - this.z*vec3f_v.GetY(), this.z*vec3f_v.GetX() - this.x*vec3f_v.GetZ(), this.x*vec3f_v.GetY() - this.y*vec3f_v.GetX());
    
    }
    
}
