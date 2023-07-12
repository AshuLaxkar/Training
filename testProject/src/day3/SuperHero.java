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

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", superPower='" + superPower + '\'' +
                '}';
    }

}
