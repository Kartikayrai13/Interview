package Start;

public class NumberInString {
	public static void main(String[] args) {
		String[] str = { "Kartikay123 Rai987" };
		int count = 0;
		for (String b : str) {
			char[] c = b.toCharArray();

			for (int i = 0; i <= c.length - 1; i++) {
				if (Character.isDigit(c[i])) {
					count += Integer.parseInt(String.valueOf(c[i]));

				}
			}
			System.out.println(count);

		}

	}
}
