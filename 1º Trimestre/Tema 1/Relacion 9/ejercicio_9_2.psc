Algoritmo media_matriz
	//Haz un programa que pida al usuario 5 datos, los guarde en una matriz y luego muestre su media (la suma de los 5 datos, dividida entre 5).
	suma <-0;
	media <-0;
	Dimension num[5];
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Introduce el número ",i;
		Leer num[i];
		suma <- suma + num[i];
	Fin Para
	media <- suma/5;
	Escribir "La media de los números introducidos es: ", media;
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Si num[i] > media Entonces
			Escribir "El número mayor que la media es: ",num[i];
		Fin Si
	Fin Para
FinAlgoritmo
