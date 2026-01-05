abstract class Vehicule {

    int type; 

    public abstract void seDeplacer();
}

class Train extends Vehicule {
    @Override
    public void seDeplacer() {
        System.out.println("\t [ Class : Train   ]\n\t : Le train se déplace sur des rails. ");
    }
}

class Voiture extends Vehicule {
    @Override
    public void seDeplacer() {
        System.out.println("\t [ Class : Voiture ]\n\t : La voiture se déplace sur la route. ");
    }
}

class Bateau extends Vehicule {
    @Override
    public void seDeplacer() {
        System.out.println("\t [ Class : Bateau  ]\n\t : Le bateau se déplace sur l'eau. \n");
    }
}

public class EX0_diapo_55 {
    public static void main(String[] args) {
        // Polymorphisme : 
        Vehicule[] mesVehicules = new Vehicule[3];
        mesVehicules[0] = new Train();
        mesVehicules[1] = new Voiture();
        mesVehicules[2] = new Bateau();

        System.out.println("\n\t [ --- Démonstration du Polymorphisme --- ] \n");
        for (Vehicule v : mesVehicules) {
            
            v.seDeplacer(); 
        }
    }
}

