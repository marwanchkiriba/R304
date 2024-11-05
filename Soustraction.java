/**
 * Représente la soustraction de deux expressions.
 * Hérite de {@link Operation}.
 * @see Operation
 * @since 1.0
 */
public class Soustraction extends Operation {

    /**
     * Constructeur de Soustraction.
     * @param operande1 Premier opérande de la soustraction.
     * @param operande2 Second opérande de la soustraction.
     */
    public Soustraction(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule la différence entre les deux opérandes.
     * @return Différence des valeurs des opérandes.
     */
    public int valeur() {
        return getOperande1().valeur() - getOperande2().valeur();
    }

    /**
     * Représentation textuelle de la soustraction.
     * @return Chaîne représentant la soustraction.
     */
    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}
