
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
	public class Bingo {  
		public static void main(String[] args) {
	        int aux, acertado;
	        boolean ordenar = true;
	        int[][] carton = new int[3][5];
	        int[][] carton2 = new int[3][5];;
	        int[] sorteo = new int[50];
	        ordenar(carton);
	        ordenar2(carton2);
	        pulsar_continuar();
	        imprimir_carton1(carton);
	        imprimir_carton2(carton2);
	        int numSorteo = Juego(carton, carton2, sorteo);
	        mostrarUsados(sorteo, numSorteo);
	        System.out.println("");
	    }
	    public static void ordenar(int[][] carton) {
	    	//para rellenar el primer carton
	        Random aleatorio = new Random();
	        int k = 0;
	        for (int i = 0; i < carton.length; i++) {
	            for (int j = 0; j < carton[i].length; j++) {
	                if (i == 0) {
	                    if (j == 0) {
	                    	carton[i][j] = aleatorio.nextInt(7) + (10 * j) + 1 ;
	                    } else {
	                    	carton[i][j] = aleatorio.nextInt(8) + (10 * j);
	                    }
	                } else {
	                    if (i == 1) {
	                        k = 0;
	                    } else if (i == 2) {
	                        k = 1;
	                    }
	                    carton[i][j] = aleatorio.nextInt(9 + k) + (10 * j);
	                    do {
	                    	carton[i][j] = aleatorio.nextInt(9 + k) + (10 * j);
	                    } while (carton[i][j] <= carton[i - 1][j]);
	                }
	            }
	        }
	        carton[2][4]++;
	    }
	    public static void ordenar2(int[][] carton2) {
	    	//para rellenar el segundo carton
	        Random aleatorio = new Random();
	        int k = 0;
	        for (int i = 0; i < carton2.length; i++) {
	            for (int j = 0; j < carton2[i].length; j++) {
	                if (i == 0) {
	                    if (j == 0) {
	                    	carton2[i][j] = aleatorio.nextInt(7) + (10 * j) + 1 ;
	                    } else {
	                    	carton2[i][j] = aleatorio.nextInt(8) + (10 * j);
	                    }
	                } else {
	                    if (i == 1) {
	                        k = 0;
	                    } else if (i == 2) {
	                        k = 1;
	                    }
	                    carton2[i][j] = aleatorio.nextInt(9 + k) + (10 * j);
	                    do {
	                    	carton2[i][j] = aleatorio.nextInt(9 + k) + (10 * j);
	                    } while (carton2[i][j] <= carton2[i - 1][j]);
	                }
	            }
	        }
	        carton2[2][4]++;
	    }	    
	    public static int bombo1(int[][] carton, int[][] carton2) {
	        //Posicion del bombo1
	        int bombo = 0;
	        for (int i = 0; i < carton.length; i++) {
	            for (int j = 0; j < carton[i].length; j++) {
	            	carton[0][0] = bombo;
	            	carton[1][0] = bombo;
	                carton[2][1] = bombo;
	                carton[0][2] = bombo;
	                carton[1][3] = bombo;
	                carton[2][3] = bombo;
	                carton[2][4] = bombo;
	                carton[0][5] = bombo;
	                carton[1][6] = bombo;
	                carton[2][6] = bombo;
	                carton[0][7] = bombo;
	                carton[1][8] = bombo;
	            }
	        }
	        return bombo;  
	    }
	    static public void pulsar_continuar()
	    {
	        String seguir;
	        Scanner teclado = new Scanner(System.in); 
			System.out.println("******** BINGO IES MARTÍNES MONTAÑÉS ********");
			System.out.println("               PREMIOS                       ");
			System.out.println("            LÍNEA: 100 $                     ");
			System.out.println("            BINGO: 500 $                     ");
			System.out.println(" ");
	        System.out.println("Pulse cualquier tecla para continuar");
	        try
	        {
	            seguir = teclado.nextLine();
	        }
	        catch(Exception e)
	        {}
	    }
	    public static void imprimir_carton1(int[][] carton) {
	        //para imprimir el carton del jugador 1
	   
			System.out.println(" ");
	    	System.out.println("  -------------------------");
	        System.out.println("          Jugador 1        ");
	        System.out.println("  -------------------------");
	        for (int i = 0; i < carton.length; i++) {
	            System.out.println("");
	            for (int j = 0; j < carton[i].length; j++) {
	                System.out.printf("%3d | ", carton[i][j]); 
	            }
	        }
	        System.out.println();
	    }
	    public static void imprimir_carton2(int[][] carton2) {
	        //para imprimir el carton del jugador 2
			System.out.println(" ");
	    	System.out.println("  -------------------------");
	        System.out.println("          Jugador 2        ");
	        System.out.println("  -------------------------");
	 
	        for (int i = 0; i < carton2.length; i++) {
	            System.out.println("");
	            for (int j = 0; j < carton2[i].length; j++) {
	                System.out.printf("%3d | ", carton2[i][j]);
	            }
	        }
	        System.out.println();
	    }
	    public static int Juego(int[][] carton, int[][] carton2, int[] sorteo) {
	        Scanner numero = new Scanner(System.in);
	        Random ran = new Random();
	        char opcion = ' ';
	        for (int i = 0; i < sorteo.length; i++) {
	        	sorteo[i] = nums_repetidos(sorteo);
	        }	   
	        //imprimir los numeros del bombo
	        for (int i = 0; i < sorteo.length; i++) {
	        	 System.out.println("");
	        	num_acertado(sorteo[i], carton, carton2);  
	        	System.out.println("Pulse cualquier tecla para sacar bola");
	            System.out.println("");
	            String seguir;
		        Scanner teclado = new Scanner(System.in);
		        System.out.println("Numero: " + sorteo[i]);
		        try
		        {
		            seguir = teclado.nextLine();
		        }
		        catch(Exception e)
		        {}
		        imprimir_carton1(carton);
		        comprobarLinea(carton, carton2);
                imprimir_carton2(carton2);
                comproBingo(carton, carton2);       
               
	        }return sorteo.length;
	    }
	    public static void mostrarUsados(int[] sorteo, int num_sorteado) {
	        for (int i = 0; i <= num_sorteado; i++) {
	            System.out.print(sorteo[i] + ",");
	        }
	        System.out.println();
	    }
	    public static int nums_repetidos(int[] sorteo) {
	        Random ran = new Random();
	        int num;
	        boolean repetido = true;
	        do {
	            repetido = false;
	            num = ran.nextInt(50) + 1;
	            for (int i = 0; i < 50; i++) {
	                if (num == sorteo[i]) {
	                    repetido = true;
	                    break;
	                }
	            }
	        } while (repetido == true);
	        return num;
	    }
	    public static void num_acertado(int num, int[][] carton, int[][] carton2) {
	    	//Para comprobar los numeros acertados del primer carton
	        for (int i = 0; i < carton.length; i++) {
	            for (int j = 0; j < carton[i].length; j++) {
	                if (carton[i][j] == num) {
	                	carton[i][j] = 0;
	                }
	            }
	        }
	        //Para comprobar los numeros acertados del segundo carton
	        for (int i = 0; i < carton2.length; i++) {
	            for (int j = 0; j < carton2[i].length; j++) {
	                if (carton2[i][j] == num) {
	                	carton2[i][j] = 0;
	                }
	            }
	        }      
	    }        	    
	    static void comproBingo(int[][] carton, int[][] carton2) {
	        boolean bingo = false;
	        int controlador = 0;
	        int dinero_bingo = 500;
	        for (int i = 0; i < carton.length; i++) {
	        	for (int j = 0; j < carton[i].length; j++) {
	            controlador = controlador + carton[i][j];
	        	}	
	        for (i = 0; i < carton2.length; i++) {
	 	        for (int j = 0; j < carton2[i].length; j++) {
	 	        controlador = controlador + carton[i][j];
	 	        }
	 	        if (controlador == 1500) {
	 	        	bingo = true;
	 	        	System.out.println("El jugador 1 ha cantado Bingo");
	 	        	imprimir_carton1(carton);
	 	        	System.out.println("  ");
	 	        	
	 	        }	        
	 	        if (controlador == 1500) {
	 	        	bingo = true;
	 	        	System.out.println("El jugador 2 ha cantado Bingo");
	 	        	imprimir_carton2(carton2);
	 	        	System.out.println("  ");
	 	        	
	 	        	}
	        	}
	        }
			
	    }  
	    private static void comprobarLinea(int[][] carton, int[][] carton2) {
	    	int linea = 0;
	    	int dinero_linea = 100;
	    	 if (carton [0][1] + carton [0][2] + carton [0][3] + carton [0][4] == 0)  {	
              	carton [0][0] = 100;
            	carton [0][1] = 100;
            	carton [0][2] = 100;
            	carton [0][3] = 100;
            	carton [0][4] = 100;
              	 System.out.println(" ");
              	 System.out.println("El jugador 1 ha cantado linea");
              	
              }  
              else 
            	  if (carton [1][0] + carton [1][1] + carton [1][2] + carton [1][3] + carton [1][4] == 0) {          	 
            	  carton [1][0] = 100;
            	  carton [1][1] = 100;
            	  carton [1][2] = 100;
            	  carton [1][3] = 100;
            	  carton [1][4] = 100;
            	  System.out.println(" ");
            	  System.out.println("El jugador 1 ha cantado linea");
            	  
              }
              else 
            	  if (carton [2][0] + carton [2][1] + carton [2][2] + carton [2][3] + carton [2][4] == 0) {
            	  carton [2][0] = 100;
            	  carton [2][1] = 100;
            	  carton [2][2] = 100;
            	  carton [2][3] = 100;
            	  carton [2][4] = 100;
            	  System.out.println(" ");
            	  System.out.println("El jugador 1 ha cantado linea");
            	  
              }  	
	                if (carton2 [0][0] + carton2 [0][1] + carton2 [0][2] + carton2 [0][3] + carton2 [0][4] == 0)  {
	                	 carton2 [0][0] = 100;
	                	 carton2 [0][1] = 100;
	                	 carton2 [0][2] = 100;
	                	 carton2 [0][3] = 100;
	                	 carton2 [0][4] = 100;
	                     System.out.println(" ");
	                	 System.out.println("El jugador 2 ha cantado linea");
	                
	                }  
	                else 
	                	if (carton2 [1][0] + carton2 [1][1] + carton2 [1][2] + carton2 [1][3] + carton2 [1][4] == 0) {
	                	carton2 [1][0] = 100;
	                	carton2 [1][1] = 100;
	                	carton2 [1][2] = 100;
	                	carton2 [1][3] = 100;
	                	carton2 [1][4] = 100;
	                	System.out.println(" ");
	                	System.out.println("El jugador 2 ha cantado linea");           
	                	
	                }
	                else 
	                	if (carton2 [2][0] + carton2 [2][1] + carton2 [2][2] + carton2 [2][3] + carton2 [2][4] == 0) {
	                		carton2 [2][0] = 100;
		                	carton2 [2][1] = 100;
		                	carton2 [2][2] = 100;
		                	carton2 [2][3] = 100;
		                	carton2 [2][4] = 100;
	                		System.out.println(" ");
	                		System.out.println("El jugador 2 ha cantado linea");    
	                		
	                }
	    	 }            
	 }   