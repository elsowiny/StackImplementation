//Driver class




package com.elsowiny.iteratorpattern;

/**
 *
 * @author elsow
 */
public class StackClient {
    
    
    public static void main(String args[]){
    
    String myString = "Sherief";
    int myAge = 15;
    int myNumb = 125;
    Stack myStack = new StackImpl_1();
    
    myStack.push(myString);
    myStack.push(myAge);
    myStack.push(myNumb);
    Object myLastElement = myStack.pop();
    int size = myStack.getSize();
    System.out.println("size of the stackimpl1 is " + size);
    System.out.println(
            String.valueOf(myLastElement)
    );
    
    
    Stack myStack2 = new StackImpl_2();
    myStack2.push(myString);
    myStack2.push(myAge);
    myStack2.push(myNumb);
    myStack2.push(myNumb);
    myStack2.push(myNumb);
    Object myLastElement2 = myStack2.pop();
    int sizeStack2 = myStack2.getSize();
    System.out.println("size of the stackimpl12 is " + sizeStack2);
    System.out.println(
            String.valueOf(myLastElement2)
    );
    
        
        
    }
    
    public void printStack(){
        
    }
    
}
