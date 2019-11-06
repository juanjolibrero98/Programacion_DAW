Proceso ejercicio2_ej2
	definir i, posicion Como entero;
	Definir num, digito Como texto;

	Escribir "Por favor, introduzca un número entero positivo: ";
	leer num;
	
	Escribir "Introduzca la posición dentro del número: ";
	leer posicion;
	
	Escribir "Introduzca el nuevo dígito: ";
	leer digito;
	
	
	Para i<-1 Hasta Longitud(num) Con Paso 1 Hacer
		Si i=posicion Entonces
			Escribir Sin Saltar digito;
		SiNo
			Escribir Sin Saltar Subcadena(num,i,i);	
		Fin Si
	Fin Para
	Escribir " ";
	Escribir "El número resultante es: ",num;
FinProceso
