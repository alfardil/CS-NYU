import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // Write a program to find the sum and product of all elements of an array

        // first let's figure out how to put user input into an array
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you wanna do? ");
        int x = scanner.nextInt();
        int array[] = new int[x];
        
        System.out.println("Enter up to " + x + " numbers to find the sum and product of.");

        // print a bunch of stuff based on how many numbers the user inputs
        for (int i = 0; i < x; i++){
            if (i == 0) {
                System.out.println("What is the " + (i+1) + "st number? ");
            }
            else if (i == 1) {
                System.out.println("What is the " + (i+1) + "nd number? ");
            }
            else if (i == 2) {
                System.out.println("What is the " + (i+1) + "rd number? ");
            }
            else {
                System.out.println("What is the " + (i+1) + "th number ");
            }
            array[i] = scanner.nextInt();
        }      
        System.out.println("Here is your sum followed by the product. ");
        System.out.println(Sum(array));
        System.out.println(Product(array));
        scanner.close();
    }

    public static int Sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int Product(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++){
            product *= array[i];
        }
        return product;
    }
}

