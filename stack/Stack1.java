import java.util.*;

class Stack1{
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<Integer>();

        isempty(stack);
        stack_push(stack);
        printStack(stack);
        stackPeek(stack);
        pop(stack);
        isempty(stack);
        search(stack,5);
        search(stack,8);
    }

    // This function is responsible for pushing the elements in the stack
    public static void stack_push(Stack<Integer> stack){
        for(int i=0;i<10;i++){
            stack.push(i);
        }
    }

    // This function is responsible for printing the stack element 
    public static void printStack(Stack<Integer> stack){
        System.out.println(stack);
    }
    
    // Peek() function is used to display the top value of the stack 
    public static void stackPeek(Stack<Integer> stack){
        System.out.println("Peek of the stack is : "+stack.peek());
    }

    // pop() funtion remove or delete the top elemet of the stack 
    public static void pop(Stack<Integer>stack){
        stack.pop();
        System.out.println("After pop() funtion the updated stack is : " + stack);
    }

    // This function is check whether the stack is empty or not 
    public static void isempty(Stack<Integer>stack){
        System.out.println(stack.isEmpty());
    }

    public static void search(Stack<Integer>stack , int element){
        
       Integer pos =(Integer)stack.search(element);

       if(pos==-1){
           System.out.println(" Element not found ...");
       }
       else{
           System.out.println(" Eleemnt found in the position : = "+pos);
       }
    }
}