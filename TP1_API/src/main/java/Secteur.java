import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Secteur implements Comparable<Secteur>{
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

    public static Comparator<Secteur> secteurComparator() { //comparer avec la methode comparator (appel la classe en gereral apres indiquer quelle classe compare avec quelle classe)
        return (Secteur s1,Secteur s2) -> Integer.compare(s1.getNombreAnimaux(),s2.getNombreAnimaux());
    }

    @Override
    public int compareTo(Secteur o) {//comparere directement avec compareTo
        return Integer.compare(o.getNombreAnimaux(),this.getNombreAnimaux());
    }
}
