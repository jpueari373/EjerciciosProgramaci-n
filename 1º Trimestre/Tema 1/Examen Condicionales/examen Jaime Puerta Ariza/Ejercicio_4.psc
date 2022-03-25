Algoritmo sin_titulo
	Definir x,e Como Entero;
	Escribir "Tienes que introducir la coordenada de un punto en el plano";
	Escribir "";
	Escribir "Introduce el valor de x";
	Leer x;
	Escribir "Introduce el valor de e";
	Leer e;
	Si x <> 0 y e <> 0  Entonces
		Si x > 0 y e > 0 Entonces
			Escribir "Dicho punto se ubica en el 1º Cuandrante";
		SiNo
			Si x < 0 Y e > 0 Entonces
				Escribir "Dicho punto se ubica en el 2º Cuandrante";
			Fin Si
		Fin Si
	SiNo
		Escribir "Error, introduce un valor distinto a 0";
	Fin Si
FinAlgoritmo
