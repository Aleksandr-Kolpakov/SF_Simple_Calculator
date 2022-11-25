import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите первый операнд");
        int a = scanner.nextInt();

        System.out.println("введите оператор");

        char op = scanner.next().charAt(0);
        if ( checkOperator(op) ) {
            System.out.println("введите второй операнд");
        } else {
            System.out.println("Введенный оператор не соответствует условю задачи");
        }

        int b = scanner.nextInt();

        System.out.println("Результат вычисления: " + getResult(a, op, b));

    }



    private static boolean checkOperator(char op) {
        char[] arr = {'+', '-', '*', '/'};

        for (char c : arr) {
            if (c != op) {
                continue;
            }
            return true;
        }
        return false;
    }


    public static int getResult(int a, char op, int b) {

        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 404;
        };
    }

}
