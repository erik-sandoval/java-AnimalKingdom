package animalKingdom;

class Bird extends Animal {

    public Bird(String name, int year){
        super(name, year);
    }

    public void move(){
        System.out.println(getName() + " fly.");
    }
    
    public void reproduce(){
        System.out.println(getName() + " lay eggs.");
    }
    
    public void breathe(){
        System.out.println(getName() + " breathe through their lungs.");
    }
}