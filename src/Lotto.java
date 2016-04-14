
public class Lotto {

	public static void main(String[] args) {
		int[] number = new int[45];

		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * 45 + 1);
			// System.out.print(number[i] + " ");

			for (int j = 0; j < i; j++) {
				if (number[j] == number[i]) {
					i--;
				}
			}
		}

		for (int k = 0; k < 6; k++) {
			System.out.print(number[k] + " ");
		}
	}

}
