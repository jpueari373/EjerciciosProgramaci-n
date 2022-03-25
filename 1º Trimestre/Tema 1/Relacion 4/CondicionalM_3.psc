Algoritmo sin_titulo
	num1<-0;
	num2<-0;
	Escribir "Que número ha sacado el dado";
	Leer respuesta;
	
	Segun respuesta Hacer
		"UNO":
			Escribir "Has sacado ",num1+1;
			num1<-1
		"DOS":
			Escribir "Has sacado ",num1+2;
			num1<-2
		"TRES":
			Escribir "Has sacado ", num1+3;
			num1<-3
		"CUATRO":
			Escribir  "Has sacado ", num1+4;
			num1<-4
		"CINCO":
			Escribir "Has sacado ", num1+5;
			num1<-5
		"SEIS":
			Escribir "Has sacado ", num1+6;
			num1<-6
	Fin Segun
	Escribir "Que número has sacado en la segunda tirada";
	Leer respuesta2;
	Segun respuesta2 Hacer
		"UNO":
			Escribir "Has sacado ",num2+1;
			num2<-1
		"DOS":
			Escribir "Has sacado ",num2+2;
			num2<-2
		"TRES":
			Escribir "Has sacado ", num2+3;
			num2<-3
		"CUATRO":
			Escribir  "Has sacado ", num2+4;
			num2<-4
		"CINCO":
			Escribir "Has sacado ", num2+5;
			num2<-5
		"SEIS":
			Escribir "Has sacado ", num2+6;
			num2<-6
	Fin Segun
	Escribir "La suma de ambos números es ",num1+num2;
FinAlgoritmo
