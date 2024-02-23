import java.util.Scanner;

public class EvenSeriesSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a starting range ");
        int startingRange = scanner.nextInt();
        System.out.println("Enter an end range ");
        int endRange = scanner.nextInt();
        int sum = 0;
        for (int i = startingRange; i <= endRange; i++){
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
