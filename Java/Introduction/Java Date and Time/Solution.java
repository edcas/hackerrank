import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Solution {

	public static void main(String[] args) {
		int month = 8;
		int dayOfMonth = 5;
		int year = 2015;

		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase());
	}

}
