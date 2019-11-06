Proceso ejercicio3_ej3
	definir altura,i,j como entero;
	Escribir "Introduzca la altura del reloj de arena: "
	leer altura;
	Si altura%2!=0 Entonces
		Si altura>=3 Entonces
			
			Para i<-altura Hasta 1 Con Paso -2 Hacer 
				Para j<-1 Hasta (altura-i)/2 Con Paso 1 Hacer
					Escribir Sin Saltar" ";
				Fin Para
				Para j<-i Hasta 1 Hacer
					Escribir Sin Saltar"*";
				Fin Para
				Escribir " ";
			Fin Para
			
			Para i<-3 Hasta altura Con Paso 2 Hacer 
				Para j<-1 Hasta (altura-i)/2 Con Paso 1 Hacer
					Escribir Sin Saltar" ";
				Fin Para
				Para j<-i Hasta 1 Hacer
					Escribir Sin Saltar"*";
				Fin Para
				Escribir " ";
			Fin Para
			
		SiNo
			Escribir "ERROR, NÚMERO MENOR QUE 3";
		Fin Si
	SiNo
		Escribir "ERROR, NÚMERO PAR";
	Fin Si
FinProceso
