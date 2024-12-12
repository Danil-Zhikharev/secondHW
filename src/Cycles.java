package src;

public class Cycles {
    public static String listNums(int x) {
        String res = "";
        int i = -1;
        while (i++ < x) {
            res += " " + i;
        }
        return res.trim();
    }

    public static String reverseListNums(int x) {
        String res = "";
        int i = x + 1;
        while (i-- > 0) {
            res += " " + i;
        }
        return res.trim();
    }

    public static String chet(int x) {
        String res = "";
        int i = 0;
        while (i * 2 <= x) {
            res += " " + (i * 2);
            i++;
        }
        return res.trim();
    }

    public static int pow(int x, int y) {
        int res = 1;
        int i = 0;
        while (i < y) {
            res = res * x;
            i++;
        }
        return res;
    }

    public static int numLen(long x) {
        int res = 0;
        do {
            res++;
            x /= 10;
        } while (x != 0);
        return res;
    }

    public static boolean equalNum(int x) {
        int lastDigit = x % 10;
        while (x != 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x /= 10; //
        }
        return true;
    }

    public static void square(int x) {
        System.out.print("Результат метода square: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int x) {
        System.out.print("Результат метода leftTriangle: \n");
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void rightTriangle(int x) {
        System.out.print("Результат метода rightTriangle: \n");
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void guessGame() {
        int randomNum = 3;
        int attempts = 0;
        int x = -1;

        System.out.println("Какое число загадано от 1 до 9 :");

        while (x != randomNum) {
            try {
                x = System.in.read() - '0';
                System.in.read();
                attempts++;

                if (x != randomNum) {
                    System.out.println("Нет, попробуйте еще раз");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Введите число от 0 до 9");
                continue;
            }
        }
        System.out.println("Да, это число: " + randomNum);
        System.out.println("Количество ваших попыток: " + attempts);
    }
}

