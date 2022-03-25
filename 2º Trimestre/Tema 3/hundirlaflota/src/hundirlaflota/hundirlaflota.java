package hundirlaflota;

import java.util.ArrayList;
import java.util.Scanner;


	public class hundirlaflota {

	  
	    public static String[][] tablero= new String[11][11];
	    public static String[][] tablero2= new String[11][11];
	    public static ArrayList<String> ocupadas=new ArrayList<String>();
	    public static ArrayList<String> repetidas=new ArrayList<String>();
	    public static ArrayList<String> posfinal=new ArrayList<String>();
	    public static ArrayList<String> ocupadasj=new ArrayList<String>();
	    public static ArrayList<String> repetidasj=new ArrayList<String>();
	    public static ArrayList<String> posfinalj=new ArrayList<String>();
	    public static String user;
	    public static int posx;
	    public static int posy;
	    public static int posxj;
	    public static int posyj;
	    public static void main(String[] args) {
	        ArrayList<barco> barcos= new ArrayList<barco>();
	        ArrayList<barco> barcosj= new ArrayList<barco>();
	        Scanner teclado=new Scanner(System.in);
	        int puntosj=24;
	        int puntosM=24;
	        System.out.println("\t  BIENVENIDOS AL HUNDIR LA FLOTA");
	        System.out.println("\n");
	        rellenar();
	        rellenartablero();
	        rellenarjugador();
	        rellenartablerojugador();
	        
	        System.out.println("");
	        
	        //GENERAR  BARCOS MEDIANTE EL BUCLE FOR LA LONGITUD DE I INDICA EL NUMERO DE BARCOS QUE SE GENERAN DE ESE TIPO
	        //GENERA 3 ACORAZADOS Y SE GUARDAN EN EL ARRAYLIST DE POSFINAL
	        for (int i= 0 ; i < 3; i++){
	            genenarbarcos(3);
	            barco barc=new barco(3,"Acorazado",posfinal.get(i));
	            barcos.add(barc);
	        }
	      //GENERA 5 SUBMARINOS Y SE GUARDAN EN EL ARRAYLIST DE POSFINAL
	        for (int i = 3; i < 8; i++){
	            genenarbarcos(1);
	            barco barc=new barco(1,"Submarino",posfinal.get(i));
	            barcos.add(barc);
	        }
	      //GENERA 2 PORTAAVIONES Y SE GUARDAN EN EL ARRAYLIST DE POSFINAL
	        for (int i = 8; i < 10; i++){
	        genenarbarcos(5);
	        barco barc=new barco(5,"Portaavion",posfinal.get(i));
	        barcos.add(barc);
	        }
	        //GENERAR BARCOS JUGADOR
	        
	        //GENERA 3 ACORAZADOS Y SE GUARDAN EN EL ARRAYLIST DE POSFINAL
	        for (int i= 0 ; i < 3; i++){
	        genenarbarcosjugador(3);
	        barco barcj=new barco(3,"Acorazado",posfinalj.get(i));
	        barcosj.add(barcj);
	        }
	      //GENERA 5 SUBMARINOS Y SE GUARDAN EN EL ARRAYLIST DE POSFINAL
	        for (int i = 3; i < 8; i++){
	        genenarbarcosjugador(1);
	        barco barc=new barco(1,"Submarino",posfinalj.get(i));
	        barcos.add(barc);
	        }
	      //GENERA 2 PORTAAVIONES Y SE GUARDAN EN EL ARRAYLIST DE POSFINAL
	        for (int i = 8; i < 10; i++){
	        genenarbarcosjugador(5);
	        barco barcj=new barco(5,"Portaavion",posfinalj.get(i));
	        barcosj.add(barcj);
	        }
	        
	        do{
	        	System.out.println("\nTURNO JUGADOR");
		        System.out.println("\n               TABLERO MAQUINA       ");
		        mostartablero();
	        	System.out.println(" ");
	            System.out.println("Dime primero letra y despues numero: ");
	            user=teclado.nextLine();
	            posx=letraanum(user);
	            posy=Integer.parseInt(user.substring(1));
	            String posxy=posx+","+posy;
	            System.out.println(posxy);
	            if (posx==0 || posy>10 ){
	                System.out.println("Tienes que introducir una posición válida" + posx+posy);
	            }else{
	                boolean comprobacion=false;
	                for(int i=0; i<barcos.size(); i++){
	                    String barcopos=barcos.get(i).getPosicion();
	                    if(barcopos.contains(posxy)==true){
	                        tablero[posx][posy]="+";
	                        System.out.println("Bien has dado a un barco");
	                        puntosj--;
	                        comprobacion=true;	                    
	                        barcos.get(i).tocado(posx, posy);
	                        if(barcos.get(i).posiciones() == barcos.get(i).getTamano()){
	                            System.out.println("HUNDIDOOOOO!!");
	                            System.out.println("Has hundido un "+ barcos.get(i).getNombre());
	                            for(int j=0; j <barcos.get(i).posicionesx.size(); j++){
	                                tablero[barcos.get(i).posicionesx.get(j)][barcos.get(i).posicionesy.get(j)]="X";
	                            }
	                            barcos.remove(i);
	                        }
	                    }
	                }
	                if(comprobacion==false){
	                    System.out.println("Agua");
	                    tablero[posx][posy]=Character.toString('~');
	                }
	            }
	            System.out.println("\n              TABLERO MAQUINA     ");
	            System.out.println("\nPuntos restantes del Jugador: " + puntosj);
	            mostartablero();
	            System.out.println("\n ");
	            if(barcos.size()==0){
	                break;
	            }
	            
	            System.out.println("\n");
		        System.out.println("TURNO MAQUINA");
	            rellenarjugador();
		        rellenartablerojugador();
		      
		        
		        posxj=(int) (Math.random()*10+1);
	            posyj=(int) (Math.random()*10+1);
	            String posxyj=posxj+","+posyj;
	            System.out.println(posxyj);
	                boolean comprobacionmaquina=false;
	                for(int i=0; i<barcosj.size(); i++){
	                    String barcoposj=barcosj.get(i).getPosicion();
	                    if(barcoposj.contains(posxyj)==true){
	                        tablero2[posxj][posyj]="+";
	                        System.out.println("La maquina le ha dado a un barco");
	                        puntosM--;
	                        comprobacionmaquina=true;	                    
	                        barcosj.get(i).tocado(posxj, posyj);
	                        if(barcosj.get(i).posiciones() == barcosj.get(i).getTamano()){
	                            System.out.println("HUNDIDOOOOO!!");
	                            System.out.println("La maquina ha hundido un "+ barcosj.get(i).getNombre());
								for(int j=0; j <barcosj.get(i).posicionesxj.size(); j++){
	                                tablero2[barcosj.get(i).posicionesxj.get(j)][barcosj.get(i).posicionesyj.get(j)]="X";
	                            }
	                            barcosj.remove(i);
	                        }
	                    }
	                }
	                if(comprobacionmaquina==false){
	                    System.out.println("\nAgua");
	                    tablero2[posxj][posyj]=Character.toString('~');
	                }
	                System.out.println("\n              TABLERO JUGADOR      ");
	                System.out.println("\nPuntos restantes de la maquina: " + puntosM);
	                mostartablerojugador();
	                System.out.println("\n ");
	                if(barcosj.size()==0){
	                    break;
	                }   
	            
	        
	        }while(puntosj!=0 || puntosM !=0);
	        
	      if(puntosj < puntosM ) {
	    	  System.out.println("JUGADOR HA GANADO");
	      }else if(puntosM < puntosj) {
	    	  System.out.println("LO SIENTO, LA MAQUINA HA GANADO");
	      }
	                
	    }
	    public static int letraanum(String user){
	        if("A".equals(user.substring(0,1))||"a".equals(user.substring(0,1))){
	            return 1;
	        }else if("B".equals(user.substring(0,1))||"b".equals(user.substring(0,1))){
	            return 2;
	        }else if("C".equals(user.substring(0,1))||"c".equals(user.substring(0,1))){
	            return 3;
	        }else if("D".equals(user.substring(0,1))||"d".equals(user.substring(0,1))){
	            return 4;
	        }else if("E".equals(user.substring(0,1))||"e".equals(user.substring(0,1))){
	            return 5;
	        }else if("F".equals(user.substring(0,1))||"f".equals(user.substring(0,1))){
	            return 6;
	        }else if("G".equals(user.substring(0,1))||"g".equals(user.substring(0,1))){
	            return 7;
	        }else if("H".equals(user.substring(0,1))||"h".equals(user.substring(0,1))){
	            return 8;
	        }else if("I".equals(user.substring(0,1))||"i".equals(user.substring(0,1))){
	            return 9;
	        }else if("J".equals(user.substring(0,1))||"j".equals(user.substring(0,1))){
	            return 10;
	        }else{
	            return 0;
	        }
	    }
	    public static void mostartablero(){
	        for(int i = 0; i < 11; i++){
	        	System.out.println(" ");
	            for(int j = 0; j < 11; j++){
	                System.out.print(tablero[i][j]+"    ");
	            }
	           
	        }
	    }
	   
	    //RELLENADO DEL TABLERO
	    public static void rellenar(){
	        char caracter= '.';
	        for(int i = 0; i < 11; i++){
	            for(int j = 0; j < 11; j++){
	                tablero[i][j]=Character.toString(caracter);
	               
	            }
	        }
	    }
	    //RELLENADO DE TABLERO CON NUMEOS Y LETRAS
	    public static void rellenartablero(){
	        int letras=65;
	        int num=49;
	        int numeros=(char)49;
	        char letra=(char)65;
	        for(int i = 1; i < 11; i++){
	            tablero[0][i]=Character.toString(numeros);
	            
	            num=num+1;
	            numeros=(char)num;
	        }
	        for(int i = 1; i < 11; i++){
	            tablero[i][0]=Character.toString(letra);
	         
	            letras=letras+1;
	            letra=(char)letras;
	        }
	        tablero[0][10]="10";
	        
	    }
	    
	    
	    //GENERAMOS UNA ORIENTACIÓN CONTANDO CON LOS LIMITES
	    public static void genenarbarcos(int logitud){
	        int x=(int) (Math.random()*10+1);//DERECHA-IZQUIERDA NUMEROS
	        int y=(int) (Math.random()*10+1);//ARRIBA-ABAJO LETRAS
	        int orientacion=(int) (Math.random()*2+1);
	        String orientado="";
	        if(x < 5 && y < 5){
	            if(orientacion==1){
	                orientado="derecha";
	            }else{
	                orientado="abajo";
	            }
	        }else if(x > 5 && y > 5){
	            if(orientacion==1){
	                orientado="izquierda";
	            }else{
	                orientado="arriba";
	            }
	        }else if(x > 5 && y < 5){
	            orientado="arriba";
	        }else if(x < 5 && y > 5){
	            orientado="abajo";
	        }else{
	            if(orientacion==1){
	                orientado="izquierda";
	            }else{
	                orientado="arriba";
	            }
	        }
	        
	        generarposiciones(x,y,orientado,logitud);
	    }
	    //COMPROBAMOS SI NO SE JUNTAN POSICIONES ENTRE LOS BARCOS Y GUARDAMOS SUS POSICIONES
	    public static void generarposiciones(int x, int y, String orientado, int longitud){
	        String posicionesfinal="";
	        String posfallidas="";
	        int conterr=0;
	        if(orientado=="derecha"){
	            for(int j = y; j < y+longitud; j++){
	                if(comprobar(x,j)==true){
	                    conterr=1;
	                    repetidas.add(Integer.toString(x)+","+Integer.toString(j));
	                }else{
	                    ocupadas.add(Integer.toString(x)+","+Integer.toString(j));
	                    posicionesfinal=posicionesfinal+Integer.toString(x)+","+Integer.toString(j)+" ";
	                }
	            }
	        }
	        if(orientado=="izquierda"){
	            for(int j= y; j > y-longitud; j--){
	                if(comprobar(x,j)==true){
	                    conterr=1;
	                    repetidas.add(Integer.toString(x)+","+Integer.toString(j));
	                }else{
	                    ocupadas.add(Integer.toString(x)+","+Integer.toString(j));
	                    posicionesfinal=posicionesfinal+Integer.toString(x)+","+Integer.toString(j)+" ";  
	                }
	            }
	        }
	        if(orientado=="abajo"){
	            for(int j = x; j < x+longitud; j++){
	                if(comprobar(j,x)==true){
	                    conterr=1;
	                    repetidas.add(Integer.toString(x)+","+Integer.toString(j));
	                }else{
	                    ocupadas.add(" "+Integer.toString(j)+","+Integer.toString(x));
	                    posicionesfinal=posicionesfinal+Integer.toString(j)+","+Integer.toString(x)+" ";
	                }
	            }
	        }
	        if(orientado=="arriba"){
	            for(int j = x; j > x-longitud; j--){
	                if(comprobar(j,x)==true){
	                    conterr=1;
	                    repetidas.add(Integer.toString(x)+","+Integer.toString(j));
	                }else{
	                    ocupadas.add(Integer.toString(j)+","+Integer.toString(x));
	                    posicionesfinal=posicionesfinal+Integer.toString(j)+","+Integer.toString(x)+" "; 
	                }
	            }
	        }
	        if (conterr==1){
	            genenarbarcos(longitud);
	        }else{
	            posfinal.add(posicionesfinal);
	            
	        }
	        
	    }
	    //COMPROBAR LAS POSICIONES OCUPADAS
	    public static boolean comprobar(int x,int o){
	        String pos = Integer.toString(x)+","+Integer.toString(o);
	        String pos2 = Integer.toString(x)+","+Integer.toString(o)+",";
	        String pos3 = " "+Integer.toString(x)+","+Integer.toString(o)+",";
	        String pos4 = " "+Integer.toString(x)+","+Integer.toString(o);
	        String pos5 = " "+Integer.toString(x)+","+Integer.toString(o);
	        if(ocupadas.contains(pos)==true || ocupadas.contains(pos2)==true || ocupadas.contains(pos3)==true ||ocupadas.contains(pos4)==true ||ocupadas.contains(pos5)==true){
	            return true;
	        }else{
	            return false;
	  }
   }
	    //GENERAR TABLERO JUGADOR Y BARCOS DEL JUGADOR
	    public static void mostartablerojugador(){
	        for(int i = 0; i < 11; i++){
	        	System.out.println(" ");
	            for(int j = 0; j < 11; j++){
	                System.out.print(tablero2[i][j]+"    ");
	            }
	           
	        }
	    }
	   
	    //RELLENADO DEL TABLERO
	    public static void rellenarjugador(){
	        char caracter= '.';
	        for(int i = 0; i < 11; i++){
	            for(int j = 0; j < 11; j++){
	                tablero2[i][j]=Character.toString('.');
	               
	            }
	        }
	    }
	    //RELLENADO DE TABLERO CON NUMEOS Y LETRAS
	    public static void rellenartablerojugador(){
	        int letras=65;
	        int num=49;
	        int numeros=(char)49;
	        char letra=(char)65;
	        for(int i = 1; i < 11; i++){
	            tablero2[0][i]=Character.toString(numeros);
	            
	            num=num+1;
	            numeros=(char)num;
	        }
	        for(int i = 1; i < 11; i++){
	            tablero2[i][0]=Character.toString(letra);
	         
	            letras=letras+1;
	            letra=(char)letras;
	        }
	        tablero2[0][10]="10";
	        
	    }
	    
	    public static void genenarbarcosjugador(int logitudj){
	        int xj=(int) (Math.random()*10+1);//DERECHA-IZQUIERDA NUMEROS
	        int yj=(int) (Math.random()*10+1);//ARRIBA-ABAJO LETRAS
	        int orientacionj=(int) (Math.random()*2+1);
	        String orientadoj="";
	        if(xj < 5 && yj < 5){
	            if(orientacionj==1){
	                orientadoj="derecha";
	            }else{
	                orientadoj="abajo";
	            }
	        }else if(xj > 5 && yj > 5){
	            if(orientacionj==1){
	                orientadoj="izquierda";
	            }else{
	                orientadoj="arriba";
	            }
	        }else if(xj > 5 && yj < 5){
	            orientadoj="arriba";
	        }else if(xj < 5 && yj > 5){
	            orientadoj="abajo";
	        }else{
	            if(orientacionj==1){
	                orientadoj="izquierda";
	            }else{
	                orientadoj="arriba";
	            }
	        }
	        
	        generarposicionesjugador(xj,yj,orientadoj,logitudj);
	    }
	    //COMPROBAMOS SI NO SE JUNTAN POSICIONES ENTRE LOS BARCOS Y GUARDAMOS SUS POSICIONES
	    public static void generarposicionesjugador(int xj, int yj, String orientadoj, int longitudj){
	        String posicionesfinal="";
	        String posfallidas="";
	        int conterr=0;
	        if(orientadoj=="derecha"){
	            for(int j = yj; j < yj+longitudj; j++){
	                if(comprobarjugador(xj,j)==true){
	                    conterr=1;
	                    repetidasj.add(Integer.toString(xj)+","+Integer.toString(j));
	                }else{
	                    ocupadasj.add(Integer.toString(xj)+","+Integer.toString(j));
	                    posicionesfinal=posicionesfinal+Integer.toString(xj)+","+Integer.toString(j)+" ";
	                }
	            }
	        }
	        if(orientadoj=="izquierda"){
	            for(int j= yj; j > yj-longitudj; j--){
	                if(comprobarjugador(xj,j)==true){
	                    conterr=1;
	                    repetidasj.add(Integer.toString(xj)+","+Integer.toString(j));
	                }else{
	                    ocupadasj.add(Integer.toString(xj)+","+Integer.toString(j));
	                    posicionesfinal=posicionesfinal+Integer.toString(xj)+","+Integer.toString(j)+" ";  
	                }
	            }
	        }
	        if(orientadoj=="abajo"){
	            for(int j = xj; j < xj+longitudj; j++){
	                if(comprobarjugador(j,xj)==true){
	                    conterr=1;
	                    repetidasj.add(Integer.toString(xj)+","+Integer.toString(j));
	                }else{
	                    ocupadasj.add(" "+Integer.toString(j)+","+Integer.toString(xj));
	                    posicionesfinal=posicionesfinal+Integer.toString(j)+","+Integer.toString(xj)+" ";
	                }
	            }
	        }
	        if(orientadoj=="arriba"){
	            for(int j = xj; j > xj-longitudj; j--){
	                if(comprobarjugador(j,xj)==true){
	                    conterr=1;
	                    repetidasj.add(Integer.toString(xj)+","+Integer.toString(j));
	                }else{
	                    ocupadasj.add(Integer.toString(j)+","+Integer.toString(xj));
	                    posicionesfinal=posicionesfinal+Integer.toString(j)+","+Integer.toString(xj)+" "; 
	                }
	            }
	        }
	        if (conterr==1){
	            genenarbarcosjugador(longitudj);
	        }else{
	            posfinalj.add(posicionesfinal);
	        	} 
	        }
	        
	        //COMPROBAR LAS POSICIONES OCUPADAS
		    public static boolean comprobarjugador(int xj,int o){
		        String pos = Integer.toString(xj)+","+Integer.toString(o);
		        String pos2 = Integer.toString(xj)+","+Integer.toString(o)+",";
		        String pos3 = " "+Integer.toString(xj)+","+Integer.toString(o)+",";
		        String pos4 = " "+Integer.toString(xj)+","+Integer.toString(o);
		        String pos5 = " "+Integer.toString(xj)+","+Integer.toString(o);
		        if(ocupadasj.contains(pos)==true || ocupadasj.contains(pos2)==true || ocupadasj.contains(pos3)==true ||ocupadasj.contains(pos4)==true ||ocupadasj.contains(pos5)==true){
		            return true;
		        }else{
		            return false;
		  }
	    }
}

