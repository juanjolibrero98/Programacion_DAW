Proceso ejercicio2_ej2
	definir i, posicion,convertirnum, digito Como entero;
	Definir num Como Caracter;
	convertirnum=0;
	Escribir "Por favor, introduzca un número entero positivo: ";
	leer num;
	
	Escribir "Introduzca la posición dentro del número: ";
	leer posicion;
	
	Escribir "Introduzca el nuevo dígito: ";
	leer digito;
	
	
	Para i<-1 Hasta Longitud(num) Con Paso 1 Hacer
		Si i=posicion Entonces
			Escribir Sin Saltar Subcadena(num,i,i);		
		Fin Si
		convertirnum= convertirANumero(num);
	Fin Para
	Escribir "El número resultante es: ",convertirnum;
FinProceso
