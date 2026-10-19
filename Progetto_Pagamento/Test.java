import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conto conto1 = new Conto("Luca", 368);
        Pagamento pagamento1 = new Pagamento("Eren", 20);  
        boolean esci = false;

        while (!esci){

            System.out.println("premi 1 per effettuare il pagamento");
            System.out.println("Premi 2 per uscire dal programma ");

            int scelta = sc.nextInt();

            switch(scelta){
                case 1: 
                    try{
                        conto1.effettuaPagamento(pagamento1);
                        System.out.println("Il tuo saldo è di: " + conto1.getSaldo());
                    } catch (SaldoInsufficienteException e){
                        System.out.println("Errore catturato: " + e.getMessage());
                    }
                    break;

                case 2:
                    esci= true;
                    System.out.println("Arrivederci torni a trovarci.");
                    break;

                default : 
                    System.out.println("Questa opzione non esiste.");
                    break;
            }       

        }
    }
}