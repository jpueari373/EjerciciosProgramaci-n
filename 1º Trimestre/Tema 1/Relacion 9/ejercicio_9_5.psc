Algoritmo ejercicio_9_5
	Definir num1,num2 como Numero;
	suma1<-0;
	suma2<-0;
	x1<-0;
	y1<-0;
	x2<-0;
	y2<-0;
	Dimension vector[3];
	Escribir "Introduce los números del 1 vector";
	Escribir "";
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Introduce el número ",i;
		Leer num1;
		vector[i] <- num1
		x1<-vector[1];
		y1<-vector[2];
	
	Fin Para
	
	Dimension vector2[3];
	Escribir "Introduce los números del 2 vector";
	Escribir "";
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		Escribir "Introduce un número ",i;
		Leer num2;
		vector2[i] <- num2
		x2<-vector2[1];
		y2<-vector2[2];
	Fin Para
	x3<-x1+x2;
	y3<-y1+y2;
	escalar<- (x1*y1)+(x2*y2)+(x3*y3);
	
	Escribir "El producto escalar es: ",escalar;
FinAlgoritmo
