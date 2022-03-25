Algoritmo sin_titulo
	Definir año,mes,dia,mes_navi,dia_navi Como Entero;
	Escribir "Introduce una fecha para ver si corresponde con Navidad";
	Escribir "";
	Escribir "Introduce año";
	Leer año;
	Escribir "Introduce mes";
	Leer mes;
	Escribir "Introduce dia";
	Leer dia;
	mes_navi <- 12;
	dia_navi <- 25;
	Si mes == mes_navi y dia == dia_navi Entonces
		Escribir "la fecha: ",dia," dia, ",mes," meses y ", año,"año corresponde con navidad";
	SiNo
		escribir "La fecha introducida no corresponde con navidad";
	Fin Si
FinAlgoritmo
