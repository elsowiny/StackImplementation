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
    //uses ArrayList to hold the elements in the stack for this class

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
