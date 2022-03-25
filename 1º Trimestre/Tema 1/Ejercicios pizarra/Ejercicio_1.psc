Algoritmo sin_titulo
	Definir s,m,h como Numero;
	Escribir "Introduce un número de segundos";
	Leer s;
	m <- s/60;
	h <- m/60;
	s <- m%60;
	Escribir "El número introducido es ",h," horas, ",m," minutos y ",s," segundos";
FinAlgoritmo
