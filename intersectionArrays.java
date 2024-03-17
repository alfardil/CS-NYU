public class intersectionArrays {

    // a.) print the original arrays in two seperate lines (DONE)
    // b.) print the intersection of two arrays (DONE)

    public static void main(String[] args) {
        int array1[] = {1,3,5,6,7,8,9,10};
        int array2[] = {0,2,4,5,6,7,8,9,10};

        System.out.println("The contents of Array1 are: ");
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n");
        System.out.println("The contents of Array2 are: ");
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n");

        if (Intersection(array1, array2) == -1) {
            System.out.println("These arrays do not intersect.");
        }
        else {
            System.out.println("These arrays intersect at " + Intersection(array1, array2));
        }

    }

    public static int Intersection(int[] arr1, int[] arr2) {
        int doesNotIntersect = -1;

        // go through first array
        for (int i = 0; i < arr1.length; i++) {
            // compare each of the elements in the second array with the elements in the first array
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    return arr1[i];
                }
            }
        }

        // return -1 if it doesn't intersect
        return doesNotIntersect;

    }


}
