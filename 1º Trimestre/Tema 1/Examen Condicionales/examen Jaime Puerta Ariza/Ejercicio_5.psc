Algoritmo sin_titulo
	Definir aumento,sueldo,años Como Numero;
	aumento<-0;
	total <-0;
	Escribir "Introduce el sueldo del operario";
	Leer sueldo;
	Escribir "Introduce los años de antiguedad";
	Leer años;
	Si sueldo >= 500 Entonces
		Escribir "El sueldo del operario es: ",sueldo," euros";
	SiNo
		Si sueldo < 500 y años >= 10 Entonces
			Escribir "Otorgarle un aumento del 20% al operario";
			aumento= sueldo*0.20;
			total=sueldo + aumento
			Escribir "Aumentar el sueldo en: ",total," euros";
		SiNo
			Si sueldo < 500 y años < 10 Entonces
				Escribir "Otorgarle un aumento del 5% al operario";
				aumento= sueldo*0.05
				total= sueldo + aumento
				Escribir "Aumentar el sueldo en: ",total," euros";
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
