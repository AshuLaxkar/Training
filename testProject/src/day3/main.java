package day3;

public class main {
    public static void main(String[] args) {

        SuperHero ironMan =  new SuperHero("IronMan", "Strength" ,"IronSuit");
        System.out.println(  "Name: " + ironMan.getName() +"," +  " Power: "+ ironMan.getPower()+ "," + " SuperPower: " + ironMan.getSuperPower());

        Villain joker = new Villain();
        joker.speak();

        Dog snoopy = new Dog();
        snoopy.makeSound();
        Cat garfield = new Cat();
        garfield.makeSound();
    }
}
