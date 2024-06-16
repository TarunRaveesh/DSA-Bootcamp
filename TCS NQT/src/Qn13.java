import java.util.PriorityQueue;
import java.util.Scanner;

public class Qn13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            minHeap.add(sc.nextInt());
        }

        int time = 0;
        while(minHeap.size() > 1) {
            int X = minHeap.poll();
            int Y = minHeap.poll();
            time += X + Y;
            minHeap.add(X + Y);
        }
        System.out.println(time);
    }
}
