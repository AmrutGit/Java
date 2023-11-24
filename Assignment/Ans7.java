
// 7. Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
//(Hint: a, e, i, o, u are vowels)
import java.util.Scanner;

public class Ans7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char a = sc.next().charAt(0);
		char [] arr = {'a','e','i','o','u'};
		int flag = 0;
		for (int i=0;i < arr.length;i++) {
			if (arr[i] == a)
				flag = 1;
		}
		
		if (flag == 1)
			System.out.println("Character is a Vowel !");
		else
			System.out.println("Character is a Consonent !");
		
	}

}
