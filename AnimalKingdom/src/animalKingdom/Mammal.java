package animalKingdom;

public class Mammal extends Animal {

    public Mammal(String name, int year) {
        super(name, year);
	}

	public String move() {
        return "Walking";
    }

    public String breathe() {
        return "Lungs";
    }
    
    public String reproduce() {
        return "Live Births";
    }
}