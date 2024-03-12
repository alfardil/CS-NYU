public class binary {

    // binary search algorithm O(log(n)) time complexity 
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int start = 0, end = array.length-1, target = 10;
        boolean foundTarget = false;
        int counter = 0;


        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (array[mid] == target) {
                foundTarget = true;
                break;
            }
            else if (array[mid] < target) {
                start = mid + 1;
                counter += 1;
            }
            else {
                end = mid - 1;
                counter += 1;
            }
        }

        // our output shows where/when we found our target
        System.out.println(foundTarget);
        System.out.println(counter);
        


    }
}
