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
    
        public Object pop(Object item);
	  
	public Object push(Object item);
	    
	public void clear();
	
}
