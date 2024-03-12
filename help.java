public class help {
    public static void main(String[] args) {

        int x[] = {5,4,3,2,1,0};
        int y[] = reverseArray(x);


        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }



    }


    public static int[] reverseArray(int[] arr) {
        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length-1-i]; 
        }

        return newArr;


    }



}