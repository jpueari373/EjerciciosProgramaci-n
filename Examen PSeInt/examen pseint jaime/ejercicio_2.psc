Algoritmo sin_titulo
	Definir num,num1,num2 Como numero
	Repetir
		Escribir "MENU PRINCIPAL"
		Escribir "--------------"
		Escribir "1. Operaciones básicas"
		Escribir "2. Operaciones variadas"
		Escribir "0. SALIR"
		Escribir "Introduce una opcion:"
		Leer num
		Segun num Hacer
			1:
				Repetir
					Escribir "MENU OPERACIONES BÁSICAS"
					Escribir "1. Sumar dos numeros"
					Escribir "2. Restar dos numeros"
					Escribir "3. Multiplicar dos numeros"
					Escribir "4. Dividir dos numeros"
					Escribir "0. REGRESAR"
					Escribir "Introduce una opcion:"
					leer num1
					Segun num1 Hacer
						1:
							Escribir sumat( num1,num2 )
						2:
							Escribir restat(num1,num2)
						3:
							Escribir multiplicart(num1,num2)
						4:
							Escribir dividirt(num1,num2)
						0:
							Escribir sin saltar " "
						De Otro Modo:
							Escribir "Error, opcion no existe"
					Fin Segun
					Escribir " "
				Hasta Que num1=0
			2:
				Repetir
					Escribir "MENU OPERACIONES VARIADAS"
					Escribir "1. Número y día"
					Escribir "2. Suma de los primeros n números naturales"
					Escribir "3. Número primo"
					Escribir "4. Invertir un número de 4 cifras"
					Escribir "0. REGRESAR"
					Escribir "Introduce una opcion:"
					leer num2
					Segun num2 Hacer
						1:
							numerodia(numero)
						2:
							Escribir sumanaturales(numero)
						3:
							Escribir primo(numero)
						4:
							Escribir invertirnumero(numero)
						0:
							Escribir sin saltar " "
						De Otro Modo:
						Escribir "Error, opcion no existe"
					Fin Segun
					Escribir " "
				Hasta Que num2=0
			0:
				Escribir sin saltar " "
			De Otro Modo:
				Escribir "Error, opcion no existe"
		Fin Segun
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

SubProceso numerodia(numero)
	Escribir "CONVIERTE NUMERO A DIA:"
	Escribir "Introduce el número del día:"
	Leer num1
	Segun num1 Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Miercoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "Sabado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "El número introducido no corresponde con un día"
	Fin Segun
FinSubProceso

SubProceso resultado <- sumanaturales(numero)
	Definir n,suma Como Entero
	Escribir "SUMA DE LOS PRIMEROS N NUMEROS"
	Escribir "Introduce número n:"
	Leer n
	Para i<-1 Hasta n Con Paso 1 Hacer
		suma<-suma+i
	Fin Para
	Escribir "La suma de los primeros n números es = ",suma
FinSubProceso

SubProceso resultado <- primo(numero)
	Definir n,suma Como numero
	Escribir "SUMA DE LOS PRIMEROS N NUMEROS"
	Escribir "Introduce número n:"
	Leer n
	Si n%2=0 Entonces
		Escribir "El número ",n ," es primo"
	SiNo
		Escribir "El número ",n " no es primo"
	Fin Si
FinSubProceso

SubProceso resultado <- invertirnumero(numero)
	Definir num  como numero
	Definir cen,res,dec,uni Como Entero
	Escribir "INVERTIR NUMERO 4 CIFRAS"
	Escribir "Introduce número de 4 cifras:"
	Leer num
	Mil= (num - (num MOD 1000))/1000
	res1= num mod 1000
	cen = (res1 - (res1 MOD 100))/100
	res = num MOD 100;
    dec = (res - (res MOD 10))/10
    uni = res MOD 10;
	Escribir "El número de 4 cifras al reves es: ",uni,dec,cen,Mil
FinSubProceso