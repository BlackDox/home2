package com.jcourse.melnikov;

import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 08.12.2017.
 */
public class Push implements Command {
    @Override
    public void exec(Stack<Double> stack, Map<String, Double> definitions, String[] line) {
        if (definitions.containsKey(line[1])) {
            stack.push(definitions.get(line[1]));
        } else {
            System.out.println("Такая переменная не задана!");
        }
    }
}
