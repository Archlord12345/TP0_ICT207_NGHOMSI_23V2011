class Voiture {
    String nom; 
    int puissance;
    boolean estDemarree;
    double vitesse;

    public Voiture(String nom, int puissance, boolean estDemarree, double vitesse) {
        this.nom = nom;
        this.puissance = puissance;
        this.estDemarree = estDemarree;
        this.vitesse = vitesse;
    }

    public void afficher() {
        System.out.println("\n\t [ --- Infos Voiture --- ]");
        System.out.println("\t Nom       : " + nom);
        System.out.println("\t Puissance : " + puissance + " ch");
        System.out.println("\t Vitesse   : " + vitesse + " km/h");
    }
    
    public void demarre() { this.estDemarree = true; }
     
    public int deQuellePuissance(){ return 0; }
    public double accelere( float p1 ){ return 0; }
}

class VoitureElectrique extends Voiture {
    private String typeChargeur;

    public VoitureElectrique(String nom, int puissance, boolean estDemarree, double vitesse, String typeChargeur) {
        
        super(nom, puissance, estDemarree, vitesse);
        this.typeChargeur = typeChargeur;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("\t Type      : Electrique");
        System.out.println("\t Chargeur  : " + this.typeChargeur);
    }
}

class VoitureCarburant extends Voiture {
    private String typeCarburant;

    public VoitureCarburant(String nom, int puissance, boolean estDemarree, double vitesse, String typeCarburant) {
        super(nom, puissance, estDemarree, vitesse);
        this.typeCarburant = typeCarburant;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("\t Type      : Carburant");
        System.out.println("\t Carburant : " + this.typeCarburant);
    }
}

public class EX0_diapo_56 {
    public static void main(String[] args) {
        
        VoitureElectrique maVoitureElectrique = new VoitureElectrique("Tesla Model 3", 280, false, 0, "SuperCharger V3");
        
        VoitureCarburant maVoitureCarburant = new VoitureCarburant("Ford Mustang", 450, true, 50, "Essence Sans-Plomb");

        System.out.println("\n\t\t [ APPEL 1: ]");
        maVoitureElectrique.afficher();
        
        System.out.println("\n\t\t [ APPEL 2: ]");
        maVoitureCarburant.afficher();
        System.out.println("\n");
    }
}
