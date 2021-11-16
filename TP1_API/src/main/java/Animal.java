public class Animal {
    private String nomAnimal;
    protected TypeAnimal typeAnimal;

    public Animal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal.toString();
    }


}
