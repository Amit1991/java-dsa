package arrays;

public class PaintersPartition {

    public static int timeNeededToPaint(int numberOfPainters, int capacity, int[] boards) {

        int l = 0;
        int r = 0;

        for(int board : boards){

            if(board > l) {
                l = board;
            }

            r += board;
        }

        int mid = 0;
        int count;
        int result = 0;

        while(l <= r) {

            mid = (r - l) / 2 + l;
            count = paintersNeeded(mid, boards);

            if(count <= numberOfPainters) {

                result = mid;
                r = mid - 1;
            } else{
                l = mid + 1;
            }
        }

        return result;
    }

    private static int paintersNeeded(int capacity, int[] boards) {
        int count = 1;
        int timeTaken = capacity;

        for(int i = 0; i < boards.length; i++) {

            if(boards[i] > capacity) return Integer.MAX_VALUE;

            if(boards[i] <= timeTaken) {
                timeTaken = timeTaken - boards[i];
            } else {
                count++;
                timeTaken = capacity - boards[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(timeNeededToPaint(5, 20, new int[]{3,5,1,7,8,2,5,3,10,1,4,7,5,4,6}));
    }
}
