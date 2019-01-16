import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int oriNum = sc.nextInt();
		int firstDigit = oriNum/10;
		int secondDigit = oriNum%10;

		System.out.println(calculator(oriNum, secondDigit, (firstDigit+secondDigit)%10));
		sc.close();
	}

	public static int calculator(int oriNum, int firstDigit, int secondDigit){
		//System.out.println(firstDigit + "+" + secondDigit +"=" + (firstDigit+secondDigit));
		if((oriNum/10==firstDigit) && (oriNum%10==secondDigit)){
			return 1;
		} else {
			return calculator(oriNum, secondDigit, (firstDigit+secondDigit)%10)+1;
		}
	}
}
