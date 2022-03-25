Algoritmo ejercicio_11_1
	Definir nombre Como Caracter;
	x<-0;
	cont<-0;
	Escribir "Introduce tu nombre";
	Leer nombre;
	Para x<-1 Hasta Longitud(nombre) Con Paso 1 Hacer
		Escribir sin saltar  Subcadena(nombre,x,x);
	Fin Para
	Escribir "";
FinAlgoritmo
