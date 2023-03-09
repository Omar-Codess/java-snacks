//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
//e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
import java.util.*;
public class Snack2 {
    public static void main (String[] args){
        String[] names = {"Mario ", "Antonio ", "Martina ", "Riccardo ", "Fausto ", "Angelo ", "Domenico "};
        String[] surnames = {"Rossi", "Bianchi","Chioschi ", "Verdi", "Neri", "Violi", "Azzurri"};

        System.out.println("Lista falsa partecipanti:");
        Random ran = new Random();
        int i = 0;
        int p = 0;

        while(i < names.length || p < surnames.length){
            i = ran.nextInt(names.length);
            p = ran.nextInt(surnames.length);
            System.out.println(names[i] + surnames[p]);
            i++;
            p++;
            }
        }
    }


