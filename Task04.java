import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		 
		int [] array = new int[10];
		 
		for (int i = 0; i < array.length; i++) {
			array[i] = (rand.nextInt(10));
		}
		 
		System.out.println("Массив:");
		 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" | ");
		}
		
		System.out.println("\nВ массиве "+array.length+" элементов.\nВведите номер элемента, с которого подсчитать сумму трех чисел> ");
		int a = sc.nextInt();
		
		System.out.println("Сумма трех элементов с номера "+a+" будет равна "+sumMas(a, array));
		

	}
	
	public static int sumMas (int a, int[] array) {
		int sum = 0;
		if (array.length<a+2 || a<1){
			throw new RuntimeException();
		}
		for (int i = a-1; i < a+2; i++) {
			sum += array[i];
		}
		return sum;
	}

}
