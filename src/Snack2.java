//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
//e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
public class Snack2 {
    public static void main (String[] args){
        String[] names = {"Mario ", "Antonio ", "Riccardo ", "Fausto "};
        String[] surnames = {"Rossi", "Bianchi", "Verdi", "Neri"};

        System.out.println("Lista falsa partecipanti:");

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i] + surnames[i]);
        }
    }
}
