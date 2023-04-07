package com.example.samplecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button btnone;
    @FXML
    private TextField textField1;
    @FXML
    private Button btntwo;

    @FXML
    private Button btnplus;

    @FXML
    private Button btnequal;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Button btnclear;
    @FXML
    private Button btnper;
    @FXML
    private Button btnm;
    @FXML
    private Button btntimes;
    @FXML
    private Button btnd;
    @FXML
    private Button btndot;
    @FXML
    private Button btnn;
    @FXML
    private Button cos;
    @FXML
    private Button sin;
    @FXML
    private Button tan;
    @FXML
    private Button sec;
    @FXML
    private Button csc;
    @FXML
    private Button cot;
    @FXML
    private Button cancel;
    @FXML
    private Button Lbracket;
    @FXML
    private Button Rbracket;

    @FXML
    private Button sqrt;
    @FXML
    private Button power;
    @FXML
    private Label label1;

    @FXML
    private TextField textfield;
    private Double firstnum;
    private Double secondnum;
    private Double sum = 0.0;
    private String operation;

    @FXML
    private void handleCos() {
        operation = "cos( ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleLbracket() {
        operation = "( ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleRbracket() {
        operation = " ) ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleSec() {
        operation = "sec( ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleTan() {
        operation = "tan( ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleSin() {
        operation = "sin( ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleCot() {
        operation = "cot( ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleCsc() {
        operation = "csc( ";
        textfield.setText(textfield.getText() + operation);
    }

    @FXML
    private void handleCancel() {
        operation = textfield.getText();
        Character ch = ((operation.charAt(operation.length() - 1)));
        if (ch.isDigit(ch)) {
            operation = operation.replace(String.valueOf(operation.charAt(operation.length() - 1)), "");
            textfield.setText(operation);
        }

        else {
            Stack<String> stack = new Stack<>();
            ArrayList<String> arrayList = new ArrayList<String>();
            StringTokenizer stringTokenizer = new StringTokenizer(operation, " ");
            String temp = null;
            while (stringTokenizer.hasMoreTokens())
                stack.add(stringTokenizer.nextToken());

            stack.pop();
            System.out.println(stack.toString());
            int i = 0;
            operation = "";
            while (!stack.isEmpty())
                operation = operation + " " + stack.remove(0);
            if (operation.isEmpty())
                textfield.setText("");
            else {
                textfield.setText(operation);
            }
        }

    }

    @FXML
    private void handleAbs() {
        Double aDouble = Double.parseDouble(textfield.getText());
        aDouble = aDouble < 0 ? aDouble * -1 : aDouble;
        label1.setText(Double.toString(aDouble));
        textfield.setText(Double.toString(aDouble));
    }

    @FXML
    private void handleSqrt() {
        String temp4 = textfield.getText();
        textfield.setText(textfield.getText() + " √( ");
    }

    @FXML
    private void handlePower() {
        firstnum = Double.parseDouble(textfield.getText());
        operation = "^";
        textfield.setText(Double.toString(firstnum) + " ^ ");
    }

    @FXML
    private void handlebtnone() {
        textfield.setText(textfield.getText() + btnone.getText());

    }

    @FXML
    private void handlebtntwo() {
        textfield.setText(textfield.getText() + btntwo.getText());

    }

    @FXML
    private void handlebtn3() {
        textfield.setText(textfield.getText() + btn3.getText());

    }

    @FXML
    private void handlebtn4() {
        textfield.setText(textfield.getText() + btn4.getText());

    }

    @FXML
    private void handlebtn5() {
        textfield.setText(textfield.getText() + btn5.getText());

    }

    @FXML
    private void handlebtn6() {
        textfield.setText(textfield.getText() + btn6.getText());

    }

    @FXML
    private void handlebtn7() {
        textfield.setText(textfield.getText() + btn7.getText());

    }

    @FXML
    private void handlebtn8() {
        textfield.setText(textfield.getText() + btn8.getText());

    }

    @FXML
    private void handlebtn9() {
        textfield.setText(textfield.getText() + "9");

    }

    @FXML
    private void handlebtn0() {
        textfield.setText(textfield.getText() + "0");

    }

    @FXML
    private void handlebtnplus() {
        operation = "+";
        textfield.setText(textfield.getText() + " + ");

    }

    @FXML
    private void handlebtnm() {
        operation = "-";
        textfield.setText(textfield.getText() + " - ");

    }

    @FXML
    private void handlebtntimes() {
        operation = "*";
        textfield.setText(textfield.getText() + " * ");

    }

    @FXML
    private void handlebtnd() {
        operation = "/";
        textfield.setText(textfield.getText() + " / ");
    }

    @FXML
    private void handlebtnclear() {
        textfield.clear();

    }

    @FXML
    private void handlebtnn() {
        String temp = (textfield.getText());
        StringTokenizer stringTokenizer = new StringTokenizer(temp," ");
        Stack<String> stack = new Stack<String>();
        String t = new String();
        while (stringTokenizer.hasMoreTokens())
            stack.push(stringTokenizer.nextToken());
        int i = 1;
        t = stack.pop();
        if (!stack.isEmpty())
        temp = stack.get(0);
        while (i < stack.size())
        {
            temp = temp + " " + stack.get(i);
            i++;
        }
        t = Double.toString(Double.parseDouble(t)*-1);
        temp = temp + " "+ t;
        textfield.setText(temp);

    }

    @FXML
    private void handlebtnper() {
        operation = " % ";
        textfield.setText(textfield.getText() + " % ");
    }

    @FXML
    private void handlebtndot() {
        textfield.setText(textfield.getText() + ".");
    }

    @FXML
    private void handlebtnequal() throws Exception {

        ArrayList<String> infix = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String temp = textfield.getText();
        String temp6 = textfield.getText();
        StringTokenizer stringTokenizer = new StringTokenizer(temp, " ");
        while (stringTokenizer.hasMoreTokens())
            infix.add(stringTokenizer.nextToken());
        ArrayList<String> temp2 = new ArrayList<String>();
        ArrayList<String> temp3 = new ArrayList<String>();
        System.out.println(infix.toString());
        temp = getMore(infix);
//        if (temp6.equalsIgnoreCase("undefined")) {
//            textfield.setText(temp6);
//            label1.setText(temp6);
//        } else {
//            StringTokenizer stringTokenizer1 = new StringTokenizer(temp, ".");
//            String temp1 = stringTokenizer1.nextToken();
//            Integer integer = null;
//
//            if (operation.equalsIgnoreCase(" % ")) {
//                textfield.setText(Integer.toString(Integer.parseInt(temp1)));
//                label1.setText(Integer.toString(Integer.parseInt(temp1)));
//            } else {
//                if (Double.parseDouble(temp) == Double.parseDouble(temp1)) {
//
//                    textfield.setText(Integer.toString(Integer.parseInt(temp1)));
//                    label1.setText(Integer.toString(Integer.parseInt(temp1)));
//
//                } else
                    textfield.setText(temp);
                label1.setText(temp);
//            }
//        }

    }
