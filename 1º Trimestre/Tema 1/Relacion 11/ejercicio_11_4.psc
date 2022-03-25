Algoritmo ejercicio_11_4
	Definir nombre Como Caracter;
	//Pedir el nombre del usuario
	Escribir "Introduce tu nombre";
	Leer nombre;
	cont<-0;
	
	Para i<-1 Hasta Longitud(nombre) Hacer
		letra<-Subcadena(nombre,i,i)
		Segun letra Hacer
			"a":
				Escribir Sin Saltar"a"
			"e":
				Escribir Sin Saltar "e"
			"i":
				Escribir sin Saltar "i"
			"o":
				Escribir Sin Saltar"o"
			"u":
				Escribir Sin Saltar"u"
		Fin Segun
	Fin Para
	Escribir "";
FinAlgoritmo
