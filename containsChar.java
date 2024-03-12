public class containsChar {
    // implement a program which checks if a string has an element of a char array and print which ones.

    public static void main(String[] args) {
        String string = "Hello World";
        string = string.toLowerCase();
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',};

        // go through the string
        for (int i = 0; i < string.length(); i++){
            // initialize the char of the index we're looking at in the string 
            char charInString = string.charAt(i);
            // iterate through the array 
            for (int j = 0; j < array.length; j++){
                // compare character to character (we can do that with ==)
                if (charInString == array[j]) {
                    System.out.println("The character " + charInString + " is in the array");
                }
            }
        }

    }
}
