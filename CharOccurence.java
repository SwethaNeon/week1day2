package week1day2;

public class CharOccurence {

	public static void main(String[] args) {
		String word = "Assignments";
		char search = 's';
		  		  int result=0;
		  for(int i=0; i<word.length(); i++)
		  {
		      if(word.charAt(i) == search)
		      result++;
		  }
				  System.out.println("The Character '"+search+"' appears "+result+" times.");
	}}


