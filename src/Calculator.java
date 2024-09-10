import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print(" Введите формулу. Например: 3 + 3: ");
            int a = scanner.nextInt();
            if (a > 10) {
                System.out.println(" число не должно быть больше 10 ");
                return;
            }
            char getOperator = scanner.next().charAt(0);
            int b = scanner.nextInt();
            if (b > 10) {
                System.out.println(" Число не должно быть больше 10 ");
                return;
            }
            int result;
            switch (getOperator) {
                case '*':
                    result = a * b;
                    break;
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println(" Не Делится на ноль ");
                        return;
                    }
                    break;
                default:
                    System.out.println(" Неверный символ. Требуются знаки +, -, *, / ");
                    return;
            }
            System.out.println(" Ответ: " + result);
        } catch (InputMismatchException e) {
            System.out.println(" Ошибка: введено не число ");
        }
    }
}