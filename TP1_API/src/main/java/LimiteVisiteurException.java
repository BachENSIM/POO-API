public class LimiteVisiteurException extends Exception{
    public LimiteVisiteurException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "La limite de visiteur est atteinte";
    }
}
