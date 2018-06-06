/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.engine;

import java.util.ArrayList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

/**
 *
 * @author eeshan
 */
public class InputProcessor {

	// Define attributes
	public static final int NUM_KEYCODES = 256; // Can be set to other large number as per the requirements
	public static final int NUM_BUTTONCODES = 5; // Can be set to other large number as per the requirements

	private static ArrayList<Integer> arr_n_current_keys = new ArrayList<Integer>(); // Array for currently active keys
	private static ArrayList<Integer> arr_n_down_keys = new ArrayList<Integer>(); // Array for dowm keys
	private static ArrayList<Integer> arr_n_up_keys = new ArrayList<Integer>(); // Array for up keys
	private static ArrayList<Integer> arr_n_current_buttons = new ArrayList<Integer>(); // Array for currently active
																						// buttons of mouse
	private static ArrayList<Integer> arr_n_down_buttons = new ArrayList<Integer>(); // Array for dowm buttons of mouse
	private static ArrayList<Integer> arr_n_up_buttons = new ArrayList<Integer>(); // Array for up buttons of mouse

	// Define a function to update the input processor
	public static void UpdateInputProcessor() {

		/*
		 * inputs--
		 */

		/*
		 * outputs--
		 */

		// Reset all the up buttons
		arr_n_up_buttons.clear();

		// Add all relevant buttons
		for (int n_i = 0; n_i < NUM_BUTTONCODES; n_i++) {

			if (!GetMouse(n_i) && arr_n_current_buttons.contains(n_i)) {

				arr_n_up_buttons.add(n_i);

			}

		}

		// Reset all the down buttons
		arr_n_down_buttons.clear();

		// Add all the relevant buttons
		for (int n_i = 0; n_i < NUM_BUTTONCODES; n_i++) {

			if (GetMouse(n_i) && !arr_n_current_buttons.contains(n_i)) {

				arr_n_down_buttons.add(n_i);

			}

		}

		// Reset all the pressed buttons
		arr_n_current_buttons.clear();

		// Add all the relevant buttons
		for (int n_i = 0; n_i < NUM_BUTTONCODES; n_i++) {

			if (GetMouse(n_i)) {

				arr_n_current_buttons.add(n_i);

			}

		}

		// Reset all the up keys
		arr_n_up_keys.clear();

		// Add all relevant keys
		for (int n_i = 0; n_i < NUM_KEYCODES; n_i++) {

			if (!GetKey(n_i) && arr_n_current_keys.contains(n_i)) {

				arr_n_up_keys.add(n_i);

			}

		}

		// Reset all the down keys
		arr_n_down_keys.clear();

		// Add all relevant keys
		for (int n_i = 0; n_i < NUM_KEYCODES; n_i++) {

			// If the key is now pressed and was not in the active keys
			if (GetKey(n_i) && !arr_n_current_keys.contains(n_i)) {

				arr_n_down_keys.add(n_i);

			}

		}

		// Reset all the current keys
		arr_n_current_keys.clear();

		// Add all the keys that are down
		for (int n_i = 0; n_i < NUM_KEYCODES; n_i++) {

			if (GetKey(n_i)) {

				arr_n_current_keys.add(n_i);

			}

		}

	}

	// Define a function to get the current key, i.e., get true if the key is
	// pressed down
	public static boolean GetKey(int n_key_code) {

		/*
		 * inputs--
		 * 
		 * n_key_code : Integer key code for the pressed key
		 */

		/*
		 * outputs--
		 * 
		 * is_pressed (implicit) : Whether the key is pressed or not
		 */

		return Keyboard.isKeyDown(n_key_code);

	}

	// Define a function to get key down true for ONE AND ONLY ONE frame
	public static boolean GetKeyDown(int n_key_code) {
		/*
		 * inputs--
		 * 
		 * n_key_code : Integer key code for the pressed key
		 */

		/*
		 * outputs--
		 * 
		 * is_pressed (implicit) : Whether the key is pressed or not for one frame
		 */

		return arr_n_down_keys.contains(n_key_code);

	}

	// Define a function to get key up true for ONE AND ONLY ONE frame
	public static boolean GetKeyUp(int n_key_code) {
		/*
		 * inputs--
		 * 
		 * n_key_code : Integer key code for the pressed key
		 */

		/*
		 * outputs--
		 * 
		 * is_pressed (implicit) : Whether the key is un-pressed or not for one frame
		 */

		return arr_n_up_keys.contains(n_key_code);

	}

	// Define a function to get the mouse down
	public static boolean GetMouse(int n_mouse_button) {

		/*
		 * inputs--
		 * 
		 * n_mouse_button : The integet code for pressed mouse button
		 */

		/*
		 * outputs--
		 * 
		 * is_pressed (implicit) : Whether the mouse is pressed
		 */

		return Mouse.isButtonDown(n_mouse_button);

	}

	// Define a function to get the mouse down
	public static boolean GetMouseDown(int n_mouse_button) {

		/*
		 * inputs--
		 * 
		 * n_mouse_button : The integet code for pressed mouse button
		 */

		/*
		 * outputs--
		 * 
		 * is_pressed (implicit) : Whether the mouse is pressed
		 */

		return arr_n_down_buttons.contains(n_mouse_button);

	}

	// Define a function to get the mouse up
	public static boolean GetMouseUp(int n_mouse_button) {

		/*
		 * inputs--
		 * 
		 * n_mouse_button : The integet code for pressed mouse button
		 */

		/*
		 * outputs--
		 * 
		 * is_pressed (implicit) : Whether the mouse is released
		 */

		return arr_n_up_buttons.contains(n_mouse_button);

	}

	// Define a function to get the coordinates of the mouse
	public static Vector2f GetMouseLocation() {

		/*
		 * inputs--
		 */

		/*
		 * outputs--
		 */

		return new Vector2f(Mouse.getX(), Mouse.getY());

	}

}
