/**
 * Classe qui permet de réaliser des opérations combinant d'autres expressions.
 * @see Expression
 * @see Nombre
 * @see Addition
 * @see Soustraction
 * @see Division
 */
public class Calculatrice {

    public static void main(String[] args) {
        try {
            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);
            Expression s = new Soustraction(dixSept, deux);  // Soustraction : 17 - 2
            Expression a = new Addition(deux, trois);        // Addition : 2 + 3
            Expression d = new Division(s, a);               // Division : (17 - 2) / (2 + 3)

            System.out.println(d + " = " + d.valeur()); // affiche le résultat de l'expression ((17 - 2) / (2 + 3)) = 3
        } catch (MismatchException e) {
            System.out.println("Erreur de type : " + e.getMessage());
        } catch (ExpressionNullException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erreur de calcul : " + e.getMessage());
        }
    }
}
