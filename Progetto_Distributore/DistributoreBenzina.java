public class DistributoreBenzina{
    private double deposito;
    private double euroPerLitro;
    private double importo;

    public DistributoreBenzina(double unPrezzoPerLitro, double deposito, double importo){
        this.unPrezzoPerLitro = unPrezzoPerLitro;
        this.deposito = 0;
        this.importo = importo;
    }

    public void rifornisci(double unaQuantita){
        if(unaQuantita > 0){
        deposito += unaQuantita;
        }
    }

    public void vendi(double euro,Car unaAutomobile){
        litriDiBenzina = euro/euroPerLitro;
        unaAutomobile.addGas(litriDiBenzina);  
    }

    public void aggiorna(double unPrezzoPerLitro){
        this.euroPerLitro = unPrezzoPerLitro;
    }
}