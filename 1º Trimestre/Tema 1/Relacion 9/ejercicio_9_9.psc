Algoritmo ejercicio_9_9
	det=0;
	columna=2;
	fila=2;
	Dimension num[columna,fila];
	Para i<-1 Hasta fila Con Paso 1 Hacer
		Para j<-1 Hasta columna Con Paso 1 Hacer
			Escribir "Introduce el número ",i,",",j;
			Leer num[i,j];
		FinPara
	FinPara
	det=(num[1,1]*num[2,2])-(num[1,2]*num[2,1])
	Escribir "El determinante de la matriz es: ",det;
FinAlgoritmo
