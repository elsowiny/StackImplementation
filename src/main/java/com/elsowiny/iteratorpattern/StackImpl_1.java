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
    public Object pop() {
        
        if(stack.size() - 1 == 0){
            return "Error Stack is empty";
        }
        
        int lastIndex = stack.size() - 1;
        
        //keep reference to the last item to be returned
        Object lastItem = stack.get(lastIndex);
        
        //remove it via index
        stack.remove(lastIndex);
        System.out.println("removed item from stack");
        return lastItem;
    }

    @Override
    public void push(Object item) {
        stack.add(item);
        System.out.println("added item to stack");
    }
    
    @Override
    public void clear(){
        stack.clear();
        System.out.println("Cleared items..");
    }
    
    @Override
    public int getSize(){
        return stack.size();
    }
    
    @Override
    public Object get(int i){
        return stack.get(i);
    }

}
