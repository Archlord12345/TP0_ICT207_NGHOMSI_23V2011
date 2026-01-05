class Division {
    
    public void diviserInstance(double a, double b) {
        if (b != 0) {
            System.out.println("\n\t [ Résultat (Instance) : " + (a / b) +" ] \n");
        } else {
            System.out.println("\n\t [ Erreur : Division par zéro... ]");
        }
    }

    public static void diviserStatique(double a, double b) {
        if (b != 0) {
            System.out.println("\n\t [ Résultat (Statique) : " + (a / b) +" ] \n");
        } else {
            System.out.println("\n\t [ Erreur : Division par zéro... ]");
        }
    }
}

public class EX0_diapo_34 {
    public static void main(String[] args) {
        double num = 10.0;
        double den = 2.0;

        System.out.println("\n\t // Test de la méthode d'instance... ");
        System.out.println("\t // Obligé de créer un 'objet' qui ne sert à rien d'autre qu'à appeler la méthode");
        Division d = new Division();
        d.diviserInstance(num, den);

        System.out.println("\t // Test de la méthode de classe... ");
        System.out.println("\t // On appelle directement via le nom de la classe. Plus propre et plus économe en mémoire.");
        Division.diviserStatique(num, den);
    }
}
