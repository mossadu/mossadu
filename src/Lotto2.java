
public class Lotto2 {

	public static void main(String[] args) {
		int[] lotto = new int[45];
		
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = i + 1;
		
		int temp = 0;
		int r = 0;
		
		for (int i = 0; i < 100; i++) {
			r = (int) (Math.random() * 45);
			
			temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
