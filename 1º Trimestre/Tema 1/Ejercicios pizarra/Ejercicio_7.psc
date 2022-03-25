Algoritmo num_cifras
    Definir num, cifras como Entero;
    Escribir "Introduce un numero de 2 cifras ";
    Leer num;		
    Si num > 99 Entonces
        Escribir "Error, el numero supera las 2 cifras";
    SiNo		
        Si num < 10 Entonces
            Escribir "Le falta ", 10-num ," Para 2 cifras";
        SiNo
            Escribir "Le falta ", 100-num ," Para 3 cifras";
        FinSi		
    FinSi	
FinAlgoritmo