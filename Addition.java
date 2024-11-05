/**
 * Classe Addition
 */

public class Addition extends Operation {

    /**Ce constructeur permet de récupérer la valeur des 2 opérandes
     * <p> elle permet grâce à l'héritage et l'utilisation du super
      */

    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Méthode valeur
     * <p>Cette fonction permet de récupérer la valeur de la somme de l'adition
     * @return getOperande1.valeur + getOperande2.valeur
     */
    @Override
    public double valeur() {
        return getOperande1().valeur() + getOperande2().valeur();
    }
    /**
     * Methode toString
     * <p> Permet de récuperer la toSting, la chaine renvoyé pour montrer l'addition faite
     * @return getOperande1 "+" getOperande2
     */
    @Override
    public String toString() {
        return "(" + getOperande1() + " + " + getOperande2() + ")";
    }
}
