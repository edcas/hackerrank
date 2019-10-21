import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.printf("%d %s\n", ++i, line);
		}
		sc.close();
	}
}
