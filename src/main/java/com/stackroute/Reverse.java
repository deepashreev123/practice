package com.stackroute;

public class Reverse {

    public static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    public boolean checkInt() {
        int n = 0;
        if (n == (0 - 9)) {
            return true;
        } else {
            return false;
        }
    }

}
