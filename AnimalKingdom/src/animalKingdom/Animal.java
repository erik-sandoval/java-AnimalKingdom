package animalKingdom;

public abstract class Animal {

    private int maxId = 0;
    private int id;
    private String name;
    private int year;

    public Animal(String name, int year) {
        id = id + 1;
        this.name = name;
        this.year = year;
    }

    public abstract void move();
    public abstract void breathe();
    public abstract void reproduce();

    public void eat() {
        System.out.println(name + " NOM NOM NOM");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId(){
        return id;
    }
}