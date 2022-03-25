Algoritmo ejercicio_9_7
	Definir i,dato como entero;
	cont=0;
	Dimension datos[10];
	datos[1]<-4;
	datos[2]<-8;
	datos[3]<-6;
	datos[4]<-3;
	datos[5]<-2;
	datos[6]<-3;
	datos[7]<-2;
	datos[8]<-7;
	datos[9]<-5;
	datos[10]<-5;
	Escribir "Que dato desea buscar"
	Leer dato
	Para  i<- 1 Hasta  10 Hacer
		Si datos[i]= dato Entonces
			cont=cont+1;
		Fin Si
	FinPara
	
	Si cont>0 Entonces
		Escribir "El dato se ha encontrado ",cont," veces";
	SiNo
		Escribir "El dato no se encuentra";
	Fin Si

FinAlgoritmo
