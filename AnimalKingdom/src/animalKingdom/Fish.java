package animalKingdom;

public class Fish extends Animal {

    public Fish(String name, int year) {
        super(name, year);
    }

    public String breathe(){
        return "Gills";
    }
    
    public String move(){
        return "Swimming";
    }
    
    public String reproduce(){
        return "Eggs";
    }
}