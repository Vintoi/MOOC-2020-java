
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Varasto {
    private Map<String, Integer> hinnat;
    private Map<String, Integer> saldo;
    
    public Varasto(){
        this.hinnat = new HashMap<>();
        this.saldo = new HashMap<>();
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo){
        this.hinnat.put(tuote, hinta);
        this.saldo.put(tuote, saldo);
    }
    
    public int hinta(String tuote){
        if (this.hinnat.containsKey(tuote)){
            return this.hinnat.get(tuote);
        } else {
            return -99;
        }
    }
    public int saldo(String tuote){
        if (this.saldo.containsKey(tuote)){
            return this.saldo.get(tuote);
        } else {
            return -0;
        }
    }
    public boolean ota(String tuote) {
        if(this.saldo.containsKey(tuote)){
        if (this.saldo.get(tuote) > 0){
            int temp = this.saldo.get(tuote);
            int uusisaldo = temp-1;
            this.saldo.replace(tuote, temp, uusisaldo);
            return true;
        } else {
            return false;
        }
        } else {
            return false;
        }
    }
    public Set<String> tuotteet() {
        return this.hinnat.keySet();
    }
}
