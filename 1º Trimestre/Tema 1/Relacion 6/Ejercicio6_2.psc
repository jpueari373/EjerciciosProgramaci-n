//6.2: Haz un programa que permita calcular la suma de pares de n�meros. 
//Pedir� dos n�meros al usuario y mostrar� su suma, 
//volviendo a repetir hasta que ambos n�meros introducidos sean 0.
Algoritmo Ejercicio6_2
	Definir n1,n2 Como Entero
	
	Escribir "Introduce dos n�meros"
	Leer n1,n2
	Mientras n1<>0 o n2<>0 Hacer
		escribir "La suma de los n�meros introducidos es: ", n1+n2
		Escribir "Introduce dos n�meros"
		Leer n1,n2
	Fin Mientras
	Escribir "Los dos n�meros introducidos son 0"
	
FinAlgoritmo
