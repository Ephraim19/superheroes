package models;

public class Squad {
    private Integer maxSize;
    private String name;
    private  String dedicatedCause;
    private Hero heroSquad;

    public Squad(Integer maxSize,String name, String dedicatedCause,Hero hero) {
        this.maxSize = maxSize;
        this.name = name;
        this.dedicatedCause = dedicatedCause;
        heroSquad = hero;
    }


    public Integer getMaxSize() {
        return maxSize;
    }

    public String getName() {
        return name;
    }

    public String getDedicatedCause() {
        return dedicatedCause;
    }

    public Hero getData(){
        return heroSquad;
    }
}
