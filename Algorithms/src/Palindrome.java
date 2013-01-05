import java.util.Scanner;
 

public class Palindrome {
	private static boolean isPalindrome(String word){
		int length = word.length();
		length = length / 2;
		
		for (int i = 0;i <= length;i++){
			if (word.charAt(i) != word.charAt((word.length()-1)-i)){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String args[]){
		
		System.out.println("Enter A Word: ");
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		
		if (isPalindrome(word)){
			System.out.println("It's a Palindrome ");
		}else{
			System.out.println("It's not a Palindrome");
		}
		
		
		
		
	}

}
