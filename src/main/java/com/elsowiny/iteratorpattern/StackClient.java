//Driver class




package com.elsowiny.iteratorpattern;

/**
 *
 * @author elsow
 */
public class StackClient {
    
    
    public static void main(String args[]){
    
    //obj creation
    String myString = "1Sherief";
    int num1 = 2;
    int num2 = 3;
    Stack myStack = new StackImpl_1();
    
    myStack.push(myString);
    myStack.push(num1);
    myStack.push(num2);
    myStack.push(4);
    myStack.push(5);
    Object myLastElement = myStack.pop();
    int size = myStack.getSize();
    System.out.println("size of the stack impl1 1 is " + size);
    System.out.println(
            String.valueOf(myLastElement)
    );
    
    
    Stack myStack2 = new StackImpl_2();
    myStack2.push(myString);
    myStack2.push(num1);
    myStack2.push(num2);
    myStack2.push(myString);
    myStack2.push(myString);
    Object myLastElement2 = myStack2.pop();
    int sizeStack2 = myStack2.getSize();
    System.out.println("size of the stack impl1 2 is " + sizeStack2);
    System.out.println(
            String.valueOf(myLastElement2)
    );
    
   System.out.println("Stack 1 contains: ");
   
   printStack(myStack);
   
      System.out.println("Stack 2 contains: ");
   printStack(myStack2);
    }
    
    public static void printStack(Stack myStack){
        for(int i=0;i< myStack.getSize(); i++){
            System.out.println(myStack.get(i));
        }
    }
    
}
