Algoritmo sin_titulo
	Definir total,correctas Como Entero;
	
	Escribir "Cantidad total de preguntas"
	Leer total;
	Escribir "Cantidad de preguntas correctas";
	Leer correctas;
	
	Si correctas >= 0.9 * total Entonces
		Escribir "Nivel máximo";
	SiNo
		Si correctas >= 0.7 * total y correctas < 0.9 * total Entonces
			Escribir "Nivel medio";
		SiNo
			Si correctas >= 0.5 * total y correctas < 0.7 * total Entonces
				Escribir "Nivel regular";
			SiNo
				Escribir "Fuera de nivel";
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
