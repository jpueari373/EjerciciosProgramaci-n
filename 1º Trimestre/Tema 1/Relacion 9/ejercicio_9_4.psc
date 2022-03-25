Algoritmo ejercicio_9_4
	Definir num1,num2 como Numero;
	suma1<-0;
	suma2<-0;
	Dimension vector[3];
	Escribir "Introduce los números del 1 vector";
	Escribir "";
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Introduce el número ",i;
		Leer num1;
		vector[i] <- num1
		suma1<-suma+num1;
	Fin Para
	
	Dimension vector2[3];
	Escribir "Introduce los números del 2 vector";
	Escribir "";
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Introduce un número ",i;
		Leer num2;
		vector2[i] <- num2
		suma2<-suma+num2;
	Fin Para
	suma <- suma1+suma2;
	Escribir "La suma de ambos vectores es: ",suma;
FinAlgoritmo
