public abstract class Operation {

    public int calculated(int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException e) {
                    System.err.println("На ноль делить нельзя " + e);
                    break;
                }
        }
        return result;

    }


}