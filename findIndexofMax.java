public class findIndexofMax {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Index of the max is " + index);
    }
}