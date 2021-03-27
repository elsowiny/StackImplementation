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
import java.util.ArrayList;

public class StackImpl_1 implements Stack {
    
    public StackImpl_1(){
        //ask for the size?
    }
    
    //uses ArrayList to hold the elements in the stack for this class
    //think of a stack as a pile of plates
    /*
    Think about the things you can do with such a pile of plates

Put a new plate on top
Remove the top plate
If you want the plate at the bottom, you must first remove all the plates on top.
Such an arrangement is called Last In First Out - 
the last item that is the first item to go out.
   */

    ArrayList<Object> stack = new ArrayList<>();
    
    @Override
    public Object pop(Object item) {
        return null;
    }

    @Override
    public Object push(Object item) {
        return null;
    }
    
    @Override
    public void clear(){
        System.out.println("Cleared items");
    }
    
    
    

}
