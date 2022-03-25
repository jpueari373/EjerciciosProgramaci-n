Algoritmo ejercicio_11_3
	Definir nombre Como Caracter;
	//Pedir el nombre del usuario
	Escribir "Introduce tu nombre";
	Leer nombre;
	cont<-0;
	
	Para i<-1 Hasta Longitud(nombre) Hacer
		letra<-Subcadena(nombre,i,i)
		Si "a"==letra o "e"==letra o "i"==letra o "o"==letra o "u"==letra Entonces
			cont<-cont+1
		Fin Si
	Fin Para
	Escribir "Tu nombre tiene ",cont," vocales";
FinAlgoritmo
