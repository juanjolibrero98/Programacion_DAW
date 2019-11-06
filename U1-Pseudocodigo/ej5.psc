Funcion  esta <- contiene (v,num) 
	definir esta Como Logico;
	definir i Como Entero;
	esta<-falso;
	
	Para i<-1 Hasta 5  Hacer
		si v[i]=num Entonces
			esta=Verdadero;
		FinSi
	Fin Para
	
FinFuncion

Funcion   cantidad <- ocurrencias (v, num)
	definir i,cantidad Como Entero;
	cantidad<-0;
	
	Para i<-1 Hasta 5  Hacer
		si v[i] = num Entonces
			cantidad<-cantidad+1;
		FinSi
	Fin Para
	
FinFuncion



Algoritmo  ejercicio5_ej5
	definir datos Como Entero;
	Dimension  datos[6];
	datos[1]=44;
	datos[2]=66;
	datos[3]=7;
	datos[4]=100;
	datos[5]=100;
	Escribir  contiene(datos,5);
	Escribir contiene(datos,7);
	Escribir ocurrencias(datos,100);
	Escribir ocurrencias(datos,150);
FinAlgoritmo

