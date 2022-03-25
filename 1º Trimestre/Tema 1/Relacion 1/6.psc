Algoritmo cadena_caracteres
	palabra=""
	palabra2=""
	k<-0
	Escribir "Introduce 5 letras"
	Leer palabra
	cantidad= Longitud(palabra)
	Escribir "El numero de caracteres introducidos es " Mostrar cantidad
	
	para i<-1 hasta cantidad con paso 1
		palabra2= palabra2 + Subcadena(palabra,cantidad-k,cantidad-k);
		k<-k+1
	FinPara
	Escribir palabra2
FinAlgoritmo
