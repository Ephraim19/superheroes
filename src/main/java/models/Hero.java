package models;

import java.util.ArrayList;

public class Hero {
    private String name;
    private Integer age;
    private String specialPower;
    private String weakness;
    private static ArrayList<Hero> instance = new ArrayList<>();

    public Hero(String name, Integer age, String specialPower,String weakness) {
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;
        instance.add(this);
    }
    public static ArrayList<Hero> getAll(){
        return instance;
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

    public static void clearAllHeroes(){
        instance.clear();
    }
}




















