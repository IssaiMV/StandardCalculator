/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import java.util.Stack;

/**
 *
 * @author Frida Fernanda Arcos Guitierrez
 */
public class InfixToPrefix {

    private String infixNotation;

    public InfixToPrefix() {
        this.infixNotation = "";
    }

    // A utility function to return  
    // precedence of a given operator 
    // Higher returned value means  
    // higher precedence 
    private static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // The main method that converts  
    // given infix expression 
    // to postfix expression.  
    public static Stack run(String exp) {
        // initializing empty String
        String aux = "";
        String number = "";
        // initializing empty stack 
        Stack<Character> stack = new Stack<>();
        Stack<String> result = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an 
            // operand, add it to output. 
            if (Character.isLetterOrDigit(c)) {
                number += c;
                if (i == exp.length() - 1) {
                    result.push(String.valueOf(number));
                }
            } else {
                result.push(String.valueOf(number));
                number = "";
                // an operator is encountered 
                while (!stack.isEmpty() && Prec(c)
                        <= Prec(stack.peek())) {
                    aux = String.valueOf(stack.pop());
                    result.push(aux);
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack 
        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                result =  new Stack<>();
                return result;
            }
            aux = String.valueOf(stack.pop());
            result.push(aux);
        }
        return result;
    }
}
