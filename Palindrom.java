package week3.day1;

public class Palindrom {

	public static void main(String[] args) {
		String s1 = "Madam";
		String s2 = "";
		int len = s1.length();
		//Iterate over the String in reverse order
		for(int i=len-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
			//Add the char into rev
		}
		//Compare the original String with the reversed String, if it is same then print palindrome 
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("its Not a Palindrome");
		}
			

		}


	}


