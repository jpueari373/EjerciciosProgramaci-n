Algoritmo CALCULOS
	Definir num1,num2 Como Entero;
	Escribir "Introduce dos numeros";
	Leer num1,num2;
	Escribir "Se mostrara un menu en la pantalla con diferentes opciones";
	Escribir "Introduce 1 para sumar los números";
	Escribir "Introduce 2 para restar los números";
	Escribir "Introduce 3 oara multiplicar los números";
	Escribir "Introduce 4 para dividir los números";
	Leer dato
	Segun dato Hacer
		1:
			Escribir "La suma de ambos números es ",num1+num2;
		2:
			Escribir "La resta de ambos números es ",num1-num2;
		3:
			Escribir "La multiplicacion de ambos números es ", num1*num2;
		4:	
			Escribir "La division de ambos números es ", num1/num2;
		De Otro Modo:
			Escribir "Te has esquivocado";
	Fin Segun
FinAlgoritmo
