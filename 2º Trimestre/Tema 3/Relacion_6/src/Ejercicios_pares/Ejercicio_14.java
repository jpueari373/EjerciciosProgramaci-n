package Ejercicios_pares;
import java.util.Scanner;
public class Ejercicio_14 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Introduce la palabra: ");
	        String pass = sc.nextLine();
	        for (int i= 0; i < 20; i++) {
	            System.out.println("");
	        }
	        String anagrama = anagramaAlAzar(pass);
	        System.out.println("El anagrama es " + anagrama);
	     
	      
	        boolean adivina = false;
	        
	        System.out.println("Pistas...");
	        
	        System.out.println("Numero de caracteres: " + pass.length());
	        System.out.println("Caracter inicial: " + pass.charAt(0));
	        System.out.println("Caracter final: " + pass.charAt(pass.length()-1));
	        
	        while (!adivina){
	            System.out.println("Adivina la palabra si puedes je:");
	            String intento = sc.nextLine();
	            
	            if (pass.equals(intento)){
	                adivina=true;
	                System.out.println("¡ufff!, has acertado la palabra se nota que eres listo :D");
	            } else {
	                int r;
	                r=pass.compareTo(intento);
	                if(r>0){
	                    System.out.println("La palabra es posterior a esa cateto");
	                }else {
	                    System.out.println("La palabra es anterior a esa cateto");
	                }
	            }
	            
	        }  
	        sc.close();
	    }
	    
	    public static String anagramaAlAzar(String cadena) {
	        char[] tabla = cadena.toCharArray();
	    
	        for (int i = 0; i < tabla.length; i++) {
	       
	            int i1 = (int)(Math.random() * tabla.length);
	            int i2 = (int)(Math.random() * tabla.length);
	  
	            char aux = tabla[i1];
	            tabla[i1] = tabla[i2];
	            tabla[i2] = aux;
	        }
	        return new String(tabla);
	    }
	    
	}