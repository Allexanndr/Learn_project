package com.company;

public class Start {
    public static void main(String[] args) {
        byte num = 100; // 8 бит -128 + 127
        short num1 = 131; // 16 бит -32 768 + 32 767
        int num2 = 141; // 32 бит -2 147 483 648 + -2 147 483 647
        long num3 = 123; // 64 бит -9 223 372 836 854 775 888 +  9 223 372 836 854 775 888

        float num4 = 1.1f; // 32 бит 6-7 знаков после запятой
        double num5 = 1.11d; // писать  d в конце не обязательно 64 бит 15 знаков после запятой

        char sym = '\u2122'; //символьный тип 16 бит

        boolean isTrue = false; // 1 бит true or false истина или лож
    }
}