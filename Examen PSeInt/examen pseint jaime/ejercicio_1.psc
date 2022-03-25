Algoritmo ejercicio_1
	Repetir
		Escribir "MENU DE OPCIONES"
		Escribir "1. Sumar dos numeros"
		Escribir "2. Restar dos numeros"
		Escribir "3. Multiplicar dos numeros"
		Escribir "4. Dividir dos numeros"
		Escribir "0. SALIR"
		Escribir "Introduce una opcion:"
		leer num
		Segun num Hacer
			1:
				Escribir  sumat( num1,num2 )
			2:
				Escribir restat(num1,num2)
			3:
				Escribir multiplicart(num1,num2)
			4:
				Escribir dividirt(num1,num2)
			De Otro Modo:
				Escribir "Error, opcion no existe"
		Fin Segun
		Escribir " "
	Hasta Que num=0
FinAlgoritmo

SubProceso resultado <- sumat( num1,num2 )
	Escribir "Introduce el primer numero:"
	Leer num1
	Escribir "Introduce el segundo numero:"
	Leer num2
	suma = num1 + num2
	Escribir "Resultado: ", suma
FinSubProceso

SubProceso resultado <- restat( num1,num2 )
	Escribir "Introduce el primer numero:"
	Leer num1
	Escribir "Introduce el segundo numero:"
	Leer num2
	resta <- num1-num2
	Escribir "Resultado: ", resta
FinSubProceso

SubProceso resultado <- multiplicart( num1,num2 )
	Escribir "Introduce el primer numero:"
	Leer num1
	Escribir "Introduce el segundo numero:"
	Leer num2
	multiplicar<- num1*num2
	Escribir "Resultado: ", multiplicar
FinSubProceso

SubProceso resultado <- dividirt( num1,num2 )
	Escribir "Introduce el primer numero:"
	Leer num1
	Escribir "Introduce el segundo numero:"
	Leer num2
	dividir<- num1/num2
	Escribir "Resultado: ", dividir
FinSubProceso


