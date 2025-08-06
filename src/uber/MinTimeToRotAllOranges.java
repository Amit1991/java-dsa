package uber;

import arrays.ArrayUtils;

public class MinTimeToRotAllOranges {

    public static int findMinTimToRotAllOranges(int[][] array) {

        int ans = 0;
        boolean fruitGoneBad = false;

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++){
                fruitGoneBad = false;
                if(array[i][j] == 2) {
                    if(i+1 < array.length && array[i+1][j] == 1)
                    {
                        array[i+1][j] = 2;
                        fruitGoneBad = true;
                    }
                    if(i-1 >= 0 &&  array[i-1][j] == 1) {
                        array[i-1][j] = 2;
                        fruitGoneBad = true;
                    }
                    if(j+1 < array[i].length && array[i][j+1] == 1) {
                        array[i][j+1] = 2;
                        fruitGoneBad = true;
                    }
                    if(j-1 >= 0 && array[i][j-1] == 1) {
                        array[i][j-1] = 2;
                        fruitGoneBad = true;
                    }

                    if(fruitGoneBad){
                        ans++;
                    }
                }
            }
        }

        for(int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        for(int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if(array[i][j] == 1) {
                    ans = -1;
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] givenArray = ArrayUtils.getRandomArray();
        System.out.println(findMinTimToRotAllOranges(givenArray));
    }
}
