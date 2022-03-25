Algoritmo ejercicio_11_2
	definir nombre Como Caracter;
	i<-0;
	Escribir "Introduce tu nombre";
	Leer nombre;
	Para i<-1 Hasta longitud(nombre) Hacer
		Si i mod 2 == 0 Entonces
			Escribir Sin Saltar Mayusculas(Subcadena(nombre,i,i));
		SiNo
			Escribir Sin Saltar Minusculas(Subcadena(nombre,i,i));
		Fin Si
	FinPara
	Escribir "";
FinAlgoritmo
