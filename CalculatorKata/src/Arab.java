public class Arab extends Operation {

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
            throw new Exception("Введенное число не может быть больше 10");
        }

    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) throws Exception {
        if (num2 <= 10) {
            this.num2 = num2;
        } else {
            throw new Exception("Введенное число не может быть больше 10");
        }
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
