
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;

    public Zoo() {
        this.visiteurs = 0;
        secteursAnimaux = new ArrayList<Secteur>();
    }

    public void ajouterSecteurs(TypeAnimal type) {
        Secteur sc = new Secteur(type);
        secteursAnimaux.add(sc);
    }

    public void nouveauVisiteurs() throws LimiteVisiteurException{
        //this.visiteurs++;

        if (visiteurs + 1 == getLimiteVisiteurs()){
            throw new LimiteVisiteurException("Error");
        }
        visiteurs++;
    }

    public int getLimiteVisiteurs() {
       /** if (this.visiteurs > 15 ) throw new LimiteVisiteurException("Maximal de 15 personnes dans un secteurs ....");
        else
            return this.visiteurs;**/
       return 15;
    }
    public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException{
        boolean check = false;
        int index = -1;
        for (int i=0;i< secteursAnimaux.size();i++ ) {
            if(animal.getTypeAnimal().equals(secteursAnimaux.get(i).obtenirType()) ) {
                check = true;
                index = i;
            }
        }
        if (check) {
            secteursAnimaux.get(index).ajouterAnimal(animal);
            System.out.println("Ajoute " + animal.getNomAnimal() + " dans le secteur " + secteursAnimaux.get(index).obtenirType());
        }
        else {
            throw new AnimalDansMauvaisSecteurException("Ne pas trouver un bon secteur pour mettre l'animal " + animal.getNomAnimal());
        }
    }



    public int nombreAnimal() {
        int sum = 0 ;
        for (Secteur nombre : secteursAnimaux ) {
            sum+= nombre.getNombreAnimaux();
        }
        return sum;
    }
}

