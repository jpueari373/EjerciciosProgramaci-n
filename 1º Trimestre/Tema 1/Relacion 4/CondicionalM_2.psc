Algoritmo CALCULOS
	Definir num1,num2 Como Entero;
	Escribir "Introduce dos numeros";
	Leer num1,num2;
	Escribir "Se mostrara un menu en la pantalla con diferentes opciones";
	Escribir "Introduce 1 para sumar los n�meros";
	Escribir "Introduce 2 para restar los n�meros";
	Escribir "Introduce 3 oara multiplicar los n�meros";
	Escribir "Introduce 4 para dividir los n�meros";
	Leer dato
	Segun dato Hacer
		1:
			Escribir "La suma de ambos n�meros es ",num1+num2;
		2:
			Escribir "La resta de ambos n�meros es ",num1-num2;
		3:
			Escribir "La multiplicacion de ambos n�meros es ", num1*num2;
		4:	
			Escribir "La division de ambos n�meros es ", num1/num2;
		De Otro Modo:
			Escribir "Te has esquivocado";
	Fin Segun
FinAlgoritmo
