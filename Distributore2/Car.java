public class Car{
    private String targa;
    private double serbatoio;
    private double resa;

    public Car(String targa,double serbatoio, double resa){
        this.targa = targa;
        this.serbatoio = 0.0;
        this.resa = resa;
    }

    public void drive(double serbatoio, double resa, double km){
        double carburanteNecessario = km*resa;
        serbatoio -= carburanteNecessario;
        
    }

    public void addGas(double serbatoio, double benzinaAggiunta){
        serbatoio += benzinaAggiunta;
    }

    public void setTarga(String targa){
        if(targa != 0.0){
            this.targa = targa;
        }
    }

    public void setSerbatoio(double serbatoio){
        if(serbatoio != 0.0){
            this.serbatoio = serbatoio;
        }
    }

    public double getSerbatoio(double serbatoio){
        return serbatoio;
    }

    public void setResa(double resa){
        if(resa != 0.0){
            this.resa = resa;
        }
    }

    public double getTarga(){
        return targa;
    }

    

}