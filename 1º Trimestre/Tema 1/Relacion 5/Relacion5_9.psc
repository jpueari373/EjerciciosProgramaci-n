Algoritmo sin_titulo
		//Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos. Cuando el usuario no quiera
		//insertar más números, introducirá un número negativo y el algoritmo, antes de acabar, mostrará la media
		//de los números positivos que ha introducido anteriormente el usuario.
		Definir num1,cant,media Como Numero;
		Escribir "Introduce un numero positivo";
		Leer num1;
		suma<-0;
		cant<-0;
		Mientras num1 >= 0 Hacer
			Escribir "Introduce un numero positivo";
			Leer num1;
			suma<- suma + num1;
			cant<-cant+1
			media<-suma/cant;
		Fin Mientras
		Escribir media;
FinAlgoritmo

