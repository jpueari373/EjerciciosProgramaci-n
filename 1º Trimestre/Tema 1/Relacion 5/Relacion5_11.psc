Algoritmo sin_titulo
	Definir x,total Como Entero;
	Definir suma,n1,media,cant,cantidad,suma1 Como Real;
	suma<-0;
	suma1<-0;
	media<-0;
	cantidad<-0;
	cant<-0;
	x<-1;
	Mientras X <= 10 Hacer
		Escribir "Introduce un número ",x;
		Leer n1;
		x<-x+1;
		Si n1 > 0 Entonces
			suma<-suma + n1
			SiNo
				Si n1 < 0 Entonces
				cantidad<-cantidad+1
				media<-suma1 + n1/ cantidad
			SiNo
				Si n1 == 0 Entonces
					cant<-cant+1;
				FinSi
			FinSi
		Fin Si
	Fin Mientras
	Escribir "La suma de los números positivos es: ",suma;
	Escribir "La media de los numeros negativos es: ",media;
	Escribir "La cantidad de 0 introducidas es: ",cant;
FinAlgoritmo
