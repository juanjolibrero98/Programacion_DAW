Proceso ejercicio11_2
	definir num Como Entero;
	Escribir "Vamos a calcular las raices cuadradas de los numeros que usted introduzca";
	
	Repetir
		Escribir "Dime un numero";
		leer num;
		Si num>0 Entonces
			escribir RAIZ(num);
		SiNo
			Si num=0 Entonces
				Escribir "Numero 0";
			SiNo
				Escribir "ERROR, NUMERO NEGATIVO";
			Fin Si
		Fin Si
	Hasta Que num=0;
	Escribir "FIN";
FinProceso
