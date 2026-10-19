public class Conto{
    private String beneficiario;
    private double importo;

    public Pagamento() {
        this.beneficiario="";
        this.importo=0.0;
    }

    public Pagamento(String beneficiario, double importo) {
        this.beneficiario = beneficiario;
        this.importo = importo;
    }

    public void setBeneficiario(String beneficiario){
        this.beneficiario = beneficiario;
    }

    public String getBeneficiario(){
        return beneficiario;
    }

    public void setImporto(double importo){
        this.importo = importo;
    }

    public double getImporto(){
        return importo;
    }
}
