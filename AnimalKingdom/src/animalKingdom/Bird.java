package animalKingdom;

class Bird extends Animal {

    public Bird(String name, int year){
        super(name, year);
    }

    public String move(){
        return "Flying";
    }
    
    public String reproduce(){
        return "Eggs";
    }
    
    public String breathe(){
        return "Lungs";
    }
}