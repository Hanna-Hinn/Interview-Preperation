// When they fibonacci or tower of hanoi always think of recurssion
// In interviews when they bring the above problems do it in recurssion bc if u did not 
// they will assume u do not know recurssion and thats bad for u

// Fibonacci series : 0 1 1 2 3 5 8 13 21 34 55 .....etc
// its the sum of the previous 2 numbers.
public class Fibonacci {

	public static void main(String[] args) {
    System.out.println(fibonacci(10));
  }
  
  public static int fibonacci(int n) {
		if(n<= 1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
  }
  
}
