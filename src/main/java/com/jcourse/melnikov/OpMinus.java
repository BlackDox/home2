package com.jcourse.melnikov;

import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 01.12.2017.
 */
public class OpMinus implements Command {
    @Override
    public void exec(Stack<Double> stack, Map<String, Double> definitions, String[] line) {
        if (stack.size() >= 2){
            stack.push(- stack.pop() + stack.pop());
        } else if (stack.size() == 1){
            stack.push(0.0 - stack.pop());
        } else {
            System.out.println("Стек пуст!");
        }
    }
}
