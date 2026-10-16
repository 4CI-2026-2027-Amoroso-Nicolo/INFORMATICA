import java.util.ArrayList;

public class Parcheggio{
    private int nPostiDisponibili;
    private double costoOrario;
    private ArrayList<Car> listaParcheggio;

    public Parcheggio(){
        this.nPostiDisponibili=0;
        this.costoOrario=0.0;
        this.listaParcheggio = new ArrayList<>();
    }
    public Parcheggio(int nPostiDisponibili, double costoOrario){
        if(nPostiDisponibili >= 0){
            this.nPostiDisponibili = nPostiDisponibili;
        }else{
            this.nPostiDisponibili = 0;
        }
        if(costoOrario >= 0.0){
            this.costoOrario = costoOrario;
        }else{
            this.costoOrario = 0.0;
        }

    }

    public Parcheggio(Parcheggio p){
        this.nPostiDisponibili = p.nPostiDisponibili;
        this.costoOrario = p.costoOrario;
        this.listaParcheggio = new ArrayList<>(p.listaParcheggio);
    }

    public boolean entra(Car unaAutomobile, double ore){
        if(nPostiDisponibili > 0 && !listaParcheggio.contains(unaAutomobile)){
            Car.postoMacchina();
            listaParcheggio.add(unaAutomobile);
            return true;
        }else{
            return false;
        }
    }

    public double esci(Car unaAutomobile, double ore){
       if(listaParcheggio.contains(unaAutomobile)){
            double costoDaPagare = costoOrario * ore;
            nPostiDisponibili += 1;
            listaParcheggio.remove(unaAutomobile);
            return costoDaPagare;
       }
        return 0.0;
    }

    public void setCosto(double unCostoOrario){
        this.costoOrario = unCostoOrario;
    }
}