
public class ReverseArrayUsingStack {
  
  public static void main(String[] args) {
    
      int[] arr = {1,234,54,123,412,43};
  
      reverseArray(arr);
    }
//reverse an array using stack
	public static void reverseArray (int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			int tmp = stack.pop();
			System.out.println(tmp);
		}
	}
}
