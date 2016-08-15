import java.util.HashMap;
import java.util.Map;

/**
 * Created by Виктор on 31.07.2016.
 */
public class SeniorManager {
    private String Firstname;
    private String Secondname;
    private int age;
    private Map<String, Manager> hashmap = new HashMap<String, Manager>();

    public SeniorManager(String firstname, String secondname,int age){
        this.Firstname=firstname;
        this.Secondname=secondname;
        this.age=age;

    }

    public void addmanager(Manager manager){
        hashmap.put(manager.getname(),manager);
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String secondname) {
        Secondname = secondname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Manager> getHashmap() {
        return hashmap;
    }

    public void setHashmap(Map<String, Manager> hashmap) {
        this.hashmap = hashmap;
    }
    public void fire(String s){
        hashmap.remove(s);
    }

    @Override
    public String toString() {
        return "SeniorManager{" +
                "Firstname='" + Firstname + '\'' +
                ", Secondname='" + Secondname + '\'' +
                ", age=" + age +
                ", hashmap=" + hashmap +
                '}';
    }
}
