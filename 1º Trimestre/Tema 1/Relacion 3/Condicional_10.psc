Algoritmo sin_titulo
	Definir palabra1,palabra2 Como Caracter;

	Escribir "Juego de piedra, papel y tijeras";
	Escribir "Jugador 1 Empieza";
	Escribir "Introduce piedra, papel o tijeras";
	Leer palabra1;
	Escribir "Jugador 2 sigue";
	Escribir "Introduce piedra, papel o tijeras";
	Leer palabra2;
	Si palabra1="papel" y palabra2="piedra";
		Escribir"Gana el jugador 1",palabra1;
		Sino
		Si palabra1="piedra" y palabra2= "tijeras";
		Escribir "Gana jugador 1 ",palabra1;
		Sino
			Si palabra1="tijeras" y palabra2="papel";
					Escribir "Gana jugador 1 ",palabra1;
					Sino
					Si palabra1="papel" y palabra2="tijeras";
						Escribir "Gana jugador 2 ",palabra2;
						Sino
						Si palabra1="tijeras" y palabra2="piedra";
							Escribir "Gana jugador 2 ",palabra2;
							Sino
							Si palabra1="piedra" y palabra2="papel";
								Escribir "Gana jugador 2 sacando ",palabra2;
								Sino
								Si palabra1==palabra2;
									Escribir "Empate";
									Sino
									Escribir "Hay que introducir piedra, papel o tijeras";
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
