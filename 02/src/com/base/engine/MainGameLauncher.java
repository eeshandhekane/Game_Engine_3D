/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.opengl.Display;


/**
 *
 * @author eeshan
 */


// Define the main class
public class MainGameLauncher {
    
    
    // Define attributes
    public static final int GAME_WINDOW_WIDTH = 800;
    public static final int GAME_WINDOW_HEIGHT = 600;
    public static final String GAME_WINDOW_TITLE = "Game Engine 3D";
    public static final double FRAME_CAP = 5000.0; // Updates per second
    
    private boolean IS_GAME_WINDOW_RUNNING;
    private static final boolean IS_VERBOSE = true;
    private Game game;
    
    
    // Define the constructor to build the main game launcher. The components will be filled successively
    public MainGameLauncher() {
   
	/*
	inputs--
    	*/
	
	/*
	outputs--
	*/
	
	// As of now, the main component is not running
	IS_GAME_WINDOW_RUNNING = false;
	
	// Initialize the game
	game = new Game(); 
    
    }
    
    
    // Define a function to pre-process and start the game launcher. The starter should make the game run
    public void StartGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// If the game is already running, nothing to do
	if(IS_GAME_WINDOW_RUNNING) {
	
	    return;
	    
	}
	
	// Otherwise, the game window is not running, we need to start running it
	RunGameLauncher();
    
    }
    
    
    // Define a function to pre-process and stop the game launcher
    public void StopGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// If the window is not running already, nothing to do
	if(!IS_GAME_WINDOW_RUNNING) {
	
	    return;
	
	}
	
	// Else, we need to change the status to not runnign
	IS_GAME_WINDOW_RUNNING = false;
    
    }
    
    
    // Define a function to continue the running of the game launcher. We do not want it accessed by any external element
    private void RunGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// Since we are in the code, we must set the boolean of running to true
	IS_GAME_WINDOW_RUNNING = true;
	
	// Add frame statistics
	int n_frames = 0;
	long l_frame_counter = 0L;
	
	// Process the time
	final double d_per_frame_time = 1.0/FRAME_CAP;
	long l_last_frame = Timer.GetTime();
	double d_idle_time = 0.0;
	
	// While the game is running, keep rendering
	while(IS_GAME_WINDOW_RUNNING) {
	    
	    // Define a boolean to see if we need to render
	    boolean is_render = false;
	    
	    // Get the start time of the frame
	    long l_new_frame = Timer.GetTime();
	    long l_delta_frame = l_new_frame - l_last_frame;
	    l_last_frame = l_new_frame;

	    // Calculate the idle time
	    d_idle_time += l_delta_frame/((double)Timer.SECOND);
	    
	    // Update the fram counter
	    l_frame_counter += l_delta_frame;
	    
	    // While unprocessed time is larger than th frame time
	    while(d_idle_time > d_per_frame_time) {
		
		// We can render
		is_render = true;
	    
		// Unprocessed time needs to be updated properly
		d_idle_time -= d_per_frame_time;
		
		// If the window is not to be closed, keep on rendering
		if (Display.isCloseRequested()) {

		    // Stop!
		    StopGameLauncher();

		}
		
		// Set the delta
		Timer.SetDelta(d_per_frame_time);
		// Get input and update the game state
		game.ReceiveInputToGame();
		game.UpdateGame();
		
		// If the frame counter has passed a second, then we can print it up!!
		if (l_frame_counter >= Timer.SECOND) {
		
		    // If verbose, print
		    if(IS_VERBOSE) {
		    
			System.out.println("FPS : " + Integer.toString(n_frames));
		    
		    }
		    
		    n_frames = 0;
		    l_frame_counter = 0;
		
		}
	    
	    }
	
	    // Only if so much of frame rate, render. Otherwise not
	    if(is_render) {
	    
		// Render the game
		RenderGameLauncher();
		
		// If rendered, then count the number of frames
		n_frames += 1;
	    
	    }
	    else {
	    
		try {
		    Thread.sleep(1); // Sleep for 1 ms == 10^6 java nanoseconds
		} catch (InterruptedException ex) {
		    Logger.getLogger(MainGameLauncher.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	    }
	    
	
	}
	
	// Call the clean up method
	DestroyGameLauncher();
    
    }
    
    
    // Define a function to render the entire game launcher. We do not want it accessed by any external element
    private void RenderGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	game.RenderGame();
	GameWindow.RenderGameWindow();
    
    }
    
    
    // Define a function to cleanup after the rendering is over. As of now, only one thing is needed
    private void DestroyGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// As of now, just clean up the display
	GameWindow.DestroyGameWindow();
    
    }
    
    
    // Define the main funtion
    public static void main(String[] args){
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
    
	// Check for basic run
//	System.out.println("Hello, World of Game Engine!!");

	// Create new window
	GameWindow.CreateGameWindow(GAME_WINDOW_WIDTH, GAME_WINDOW_HEIGHT, GAME_WINDOW_TITLE); // Without the game loop, the window is instantiated and instantly destroyed.

	// Create a new game launcher
	MainGameLauncher game_launcher = new MainGameLauncher();
	    
	// Start running the game launcher
	game_launcher.StartGameLauncher();
	    	
    }
    
    
}
