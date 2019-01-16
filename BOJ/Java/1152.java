import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		String[] ss = s.split(" ");
		int count = 0;

		for(int i=0; i<ss.length ; i++){
			if(ss[i].isEmpty()){
				count++;
			}
		}

		System.out.println(ss.length-count);

		sc.close();

	}
}
