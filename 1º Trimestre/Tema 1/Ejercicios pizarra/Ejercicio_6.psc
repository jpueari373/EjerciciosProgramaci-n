Algoritmo numero_div_partes
	Definir Num como Numero;
	Definir cen,res,dec,uni Como Entero;
    Escribir "Mostrar la decena, centena y unidad";
    Escribir "Ingrese Número de 3 Cifras";
    Leer Num;
    cen = (num - (num MOD 100))/100;
    res = num MOD 100;
    dec = (res - (res MOD 10))/10;
    uni = res MOD 10;
    Escribir "Centena : ",cen;
    Escribir "Decena : ",dec;
    Escribir "Unidad : ",uni;
FinAlgoritmo      