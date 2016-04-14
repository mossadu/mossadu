
public class Diamond {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			if (i <= 2) {
				for (int j = 0; j < 4 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2 * i + 1; k++) {
					System.out.print("*");
				}
			} else {
				for (int n = 0; n <= 4 - i; n++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
