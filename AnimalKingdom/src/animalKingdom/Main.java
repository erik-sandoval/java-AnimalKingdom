package animalKingdom;
import java.util.ArrayList;

class Main {
    public static ArrayList<Animal> filteredList = new ArrayList<Animal>();

    public static void filterAnimals(ArrayList<Animal> animals, CheckAnimal tester){
        filteredList.clear();

        for (Animal a : animals){
            if (tester.test(a)) {
                filteredList.add(a);
            }
        }
    }
    public static void main(String[] args ) {
        
        ArrayList<Animal> animals = new ArrayList<Animal>();

        // adding mammals
        animals.add(new Mammal("Panda", 1869));
        animals.add(new Mammal("Zebra", 1778));
        animals.add(new Mammal("Koala", 1816));
        animals.add(new Mammal("Sloth", 1804));
        animals.add(new Mammal("Armadillo", 1758));
        animals.add(new Mammal("Raccoon", 1758));
        animals.add(new Mammal("Bigfoot", 2021));

        // adding Birds
        animals.add(new Bird("Pigeon", 1837));
        animals.add(new Bird("Peacock", 1821));
        animals.add(new Bird("Toucan", 1758));
        animals.add(new Bird("Parrot", 1824));
        animals.add(new Bird("Swan", 1785));

        // adding Fishes
        animals.add(new Fish("Salmon", 1758));
        animals.add(new Fish("Catfish", 1817));
        animals.add(new Fish("Perch", 1758));

        // Sorted by Year Descending
        System.out.println("Sorted by Year Descending.");
        animals.sort((animal1, animal2) -> Integer.compare(animal1.getYear(), animal2.getYear()));
        animals.forEach((animal) -> System.out.println(animal.getName() + " " + animal.getYear() ));

        // Sorted by Name Descrending
        System.out.println("/n Sorted by Name Descending.");
        animals.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        animals.forEach((animal) -> System.out.println(animal.getName()));
        
        // Sorted by how they move
        System.out.println("Sorted how they move.");
        animals.sort((animal1, animal2) -> animal1.move().compareToIgnoreCase(animal2.move()));
        animals.forEach((animal) -> System.out.println(animal.getName()));
        
        // Sorted by those who breathe with lungs.
        System.out.println("Sorted by those who breathe with lungs.");
        filterAnimals(animals, (a) -> a.breathe() == "Lungs");
        filteredList.forEach((animal) -> System.out.println(animal.getName() + " breathes through " + animal.breathe()));
    }
}