/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import org.lwjgl.opengl.Display;


/**
 *
 * @author eeshan
 */


// Define the main class
public class MainGameLauncher {
    
    
    // Define the constructor to build the main game launcher. The components will be filled successively
    public MainGameLauncher() {
   
	/*
	inputs--
    	*/
	
	/*
	outputs--
	*/
    
    }
    
    
    // Define a function to pre-process and start the game launcher. The starter should make the game run
    public void StartGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	RunGameLauncher();
    
    }
    
    
    // Define a function to continue the running of the game launcher. The run method should keep on rendering the game as long as we do not want to kill 
    public void RunGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	// While not to terminate, keep on rendering
	while(!Display.isCloseRequested()) {
	
	    RenderGameLauncher();
	
	}
	
	// Stopping criterion is satisfied. Now, clean up. Just now, only game window is to be cleaned up
	DestroyGameLauncher();
    
    }
    
    
    // Define a function to render the entire game launcher. As of now, only the window needs to be rendered
    public void RenderGameLauncher() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	GameWindow.RenderGameWindow();
    
    }
    
    
    // Define a function to cleanup after the rendering is over
    public void DestroyGameLauncher() {
    
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
	GameWindow.CreateGameWindow(0, 0, "Game Engine"); // Without the game loop, the window is instantiated and instantly destroyed.

	// Create a new game launcher
	MainGameLauncher game_launcher = new MainGameLauncher();
	    
	// Start running the game launcher
	game_launcher.StartGameLauncher();
	    	
    }
    
    
}
