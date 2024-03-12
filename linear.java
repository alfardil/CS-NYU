import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        // work with a linear search
        int array[] = {10,8,6,4,2,9,7,5,3,1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sony what number u want? btwn 1 and 10 pls! ");
        int target = scanner.nextInt();

        System.out.println("Linear Search Method");
        // bing chilling for loop
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                System.out.println("It only took you " + (i+1) + " amount of tries.");
                break;
            }
        }
        scanner.close();
    }
}
