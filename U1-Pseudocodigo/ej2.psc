Proceso ejercicio2_ej2
	definir i, posicion Como entero;
	Definir num, digito Como texto;

	Escribir "Por favor, introduzca un n�mero entero positivo: ";
	leer num;
	
	Escribir "Introduzca la posici�n dentro del n�mero: ";
	leer posicion;
	
	Escribir "Introduzca el nuevo d�gito: ";
	leer digito;
	
	
	Para i<-1 Hasta Longitud(num) Con Paso 1 Hacer
		Si i=posicion Entonces
			Escribir Sin Saltar digito;
		SiNo
			Escribir Sin Saltar Subcadena(num,i,i);	
		Fin Si
	Fin Para
	Escribir " ";
	Escribir "El n�mero resultante es: ",num;
FinProceso
