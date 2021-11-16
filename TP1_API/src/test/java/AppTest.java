import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AppTest {

    @Test
    public void testMettreSecteur() {
        Zoo zoo = new Zoo();

        zoo.ajouterSecteurs(TypeAnimal.CHIEN);
        zoo.ajouterSecteurs(TypeAnimal.CHAT);

        Exception exc = null;

        Chien chien1 = new Chien("Toto");
        Chien chien2 = new Chien("Titi");
        Chat chat1 = new Chat("Meomeo");
        Rat rat1 = new Rat("Hamster");

        try {
            zoo.nouvelAnimal(chien2);
            zoo.nouvelAnimal(chien1);
            zoo.nouvelAnimal(chat1);
            zoo.nouvelAnimal(rat1);
        } catch (AnimalDansMauvaisSecteurException e) {
            exc = e;
        }
        assertNotNull(exc);
        //assertNull(exc);
        assertEquals(AnimalDansMauvaisSecteurException.class, exc.getClass());
        //assertEquals(exc.getClass(),AnimalDansMauvaisSecteurException.class);
    }

    @Test
    public void testNombreMaxKO() {
        Zoo zoo = new Zoo();
        zoo.ajouterSecteurs(TypeAnimal.CHAT);
        Exception exc = null;
        try {
            for (int i = 0; i <= 16 ; i++) {
                zoo.nouveauVisiteurs();
            }
        } catch (LimiteVisiteurException e) {
            exc = e;
        }
        assertNotNull(exc);
        assertEquals(LimiteVisiteurException.class, exc.getClass());
    }
}