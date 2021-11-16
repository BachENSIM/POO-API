import java.util.List;

public class App {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        //Secteur scChien = new Secteur(TypeAnimal.CHIEN);
        //Secteur scChat = new Secteur(TypeAnimal.CHAT);
        zoo.ajouterSecteurs(TypeAnimal.CHIEN);
        zoo.ajouterSecteurs(TypeAnimal.CHAT);

        //List<Animal> aniChien = (List<Animal>) new Animal("AniChien");
        //List<Animal> aniChat = (List<Animal>) new Animal("aniChat");

        Chien chien1 = new Chien("Toto");
        Chien chien2 = new Chien("Titi");
        Chien chien3 = new Chien("Lulu");
        Chien chien4 = new Chien("Bobo");
        Chat chat1 = new Chat("Meomeo");
        Chat chat2 = new Chat("Chien");
        Chat chat3 = new Chat("Chat");
        Rat rat1 = new Rat("Hamster");

        try {
            zoo.nouvelAnimal(chien2);
            zoo.nouvelAnimal(chien1);
            zoo.nouvelAnimal(chien3);
            zoo.nouvelAnimal(chien4);
            zoo.nouvelAnimal(chat1);
            zoo.nouvelAnimal(chat2);
            zoo.nouvelAnimal(chat3);
            zoo.nouvelAnimal(rat1);
            System.out.println(zoo.nombreAnimal());
        } catch (AnimalDansMauvaisSecteurException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 16; i++) {
            try {
                zoo.nouveauVisiteurs();
                //System.out.println(zoo.getLimiteVisiteurs());
            } catch (LimiteVisiteurException e) {
                e.printStackTrace();
            }
            /**try {
                System.out.println(zoo.getLimiteVisiteurs());
            } catch (LimiteVisiteurException e) {
                e.printStackTrace();
            }**/
        }







    }
}
