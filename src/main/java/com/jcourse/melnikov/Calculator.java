package com.jcourse.melnikov;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by BlackDox on 01.12.2017.
 */
public class Calculator {
    private boolean isWork = true;
    Stack<Double> operands = new Stack<>();
    Map<String, Double> definitions = new HashMap<>();
    BufferedReader reader;

    public Calculator(){
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public Calculator(String pathFile){
        try {
            reader = new BufferedReader(new FileReader(pathFile));
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл с таском для расчетов!");
        }
    }

    public void start(){
        System.out.println("Вводите команды. Для выхода введите EXIT:");

        try {
            while (isWork) {
                String nextLine = reader.readLine();
                String[] line = nextLine.split(" ");

                switch (line[0]){
                    case "#":{
                        Command c = new Comment();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "POP":{
                        Command c = new Pop();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "PUSH":{
                        Command c = new Push();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "+":{
                        Command c = new OpPlus();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "-":{
                        Command c = new OpMinus();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "*":{
                        Command c = new OpMultiply();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "/":{
                        Command c = new OpDivision();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "SQRT":{
                        Command c = new Sqrt();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "PRINT":{
                        Command c = new Print();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "DEFINE":{
                        Command c = new Define();
                        c.exec(operands, definitions, line);
                        break;
                    }
                    case "":{
                    }
                    case "exit":{
                    }
                    case "EXIT":{
                        isWork = false;
                        break;
                    }
                    default:{
                        System.out.println("Ошибка! Такой команды нет!");
                    }
            }}
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Программа успешно завершила работу!");
    }
}