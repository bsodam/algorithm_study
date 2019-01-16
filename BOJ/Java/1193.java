import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		// numerator, denominator, count
		int[] arr = {1, 1, num-1};
		while(true){
			arr = downward(arr);
			if(arr[2]==0) break;
			arr = upward(arr);
			if(arr[2]==0) break;
		}
		System.out.println(arr[0] + "/" + arr[1]);

		sc.close();

	}

	public static int[] downward(int[] arr){
		int lineNum = arr[1];
		if(arr[2]==0){
			return arr;
		}
		arr[1] += 1;
		arr[2]--;

		for(int i=0 ; i<lineNum ; i++){
			if(arr[2]==0) break;
			arr[0]++;
			arr[1]--;
			arr[2]--;
		}
		return arr;
	}

	public static int[] upward(int[] arr){
		int lineNum = arr[0];
		arr[0] += 1;
		arr[2]--;

		for(int i=0 ; i<lineNum ; i++){
			if(arr[2]==0) break;
			arr[0]--;
			arr[1]++;
			arr[2]--;
		}
		return arr;
	}


}
