
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia
    Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
System.out.println(olli);
olli.opiskele();
System.out.println(olli);
    }
    public static void tulostaHenkilot(ArrayList<Henkilo> henkilot){
        for (int i = 0 ; i< henkilot.size() ; i++) {
            System.out.println(henkilot.get(i));
        }
        
    }

}
