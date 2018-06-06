package com.base.engine;


// Dependencies
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;


// Define a class to have static methods for basic rendering
public class RenderUtilities {

	
	// Define a method to clear screen
	public static void ClearScreen() {
		
	    /*
	    inputs--
	    */
	    
	    /*
	    outputs--
	    */
		
	    // TODO : Stencil buffer is not used now
	    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
		
	}
	
	// Define a method to initialize opengl
	public static void InitializeGraphics() {
	
	    /*
	    inputs--
	    */
	    
	    /*
	    outputs--
	    */
	    
	    // Clear the color and set to black
	    glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
	    
	    /*
	    By default, GL draws to faces per basic drawing, one facing towards and the another facing away from the viewer
	    We can allow for avoiding this provided we tell which all faces are front faces, which all are back and then culling appropriately
	    */
	    
	    // Set clockwise faces as front faces
	    glFrontFace(GL_CW);	    
	    // Cull the back faces
	    glCullFace(GL_BACK);	    
	    // Enable face culling
	    glEnable(GL_CULL_FACE);
	    
	    /*
	    We can keep track of depth per pixel
	    Whenever a new pixel is drawn, based on the depth info, the pixels are conditioanlly overwritten
	    */
	    
	    // Allow for depth. 
	    glEnable(GL_DEPTH_TEST);
	    
	    //TODO : Depth clamping
	    
	    /*
	    Send colors with exponential changes. This can be done by correct exponential correction
	    This avoids showing things darker than they actually are
	    */
	    
	    // Get free gamma correction
	    glEnable(GL_FRAMEBUFFER_SRGB);
	    
	}
	
	
}
