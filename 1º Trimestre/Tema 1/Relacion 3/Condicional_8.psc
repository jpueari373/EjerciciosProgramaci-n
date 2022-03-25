Algoritmo sin_titulo
	Definir Radio,base,altura Como Real
	Escribir "Introduce el radio del circulo"
	Leer Radio
	area= pi*Radio^2;
	Escribir "Introduce la base y la altura del triangulo"
	Leer base, altura;
	area2= base*altura;
	Si area > area2 Entonces
		Escribir "El area del circulo es mayor que el area del triangulo"
	SiNo
		Escribir "El area del triangulo es mayor que el area del circulo"
	Fin Si
FinAlgoritmo
