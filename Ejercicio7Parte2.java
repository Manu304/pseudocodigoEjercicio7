//202030799 Manuel Rojas
//Crear un algoritmo que genere al azar 15 n�meros de la ruleta (del 0 al 36)
//y muestre el % de n�meros pares, % de impares y % de ceros generados.
public class Ejercicio7Parte2 {
    public static void main(String[] args) {
        int parC = 0, imparC = 0; ceroC = 0;
        final int CANTIDAD = 15;
        for (int i=0; i<CANTIDAD; i++){
            int random = (int) Math.floor(Math.random()*(36)+1);
            if (random == 0){
                ceroC++;
            }else if((random%2) == 0){
                parC++;
            }else{
                imparC++;
            }
        }
        double pPar = (parC/CANTIDAD)*100;
        double pImpar = (imparC/CANTIDAD)*100;
        double pCero = (ceroC/CANTIDAD)*100;
    }
    
}
