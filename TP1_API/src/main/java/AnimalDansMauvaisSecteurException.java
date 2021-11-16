public class AnimalDansMauvaisSecteurException extends Exception{
    public AnimalDansMauvaisSecteurException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "L'animal est dans le mauvais secteur";
    }
}
