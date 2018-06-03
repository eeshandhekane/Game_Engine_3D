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


/*
Quaternions--

An extremely efficient way to manipulate solid rotations
*/


public class Quaternion {
    
    
    // Define attributes
    private float x;
    private float y;
    private float z;
    private float w;
    
    
    // Define a constructor
    public Quaternion(float x, float y, float z, float w) {
    
	/*
	inputs--
	
	x :
	    The first component
	y :
	    The second component
	z :
	    The third component
	w :
	    The fourth component
	*/
	
	/*
	outputs--
	*/
	
	this.x = x;
	this.y = y;
	this.z = z;
	this.w = w;
    
    }
    
    
    // Define a function to get x
    public float GetX() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	x :
	    The x component
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
	    The y component
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
	    The z component
	*/
	
	return this.z;
	 
    }
    
    
    // Define a function to get w
    public float GetW() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	w :
	    The w component
	*/
	
	return this.w;
	 
    }
    
    
    // Define a function to set x
    public void SetX(float x) {
    
	/*
	inputs--
	
	x : 
	    The x component
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
	    The y component
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
	    The z component
	*/
	
	/*
	outputs--
	*/
	
	this.z = z;
    
    }
    
    
    // Define a function to set w
    public void SetW(float w) {
    
	/*
	inputs--
	
	w : 
	    The w component
	*/
	
	/*
	outputs--
	*/
	
	this.w = w;
    
    }
    
    
    // Define a function to get the length of the quaternion
    public float GetLength() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	return (float)(Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z + this.w*this.w));
    
    }
    
    
    // Define a function to normalize the quaternion
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
	this.w /= f_len;
	
    }
    
    
    // Define a function to get normalized self
    public Quaternion GetNormalizedQuaternion() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	this :
	    The self after normalization
	*/
	
	float f_len = GetLength();
	this.x /= f_len;
	this.y /= f_len;
	this.z /= f_len;
	this.w /= f_len;
	
	return this;
    
    }
    
    
    // Define a function to get the conjugates
    public Quaternion GetConjugateQuaternion() {
    
	/*
	inputs--
	*/
	
	
	/*
	outputs--
	
	quat_conj (implicit) :
	    An instance of Quaternion, the conjugate of this
	*/
	
	return new Quaternion(-this.x, -this.y, -this.z, w);
    }
    
    
    // Define a function to get multiplied quaternion
    public Quaternion GetMultipliedQuaternion(Quaternion quat_r) {
    
	/*
	inputs--
	
	quat_r :
	    An instance of Quaternion, the quaternion which is to be multiplied with this
	*/
	
	/*
	outputs--
	
	quat_mul (implicit) :  
	    The multiplication quaternion
	*/
	
	// Define the components
	float w_ = this.w*quat_r.GetW() - this.x*quat_r.GetX() - this.y*quat_r.GetY() - this.z*quat_r.GetZ();
	float x_ = this.x*quat_r.GetW() + this.w*quat_r.GetX() + this.y*quat_r.GetZ() - this.z*quat_r.GetY();
	float y_ = this.y*quat_r.GetW() + this.w*quat_r.GetY() + this.z*quat_r.GetX() - this.x*quat_r.GetZ();
	float z_ = this.z*quat_r.GetW() + this.w*quat_r.GetZ() + this.x*quat_r.GetY() - this.y*quat_r.GetX();
	
	// Return a new multiplication quaternion
	return new Quaternion(x_, y_, z_, w_);
    
    }
    
    
    // Define a function to get multiplied quaternion
    public Quaternion GetMultipliedQuaternion(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :
	    An instance of Vector3f, the vector to multiply with this
	*/
	
	/*
	outputs--
	
	quat_mul (implicit) :  
	    The multiplication quaternion
	*/
	
	// Define the components
	float w_ = this.x*vec3f_v.GetX() - this.y*vec3f_v.GetY() - this.z*vec3f_v.GetZ();
	float x_ = this.w*vec3f_v.GetX() + this.y*vec3f_v.GetZ() - this.z*vec3f_v.GetY();
	float y_ = this.w*vec3f_v.GetY() + this.z*vec3f_v.GetX() - this.x*vec3f_v.GetZ();
	float z_ = this.w*vec3f_v.GetZ() + this.x*vec3f_v.GetY() - this.y*vec3f_v.GetX();
	
	// Return a new multiplication quaternion
	return new Quaternion(x_, y_, z_, w_);
    
    }
    
}
