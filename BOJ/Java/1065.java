import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static final int LIMIT_NUM = 1000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		for(int i=1; i<=n; i++){
			if(isHansu(i)){
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean isHansu(int n){
		int tmp = n;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while(tmp > 0){
			digits.add(tmp%10);
			tmp /= 10;
		}
		return isArithmaticSequence(digits);
	}

	public static boolean isArithmaticSequence(ArrayList<Integer> digits){
		if(digits.size() < 3) {
			return true;
		}
		int sub = digits.get(0) - digits.get(1);

		for(int i=2; i<digits.size() ; i++){
			if(sub != digits.get(i-1) - digits.get(i)){
				return false;
			}
		}
		return true;
	}
}
