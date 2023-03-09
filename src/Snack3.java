//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
public class Snack3 {
    public static void main(String[] args){
        int[] myArray = {17, 22, 9, 45, 6, 32, 1, 5, 2, 10, 18};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            if (i % 2 != 0){
                sum += myArray[i];
            }
        }
        System.out.println(sum);
    }
}
