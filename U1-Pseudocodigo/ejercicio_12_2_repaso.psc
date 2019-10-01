Proceso ejercicio12_2
	definir nombre, nombre_mod Como Caracter;
	Definir i Como Entero;
	Escribir "Dime tu nombre alterando entre mayusculas y minusculas";
	leer nombre;
	nombre_mod="";
	Para i<-1 Hasta Longitud(nombre)  Con Paso 1 Hacer
		Si i%2==0 Entonces
			nombre_mod <- nombre_mod + Mayusculas(nombre) + Subcadena(nombre,i,i);
		SiNo
			nombre_mod <- nombre_mod + Subcadena(nombre,i,i);
		Fin Si
	Fin Para
	Escribir nombre_mod;
FinProceso
