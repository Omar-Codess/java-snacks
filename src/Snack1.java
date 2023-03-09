//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

import java.util.Scanner;

public class Snack1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero:");
        int userNum = Integer.parseInt(scan.nextLine());

        if (userNum % 2 == 0){
            System.out.print(userNum);
        } else {
            userNum += 1;
            System.out.print(userNum);
        }
        scan.close();
    }
}
