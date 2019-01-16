import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int j=0; j<tc ; j++) {
            int num = sc.nextInt();

            int[][] dpTable = new int[num + 1][2];
            dpTable[0][0] = 1;
            dpTable[0][1] = 0;
            if (num > 0) {
                dpTable[1][0] = 0;
                dpTable[1][1] = 1;

                for (int i = 2; i <= num; i++) {
                    dpTable[i][0] = dpTable[i - 1][0] + dpTable[i - 2][0];
                    dpTable[i][1] = dpTable[i - 1][1] + dpTable[i - 2][1];
                }
            }

            System.out.println(dpTable[num][0] + " " + dpTable[num][1]);

        }
    }
}
