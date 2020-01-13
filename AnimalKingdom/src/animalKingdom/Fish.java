package animalKingdom;

public class Fish extends Animal {

    public Fish(String name, int year) {
        super(name, year);
    }

    public void breathe(){
        System.out.println(getName() + " breathe through their gills.");
    }
    
    public void move(){
        System.out.println(getName() + " move by swimming.");
    }
    
    public void reproduce(){
        System.out.println(getName() + " reproduce by laying eggs.");
    }
}