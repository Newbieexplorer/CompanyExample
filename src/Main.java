import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ������ on 31.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        BigBoss a = BigBoss.getInstance();
        HashMap<String,SeniorManager> hm = new HashMap<>();
        HashMap<String,Manager> hm1 = new HashMap<>();
        for (int i = 0; i <10 ; i++) {
            SeniorManager senior = new SeniorManager("SeniorFN"+i,"SeniorSN"+i,i);
            hm.put("SeniorFN"+i,senior);
            a.setSeniorManager(hm);
            for (int j = 0; j <10 ; j++) {
                Manager manager = new Manager("ManagerFN"+i+j,"ManagerSN"+i+j,j);
                hm1.put("ManagerFN"+i+j,manager);
                senior.setHashmap(hm1);
            }
            hm1 = new HashMap<>();
        }
       // System.out.println(a.toString());
        a.fireManager("ManagerFN31");
        a.fireManager("ManagerFN31");

    }
}




