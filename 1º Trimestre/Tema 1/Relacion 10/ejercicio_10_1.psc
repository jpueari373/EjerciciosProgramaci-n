Algoritmo ejercicio_10_1
	Definir num,respuesta como Numero;
	cont<-1;
	num <- azar(100)+1;
	mostrar num;
	Escribir "Adivina el número en 7 intentos";
	Repetir
		Escribir "Introduce un numero ",cont;
		Leer respuesta;
		cont<-cont+1;
	Hasta Que respuesta == num o cont > 7;
	Si respuesta == num Entonces
		Escribir "Has acertado el número";
	SiNo
		Escribir "Te has quedado sin intentos";
	Fin Si
FinAlgoritmo
