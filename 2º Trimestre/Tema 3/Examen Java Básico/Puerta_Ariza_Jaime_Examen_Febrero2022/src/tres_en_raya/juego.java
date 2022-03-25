package tres_en_raya;

import java.util.Scanner;

public class juego {
	//FICHAS DEL PROGRAMA
		int x1,x2,x3;
	//FICHAS DEL JUGADOR
		int o1,o2,o3;
		static String[][]tablero = new String [3][3];
		static String[]fichas = new String [9];
	public static void main(String[] args) {	
		Scanner s=new Scanner(System.in);
		int tirada;
		int tirada_maquina;
		int turno = 0;
		boolean movimiento = false;
		System.out.print("¡Jugemos al tres en raya!");
		rellenartablero();
		mostrartablero();
		
		do {
		System.out.println("\n¡Tu turno!");
		System.out.println("Elige donde quieres colocar tu ficha: ");
		turno++;
		do {
			String user=s.nextLine();
			tirada = posicionMovimiento(user);
			turno ++;
			
			if (tirada < 0 || tirada > 8) {
			System.out.println("Movimiento erróneo! ");
			System.out.println("introduce un movimiento valido");
			movimiento = false;
			}else {
			System.out.println("Movimiento valido! ");
			
			mostrartablero();
			movimiento = true;
			}
		}while(!movimiento);
		 System.out.println("\n¡Turno de la maquina!");
		
		}while(turno == 10 );
	}

	
	  public static void mostrartablero(){
	        for(int i=0;i<3;i++){
	        	System.out.println(" ");
	            for(int j=0;j<3;j++){
	                System.out.print(" "+tablero[i][j]);
	            }
	        }
	    }
	 public static void rellenartablero(){
	        for(int i=0;i<3;i++){
	            for(int j=0; j<3; j++){
	            	tablero[i][j]=Character.toString('-');
	               
	            }
	        }
	    }
		 public static void generarnumero (int tirada_maquina) {
			 int numeroaleatorio = (int)(Math.random()*8 + 1);
			  tirada_maquina = numeroaleatorio;
			  switch(tirada_maquina) {
			  case 0:
				  tablero [0][0] = Character.toString('x');
			  case 1:
				  tablero [0][1] = Character.toString('x');
			  case 2:
				  tablero [0][2] = Character.toString('x');
			  case 3:
				  tablero [1][0] = Character.toString('x');
			  case 4:
				  tablero [1][1] = Character.toString('x');
			  case 5:
				  tablero [1][2] = Character.toString('x');
			  case 6:
				  tablero [2][0] = Character.toString('x');
			  case 7:
				  tablero [2][1] = Character.toString('x');
			  case 8:
				  tablero [2][2] = Character.toString('x');
			  }
	 	}  
		 public static void tirada (int posicionMovimiento) {
	
			  switch(posicionMovimiento) {
			  case 0:
				  tablero [0][0] = Character.toString('o');
			  case 1:
				  tablero [0][1] = Character.toString('o');
			  case 2:
				  tablero [0][2] = Character.toString('o');
			  case 3:
				  tablero [1][0] = Character.toString('o');
			  case 4:
				  tablero [1][1] = Character.toString('o');
			  case 5:
				  tablero [1][2] = Character.toString('o');
			  case 6:
				  tablero [2][0] = Character.toString('o');
			  case 7:
				  tablero [2][1] = Character.toString('o');
			  case 8:
				  tablero [2][2] = Character.toString('o');
			  }
	 	}  
		 
		 static int posicionMovimiento(String user){
		 if("ARRIBA IZQUIERDA".equals(user.substring(0,13))||"arriba izquierda".equals(user.substring(0,13))){
			 	return 0;
		 }else if("ARRIBA CENTRO".equals(user.substring(0,13))||"arriba centro".equals(user.substring(0,13))){
	            return 1;
	        }else if("ARRIBA DERECHA".equals(user.substring(0,13))||"arriba derecha".equals(user.substring(0,13))){
	            return 2;
	        }else if("CENTRO IZQUIERDA".equals(user.substring(0,13))||"centro izquierda".equals(user.substring(0,13))){
	            return 3;
	        }else if("CENTRO CENTRO".equals(user.substring(0,13))||"centro centro".equals(user.substring(0,13))){
	            return 4;
	        }else if("CENTRO DERECHA".equals(user.substring(0,13))||"centro derecha".equals(user.substring(0,13))){
	            return 5;
	        }else if("ABAJO IZQUIERDA".equals(user.substring(0,13))||"abajo izquierda".equals(user.substring(0,13))){
	            return 6;
	        }else if("ABAJO CENTRO".equals(user.substring(0,13))||"abajo centro".equals(user.substring(0,13))){
	            return 7;
	        }else if("ABAJO DERECHA".equals(user.substring(0,13))||"abajo derecha".equals(user.substring(0,13))){
	            return 8;
	        }else{
	            return -1;
	        } 
		 }
	    }       