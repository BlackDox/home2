package com.jcourse.melnikov;

import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 08.12.2017.
 */
public class Define implements Command {
    @Override
    public void exec(Stack<Double> stack, Map<String, Double> definitions, String[] line) {
        if (definitions.containsKey(line[1])){
            definitions.remove(line);
            System.out.println("Старое значение данной переменой утеряно!");
        }

        definitions.put(line[1], Double.valueOf(line[2]));
    }
}
