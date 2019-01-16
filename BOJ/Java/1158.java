import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int m = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n ; i++) {
            queue.offer(i);
        }

        System.out.print("<");
        boolean flag = false;

        while (!queue.isEmpty()) {
            if(flag) {
                System.out.print(", ");
            }
            for(int i=0; i<m-1; i++) {
                queue.offer(queue.poll());
            }
            System.out.print(queue.poll());
            flag = true;
        }
        System.out.print(">");

    }


}
