Algoritmo codigo_contrase�a
	Definir contrase�a,codigo Como Entero;
	Repetir
		Si codigo <> 1 Entonces
			Escribir "Introduce c�digo de usuario";
			Leer codigo;
			Escribir "C�digo incorrecto";
		FinSi
	Hasta Que codigo = 1;
	Escribir "C�digo correcto";
	Repetir
		Si contrase�a <> 1234 Entonces
			Escribir "Introduce contrase�a";
			Leer contrase�a;
			Escribir "contrase�a incorrecta";
		FinSi
	Hasta Que contrase�a = 1234;
	Escribir "Bienvenido";
FinAlgoritmo