import java.util.ArrayList;

public class Hero {
    private int id;
    private String name;
    private Integer age;
    private String specialPower;
    private String weakness;
    private static ArrayList<Hero> instance = new ArrayList<>();

    public Hero(int id,String name, Integer age, String specialPower,String weakness ) {
        this.id = id+1;
        this.name = name;
        this.age = age;
        this.specialPower = specialPower;
        this.weakness = weakness;

        instance.add(this);
    }
    public static Integer size(){
        return instance.size();
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

    public int getId() {
        return id;
    }

    public String getWeakness() {
        return weakness;
    }

    public static void clearAllHeroes(){
        instance.clear();
    }
}














