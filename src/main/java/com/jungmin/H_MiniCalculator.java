package com.jungmin;

public class H_MiniCalculator {
    public int miniCalculator(int num1, int num2, char operator) {
        if (operator == '+') {
            return num1 + num2;
        } else if (operator == '-') {
            return num1 - num2;
        } else if (operator == '*') {
            return num1 * num2;
        } else if (operator == '/') {
            return num1 / num2;
        } else if (operator == '%') {
            return num1 % num2;
        } else {
            return 0;
        }
    }
}
