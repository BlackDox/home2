package com.jcourse.melnikov;

import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 01.12.2017.
 */
public class OpDivision implements Command {
    @Override
    public void exec(Stack<Double> stack, Map<String, Double> definitions, String[] line) {
        if (stack.size() >= 2){
            Double last = stack.pop();
            Double penultimate = stack.pop();
            stack.push(penultimate / last);
        } else {
            System.out.println("В стеке меньше двух элементов!");
        }
    }
}
