package com.jcourse.melnikov;

import java.util.Stack;

/**
 * Created by BlackDox on 01.12.2017.
 */
public class MyCacl {
    public static void main(String[] args) {
        Calculator calc;

        if (args.length > 0){
            calc = new Calculator(args[0]);
        } else {
            calc = new Calculator();
        }
        calc.start();

    }
}
