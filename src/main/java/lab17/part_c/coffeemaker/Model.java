package lab17.part_c.coffeemaker;

public class Model {
    private String name;
    private String number;

    public Model(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}
