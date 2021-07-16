package week1day2;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str1="abcde";
		 String str2="edcba";
		//length comparison 
		 if (str1.length() != str2.length()) {
	        
	            System.out.println("Not an Anagram");}
		 else
		 {
		 int count[] = new int[256];
	        for (int i = 0; i < str1.length(); i++) {
	            count[str1.charAt(i)]++;
	            count[str2.charAt(i)]--;
	        }
	        
	        for (int i = 0; i < 256; i++) {
	            if (count[i] != 0) {
	                System.out.println("Not an Anagram");
	            }
	        }
	        System.out.println("Yes an Anagram");
		 }
	}

}
