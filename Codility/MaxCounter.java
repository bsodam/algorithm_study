import java.util.*;

public class Solution {

    public int[] solution(int N, int[] A) {
        int[] counter = new int[N];

        int max = 0;
        int maxCounter = 0;
        for(int a : A) {
            if(a==N+1) {
                maxCounter = max;
            } else {
                if(counter[a-1]<maxCounter) {
                    counter[a-1] = maxCounter;
                }

                counter[a-1]++;
                if(counter[a-1] > max) {
                    max = counter[a-1];
                }
            }
        }

        for(int i=0; i<N ; i++) {
            if(counter[i]<maxCounter){
                counter[i] = maxCounter;
            }
        }
        return counter;
    }


}