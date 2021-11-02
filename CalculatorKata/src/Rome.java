import java.util.InputMismatchException;

public class Rome extends Operation {

    private int num1;
    private int num2;
    private int result;
    private char operation;


    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) throws Exception {
        if (num1 <= 10) {
            this.num1 = num1;
        } else {
            throw new Exception("Введенное число не может быть больше X");
        }
    }


    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) throws Exception {
        if (num2 <= 10) {
            this.num2 = num2;
        } else {
            throw new Exception("Введенное число не может быть больше X");
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String convertNumToRoman(int numArab) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        try {
            String rome = roman[numArab];
            return rome;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Римские числа не могут быть отрицательными");
            System.exit(1);
            return "";
        }


    }


    public int romanToNumber(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else if (roman.equals("XX")) {
            return 20;
        } else if (roman.equals("XXX")) {
            return 30;
        } else if (roman.equals("XL")) {
            return 40;
        } else if (roman.equals("L")) {
            return 50;
        } else if (roman.equals("LX")) {
            return 60;
        } else if (roman.equals("LXX")) {
            return 70;
        } else if (roman.equals("LXXX")) {
            return 80;
        } else if (roman.equals("XC")) {
            return 90;
        } else if (roman.equals("C")) {
            return 100;
        }
        return -2;
    }

}
