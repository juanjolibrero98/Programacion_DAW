Proceso ejercicio1_ej1
	definir horas,contador,i como entero;
	contador=0;
	
	Escribir "Introduzca el número de horas trabajadas durante la semana:";
	leer horas;
	Si horas<=40 Entonces
		Escribir "El sueldo semanal que le corresponde es de: ",horas*10," euros";
	SiNo
		Para i<-1 Hasta horas Con Paso 1 Hacer
			Si i<=40 Entonces
				contador= contador +10;
			SiNo
				contador= contador + 15;
			Fin Si
		Fin Para
		Escribir "El sueldo semanal que le corresponde es de: ",contador," euros";
	Fin Si
	
	
FinProceso
