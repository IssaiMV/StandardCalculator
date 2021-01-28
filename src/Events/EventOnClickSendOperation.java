/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Events;

import GraphicInterface.Component;
import Operation.Arithmetic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Operation.InfixToPrefix;
import java.util.Stack;

/**
 *
 * @author Frida Fernanda Arcos Guitierrez
 */
public class EventOnClickSendOperation implements ActionListener {

    private final Component com;
    private final String operation;

    public EventOnClickSendOperation(Component com, String operation) {
        this.com = com;
        this.operation = operation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isNumeric(operation)) {
            if (com.resultLabel.getText().equals("0")) {
                com.resultLabel.setText(operation);
            } else {
                com.resultLabel.setText(com.resultLabel.getText() + operation);
            }
        } else if (operation.equals("C")) {
            com.resultLabel.setText("0");
        } else if (operation.equals("=")) {
            if (isNumeric(String.valueOf(com.resultLabel.getText().charAt(com.resultLabel.getText().length() - 1)))) {
                InfixToPrefix app = new InfixToPrefix();
                System.out.println(app.run(com.resultLabel.getText()));
                com.resultLabel.setText(getResult(app.run(com.resultLabel.getText())));
            }
        } else {
            if (isNumeric(String.valueOf(com.resultLabel.getText().charAt(com.resultLabel.getText().length() - 1))) && !com.resultLabel.getText().equals("0")) {
                com.resultLabel.setText(com.resultLabel.getText() + operation);
            }
            if(!isNumeric(String.valueOf(com.resultLabel.getText().charAt(com.resultLabel.getText().length() - 1))) && !com.resultLabel.getText().equals("0")){
                com.resultLabel.setText(com.resultLabel.getText().substring(0, com.resultLabel.getText().length() - 1) + operation);
            }
        }

    }

    private static boolean isNumeric(String cad) {

        boolean ban;

        try {
            Integer.parseInt(cad);
            ban = true;
        } catch (NumberFormatException excepcion) {
            ban = false;
        }

        return ban;
    }

    private String getResult(Stack<String> stack) {
        Arithmetic operation = new Arithmetic();
        Stack< String> E = new Stack< String>(); //Pila entrada
        Stack< String> P = new Stack< String>(); //Pila de operandos

        // Añadir post(array) a la Pila de entrada(E)
        while (!stack.isEmpty()) {
            E.push(stack.pop());
        }
        //Algoritmo de Evaluación Postfija
        String operadores = "+-*/%";
        while (!E.isEmpty()) {
            if (operadores.contains("" + E.peek())) {
                P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
            } else {
                P.push(E.pop());
            }
        }

        //Mostrar resultados:
        System.out.println("Result: " + P.peek());

        return P.peek();
    }

    private static String evaluar(String op, String n2, String n1) {
        Arithmetic operation = new Arithmetic();
        if (op.equals("+")) {
            return operation.sum(n1, n2);
        }
        if (op.equals("-")) {
            return operation.subtraction(n1, n2);
        }
        if (op.equals("*")) {
            return operation.multiplication(n1, n2);
        }
        if (op.equals("/")) {
            return operation.division(n1, n2);
        }
        return "error";
    }

}
