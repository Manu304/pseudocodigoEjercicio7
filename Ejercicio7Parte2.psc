//202030799 Manuel Rojas
//Crear un algoritmo que genere al azar 15 números de la ruleta (del 0 al 36)
//y muestre el % de números pares, % de impares y % de ceros generados.
Proceso Ejercicio7Parte2
	parC <- 0
	imparC <- 0
	ceroC <- 0
	
	Para i<-1 Hasta 15 Con Paso 1 Hacer
		random = Aleatorio(0, 36)
		Si random == 0 Entonces
			ceroC <- ceroC +1
		SiNo
			Si (random%2 == 0) Entonces
				parC <- parC + 1
			SiNo
				imparC <- imparC + 1
			FinSi
		FinSi
	FinPara
	
	pPar <- (parC/15)*100
	pImpar <- (imparC/15)*100
	pCero <- (ceroC/15)*100
	Escribir "De los 15 numeros generados: ", pPar, "% son pares, ", pImpar, "% son impares y ", pCero, "% son ceros."
FinProceso
