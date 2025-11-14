package arrays;

public class SearchInSortedMatrix {

    public static int search(int[][] A, int B) {

        int y = A[0].length - 1;
        int x = 0;

        int ans = Integer.MAX_VALUE;
        int currAns = -1;

        while(x < A.length & y >= 0) {

            System.out.println(x + " " + y + " " + A[x][y]);
            if(A[x][y] == B) {
                currAns = ((x+1) * 1009) + y + 1;
                if(currAns < ans) {
                    ans = currAns;
                }
                y--;
            } else if(A[x][y] < B) {
                x++;
            } else if(A[x][y] > B) {
                y--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 2));
    }
}
