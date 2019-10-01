//solicitar al usuario los datos de una matriz bidimensional de 4x3.
//debemos calcular la suma de los elementos de cada fila, y guardarla en una matriz unidimensional llamada resultado
Proceso ejercicio_matrices_repaso
	Definir j,i, calcu,suma Como Entero;
	
	Dimension calcu[4,3]
	Escribir "Dime los números de la matriz";
	Para J<-0 Hasta 3 Hacer
		Para I<-0 Hasta 2 Hacer
			Escribir 'Ingrese el número que usté desee ',I+1,', en la fila ',J+1,':'
			Leer calcu[J,I]
		FinPara
	FinPara
	
	suma=0;
	Escribir 'Cantidades por articulos:'
	Para I<-0 Hasta 3 Hacer
		Suma<-calcu[i,0]+calcu[i,1]+calcu[i,2]+calcu[i,3]
		Escribir 'Total de numeros de la fila ',I+1,': ',Suma
	FinPara
	
	
FinProceso
