public class findMaxMin {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
