Algoritmo ejercicio_10_2
	Definir num,calculo como Numero;
	Escribir "Programa para calcular ra�ces cuadradas"
	Escribir "";
	Repetir
		Escribir "Introduce un n�mero";
		Leer num;
		Si num > 0 Entonces
			calculo<-RC(num);
			Escribir "La ra�z del n�mero introducido es: ",calculo;
			Escribir "";
		SiNo
			Si num < 0 Entonces
				Escribir "Has introducido un n�mero negativo";
				Escribir "";
			Fin Si
		Fin Si
	Hasta Que num == 0;
	Escribir "Adios";
FinAlgoritmo
