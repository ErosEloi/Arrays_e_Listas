package application;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de registros: ");
		int regis = sc.nextInt();
		
		double[] vect = new double[regis];
		
		for(int i = 0; i<regis; i++) {
			System.out.print("Digite a altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < regis; i++) {
			sum += vect[i];
		}
		
		double media = sum / regis;
		
		System.out.println("Media: " + media);
		
	}

}