private String getMore(ArrayList<String> infix){
        String temp = "0";
        ArrayList<String> temp3 = new ArrayList<String>();
        ArrayList<String> temp2 = new ArrayList<String>();
    for (int i = 0; i < infix.size(); i++) {
        if (infix.get(i).equalsIgnoreCase("cos(") ||
                infix.get(i).equalsIgnoreCase("sin(") ||
                infix.get(i).equalsIgnoreCase("cot(") ||
                infix.get(i).equalsIgnoreCase("tan(") ||
                infix.get(i).equalsIgnoreCase("csc(") ||
                infix.get(i).equalsIgnoreCase("√(") ||
                infix.get(i).substring(1).contains("(") ||
                infix.get(i).equalsIgnoreCase("sec(")) {

            operation = infix.get(i);
            i++;
            for (; !infix.get(i).equalsIgnoreCase(")"); i++) {
                if (infix.get(i).contains("(")) {
                    ArrayList<String> temp7 = null;
                    while (i < infix.size()) ;
                    {
                        temp7.add(infix.get(i));
                        i++;
                    }
                    temp = (getMore(temp7));
                    temp3.add(temp);

                } else
                    temp3.add(infix.get(i));

            }
            switch (operation) {
                case "cos(":

                    temp = Double.toString(Math.cos(Math.toRadians(evaluatePostfix(infixToPostfix(temp3)))));
                    if (Math.abs(Double.parseDouble(temp)) <= Math.cos(Math.toRadians(89.999999999999)))
                        temp = "0.0";
                    else if (Math.abs(Double.parseDouble(temp)) >= 1 / Math.cos(Math.toRadians(89.999999999999)))
                        temp = "undefined";
                    else
                        ;
                    break;
                case "sin(":
                    temp = Double.toString(Math.sin(Math.toRadians(evaluatePostfix(infixToPostfix(temp3)))));
                    if (Math.abs(Double.parseDouble(temp)) <= Math.cos(Math.toRadians(89.999999999999)))
                        temp = "0.0";
                    else if (Math.abs(Double.parseDouble(temp)) >= 1 / Math.cos(Math.toRadians(89.999999999999)))
                        temp = "undefined";
                    else
                        ;
                    break;
                case "cot(":
                    temp = Double.toString(1 / Math.tan(Math.toRadians(evaluatePostfix(infixToPostfix(temp3)))));
                    if (Math.abs(Double.parseDouble(temp)) <= Math.cos(Math.toRadians(89.999999999999)))
                        temp = "0.0";
                    else if (Math.abs(Double.parseDouble(temp)) >= 1 / Math.cos(Math.toRadians(89.999999999999)))
                        temp = "undefined";
                    else
                        ;
                    break;
                case "tan(":
                    temp = Double.toString(Math.tan(Math.toRadians(evaluatePostfix(infixToPostfix(temp3)))));
                    if (Math.abs(Double.parseDouble(temp)) <= Math.cos(Math.toRadians(89.999999999999)))
                        temp = "0.0";
                    else if (Math.abs(Double.parseDouble(temp)) >= 1 / Math.cos(Math.toRadians(89.999999999999)))
                        temp = "undefined";
                    else
                        ;
                    break;
                case "csc(":
                    temp = Double.toString(1 / Math.sin(Math.toRadians(evaluatePostfix(infixToPostfix(temp3)))));
                    if (Math.abs(Double.parseDouble(temp)) <= Math.cos(Math.toRadians(89.999999999999)))
                        temp = "0.0";
                    else if (Math.abs(Double.parseDouble(temp)) >= 1 / Math.cos(Math.toRadians(89.999999999999)))
                        temp = "undefined";
                    else
                        ;
                    break;
                case "sec(":
                    temp = Double.toString(1 / Math.cos(Math.toRadians(evaluatePostfix(infixToPostfix(temp3)))));
                    if (Math.abs(Double.parseDouble(temp)) <= Math.cos(Math.toRadians(89.999999999999)))
                        temp = "0.0";
                    else if (Math.abs(Double.parseDouble(temp)) >= 1 / Math.cos(Math.toRadians(89.999999999999))) {
                        temp = "undefined";
                        textfield.setText(temp);
                        label1.setText(temp);
                        break;
                    } else
                        ;

                    break;

                case "√(":
                    temp = Double.toString(Math.sqrt(evaluatePostfix(infixToPostfix(temp3))));

                    break;

            }

            temp2.add(temp);
        } else
            temp2.add(infix.get(i));
    }

        temp = Double.toString(evaluatePostfix(infixToPostfix(temp2)));

//        else if (infix.get(i).startsWith("√") && !operation.contains("(")) {
//
//            String value = operation.substring(1);
//            System.out.println(value);
//            temp = Double.toString(Math.sqrt(Double.parseDouble(value)));
//            temp2.add(temp);
//        } else
//            temp2.add(infix.get(i));
//
//    }
    return  temp;
}
//private  String gatSec(ArrayList<String> infix){
//      String operation = infix.get(0);
//      String temp =null;
//    int j = 1 ;
//    for (int i = 0; j > 0 ;i++) {
//        if(infix.get(i).equalsIgnoreCase(")"))
//            j--;
//        else if (infix.get(i).equalsIgnoreCase("("))
//            j++;
//        else
//           j=j + 0;
//        temp3.add(infix.get(i));
//
//    }
//
//    return temp;
//}
    private static final String OPERATORS = "+-*/";

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            case '%':
                return 4;
            case '_':
                return 5;
        }
        return -1;
    }

    public static ArrayList<String> infixToPostfix(ArrayList<String> infix) {
        ArrayList<String> postfix = new ArrayList<String>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.size(); i++) {
            String c = infix.get(i) + "";
            if (Character.isDigit(c.charAt(0))) {
                postfix.add(c);
            } else if (c.startsWith("-") && c.length() > 1) {
                stack.push('_');
                postfix.add(c.substring(1));
            } else if (c.equalsIgnoreCase("(")) {
                stack.push(c.charAt(0));
            } else if (c.equalsIgnoreCase(")")) {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.add(stack.pop() + "");
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return null;
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && precedence(c.charAt(0)) <= precedence(stack.peek())) {
                    postfix.add(stack.pop() + "");
                }
                stack.push(c.charAt(0));
            }
        }

        while (!stack.isEmpty()) {
            postfix.add(stack.pop() + "");
        }
        return postfix;
    }

    public static double evaluatePostfix(ArrayList<String> postfix) {
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < postfix.size(); i++) {
            String c = postfix.get(i);

            if (Character.isDigit(c.charAt(0))) {
                stack.push(Double.parseDouble(c));
            } else {
                if (c.equalsIgnoreCase("_")) {
                    stack.push(stack.pop() * -1);
                } else {
                    double val1 = stack.pop();
                    double val2 = stack.pop();

                    switch (c) {
                        case "+":
                            stack.push(val2 + val1);
                            break;

                        case "-":
                            stack.push(val2 - val1);
                            break;
                        case "*":
                            stack.push(val2 * val1);
                            break;
                        case "/":
                            stack.push(val2 / val1);
                            break;
                        case "^":
                            stack.push(Math.pow(val2, val1));
                            break;
                        case "%":
                            stack.push(val2 % val1);
                            break;
                    }
                }
            }
        }

        return stack.pop();
    }

}

