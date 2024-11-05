/**
 * Représente la multiplication de deux expressions.
 * Hérite de {@link Operation}.
 * @see Operation
 * @since 1.0
 */
public class Multiplication extends Operation {

    /**
     * Constructeur de Multiplication.
     * @param operande1 Premier opérande.
     * @param operande2 Second opérande.
     */
    public Multiplication(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule le produit des deux opérandes.
     * @return Produit des valeurs des opérandes.
     */
    public int valeur() {
        return getOperande1().valeur() * getOperande2().valeur();
    }

    /**
     * Représentation textuelle de la multiplication.
     * @return Chaîne représentant la multiplication.
     */
    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
}
