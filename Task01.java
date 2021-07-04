
public class Task01 {

	public static void main(String[] args) {
		int a = 28;
		int b = 42;
		int nod = nod(a, b);
		int nok = nok(a, b, nod);
		
		System.out.println("A = "+a+"; B = "+b+"| мнд = "+nod+"|мнй = "+nok);

	}
	
	public static int nod (int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}
	
	public static int nok (int a, int b, int nod) {
		return (a * b)/nod;
	}
	

}
