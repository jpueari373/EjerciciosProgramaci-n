Algoritmo sin_titulo
	//Crea una versi�n ampliada del ejercicio 9.2, en la que se pida al usuario 5 datos, se guarden en una matriz y finalmente se calcule su media, se muestre �sta y se muestren tambi�n los valores mayores que la media).
	suma <-0;
	media <-0;
	n <-0;
	Dimension num[5];
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Introduce el n�mero ",i;
		Leer num[i];
		suma <- suma + num[i];
	Fin Para
	media <- suma/5;
	Escribir "La media de los n�meros introducidos es: ", media;
	Para i<- 1 Hasta 5 Con Paso 1 Hacer
		Si num[i] > media Entonces
			Escribir "Los n�meros mayores de la media son: ", num[i];
		Fin Si
	Fin Para
	
	
	
FinAlgoritmo
