Proceso ejercicio12_3
	definir anterior, frase Como Caracter;
	Definir i, contador Como Entero;
	Escribir "DIME UNA FRASE";
	leer frase;
	anterior= " ";
	contador=0;
	Para i<-0 Hasta longitud(frase) Con Paso 1 Hacer
		Si Subcadena(frase, i, i) <> " " y anterior = " " Entonces
			contador= contador+1;
		Fin Si
		anterior=Subcadena(frase,i,i);
	Fin Para
	Escribir "En la frase hay ",contador," palabras";
	
FinProceso
