
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (MARTINEZ Quentin)
 */
public class Pile
{
    String elements[];
    int indiceSommet;

    Pile(){
        this.elements = new String[100];
        this.indiceSommet  = -1;
    }
    
    Pile(int pfTaille){
       this.elements = new String[pfTaille];
       this.indiceSommet = -1;
    }
    
    
}

