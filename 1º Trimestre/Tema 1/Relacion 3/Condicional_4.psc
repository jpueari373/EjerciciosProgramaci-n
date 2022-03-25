Algoritmo Multiplo_2
	Definir num1, num2 Como Real;
	Escribir "Introduce dos numeros";
	Leer num1,num2;
	Si num1 == num2^2 Entonces
		Escribir "El numero ",num1," es multiplo del numero " num2;
	SiNo
		Si num2 == num1^2 Entonces
			Escribir " El numero ",num2," es multiplo del numero " num1;
		SiNo
			Escribir "ninguno de los dos numeros son multiplos del otro";
		Fin Si
	Fin Si
FinAlgoritmo

