package Calc;

import java.util.Stack;

public class Calc {
    private boolean isOperator(char b) {
        return b == '+' || b == '-' || b == '*' || b == '/' || b == '^' || b == '|' || b == '%';
    }

    private double vipolnOperation(double numb_one, double numb_two, char operator) {
        switch (operator) {
            case '+':
                return numb_one + numb_two;
            case '-':
                return numb_one - numb_two;
            case '*':
                return numb_one * numb_two;
            case '/':
                return numb_one / numb_two;
            case '%':
                return numb_one % numb_two;
            case '^':
                return Math.pow(numb_one, numb_two);
            default:
                throw new IllegalArgumentException("ха-ха, неверный оператор: " + operator);
        }
    }

    public double ozenExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char curr = expression.charAt(i);

            if (Character.isDigit(curr)) {
                StringBuilder numberBuilder = new StringBuilder();
                numberBuilder.append(curr);

                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    numberBuilder.append(expression.charAt(i + 1));
                    i++;
                }

                double number = Double.parseDouble(numberBuilder.toString());
                numbers.push(number);
            } else if (curr == '(') {
                operators.push(curr);
            } else if (curr == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char operator = operators.pop();
                    double numb_two = numbers.pop();
                    double numb_one = numbers.pop();
                    double result = vipolnOperation(numb_one, numb_two, operator);
                    numbers.push(result);
                }

                if (!operators.isEmpty() && operators.peek() == '(') {
                    operators.pop();
                }
            } else if (isOperator(curr)) {
                while (!operators.isEmpty() && getOperatorPriority(operators.peek()) >= getOperatorPriority(curr)) {
                    char operator = operators.pop();
                    double numb_two = numbers.pop();
                    double numb_one = numbers.pop();
                    double result = vipolnOperation(numb_one, numb_two, operator);
                    numbers.push(result);
                }

                operators.push(curr);
            }
        }

        while (!operators.isEmpty()) {
            char operator = operators.pop();
            double numb_two = numbers.pop();
            double numb_one = numbers.pop();
            double result = vipolnOperation(numb_one, numb_two, operator);
            numbers.push(result);
        }

        return numbers.pop();
    }

    private int getOperatorPriority(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
            case '|':
                return 3;
            default:
                return 0;
        }
    }
}