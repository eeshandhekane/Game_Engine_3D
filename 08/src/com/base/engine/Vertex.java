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


// Define a class to hold vertices
public class Vertex {
    
    
    // Define attributes
    private Vector3f location;
    
    public static final int CONST_COUNT_COMPONENTS = 3; // The number of components of the vertex    
    
    // Define a constructor
    public Vertex(Vector3f vec3f_v) {
    
	/*
	inputs--
	
	vec3f_v :
	    The position input
	*/
	
	/*
	outputs--
	*/
	
	this.location = vec3f_v;
    
    }
    
    
    // Define a function to get the location of the vertex
    public Vector3f GetLocation() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	vec3f_loc (implicit) :
	    The vector location of the vertex
	*/
	
	// Return the location
	return this.location;
    
    }
    
    
    // Define a function to set the location of the vector
    public void SetLocation(Vector3f vec3f_loc) {
	
	/*
	inputs--
	
	vec3f_v :
	    The position input
	*/
	
	/*
	outputs--
	*/
	
	this.location = vec3f_loc;
    
    }
    
    
}
