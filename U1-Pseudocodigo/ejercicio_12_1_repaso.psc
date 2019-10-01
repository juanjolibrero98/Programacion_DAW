Proceso ejercicio12_1
	Definir nombre,  reves Como texto;
	Definir i Como Entero;
	Escribir "Dime tu nombre";
	leer nombre;
	
	
	Para i<-longitud(nombre) Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar Subcadena(nombre,i,i);
	Fin Para
FinProceso
