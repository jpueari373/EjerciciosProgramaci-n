Algoritmo sin_titulo
	Definir num1 como Numero;
	Escribir "Introduce un n�mero";
	Leer num1;
	Repetir
		Si num1 % 2 = 0 y num1 <> 0  Entonces;
			Escribir "El n�mero introducido es par";
			Leer num1;
		SiNo
			Si num1 % 2 = 1 y num1 <> 0 o num1< 0 Entonces
				Escribir "El n�mero introducido es impar";
				Leer num1;
			FinSi
		FinSi
	Hasta Que num1 == 0;
	Escribir "Finalizado";
FinAlgoritmo
