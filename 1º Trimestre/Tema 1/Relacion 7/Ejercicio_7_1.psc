Algoritmo codigo_contraseña
	Definir contraseña,codigo Como Entero;
	Repetir
		Si codigo <> 1 Entonces
			Escribir "Introduce código de usuario";
			Leer codigo;
			Escribir "Código incorrecto";
		FinSi
	Hasta Que codigo = 1;
	Escribir "Código correcto";
	Repetir
		Si contraseña <> 1234 Entonces
			Escribir "Introduce contraseña";
			Leer contraseña;
			Escribir "contraseña incorrecta";
		FinSi
	Hasta Que contraseña = 1234;
	Escribir "Bienvenido";
FinAlgoritmo