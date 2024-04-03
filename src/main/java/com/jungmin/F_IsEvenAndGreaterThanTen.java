package com.jungmin;

public class F_IsEvenAndGreaterThanTen {
    public boolean isEvenAndGreaterThanTen(int num) {
        if (num % 2 == 0 && num > 10) {
            return true;
        }
        return false;
    }
}
