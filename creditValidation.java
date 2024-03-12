import java.util.Scanner;




public class creditValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // make sure digits are between 13 and 16
        int digits = 0; 
        while (true) {
            System.out.print("How many digits are in your credit card number? ");
            digits = scanner.nextInt();

            if (digits >= 13 && digits <= 16) {
                break;
            }
            else {
                System.out.println("The amount of digits must be between 13 and 16.");
            }
        }

        int[] creditCard = new int[digits];

        int number = 0;
        // add credit card numbers to an array
        for (int i = 0; i < creditCard.length; i++){
            // make sure it's just one digit we're getting at a time
            while (true) {
                System.out.print("Enter a credit card number: ");
                number = scanner.nextInt();

                if (number > 0 && number < 10) {
                    break;
                }
                else {
                    System.out.println("Just one digit at a time please.");
                }
            }
            creditCard[i] = number;
        }

        // in the case that the prefix doesn't match the possible types
        




        // see what type of card it is 
        System.out.println(cardType(creditCard));
        // get the actual number of the credit card
        System.out.println(getCreditCardNumber(creditCard));


        scanner.close();
    }



    // method to add credit card numbers that are in an array to a string
    public static String getCreditCardNumber(int[] arr) {
        String creditCardNumber = "";

        for (int i = 0; i < arr.length; i++) {
            creditCardNumber += String.valueOf(arr[i]);
        }

        return creditCardNumber;
    }

    // method to return credit card type 
    public static String cardType(int[] arr) {
        if (arr[0] == 5) {
            return "Mastercard";
        }
        else if (arr[0] == 4) {
            return "Visa";
        }
        else if (arr[0] == 3 && arr[1] == 7) {
            return "American Express";
        }
        else if (arr[0] == 6){
            return "Discover";
        }
        else {
            return "Not a possible type.";
        }
    }









}