// StringTokenizer token = null;
// try {
// token = new StringTokenizer(textfield.getText(),operation);
// } catch (NumberFormatException e) {
// // handle the case where the input string is not properly formatted
// System.out.println("Error: Input string is not a valid arithmetic
// expression");
// }
//
// if(operation == "+"){
// sum = Double.parseDouble(token.nextToken());
// while(token.hasMoreElements())
// {
// sum = sum + Double.parseDouble(token.nextToken());
// }
// textfield.setText(Double.toString(sum));
//
// }
// else if(operation == "-"){
// sum = Double.parseDouble(token.nextToken());
// while(token.hasMoreElements())
// {
// sum = sum - Double.parseDouble(token.nextToken());
// }
// textfield.setText(Double.toString(sum));
//
// }
// else if(operation == "*"){
// sum = 1.0;
// while(token.hasMoreElements())
// {
// sum = sum * Double.parseDouble(token.nextToken());
// }
// textfield.setText(Double.toString(sum));
//
// }
// else if(operation == "/"){
//
// sum = Double.parseDouble(token.nextToken());
// while(token.hasMoreElements())
// {
// sum = sum / Double.parseDouble(token.nextToken());
// }
// textfield.setText(Double.toString(sum));
//
// }
// sum = 0.0;
// if(operation.equals( "%")){
// int temp = Integer.parseInt(token.nextToken());
// while(token.hasMoreElements())
// {
// temp = temp % Integer.parseInt(token.nextToken());
// }
//
// textfield.setText(Integer.toString(temp));
//
// }

// textfield.setText(Evaluation(textfield.getText(),true));