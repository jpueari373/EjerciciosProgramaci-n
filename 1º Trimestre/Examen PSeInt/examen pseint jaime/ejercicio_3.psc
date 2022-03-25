Algoritmo ejercicio_3
	Definir frase Como Caracter
	Definir i como entero
	Escribir "Introduce una frase"
	leer frase

	Escribir " "
	Para i<-Longitud(frase) Hasta 1 Con Paso -1 Hacer
		si subcadena(frase,i,i) <> " " Entonces
			Escribir Sin Saltar Subcadena(frase i,i)
		SiNo
			si Subcadena(frase,i+1,i+1) == " "   Entonces
				i=+1
			FinSi
		Fin Si
		
	Fin Para
	Escribir " "
FinAlgoritmo
