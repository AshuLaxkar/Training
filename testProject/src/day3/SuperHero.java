package day3;

public class SuperHero {

    private String name;
    private String power;
    private String superPower;
    public SuperHero(String name, String power, String superPower) {
        this.name = name;
        this.power = power;
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public String getSuperPower() {
        return superPower;
    }
}
