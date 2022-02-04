package week3.day1;

public class Anagram {

		public static class _Anagram {

			public static void main(String[] args) 
			{
				String text1 = "grab";
				String text2 = "bran";
				int l1 = text1.length();
				int l2 = text2.length();
				if(l1!=l2)
				{
					System.out.println("Both strings are not having same length");
				}
				else
				{
					
					System.out.println("Both strings are having same length");
					char s1[] = text1.toCharArray();
					char s2[] = text2.toCharArray();
					Arrays.sort(s1);
					Arrays.sort(s2);
					if(Arrays.equals(s1,s2))
							{
								System.out.println("Both strings are anagram");
							}
					else
						System.out.println("Both strings are not anagram");
				}
					

	}

}
