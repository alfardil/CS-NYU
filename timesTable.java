public class timesTable {
    public static void main(String[] args) {
        // implement a program which represents a multiplcation times table
        int length = 12;
        int[][] table = new int[length+1][length+1];

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length; j++) {

                if (i == 0 && j == 0) {
                    table[i][j] = 0;
                }

                else if (i == 0 && !(j == 0)) {
                    table[i][j] = j;
                }

                else if (!(i == 0) && (j == 0)) {
                    table[i][j] = i;
                }

                else {
                    table[i][j] = i*j;
                }



            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }


    }





}
