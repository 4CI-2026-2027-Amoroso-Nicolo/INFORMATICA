public class Car{
    private String targa;
    private double serbatoio;
    private double resa;

    public Car(String targa,double serbatoio, double resa){
        this.targa = targa;
        this.serbatoio = 0.0;
        this.resa = resa;
    }

    public void setTarga(String targa){
        if(targa != 0.0){
            this.targa = targa;
        }
    }

    public double getTarga(){
        return targa;
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

    public double getResa(){
        return this.resa;
    }

    

    public void drive(double km){
        double carburanteNecessario = km * this.resa;
        if(carburanteNecessario <= this.serbatoio){
            this.serbatoio -= carburanteNecessario;
        }else{
            this.carburante = 0;
        }
        
    }  

    public void addGas(double benzinaAggiunta){
        this.serbatoio += benzinaAggiunta;
    }

    public String toString(){
        String out="";
        out+= "\n La targa della macchina è: " + auto1.getTarga() +"\n La reda della macchina è di: " + auto1.getResa() + "\n La macchina ha " + auto1.getGas() + " di serbatoio" ;
    }

}