package models;

public class Hero {
    private String name;
    private Integer age;
    private String specialPower;
    private String weakness;

    public Hero(String name, Integer age, String specialPower,String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public String getWeakness() {
        return weakness;
    }
}




















