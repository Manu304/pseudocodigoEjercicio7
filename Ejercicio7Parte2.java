//202030799 Manuel Rojas
//Crear un algoritmo que genere al azar 15 n�meros de la ruleta (del 0 al 36)
//y muestre el % de n�meros pares, % de impares y % de ceros generados.
public class Ejercicio7Parte2 {
    public static void main(String[] args) {
        float parC = 0, imparC = 0, ceroC = 0;
        final int CANTIDAD = 15;
        float pPar, pImpar, pCero;
        for (int i=0; i<CANTIDAD; i++){
            int random = (int) Math.floor(Math.random()*(36)+1);
            System.out.println("genere: " + random);
            if (random == 0){
                ceroC += 1.0;
            }else if((random%2) == 0){
                parC += 1.0;
            }else{
                imparC += 1.0;
            }
        }
        System.out.println("Contador par: " + parC + ". Contador impar: " + imparC + ". Contador ceros: " + ceroC);
        
        pPar = (float) ((parC/CANTIDAD) * 100);
        pImpar = (float) ((imparC/CANTIDAD) * 100);
        pCero = (float) (ceroC * (100 / CANTIDAD));
        System.out.println("De los 15 numeros generados: " + pPar + "% son pares, " + pImpar + "% son impares y " + pCero + "% son ceros.");
    } 
}