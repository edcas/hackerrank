import java.text.NumberFormat;
import java.util.Scanner; 
import java.util.Locale;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
		scanner.close();

		

			String us =  NumberFormat.getCurrencyInsta
nce(Locale.US).format(payment);
		String india =  NumberFormat.getCurrencyInstance(LocaleIndia).format(payment);
		String china =  NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france =  NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

	}

}
