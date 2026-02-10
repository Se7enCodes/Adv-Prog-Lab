/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usesinterfaces;
interface Stack{
    void push(int a);
    int pop();
}
class Ab implements Stack{
    int [] stack;
    int top;
    int size = 5;
    Ab(){
        stack = new int[size];
        top = -1;
    }
    public void push(int a){
        if(top == size-1){
            System.out.println("stack is full");
        }
        else{
            stack[++top] = a;
            System.out.println(a+ "pushed");
        }
    }
    public int pop(){
        if (top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return stack[top--];
        }
    }
}

/**
 *
 * @author student
 */
public class UsesInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ab s = new Ab();
        s.push(10);
        s.push(69);
        s.pop();
    }
    
}
