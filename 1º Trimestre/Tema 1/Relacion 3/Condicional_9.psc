Algoritmo sin_titulo
	Definir num1,num2,num3 Como Entero;
	Escribir "Introduce tres numeros";
	Leer num1,num2,num3;
	Si num1 + num2 = num3 Entonces
		Escribir "La suma de ",num1, " y ",num2," es igual a ",num3;
	SiNo
		Si num1 + num3 = num2 Entonces
			Escribir "La suma de ",num1, " y ",num3," es igual a ",num2;
		SiNo
			Si num2 + num3 = num1 Entonces
				Escribir "La suma de ",num2, " y ",num3," es igual a ",num1;
			SiNo
				Escribir "Ninguno de los numeros es la suma de otro numero";
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
