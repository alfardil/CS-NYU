import java.util.Scanner;

public class CheckForPalindrome {

    public static boolean checkPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (left < right){
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase to check if it is a palindrome: ");
        String checkWord = scanner.nextLine();
        checkWord = checkWord.toLowerCase();
        // get rid of all the spaces in a phrase
        checkWord = checkWord.replace(" ","");

        if (checkPalindrome(checkWord)){
            System.out.println("Your word is a palindrome!");
        }
        else {
            System.out.println("Your word is not a palindrome!");
        }


        scanner.close();
    }
}