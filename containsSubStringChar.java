public class containsSubStringChar {
    public static void main(String[] args) {
        String string = "check for abc?";
        char array[] = {'a', 'b', 'c'};
        boolean letssee = false;

        
        for (int i = 0; i < string.length()-2; i++){
            if (string.charAt(i) == array[0]) {
                if (string.charAt(i+1) == array[1]) {
                    if (string.charAt(i+2) == array[2]) {
                        letssee = true;
                    }
                }
            }
        }


        if (letssee) {
            System.out.println("You had a valid substring!");
        }
        else {
            System.out.println("No valid substrings found.");
        }

    }
}





