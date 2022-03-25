Algoritmo Mayor_que
	Definir num1, num2 Como Real;
	Escribir "Introduce un numero";
	Leer num1;
	Escribir "Introduce otro numero";
	Leer num2;
	Si num1 > num2 Entonces;
		Escribir "El numero ",num1," es mayor que " num2;
	SiNo
		Si num1 < num2 Entonces;
			Escribir "El numero ",num2," es mayor que " num1;
		SiNo
			Escribir "El numero ",num1," es igual que " num2;
		Fin Si
	Fin Si
	
FinAlgoritmo
