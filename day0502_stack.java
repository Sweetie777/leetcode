package com.tang.day05;

import java.util.Stack;

/**
 * Author: Sweetie77
 * Created: 2019/5/26
 */
public class day0502_stack {
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2= new Stack<>();
    public void push(int node){
        stack1.push(node);
    }
    public Integer pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw  new RuntimeException("Queue is empty");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
