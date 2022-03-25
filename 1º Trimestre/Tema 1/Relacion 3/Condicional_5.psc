Algoritmo sin_titulo
	Definir c1,c2,c3 Como Caracter;
	Escribir  "Introduce 3 Caracteres";
	Leer c1,c2,c3;
	Si c1 > c2 y c1 > c3 y c2 > c3 Entonces
		Escribir "El caracter ",c1," es mayor que ",c2," Y ",C2," es mayor que ",c3;
	SiNo
		Si c1 > c2 y c1 > c3 y c3 > c2 Entonces
			Escribir "El caracter ",c1," es mayor que ",c3," Y ",C3," es mayor que ",c2;
		SiNo
			Si c2 > c1 y c2 > c3 y c1 > c3 Entonces
				Escribir "El caracter ",c2," es mayor que ",c1," Y ",C1," es mayor que ",c3;
				
				Si c2 > c1 y c2 > c3 y c3 > c1 Entonces
					Escribir "El caracter ",c2," es mayor que ",c3," Y ",C3," es mayor que ",c1;
				SiNo
					Si c3 > c1 y c3 > c2 y c1 > c2 Entonces
						Escribir "El caracter ",c3," es mayor que ",c1," Y ",C1," es mayor que ",c2;
						
					SiNo
						Si c2 > c1 y c2 > c3 y c2 > c1 Entonces
						Escribir "El caracter ",c3," es mayor que ",c2," Y ",C2," es mayor que ",c1;
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si	
	Fin Si
FinAlgoritmo
