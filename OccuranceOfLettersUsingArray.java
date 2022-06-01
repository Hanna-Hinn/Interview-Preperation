//How to calculate the occurance of characters using array (a-z) without the Captial letters
public class OccuranceOFLettersUsingArray {

	public static void main(String[] args) {
    
    occuranceOfLetters("codebinarytest");
    
  }
  
  public static void occuranceOfLetters(String str) {
		int[] arr = new int[26];
		for(int i =0;i<arr.length;i++) {
			arr[i] =0;
		}
		
		for(int i=0;i<str.length();i++) {
			char tmp = str.charAt(i);
			int index = tmp%97;
			arr[index]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println( (char)(97+i)+" "+arr[i]);
		}
		
	}
  
}
