import java.util.ArrayList;

public class Squad {
    private Integer maxSize;
    private String name;
    private  String dedicatedCause;
    private static Hero heroSquad;
    private static ArrayList<Squad> instance = new ArrayList<>();

    public Squad(Integer maxSize,String name, String dedicatedCause) {
        this.maxSize = maxSize;
        this.name = name;
        this.dedicatedCause = dedicatedCause;
        instance.add(this);
    }


    //ensuring heroes don't exceed maximum number
    public static boolean max(){
        if(instance.get(0).maxSize <= Hero.size()){
            return false;
        }
        return true;
    };
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
    public static ArrayList<Squad> getAllData(){
        return instance;
    }

    public static void clearAllSquads(){
        instance.clear();
    }
}
