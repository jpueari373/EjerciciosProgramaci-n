Algoritmo juego
	Dimension tablero[4,5]
	vacio=" "
	intento="x"
	//inicio del array
	Para i<-4 Hasta 1 Con Paso -1 Hacer
		Para j<-1 Hasta 5 Hacer
			tablero[i,j]=vacio
		Fin Para
		Escribir " "
	Fin Para
	//colocar la mina
	minax<-azar(5)+1
	minay<-azar(4)+1
	tablero[minay,minax]<-vacio
	//colocar el tesoro
	Repetir
		tesorox<-azar(5)+1
		tesoroy<-azar(4)+1
	Hasta Que tesorox <> minax y tesoroy <> minay
	tablero[tesoroy,tesorox]<-vacio
	Escribir "!BUSCA EL TESORO¡"
	Para i<-4 Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar i,"|"
		Para j<-1 Hasta 5 Hacer
			Escribir Sin Saltar ""
			Escribir Sin Saltar tablero[i,j]
		Fin Para
		Escribir  " "
	FinPara
	Escribir Sin Saltar " "
	Escribir "----------"
	Escribir "  12345 "
	Escribir " "
	//resultado
	Repetir  
		Repetir
			Escribir "Introduce la coordenada x"
			Leer cx
			si cx < 1 o cx > 5 Entonces
				Escribir "Error, introduce un valor entre el 1 y el 5"
			FinSi
			Escribir ""
		Hasta Que cx >= 1 y cx <= 5 
		Repetir
			Escribir "Introduce la coordenada y"
			Leer cy
			si cy < 1 o cy > 4 Entonces
				Escribir "Error, introduce un valor entre el 1 y el 4"
			FinSi
			Escribir ""
		Hasta Que cy >= 1 y cy <= 4
		tablero[cy,cx]<-intento
		Escribir "Coordenada x: ",cx
		Escribir "Coordenada y: ",cy
		Para i<-4 Hasta 1 Con Paso -1 Hacer
			Escribir Sin Saltar i,"|"
			Para j<-1 Hasta 5 Hacer
				Escribir Sin Saltar ""
				Escribir Sin Saltar tablero[i,j]
			Fin Para
			Escribir  " "
		FinPara
		Escribir Sin Saltar " "
		Escribir "----------"
		Escribir "  12345 "
		Escribir " "
	Hasta Que tablero[cy,cx] = tablero[minay,minax] o tablero[cy,cx] = tablero[tesoroy,tesorox]
	//Si intento = bomba o tesoro
	Si  tablero[cy,cx] = tablero[minay,minax] Entonces
		Escribir "Coordenada x: ",cx
		Escribir "Coordenada y: ",cy
		Escribir "Lo siento, has perdido"
		Para i<-4 Hasta 1 Con Paso -1 Hacer
			Escribir Sin Saltar i,"|"
			Para j<-1 Hasta 5 Hacer
				tablero[minay,minax]<-"*"
				tablero[tesoroy,tesorox]<-"$"
				Escribir Sin Saltar ""
				Escribir Sin Saltar tablero[i,j]
			Fin Para
			Escribir  " "
		FinPara
		Escribir Sin Saltar " "
		Escribir "----------"
		Escribir "  12345 "
		Escribir " "
	SiNo
		Si tablero[cy,cx] = tablero[tesoroy,tesorox] Entonces
			Escribir "Coordenada x: ",cx
			Escribir "Coordenada y: ",cy
			Escribir "Genial, has ganado"
			Para i<-4 Hasta 1 Con Paso -1 Hacer
				Escribir Sin Saltar i,"|"
				Para j<-1 Hasta 5 Hacer
					tablero[minay,minax]<-"*"
					tablero[tesoroy,tesorox]<-"$"
					Escribir Sin Saltar ""
					Escribir Sin Saltar tablero[i,j]
				Fin Para
				Escribir  " "
			FinPara
			Escribir Sin Saltar " "
			Escribir "----------"
			Escribir "  12345 "
			Escribir " "
		FinSi
	Fin Si
FinAlgoritmo
