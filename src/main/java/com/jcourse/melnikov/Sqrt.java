package com.jcourse.melnikov;

import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 08.12.2017.
 */
public class Sqrt implements Command {
    @Override
    public void exec(Stack<Double> stack, Map<String, Double> definitions, String[] line) {
        if (!stack.empty()){
            stack.push(Math.sqrt(stack.pop()));
        } else {
            System.out.println("Стек пуст!");
        }
    }
}
