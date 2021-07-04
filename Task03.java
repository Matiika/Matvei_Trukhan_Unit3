
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1234;
		int b = 35234;
		
		numCompare(a, b);

	}
	
	public static void numCompare (int a, int b) {
		if (numCount(a)>numCount(b)) {
			System.out.println("В числе "+a+" больше цифр, чем в "+b);
		} else if (numCount(a)<numCount(b)){
			System.out.println("В числе "+b+" больше цифр, чем в "+a);
		} else {
			System.out.println("В числе "+a+" и "+b+" одинаковое количество цифр");
		}
		
	}
	
	public static int numCount (int a) {
		int count = 0;
		while (Math.abs(a)>10) {
			a = Math.abs(a)/10;
			count++;
		}
		return ++count;
		
	}
	
	

}
