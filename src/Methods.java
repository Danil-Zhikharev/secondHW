package src;

public class Methods {

    public static double fraction(double x) {
        int y;
        y = (int) x;
        return x - y;
    }

    public static int sumLastNums(int x) {
        int lastDigit = x % 10;
        int secondLastDigit = (x / 10) % 10;
        return lastDigit + secondLastDigit;
    }

    public static int charToNum(char x) {
        return x - 48;
    }

    public static boolean isPositive(int x) {
        return x > 0;
    }

    public static boolean is2Digits(int x) {
        return x > 9 || x < -9;
    }

    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    public static boolean isInRange(int a, int b, int num) {
        if (a > b) {
            int last = a;
            a = b;
            b = last;
        }
        return num >= a && num <= b;
    }

    public static boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }
}
