package Stack;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> stack = new ArrayList<>();

    public Stack(){

    }

    public void push(int n){
        stack.add(n);
    }

    public int pop(){
       return stack.remove(stack.size()-1);
    }

    public  int size(){
        return  stack.size();
    }
}
