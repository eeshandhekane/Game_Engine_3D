/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;


/**
 *
 * @author eeshan
 */


// Define a class to hold utility functions
public class Utilities {
    
    
    // Define a method to create a float buffer as it is very complicated in java
    public static FloatBuffer CreateFloatBuffer(int n_size) {
    
	/*
	inputs--
	
	n_size :
	    The size of the float buffer to be created
	*/
	
	/*
	outputs--
	
	fbuff_ (implicit) :
	    The floatbuffer to be created based on the input size
	*/
	
	// Return the float buffer
	return BufferUtils.createFloatBuffer(n_size);
    
    }
    
    
    // Define a method to convert a list of vertices into flipped buffer
    public static FloatBuffer GetFlippedBufferFromVertexList(Vertex[] vert_list) {
	
	/*
	inputs--
	
	vert_list :
	    The list of vertices to be converted into a flipped buffer
	*/
	
	/*
	outputs--
	
	fbuff_ :
	    The flipped float buffer of vertices
	*/
	
	// Get length of the buffer
	int n_len = vert_list.length;

	// Get a new buffer for float entries
	FloatBuffer fbuff_ = CreateFloatBuffer(n_len*Vertex.CONST_COUNT_COMPONENTS);
	
	// Add all the data into the buffers
	for (int n_i = 0; n_i < n_len ; n_i ++) {
	    
	    fbuff_.put(vert_list[n_i].GetLocation().GetX());
	    fbuff_.put(vert_list[n_i].GetLocation().GetY());
	    fbuff_.put(vert_list[n_i].GetLocation().GetZ());
	
	}
	
	// To put the data in proper order, flip the buffer
	fbuff_.flip();
	
	// Return the buffer
	return fbuff_;
	
    }
    
}
