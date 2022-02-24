package models;

public class Squad {
    private Integer maxSize;
    private String name;
    private  String dedicatedCause;

    public Squad(Integer maxSize,String name, String dedicatedCause) {
        this.maxSize = maxSize;
        this.name = name;
        this.dedicatedCause = dedicatedCause;
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
}