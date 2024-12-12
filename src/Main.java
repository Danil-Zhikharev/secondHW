package src;

public class Main {
    public static void main(String[] arg) {
        // Раздел №2
        System.out.println("Результат метода fraction: " + Methods.fraction(5.25));
        System.out.println("Результат метода sumLastNums: " + Methods.sumLastNums(4568));
        System.out.println("Результат метода charToNum: " + Methods.charToNum('3'));
        System.out.println("Результат метода isPositive: " + Methods.isPositive(1));
        System.out.println("Результат метода is2Digits: " + Methods.is2Digits(32));
        System.out.println("Результат метода isUpperCase: " + Methods.isUpperCase('A'));
        System.out.println("Результат метода isInRange: " + Methods.isInRange(15, 2, 33));
        System.out.println("Результат метода isDivisor: " + Methods.isDivisor(3, 6));
        System.out.println("Результат метода isEqual: " + Methods.isEqual(3, 15, 3));
        int res = Methods.lastNumSum(Methods.lastNumSum(Methods.lastNumSum(Methods.lastNumSum(5, 11), 123), 14), 1);
        System.out.println("Результат метода lastNumSum: " + res);

        // Раздел №3
        System.out.println("Результат метода abs: " + Conditions.abs(-5));
        System.out.println("Результат метода safeDiv: " + Conditions.safeDiv(8, 2));
        System.out.println("Результат метода max: " + Conditions.max(8, 10));
        System.out.println("Результат метода makeDecision: " + Conditions.makeDecision(8, -8));
        System.out.println("Результат метода max3: " + Conditions.max3(1, 8, 7));
        System.out.println("Результат метода sum3: " + Conditions.sum3(3, 7, 4));
        System.out.println("Результат метода sum2: " + Conditions.sum2(10, 1));
        System.out.println("Результат метода is35: " + Conditions.is35(5));
        System.out.println("Результат метода magic6: " + Conditions.magic6(6, 2));
        System.out.println("Результат метода age: " + Conditions.age(514));
        System.out.println("Результат метода day: " + Conditions.day(3));
        System.out.println("Результат метода printDays:\n" + Conditions.printDays("Пятница"));

        // Раздел №4
        System.out.println("Результат метода listNums: " + Cycles.listNums(8));
        System.out.println("Результат метода reverseListNums: " + Cycles.reverseListNums(8));
        System.out.println("Результат метода chet: " + Cycles.chet(12));
        System.out.println("Результат метода pow: " + Cycles.pow(2, 5));
        System.out.println("Результат метода numLen: " + Cycles.numLen(123456));
        System.out.println("Результат метода numLen: " + Cycles.equalNum(1111));
        Cycles.square(4);
        Cycles.leftTriangle(4);
        Cycles.rightTriangle(4);
        Cycles.guessGame();
    }
}
