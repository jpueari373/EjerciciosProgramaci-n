

import java.util.Scanner;

public class Ejercicio_8 {
	
	public static void main(String[] args) {
		int numero = 0;
		int num= 10;
		int result;
		System.out.print("Introduce un número ");
		Scanner sn=new Scanner(System.in);
		numero=sn.nextInt();
		
		for (int i=-1; i<=9;) {
			 i++;
			 result= numero*i;
			 System.out.println(i + "x" + numero + "=" + result);
			} 
	}
}