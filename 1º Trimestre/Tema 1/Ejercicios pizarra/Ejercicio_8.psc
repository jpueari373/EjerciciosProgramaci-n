Algoritmo valor_en_letras
	Definir Num como Numero;
	Escribir "Ingrese número de 2 cifras";
	Leer Num;
	Si Num > 0 Y Num < 100 Entonces;
		Si Num > 10 Y Num < 16 Entonces;
			Segun Num Hacer;
				11: Escribir "Once";
				12: Escribir "Doce";
				13: Escribir "Trece";
				14: Escribir "Catorce";
				15: Escribir "Quince";
			Fin Segun
		SiNo
			dec = (Num - (Num MOD 10))/10;
			uni = Num MOD 10;
			Segun dec Hacer;
				1: decena = "Diez";
				2: decena = "Veinte";
				3: decena = "Treinta";
				4: decena = "Cuarenta";
				5: decena = "Cincuenta";
				6: decena = "Sesenta";
				7: decena = "Setenta";
				8: decena = "Ochenta";
				9: decena = "Noventa";
			Fin Segun
			Si uni <> 0 Entonces;
				Segun uni Hacer;
					1: Unidad = "Uno";
					2: Unidad = "Dos";
					3: Unidad = "Tres";
					4: Unidad = "Cuatro";
					5: Unidad = "Cinco";
					6: Unidad = "Seis";
					7: Unidad = "Siete";
					8: Unidad = "Ocho";
					9: Unidad = "Nueve";
				Fin Segun
				Si dec = 1 Entonces;
					Decena = "Dieci";
				FinSi
				Si dec = 2 Entonces;
					Decena = "Venti";
				FinSi
				Si dec > 2 Y dec < 10 Entonces;
					Escribir Decena "Y" Unidad;
				SiNo
					Escribir Decena "" Unidad;
				FinSi
			SiNo
				Escribir Decena;
			Fin Si
		Fin Si
	SiNo
		Escribir "Numero incorrecto";
	Fin Si
FinAlgoritmo

