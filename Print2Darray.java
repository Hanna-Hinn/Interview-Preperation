//This Prints u a 2D array from left to right in the first row and then from right to left and so on.
public class arrays {

	//
  public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] twoD = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } };
		int i = 0;
		int j = 0;
		int counter = 0;
		boolean direction = true;
		while (true) {
			
			if ( i == twoD.length-1 && j == twoD[i].length-1 ) {
				System.out.println(twoD[i][j]);
				break;
			}

			counter++;
      
			if (j < twoD[i].length) {
				System.out.println(twoD[i][j]);

			}
			
			
			if (direction) {
				j++;
				if(j==twoD[i].length) {
					j = twoD[i].length-1;
				}
			}else {
				j--;
				if(j<0) {
					j = j+1;
				}
			}

			if (counter == twoD.length) {
				direction = !direction;
				counter = 0;
				i++;
			}

			
		}

	}

}

/*
input: Example in the code 
2D : 	| 1 2 3 |
	| 4 5 6	|
	| 7 8 9 |
	
output: 1 2 3 6 5 4 7 8 9 **Note: In the Code each one is printed on a new line.

*/
