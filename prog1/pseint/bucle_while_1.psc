Algoritmo sin_titulo
	//Leer un n�mero detr�s de otro mientras que el n�mero 
	//le�do sea distinto de cero. Al final del
	//proceso mostrar cuantos n�meros v�lidos he le�do, 
	//y cuanto suman las cantidades de los n�meros
	//introducidos, y cual es la media de los n�meros le�dos.
	
	//Definimos las variables
	Definir numeroLeido, cuantosLeidos, sumatorio Como Entero;
	
	//Inicializar a un valor por defecto
	numeroLeido = 0; cuantosLeidos = 0; sumatorio = 0;
	
	//Leer el primer numeroLeido
	Escribir "Dame un numero, teclee 0 para salir";
	Leer numeroLeido;
	
	Mientras numeroLeido <> 0 Hacer
		cuantosLeidos = cuantosLeidos + 1;
		sumatorio = sumatorio + numeroLeido;
		Leer numeroLeido;
	FinMientras
	
	
	//termine, escribo estad�sticas
	Escribir "numeros procesados : " cuantosLeidos;
	Escribir "sumatorio  numeros leidos: " sumatorio;
	Escribir "la media es : " sumatorio / cuantosLeidos;
FinAlgoritmo
