Algoritmo sin_titulo
	Definir n1,n2 Como Entero;
	Escribir "Introduce un n�mero";
	Leer n1;
	Escribir "Introduce el segundo n�mero";
	Leer n2;
	Repetir
		Si n2= 0 Entonces
			Escribir "El segundo n�mero introducido es ",n2;
			Escribir "Introduce el segundo n�mero";
			Leer n2
		FinSi
	Hasta Que n2 <> 0;
	Escribir "La division de ambos n�meros es ", n1/n2;
FinAlgoritmo
