Algoritmo sin_titulo
	Definir num,suma,mul Como Numero;
	suma<-0;
	Para num<-1 Hasta 20 Con Paso 1 Hacer
		Si num mod 2 == 0 Entonces
			suma<- suma + num;
		Fin Si
	FinPara
	Escribir "La suma de los números pares es ", suma;
	mul<-1;
	Para num<-1 Hasta 20 Con Paso 1 Hacer
		Si num mod 2 == 1 Entonces
			mul<- mul * num
		Fin Si
	FinPara
	Escribir "La multiplicacion de todos los numeros impares es ",mul;
FinAlgoritmo