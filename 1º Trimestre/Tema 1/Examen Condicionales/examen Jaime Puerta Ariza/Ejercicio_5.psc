Algoritmo sin_titulo
	Definir aumento,sueldo,a�os Como Numero;
	aumento<-0;
	total <-0;
	Escribir "Introduce el sueldo del operario";
	Leer sueldo;
	Escribir "Introduce los a�os de antiguedad";
	Leer a�os;
	Si sueldo >= 500 Entonces
		Escribir "El sueldo del operario es: ",sueldo," euros";
	SiNo
		Si sueldo < 500 y a�os >= 10 Entonces
			Escribir "Otorgarle un aumento del 20% al operario";
			aumento= sueldo*0.20;
			total=sueldo + aumento
			Escribir "Aumentar el sueldo en: ",total," euros";
		SiNo
			Si sueldo < 500 y a�os < 10 Entonces
				Escribir "Otorgarle un aumento del 5% al operario";
				aumento= sueldo*0.05
				total= sueldo + aumento
				Escribir "Aumentar el sueldo en: ",total," euros";
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
