package queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PlayWithQueue {

    public static int[] nNumbersHavingOnly123(int n) {

        int[] result = new int[n];

        if(n > 0) {

            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);

            for(int i = 0; i < n; i++) {

                result[i] = queue.remove();

                if(i < n-1) {
                    queue.add(result[i] * 10 + 1);
                    queue.add(result[i] * 10 + 2);
                    queue.add(result[i] * 10 + 3);
                }

                System.out.println(queue);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(nNumbersHavingOnly123(5)));
    }
}
