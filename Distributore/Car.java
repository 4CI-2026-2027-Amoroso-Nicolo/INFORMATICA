public class Car{
    private String targa;
    private String modello;

    public Car(String targa,String modello){
        this.targa = targa;
        this.modello = modello;
    }

    public Car(){
        this.targa="";
        this.modello="";
    }

     public void setTarga(String targa){
        if(targa != null){
            this.targa = targa;
        }
    }

     public void setModello(String modello){
        if(modello != null){
            this.modello = modello;
        }
    }

    public String getTarga(){
        return targa;
    }

    public String getModello(){
        return modello;
    }

    public postoMacchina(){
        nPostiDisponibili -= 1;
    }

}