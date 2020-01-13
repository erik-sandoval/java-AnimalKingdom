package animalKingdom;

public class Mammal extends Animal {

    public Mammal(String name, int year) {
        super(name, year);
	}

	public void move() {
        System.out.println(getName() + " walks.");
    }

    public void breathe() {
        System.out.println(getName() + " breathe through their lungs.");
    }
    
    public void reproduce() {
        System.out.println(getName() + " have live births.");
    }
}