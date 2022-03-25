Algoritmo ejercicio_10_6
	Definir x1,x2,y1,y2 como Numeros;
	distancia <- 0;
	Escribir "Vamos a calcular la distancia entre dos puntos";
	Escribir "";
	Escribir "Introduce el valor de x1";
	Leer x1;
	Escribir "Introduce el valor de y1";
	Leer y1;
	Escribir "Introduce el valor de x2";
	Leer x2;
	Escribir "Introduce el valor de y2";
	Leer y2;
	distancia <- RC(((x1-x2)^2 + (y1-y2)^2));
	Escribir "La distancia de ambos puntos es: ",distancia;
FinAlgoritmo
