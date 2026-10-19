public class Conto{
    private String nome;
    private double saldo;

    public Conto(){
        this.nome = "";
        this.saldo = 0.0; 
    }

    public Conto(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conto(Conto c){
        this.nome = c.nome;
        this.saldo = c.saldo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean effettuaPagamento(Pagamento paga){
        if(paga.getImporto() <= this.saldo){
            this.saldo -= paga.getImporto();
            return true;
        }else{
            throw new SaldoInsufficienteException ("Il saldo non è sufficiente");
        }
    }
}
