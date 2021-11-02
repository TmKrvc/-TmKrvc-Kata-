import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет я калькулятор!");
        System.out.println("Могу считать римские и арабские числа! С каких начнем?");
        System.out.println("Введи два арабских (5+6) или два римских числа (II+V) и нажми Enter");
        String user = scanner.nextLine();
        char[] symbol = new char[10];
        Rome rome = new Rome();
        Arab arab = new Arab();

        for (int i = 0; i < user.length(); i++) {
            symbol[i] = user.charAt(i);

            if (symbol[i] == '+') {
                rome.setOperation('+');
                arab.setOperation('+');
            }
            if (symbol[i] == '*') {
                rome.setOperation('*');
                arab.setOperation('*');
            }
            if (symbol[i] == '/') {
                rome.setOperation('/');
                arab.setOperation('/');

            }
            if (symbol[i] == '-') {
                rome.setOperation('-');
                arab.setOperation('-');
            }

        }

        String symbolString = String.valueOf(symbol);
        String[] split = symbolString.split("[-+*/]");
        if (split.length >= 3) {
            throw new Exception("Чисел больше чем нужно");
        }

        String number1 = split[0];
        String numb2 = null;
        try {
            numb2 = split[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Неподходящее число или неправильный математический знак операции "+e);

        }
        String number2 = numb2.trim();
        rome.setNum1(rome.romanToNumber(number1));
        rome.setNum2(rome.romanToNumber(number2));

        if (rome.getNum1() > 0 && rome.getNum2() > 0) {
            System.out.println("Результат для римских цифр: ");
            rome.setResult(rome.calculated(rome.getNum1(), rome.getNum2(), rome.getOperation()));
            String resultRoman = rome.convertNumToRoman(rome.getResult());
            System.out.println(resultRoman);
            System.exit(0);
        }

        if (rome.getNum1() < 0 && rome.getNum2() < 0) {
            rome.setResult(0);
        }else{

        }
        try{
            arab.setNum1(Integer.parseInt(number1));
            arab.setNum2(Integer.parseInt(number2));
        }catch (NumberFormatException e){
            System.err.println("Введенное число не может быть больше X "+e);
        }

        if(arab.getNum1()>0 && arab.getNum2()>0){
            arab.setResult(arab.calculated(arab.getNum1(), arab.getNum2(), arab.getOperation()));
            System.out.println("Результат для арабских цифр: ");
            System.out.println(arab.getResult());
        }

    }

}
