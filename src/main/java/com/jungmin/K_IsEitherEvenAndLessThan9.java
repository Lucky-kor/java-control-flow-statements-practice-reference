package com.jungmin;

public class K_IsEitherEvenAndLessThan9 {
    public boolean isEitherEvenAndLessThan9(int num1, int num2) {
        if (num1 < 9 && num2 < 9) {
            if (num1 % 2 == 0 || num2 % 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
