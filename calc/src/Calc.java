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
        System.out.println("Введите операцию (+, -, /, *)");
        op = (char) System.in.read();
        System.out.println("Введите второе число");
        y = in.nextDouble();

        if ((y == 0) && (op == '/')) System.out.println("NaN");

        double res = calc(x, y, op);

        System.out.printf("%.2f %c %.2f = %.2f", x, op, y, res);
    }

    private static double calc(double x, double y, char op) {
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
                throw new Error();
        }
        return result;
    }
}
