/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;


/**
 *
 * @author eeshan
 */


// Create a class to cater for display window functionalities
public class GameWindow {
    
    
    // Define a function to create a new window
    public static void CreateGameWindow(int n_width, int n_height, String st_title) {

	/*
	inputs--
	
	n_width :
	    The integer width of the window
	n_width :
	    The integer height of the window
	st_title :
	    The string title of the window
	*/
	
	/*
	outputs--
	*/
	
	// Create a display mode
	DisplayMode display_mode;
	if ((n_width > 0) && (n_height > 0)) {
	    display_mode = new DisplayMode(n_width, n_height);
	}
	else {
	    display_mode = new DisplayMode(2560, 1600);
	}
	
	// Set display title
	Display.setTitle(st_title);
	
	try {
	    // Set the display mode of the window
	    Display.setDisplayMode(display_mode);
	} catch (LWJGLException ex) {
	    Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
	}
	try {
	    Display.create();
	} catch (LWJGLException ex) {
	    Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
	}
	
    }
    
    
    // Define a function to render the window using display update
    public static void RenderGameWindow(){
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// Update the display window
	Display.update();
    
    }
    
    
    // Define a function to get whether to continue display
    public static boolean IsGameWindowTerminate() {
	
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	is_display_continue (implicit) :
	    Whether the display needs to be continued or not
	*/
	
	return Display.isCloseRequested();
    
    }
    
    
    // Define a function to get height
    public static int GetGameWindowWidth() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	n_width (implicit) :
	    The width of the display window
	*/
	
	return Display.getDisplayMode().getWidth();
	
    }
    
    
    // Define a function to get height
    public static int GetGameWindowHeight() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	n_height (implicit) :
	    The height of the display window
	*/
	
	return Display.getDisplayMode().getHeight();
	
    }
    
    
    // Define a function to get the title of the window
    public static String GetGameWindowTitle() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	st_title :
	    The title of the window
	*/
	
	return Display.getTitle();
    
    }
    
    
    // Define a function to cleanup the game window
    public static void DestroyGameWindow() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// Distroy the window
	Display.destroy();
    
    }
    
}
