import java.util.Scanner;
import java.io.IOException;

public class Calc {

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        double x, y;
        char op;

        System.out.println("Введите первое число");
        x = in.nextDouble();
        System.out.println("Введите второе число");
        y = in.nextDouble();
        System.out.println("Введите операцию (+, -, /, *)");
        op = (char) System.in.read();
        in.close();

        if ((y == 0) && (op == '/')) throw new Error();
        double res = calculator(x, y, op);
        System.out.println(res);
    }

    private static double calculator(double x, double y, char op) {
        double result = 0;
        switch (op) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '/':
                result = x / y;
                break;
            case '*':
                result = x * y;
                break;
            default:
        }
        return result;
    }
}
