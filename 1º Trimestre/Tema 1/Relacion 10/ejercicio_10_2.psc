Algoritmo ejercicio_10_2
	Definir num,calculo como Numero;
	Escribir "Programa para calcular raíces cuadradas"
	Escribir "";
	Repetir
		Escribir "Introduce un número";
		Leer num;
		Si num > 0 Entonces
			calculo<-RC(num);
			Escribir "La raíz del número introducido es: ",calculo;
			Escribir "";
		SiNo
			Si num < 0 Entonces
				Escribir "Has introducido un número negativo";
				Escribir "";
			Fin Si
		Fin Si
	Hasta Que num == 0;
	Escribir "Adios";
FinAlgoritmo
