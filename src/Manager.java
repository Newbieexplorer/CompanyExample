/**
 * Created by Виктор on 31.07.2016.
 */
public class Manager {
    private String firstName;
    private String secondName;
    private int age;

    public Manager(String firstName,String secondName, int age){
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
    }


    public String getname() {
        return firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
