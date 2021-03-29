//Driver class




package com.elsowiny.iteratorpattern;

/**
 *
 * @author elsow
 */
public class StackClient {
    
    
   
    
    public static void printStack(Stack myStack){
        for(int i=0;i< myStack.getSize(); i++){
            System.out.println(myStack.get(i));
        }
    }
    
}
