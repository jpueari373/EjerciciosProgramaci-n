Algoritmo sin_titulo
	Definir n1,n2 Como Entero;
	Escribir "Introduce un número";
	Leer n1;
	Escribir "Introduce el segundo número";
	Leer n2;
	Repetir
		Si n2= 0 Entonces
			Escribir "El segundo número introducido es ",n2;
			Escribir "Introduce el segundo número";
			Leer n2
		FinSi
	Hasta Que n2 <> 0;
	Escribir "La division de ambos números es ", n1/n2;
FinAlgoritmo
