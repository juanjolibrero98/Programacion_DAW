Proceso ejercicio4_ej4
	definir i, elem, multiplo como entero;
	
	dimension elem[20];
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		elem[i] <- azar(401);
	Fin Para
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		Escribir Sin Saltar " ",elem[i]," ";
	Fin Para
	
	Escribir "¿ Que números quieres resaltar ?";
	Escribir "1. los múltiplos de 5";
	Escribir "2. los múltiplos de 7";
	leer multiplo;
	Para i<-0 Hasta 19 Con Paso 1 Hacer
	
		Si multiplo=1 Entonces
			Si elem[i]%2==0 Entonces
				Escribir Sin Saltar " ","[",elem[i],"]"," ";
			SiNo
				Escribir Sin Saltar " ",elem[i]," "; 
			Fin Si
		SiNo
			Si multiplo=2 Entonces
				Si elem[i]%2==0 Entonces
					Escribir Sin Saltar " ","[",elem[i],"]"," ";
				SiNo
					Escribir Sin Saltar " ",elem[i]," "; 
				Fin Si
			SiNo
				escribir "ERROR, NUMERO ERRONEO";
			Fin Si
		Fin Si
	FinPara
	
FinProceso
