import java.util.Scanner;

public class ValidationService {

	public Boolean validate(String inputData) {

		Scanner s = new Scanner(inputData).useDelimiter(",");
		if (s.next().matches("([A-Z]{1}[a-z]{1,}\\s[A-Z]{1}[a-z]{1,})")
				&& s.next().matches(
						"(?:[1-9]|0[1-9]|1[0-2])/(?:[0-9]|0[1-9]|1[0-9]|2[0-9]|3[0-1])/(?:20[6-9][0-9]|20[0-1][0-4])")
				&& s.next().matches("([2-8][0-9])")
				&& s.next().matches("(([A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}))"))
			return true;

		return false;
	}

}
