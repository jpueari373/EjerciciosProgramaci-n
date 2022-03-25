Algoritmo sin_titulo
	Definir n1,n2 Como Entero;
	Repetir
		Si operacion <> 0 Entonces
		FinSi
		Escribir "Introduce un numero";
		Leer  n1;
		Escribir "Introduce otro numero";
		Leer n2;
		operacion= n1 + n2;
		Escribir "La suma de ambos números es ", operacion;
	Hasta Que n1= 0 y n2= 0;
	Escribir"Ambos números introducidos son ", operacion;
FinAlgoritmo
