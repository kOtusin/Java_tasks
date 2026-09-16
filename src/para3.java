import java.util.Scanner;

public class para3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        double a = sc.nextDouble();

        System.out.println("Введите второе число");
        double b = sc.nextDouble();

        System.out.println("Введите третье число");
        double c = sc.nextDouble();

        boolean available = false;

        if (b - a == c - b) {
            System.out.println("Арифметическая прогрессия: " + a + ", " + b + ", " + c);
            System.out.println("Первый член = " + a + ", разность = " + (b - a));
            available = true;
        }

        else if (a - b == c - a) {
            System.out.println("Арифметическая прогрессия: " + b + ", " + a + ", " + c);
            System.out.println("Первый член = " + b + ", разность = " + (a - b));
            available = true;
        }

        else if (a - c == b - a) {
            System.out.println("Арифметическая прогрессия: " + a + ", " + c + ", " + b);
            System.out.println("Первый член = " + a + ", разность = " + (a - c));
            available = true;
        }


        if (!available) {
            if (b * b == a * c) {
                System.out.println("Геометрическая прогрессия: " + a + ", " + b + ", " + c);
                System.out.println("Первый член = " + a + ", знаменатель = " + (b / a));
                available = true;
            }
            else if (a * a == b * c) {
                System.out.println("Геометрическая прогрессия: " + b + ", " + a + ", " + c);
                System.out.println("Первый член = " + b + ", знаменатель = " + (a / b));
                available = true;
            }
            else if (a * a == c * b) {
                System.out.println("Геометрическая прогрессия: " + a + ", " + c + ", " + b);
                System.out.println("Первый член = " + a + ", знаменатель = " + (c / a));
                available = true;
            }
        }
        if (!available) {
            System.out.println("Из этих чисел нельзя составить прогрессию");
        }
    }
}