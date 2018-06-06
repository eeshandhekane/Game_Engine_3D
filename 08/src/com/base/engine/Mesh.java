/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;


// Depdendencies
import java.nio.FloatBuffer;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;


/**
 *
 * @author eeshan
 */


// Define a function to hold the mesh of a set of vertices
public class Mesh {
    
    
    // Define attributes
    private int vbo; // The integer representing the vertex buffer array. It is a handle to the vertices
    private int count_vertex; // The count_vertex of number of included vertices
    
    
    // Define a constructor
    public Mesh() {
	
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// Create the buffer
	vbo = glGenBuffers();
	count_vertex = 0;
	
    }
    
    
    // Define a function to add vertices to the mesh
    public void AddVerticesToMesh(Vertex[] vert_list) {
	
	/*
	inputs--
	
	vert_list :
	    The list of instance of class Vertex
	*/
	
	/*
	outputs--
	*/
    
	// Set the count of vertex components
	count_vertex += vert_list.length;
	
	// Bind buffer
	glBindBuffer(GL_ARRAY_BUFFER, vbo); // Any consecutive buffer operations will be done on vbo
	
	/*
	Java stores data internally in a format different from that expected by OpenGL
	*/
	
	// Get flipped buffer from the vertices list
	FloatBuffer fbuff_ = Utilities.GetFlippedBufferFromVertexList(vert_list);
	// Bind data
	glBufferData(GL_ARRAY_BUFFER, fbuff_, GL_STATIC_DRAW); // GL_STATIC_DRAW for initialization. This is an OPTIMIZATION HINT!! There is also a GL dynamic draw and stream draw options
    
    }
    
    
    // Define a function to draw the mesh as triangles
    public void DrawMesh() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// Describe how to interpret the data
	glEnableVertexAttribArray(0);
	
	    // Description
	    glVertexAttribPointer(0, 3, GL_FLOAT, false, Vertex.CONST_COUNT_COMPONENTS*4, 0); // Which array to point to--0. There are 3 floats. Which type--GL_FLOAT, normalize?? false. How big is one vertex??--4bytes/float*CONST_COUNT_COMPONENTSflaots. Where in each vertex does the piece of data starts (offset??)--0
	
	    // Bind the vbo
	    glBindBuffer(GL_ARRAY_BUFFER, vbo);

	    // D
	    glDrawArrays(GL_TRIANGLES, 0, count_vertex); // 0 for start at beginning. 
	
	// Stop the description
	glDisableVertexAttribArray(0);
    
    }
    
}
