import java.util.ArrayList;
import java.util.List;


public class Secteur {
    private List<Animal> animauxDansSecteur;
    private TypeAnimal typeAnimalDansSecteur;

    public Secteur(TypeAnimal animal) {
        animauxDansSecteur = new ArrayList<>();
        this.typeAnimalDansSecteur = animal;
    }

    public void ajouterAnimal(Animal animal) {
        animauxDansSecteur.add(animal);
    }

    public int getNombreAnimaux() {
        return animauxDansSecteur.size();
    }

    public String obtenirType() {
        return typeAnimalDansSecteur.toString();
    }
}
