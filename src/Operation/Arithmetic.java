/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

/**
 *
 * @author Frida Fernanda Arcos Gutierrez
 */
public class Arithmetic {

    public String sum(String elementA, String elementB) {
        String result = "";
        try {
            double a = Double.parseDouble(elementA);
            double b = Double.parseDouble(elementB);
            double c = a + b;
            result = String.valueOf(c);
        } catch (Exception e) {
            e.printStackTrace();
            result = "error";
        }
        return result;
    }
    public String subtraction(String elementA, String elementB) {
        String result = "";
        try {
            double a = Double.parseDouble(elementA);
            double b = Double.parseDouble(elementB);
            double c = a - b;
            result = String.valueOf(c);
        } catch (Exception e) {
            e.printStackTrace();
            result = "error";
        }
        return result;
    }
    public String multiplication(String elementA, String elementB) {
        String result = "";
        try {
            double a = Double.parseDouble(elementA);
            double b = Double.parseDouble(elementB);
            double c = a * b;
            result = String.valueOf(c);
        } catch (Exception e) {
            e.printStackTrace();
            result = "error";
        }
        return result;
    }
    public String division(String elementA, String elementB) {
        String result = "";
        try {
            double a = Double.parseDouble(elementA);
            double b = Double.parseDouble(elementB);
            double c = a / b;
            result = String.valueOf(c);
        } catch (Exception e) {
            e.printStackTrace();
            result = "error";
        }
        return result;
    }

}
