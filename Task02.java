
public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 3;
		int c = 5;
		
		System.out.println("Сумма больше и меньшего: "+sum(a, b, c));

	}
	
	public static int sum (int a, int b, int c) {
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		return max+min;
	}

}
