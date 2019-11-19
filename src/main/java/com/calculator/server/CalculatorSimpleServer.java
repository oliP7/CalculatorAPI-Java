package com.calculator.server;

import com.calculator.model.ResponseSimple;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class CalculatorSimpleServer {

    public ResponseSimple add(float num1, float num2) {
        ResponseSimple obj = new ResponseSimple(num1, num2, 0, "+");
        obj.setResult(num1 + num2);
        return obj;
    }

    public ResponseSimple subtract(float num1, float num2) {
        ResponseSimple obj = new ResponseSimple(num1, num2, 0, "-");
        obj.setResult(num1 - num2);
        return obj;
    }

    public ResponseSimple multiply(float num1, float num2) {
        ResponseSimple obj = new ResponseSimple(num1, num2, 0, "*");
        obj.setResult(num1 * num2);
        return obj;
    }

    public ResponseSimple divide(float num1, float num2) {
        ResponseSimple obj = new ResponseSimple(num1, num2, 0, "/");
        obj.setResult(num1 / num2);
        return obj;
    }

    public ResponseSimple evaluate(String exp) {
        ResponseSimple obj = new ResponseSimple(exp);

        Stack<Integer> numbers = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == ' ') continue;
            if (Character.isDigit(exp.charAt(i))) {
                StringBuffer sb = new StringBuffer();
                while (i < exp.length() && Character.isDigit(exp.charAt(i)))
                    sb.append(exp.charAt(i++));
                numbers.push(Integer.parseInt(sb.toString()));
                i--;
            }
            else if (exp.charAt(i) == '(') op.push(exp.charAt(i));
            else if (exp.charAt(i) == ')') {
                while (op.peek() != '(')
                    numbers.push(calculate(op.pop(), numbers.pop(), numbers.pop()));
                op.pop();
            }
            else if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                while (!op.empty() && hasPrecedence(exp.charAt(i), op.peek()))
                    numbers.push(calculate(op.pop(), numbers.pop(), numbers.pop()));

                op.push(exp.charAt(i));
            }
        }
        while (!op.empty())
            numbers.push(calculate(op.pop(), numbers.pop(), numbers.pop()));

        obj.setResult(numbers.pop());
        return obj;
    }

    public static int calculate(char operator, int b, int a) {
        switch (operator)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Division by 0 is not possible");
                return a / b;
        }
        return 0;
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false;
        else return true;
    }
}
