import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		sc.close();

		int[] alphabet = new int['z'-'A'+1];

		for(int i = 0 ; i< word.length(); i++){
			alphabet[word.charAt(i)-'A']++;
		}

		for(int i=0 ; i<='Z'-'A' ; i++){
			alphabet[i] += alphabet[i+'a'-'A'];
		}

		int max = 0;
		int maxIndex = 0;
		for(int i=0 ; i<'Z'-'A'+1 ; i++){
			if(alphabet[i] > max){
				max = alphabet[i];
				maxIndex = i;
			}
		}

		int maxCount = 0;
		for(int i=0 ; i<'Z'-'A'+1 ; i++){
			if(alphabet[i] == max){
				maxCount++;
			}
		}

		if(maxCount > 1) {
			System.out.println("?");
		} else {
			System.out.println((char) (maxIndex + 'A'));
		}
	}

}
