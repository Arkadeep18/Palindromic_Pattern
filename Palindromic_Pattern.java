	
public class Palindromic_Pattern {

	public static void main(String[] args) {
		int n = 5;
		for(int a = 1;a<=n;a++) {
			for(int b = 1; b<=n-a;b++) {
				System.out.print(" ");
			}
					//First Half printing
			for(int b = a; b>=1; b--) {
				System.out.print(b);
			}
					//Second half
			for(int b = 2; b<=a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
