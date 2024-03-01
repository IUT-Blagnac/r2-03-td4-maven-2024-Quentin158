
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (MARTINEZ Quentin)
 */
public class ProgrammePile
{
    /**
     * Créer une pile vide
     *
     * @param p IN : pile à traiter
     * @return p
     *
     */
    public static Pile creerPile(){
        Pile p  = new Pile();
        return p;
    }

    /**
     * Savoir si la pile est vide ou non
     *
     * @param pfPile IN/OUT : un tableau non plein
     *
     */
    public static boolean estVide(Pile pfPile){
        boolean vide = false;    
        if(pfPile.indiceSommet == -1){
            vide = true;
        }
        return vide;
    }

    /**
     * Empile un élément dans la pile
     *
     * @param pfPile IN/OUT : un tableau non plein
     * @param pfElement IN : element à inserer
     *
     */
    public static void empiler(Pile pfPile, String pfElement) throws Exception{
        if(pfPile.elements.length == pfPile.indiceSommet){
            throw new Exception("La pile est pleine") ;
        }
        pfPile.elements[pfPile.indiceSommet + 1] = pfElement;
        pfPile.indiceSommet = pfPile.indiceSommet+1;
    }

    /**
     * Dépile un élément dans la pile
     *
     * @param pfPile IN/OUT : un tableau non plein
     *
     */
    public static void depiler(Pile pfPile)throws Exception{
        if(pfPile.indiceSommet == -1){
            throw new Exception("Aucun élément dans la pile") ;
        }
        pfPile.indiceSommet = pfPile.indiceSommet-1;
    }

    /**
     * Dépiler un élément de la pile
     *
     * @param pfPile IN/OUT : un tableau non plein
     *
     * @return le sommet de la pile
     */
    public static String sommet(Pile pfPile)throws Exception{
        if(estVide(pfPile)==true){
          throw new Exception("Contrainte non respecté");
        }
        return pfPile.elements[pfPile.indiceSommet];
    }

    /**
     * Vérifie si la pile est pleine ou non
     * 
     * @param pfPile IN/OUT : un tableau non plein
     * 
     */
    public static boolean PilePleine(Pile pfPile){
        boolean plein = false;    
        if(pfPile.elements.length == pfPile.indiceSommet){
            plein = true;
        }
        return plein;
    }

    /**
     * Retourne l'état courant de la pile
     * 
     * @param pfPile IN/OUT : un tableau non plein
     * 
     */
    public static String toString(Pile pfPile){
        String resultat = "|vide" ;
        for (int indice = 0; indice <= pfPile.indiceSommet ; indice = indice + 1){
            resultat = "|" + pfPile.elements[indice] + resultat ;
        }
        return(resultat);
    }
    
    public static int nbElements(Pile pfPile) {
        return(pfPile.indiceSommet + 1);
    } 

     public static void main(String[] args) {
        Pile pile = new Pile() ;
        try {
            empiler(pile,"1") ;
            empiler(pile,"2") ;
            empiler(pile,"3");
            empiler(pile,"4");

        }catch (Exception e) { System.out.println("Erreur : "+e.getMessage()); }; 
        System.out.println(toString(pile));
        System.out.println(nbElements(pile));

    } // fin main
}

