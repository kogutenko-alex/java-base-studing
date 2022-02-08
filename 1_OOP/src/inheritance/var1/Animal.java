package inheritance.var1;

public class Animal {

    private final String name;
    private final String voice;

    public Animal(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public void speak() {
        System.out.println(this.name + " says " + this.voice);
    }
}
