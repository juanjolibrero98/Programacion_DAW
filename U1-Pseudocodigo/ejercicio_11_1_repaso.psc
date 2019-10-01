Proceso ejercicio11_1
	definir adivina, intentos, num_escojido, i Como Entero;
	adivina <- azar(101);
	intentos=1;
	Escribir "El número aleatorio se há creado correctamente, es: ",adivina;
	
	escribir "Ahora tienes 7 intentos para adivinarlo";
	
	Repetir
		Escribir "Dime un numero, intento numero: ",intentos;
		leer num_escojido;
		Si num_escojido=adivina Entonces
			escribir "Correcto";
			intentos=intentos+1;
		SiNo
			Si num_escojido> adivina Entonces
				Escribir "Te has pasado";
				intentos=intentos+1;
			SiNo
				Escribir "Te has quedado corto";
				intentos=intentos+1;
			Fin Si
		Fin Si
		
	Hasta Que intentos=8 o num_escojido=adivina;
	Si intentos=8 Entonces
		Escribir "JA JA, HAS PERDIDO";
	Fin Si
	
FinProceso