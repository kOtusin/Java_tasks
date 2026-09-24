import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        System.out.print("Введите K: ");
        int k = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double fin = Math.pow(i, k);
            sum += fin;
        }
        System.out.println(sum);
    }
}