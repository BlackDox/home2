package com.jcourse.melnikov;

import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 08.12.2017.
 */
public class Comment implements Command {
    @Override
    public void exec(Stack<Double> stack, Map<String, Double> definitions, String[] line) {
        System.out.println("Комментарий: " + line[1]);
    }
}
