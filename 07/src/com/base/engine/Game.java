/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import org.lwjgl.input.Keyboard;

/**
 *
 * @author eeshan
 */

// Define a class for the game
public class Game {

	// Define the constructor
	public Game() {

		/*
		 * inputs--
		 */

		/*
		 * outputs--
		 */

	}

	// Define a function to catch input for the game
	public void ReceiveInputToGame() {

		/*
		 * inputs--
		 */

		/*
		 * outputs--
		 */

		// Test code
		if (InputProcessor.GetKeyDown(Keyboard.KEY_UP)) {

			System.out.println("We just pressed the UP key");

		}

		if (InputProcessor.GetKeyUp(Keyboard.KEY_UP)) {

			System.out.println("We just released the UP key");

		}

		if (InputProcessor.GetKey(Keyboard.KEY_UP)) {

			System.out.println("We have kept pressed the UP key");

		}

		// Test code
		if (InputProcessor.GetMouseDown(1)) {

			System.out.println("We just pressed the left click");

		}

		if (InputProcessor.GetMouseUp(1)) {

			System.out.println("We just released the right click");

		}

		if (InputProcessor.GetMouse(1)) {

			System.out.println(
					"We have kept pressed the left click at : " + InputProcessor.GetMouseLocation().ToString());

		}

	}

	// Define a function to update the game
	public void UpdateGame() {

		/*
		 * inputs--
		 */

		/*
		 * outputs--
		 */

	}

	// Define a function to render the game
	public void RenderGame() {

		/*
		 * inputs--
		 */

		/*
		 * outputs--
		 */

	}

}
