package src;

public class Conditions {
    public static int abs(int x) {
        return (x < 0) ? (x * -1) : x;
    }

    public static int safeDiv(int x, int y) {
        return (y != 0) ? (x / y) : 0;
    }

    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static String makeDecision(int x, int y) {
        return (x == y) ? (x + " = " + y) : (x > y)
                ? (x + " > " + y) : (x + " < " + y);
    }

    public static int max3(int x, int y, int z) {
        int max = (x > y) ? x : y;
        return (max > z) ? max : z;
    }

    public static boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public static int sum2(int x, int y) {
        int sum;
        sum = x + y;
        return (sum > 10 && sum < 20) ? 20 : sum;
    }

    public static boolean is35(int x) {
        return (x % 3 == 0 ^ x % 5 == 0);
    }

    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || x + y == 6 || x - y == 6 || y - x == 6;
    }

    public static String age(int x) {
        int lastDigit = x % 10;
        int lastTwoDigits = x % 100;

        if (lastDigit == 1 && lastTwoDigits != 11) {
            return x + " год";
        }
        if ((lastDigit >= 2 && lastDigit <= 4) && !(lastTwoDigits >= 11 && lastTwoDigits <= 14)) {
            return x + " года";
        }
        return x + " лет";
    }

    public static String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    public static String printDays(String x) {
        String res = "";

        switch (x.toLowerCase()) {
            case "понедельник":
                res += "понедельник\n";
            case "вторник":
                res += "вторник\n";
            case "среда":
                res += "среда\n";
            case "четверг":
                res += "четверг\n";
            case "пятница":
                res += "пятница\n";
            case "суббота":
                res += "суббота\n";
            case "воскресенье":
                res += "воскресенье\n";
                break;
            default:
                res = "это не день недели";
                break;
        }
        return res.trim();
    }
}
