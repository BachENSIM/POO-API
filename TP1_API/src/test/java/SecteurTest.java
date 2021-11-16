import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecteurTest extends TestCase {

    @Test
    public void testSecteurComparator() {

        Secteur sec1 = new Secteur(TypeAnimal.CHAT);
        Secteur sec2 = new Secteur(TypeAnimal.CHIEN);

        Chien chien1 = new Chien("Toto");
        Chien chien2 = new Chien("Titi");
        Chien chien3 = new Chien("Titii");
        Chien chien4 = new Chien("Titti");
        Chat chat1 = new Chat("Meomeo");

        sec2.ajouterAnimal(chien1);
        sec2.ajouterAnimal(chien2);
        sec2.ajouterAnimal(chien3);
        sec2.ajouterAnimal(chien4);
        sec1.ajouterAnimal(chat1);
        System.out.println(sec1.getNombreAnimaux() + " -- " + sec2.getNombreAnimaux());


        assertEquals(sec2.compareTo(sec1),-1);//Comparable
        assertEquals(Secteur.secteurComparator().compare(sec1,sec2),-1);//comparator
    }
}