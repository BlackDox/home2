package com.jcourse.melnikov;

import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 01.12.2017.
 */
public interface Command {
    void exec(Stack<Double> stack, Map<String,Double> definitions, String[] line);
}
