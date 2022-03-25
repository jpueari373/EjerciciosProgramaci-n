Algoritmo bucle_1_9
    Definir F, C, S, serie como Real;
    Para F <-1 Hasta 9 Con Paso 1  Hacer
        S <- 0;
        serie <- 0;	
        Para C <-1 Hasta 10 - F Con Paso 1  Hacer
            S <- (10 - F);
            serie <- (serie * 10) + S;
        FinPara
        Escribir serie;
    FinPara		
FinAlgoritmo
