Algoritmo ejercicio_9_1
	//Crea un programa que pida un n�mero al usuario un n�mero de mes (por ejemplo, el 4) y diga cu�ntos d�as tiene (por ejemplo, 30). Debes usar una matriz.
	Definir mes Como Entero;
	mes <- datos;
	Dimension datos[12]
	datos[1] <- 31;
	datos[2] <- 28;
	datos[3] <- 30;
	datos[4] <- 31;
	datos[5] <- 30;
	datos[6] <- 31;
	datos[7] <- 30;
	datos[8] <- 31;
	datos[9] <- 30;
	datos[10] <- 31;
	datos[11] <- 30;
	datos[12] <- 31;
	Escribir "Introduce un n�mero de mes";
	Leer mes;
	Si mes > 0 y mes <= 12 Entonces
		Escribir mes;
	SiNo
		Escribir "El n�mero introducido no corresponde con un n�mero de mes";
	Fin Si
FinAlgoritmo
