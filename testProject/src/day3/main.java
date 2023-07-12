package day3;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        HashMap<String, SuperHero> superheroes = new HashMap<String, SuperHero>();
        superheroes.put("superman", new SuperHero("SuperMan", "super-Strength", "Fligth"));
        superheroes.put("spiderman", new SuperHero("SpiderMan", "Wall Crawling", "Spider-web"));
        superheroes.put("wonderwoman", new SuperHero("WonderMan", "Super human Strength", "lasso of truth"));


        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Superhero's name or quit to exit");
            String s = scn.nextLine();
            if (s.equalsIgnoreCase("quit")) {
                break;
            }
            String heroName = s.toLowerCase();
            SuperHero superHero = superheroes.get(heroName);

            if (superHero != null) {
                System.out.println(superHero);
            } else {
                System.out.println("SuperHero not found");
            }
        }

        Villain joker = new Villain();
        joker.speak();

        Dog snoopy = new Dog();
        snoopy.makeSound();

        Cat garfield = new Cat();
        garfield.makeSound();
    }
}
