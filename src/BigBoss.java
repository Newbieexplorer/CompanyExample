import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Виктор on 31.07.2016.
 */
public final class BigBoss {
    private String firstname;
    private String secondname;
    private int age;
    private static BigBoss instance = null;

    private BigBoss(String firstnamename,String secondname,int age){
        this.firstname=firstnamename;
        this.secondname=secondname;
        this.age=age;
    }

    public static synchronized BigBoss getInstance() {
        if (instance == null)
            instance = new BigBoss("s","a",2);
        return instance;
    }

    private HashMap<String,SeniorManager> seniorManager = new HashMap<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void fireManager(String name) {
        for (Map.Entry<String, SeniorManager> entry : seniorManager.entrySet()) {
            if(entry.getValue().getHashmap().containsKey(name)) {
                entry.getValue().fire(name);
                break;
            }
        }
    }
    public void fireSeniorManager(String name){
        seniorManager.remove(name);
    }

    public void ChangeBoss(String firstname, String secondname, int age){
        this.firstname=firstname;
        this.secondname=secondname;
        this.age=age;
    }

    public void setSeniorManager(HashMap<String, SeniorManager> seniorManager) {
        this.seniorManager = seniorManager;
    }

    @Override
    public String toString() {
        return "BigBoss{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", age=" + age +
                ", seniorManager=" + seniorManager +
                '}';
    }
}
