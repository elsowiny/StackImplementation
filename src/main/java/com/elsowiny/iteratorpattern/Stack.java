/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elsowiny.iteratorpattern;

/**
 *
 * @author elsow
 */
public interface Stack {
    
    //lifo
    
        public Object pop();
	  
	public void push(Object item);
	    
	public void clear();
        
        public int getSize();
	
}
