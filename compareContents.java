public class compareContents {
    // method to see if two arrays have the same elements
    public static boolean Compare(int[] arr1, int[] arr2) {

        // if the array lengths are not the same then obviously their contents are not equal
        if (arr1.length != arr2.length) {
            return false;
        }

        // iterate through and make sure each element is the same. if not return false
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6,7,8,9,10,11};
        int array2[] = {1,2,3,4,5,6,7,8,9,10};

        if (Compare(array1, array2)) {
            System.out.println("These arrays are equal.");
        }
        else {
            System.out.println("These arrays are not equal.");
        }
    }



}
