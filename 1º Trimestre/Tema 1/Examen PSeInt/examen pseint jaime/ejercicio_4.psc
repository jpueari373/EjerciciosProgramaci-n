Algoritmo ejercicio_4
	definir num Como Entero
	Escribir "Serpenteo aleatorio"
	Escribir "-------------------"
	Escribir "Introduce la longitud de la serpiente"
	leer num
	Dimension tablero[num,13]
	
	Para i<-4 Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar i,"|"
		Para j<-1 Hasta 5 Hacer
			cabeza[num,13]<-"@"
			Escribir Sin Saltar ""
			Escribir Sin Saltar tablero[i,j]
		Fin Para
FinAlgoritmo
