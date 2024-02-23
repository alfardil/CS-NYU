import java.util.Scanner;

public class PowerOfSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int firstInteger = scanner.nextInt();
        System.out.print("Enter another integer: ");
        int secondInteger = scanner.nextInt();
        float result = 1;

        if (secondInteger > 0) {
            result = Exponent(firstInteger, secondInteger);
        }
        else if (secondInteger < 0) {
            // make the second integer positive for our exponent function to work with negative numbers
            secondInteger *= -1;
            result = 1 / Exponent(firstInteger, (secondInteger));
            secondInteger *= -1;
        }
        else if (secondInteger == 0) {
            result = 1;
        }
        System.out.println(firstInteger + " to the " + secondInteger + " is " + result);
        scanner.close();
    }

    public static float Exponent(float first, float second){
        int result = 1;
        for (int i = 0; i < second; i++) {
            result *= first;
    }
    return result;
    }



}