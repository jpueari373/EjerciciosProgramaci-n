//6.2: Haz un programa que permita calcular la suma de pares de números. 
//Pedirá dos números al usuario y mostrará su suma, 
//volviendo a repetir hasta que ambos números introducidos sean 0.
Algoritmo Ejercicio6_2
	Definir n1,n2 Como Entero
	
	Escribir "Introduce dos números"
	Leer n1,n2
	Mientras n1<>0 o n2<>0 Hacer
		escribir "La suma de los números introducidos es: ", n1+n2
		Escribir "Introduce dos números"
		Leer n1,n2
	Fin Mientras
	Escribir "Los dos números introducidos son 0"
	
FinAlgoritmo
