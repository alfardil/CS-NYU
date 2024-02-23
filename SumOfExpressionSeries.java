import java.util.Scanner;
import java.lang.Math;

public class SumOfExpressionSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();
        System.out.print("Enter a starting range: ");
        int start = scanner.nextInt();
        System.out.print("Enter an ending range: ");
        int end = scanner.nextInt();
        System.out.println(Series(x, start, end));

        scanner.close();
    }
    public static int Series(int x, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += Math.pow(x, i) + i;
        }
        return sum;

}
}
