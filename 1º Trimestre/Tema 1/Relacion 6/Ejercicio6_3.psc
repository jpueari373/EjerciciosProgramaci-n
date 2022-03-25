//6.3: Crea un programa que genere dos números al azar entre el 0 y el 100, 
//y pida al usuario que calcule e introduzca su suma. 
//Si la respuesta no es correcta, deberá volver a pedirla tantas veces como sea necesario 
//hasta que el usuario acierte.
//Pista: como verás en el apartado 10, para generar un número al azar del 0 al 100 puedes hacer numero <- AZAR(101)
Algoritmo Ejercicio6_3
	Definir n1, n2, suma Como Entero
	n1=Azar(101)
	n2=Azar (101)
	Escribir " Los números aleatorios son: ",n1, "  y ", n2
	Escribir " Introduce la suma de los dos números"
	Leer suma
	Mientras suma<>n1+n2 Hacer
		Escribir "No has acertado la suma, introduce otro valor "
		Leer suma
	Fin Mientras
	Escribir "Enhorabuena, ¡¡ has acertado!!"
	
	
	
	
	
FinAlgoritmo
