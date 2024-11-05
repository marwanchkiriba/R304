/**
 * Classe abstraite représentant une opération binaire (deux opérandes) dans une expression arithmétique.
 * Cette classe hérite de {@link Expression}.
 * @see Expression
 */
public abstract class Operation extends Expression {
    private final Expression operande1;
    private final Expression operande2;

    /**
     * Constructeur de Operation.
     * @param operande1 Premier opérande de l'opération.
     * @param operande2 Second opérande de l'opération.
     * @throws MismatchException si un opérande n'est pas du type attendu.
     * @throws ExpressionNullException si un opérande est null.
     */
    public Operation(Expression operande1, Expression operande2) {
        if (operande1 == null || operande2 == null) {
            throw new ExpressionNullException("Les opérandes ne doivent pas être null.");
        }

        // Vérification du type de chaque opérande
        if (!(operande1 instanceof Expression) || !(operande2 instanceof Expression)) {
            throw new MismatchException("Les opérandes doivent être de type Expression.");
        }

        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    /**
     * Retourne le premier opérande.
     * @return Premier opérande de l'opération.
     */
    public Expression getOperande1() {
        return operande1;
    }

    /**
     * Retourne le second opérande.
     * @return Second opérande de l'opération.
     */
    public Expression getOperande2() {
        return operande2;
    }

    /**
     * Méthode abstraite pour calculer la valeur de l'opération.
     * @return Valeur entière de l'opération.
     */
    public abstract int valeur();
}
