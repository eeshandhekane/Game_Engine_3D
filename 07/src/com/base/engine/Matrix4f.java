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
public class Matrix4f {
    
    
    // Define the attributes
    private float[][] mat_f_m;
    
    
    // Define a constructor
    public Matrix4f() {
	
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
    
	this.mat_f_m = new float[4][4];
    
    }
    
    
    // Define a function to get the matrix
    public float [][] GetMatrix() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	mat_f_m :
	    The self matrix
	*/
	
	return this.mat_f_m;
    
    }
    
    
    // Define a function to set the matrix
    public void SetMatrix(float[][] mat_f_m) {
    
	/*
	inputs--
	
	mat_f_m :
	    The matrix for setting
	*/
	
	/*
	outputs--
	*/
	
	this.mat_f_m = mat_f_m;
    
    }
    
    
    // Define a function to get the specific component
    public float GetComponent(int n_x, int n_y) {
    
	/*
	inputs--
	
	n_x :
	    The first index
	n_y :
	    The second index
	*/
	
	/*
	outputs--
	
	f_val (implicit) :
	    The float value at the indexed location of this
	*/
	
	return this.mat_f_m[n_x][n_y];
    
    }
    
    
    // Define a function to set the specific component
    public void SetComponent(int n_x, int n_y, float f_val) {
    
	/*
	inputs--
	
	n_x :
	    The first index
	n_y :
	    The second index
	f_val :
	    The float value at the indexed location of this
	*/
	
	/*
	outputs--
	*/
	
	this.mat_f_m[n_x][n_y] = f_val;
    
    }
    
    
    // Define a function to reset the matrix to identity 4x4
    public void SetMatrixToIdentity() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	this.mat_f_m[0][0] = 1;	    this.mat_f_m[0][1] = 0;	this.mat_f_m[0][2] = 0;	    this.mat_f_m[0][3] = 0;
	this.mat_f_m[1][0] = 0;	    this.mat_f_m[1][1] = 1;	this.mat_f_m[1][2] = 0;	    this.mat_f_m[1][3] = 0;
	this.mat_f_m[2][0] = 0;	    this.mat_f_m[2][1] = 0;	this.mat_f_m[2][2] = 1;	    this.mat_f_m[2][3] = 0;
	this.mat_f_m[3][0] = 0;	    this.mat_f_m[3][1] = 0;	this.mat_f_m[3][2] = 0;	    this.mat_f_m[3][3] = 1;	
    
    }
    
    
    // Define a function to reset the matrix to identity 4x4
    public Matrix4f SetMatrixToIdentityAndGet() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	
	this :
	    The self matrix set to identity
	*/
	
	this.mat_f_m[0][0] = 1;	    this.mat_f_m[0][1] = 0;	this.mat_f_m[0][2] = 0;	    this.mat_f_m[0][3] = 0;
	this.mat_f_m[1][0] = 0;	    this.mat_f_m[1][1] = 1;	this.mat_f_m[1][2] = 0;	    this.mat_f_m[1][3] = 0;
	this.mat_f_m[2][0] = 0;	    this.mat_f_m[2][1] = 0;	this.mat_f_m[2][2] = 1;	    this.mat_f_m[2][3] = 0;
	this.mat_f_m[3][0] = 0;	    this.mat_f_m[3][1] = 0;	this.mat_f_m[3][2] = 0;	    this.mat_f_m[3][3] = 1;	
	
	return this;
    
    }
    
    
    // Define a function to reset the matrix to zeros
    public void SetMatrixToZeros() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	this.mat_f_m[0][0] = 0;	    this.mat_f_m[0][1] = 0;	this.mat_f_m[0][2] = 0;	    this.mat_f_m[0][3] = 0;
	this.mat_f_m[1][0] = 0;	    this.mat_f_m[1][1] = 0;	this.mat_f_m[1][2] = 0;	    this.mat_f_m[1][3] = 0;
	this.mat_f_m[2][0] = 0;	    this.mat_f_m[2][1] = 0;	this.mat_f_m[2][2] = 0;	    this.mat_f_m[2][3] = 0;
	this.mat_f_m[3][0] = 0;	    this.mat_f_m[3][1] = 0;	this.mat_f_m[3][2] = 0;	    this.mat_f_m[3][3] = 0;	
    
    }
    
    
    // Define a function to reset the matrix to ones
    public void SetMatrixToOnes() {
    
	/*
	inputs--
	*/
	
	/*
	outputs--
	*/
	
	this.mat_f_m[0][0] = 1;	    this.mat_f_m[0][1] = 1;	this.mat_f_m[0][2] = 1;	    this.mat_f_m[0][3] = 1;
	this.mat_f_m[1][0] = 1;	    this.mat_f_m[1][1] = 1;	this.mat_f_m[1][2] = 1;	    this.mat_f_m[1][3] = 1;
	this.mat_f_m[2][0] = 1;	    this.mat_f_m[2][1] = 1;	this.mat_f_m[2][2] = 1;	    this.mat_f_m[2][3] = 1;
	this.mat_f_m[3][0] = 1;	    this.mat_f_m[3][1] = 1;	this.mat_f_m[3][2] = 1;	    this.mat_f_m[3][3] = 1;	
    
    }
    
    
    // Define a function to get multiplied matrix
    public Matrix4f GetMultipliedMatrix(Matrix4f m) {

	/*
	inputs--
	
	m :
	    The input matrix m, instance of Matrix4f
	*/
	
	/*
	outputs--
	
	mul :
	    The matrix this times m
	*/
	
	// Create new matrix to hold the results
	Matrix4f mul = new Matrix4f();
	
	// Double for loop based standard multiplication
	for (int n_i = 0; n_i < 4; n_i ++) {
	    
	    for(int n_j = 0; n_j < 4 ; n_j ++) {
		
		// Set entry one by one
		float f_val = 0;
		for (int n_k = 0; n_k < 4; n_k ++) {
		
		    f_val += this.mat_f_m[n_i][n_k]*m.GetComponent(n_k, n_j);
		
		}
		mul.SetComponent(n_i, n_j, f_val);
		
	    }
	
	}
	
	// Return the multiplied matrix
	return mul;
    
    }
    
}
