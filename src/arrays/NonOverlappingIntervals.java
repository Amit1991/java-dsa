package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonOverlappingIntervals {

    //TC: O(n)
    //SC: O(n)
    public static int[][] solve(int[][] A) {

        List<List<Integer>> ans = new ArrayList<>();

        int start = A[0][0];
        int end = A[0][1];

        int currStart;
        int currEnd;

        for(int x = 1; x < A.length; x++) {

            currStart = A[x][0];
            currEnd = A[x][1];

            if(currStart <= end) {
                end = Math.max(end, currEnd);
            }
            else {

                ans.add(Arrays.asList(start, end));

                start = currStart;
                end = currEnd;
            }
        }

        ans.add(Arrays.asList(start, end));
        int[][] finalAns = new int[ans.size()][2];

        for(int x = 0; x < ans.size(); x++) {
            finalAns[x][0] = ans.get(x).get(0);
            finalAns[x][1] = ans.get(x).get(1);
        }

        return finalAns;
    }

    public static void main(String[] args) {

        int[][] A = new int[][]{{1,17},{1,32},{3,13},{4,100},{5,31},{5,63},{6,11},{6,57},{7,24},{7,76},{8,36},{9,15},{9,44},{10,26},{10,71},{10,76},{10,87},{11,12},{12,24},{12,28},{13,67},{14,29},{15,88},{16,21},{17,31},{17,85},{18,29},{18,42},{18,47},{21,35},{21,35},{21,72},{24,67},{25,62},{25,78},{27,100},{29,37},{29,83},{29,94},{30,63},{30,95},{31,73},{31,78},{32,70},{33,40},{33,51},{36,53},{37,90},{39,70},{40,73},{44,59},{45,90},{46,93},{47,74},{48,79},{48,94},{49,68},{51,63},{53,55},{56,70},{56,87},{58,71},{58,79},{62,68},{63,73},{64,74},{66,83},{67,100},{68,75},{68,78},{69,94},{70,73},{78,83}};
        System.out.println(Arrays.deepToString(solve(A)));
    }
}
