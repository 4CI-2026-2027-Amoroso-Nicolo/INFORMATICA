import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car auto1 = new Car("fegyr",0.06);
        DistributoreBenzina distributore = new DistributoreBenzina(1.65);
        boolean esci = false;

        while (!esci){
            System.out.println("Benvenuto al menu del distributore ");
            System.out.println("premi 1 per rifornire la pompa del distributore ");
            System.out.println("premi 2 per fare benzina alla macchina ");
            System.out.println("premi 3 per viaggiare con la macchina ");
            System.out.println("premi 4 per controllare il serbatoio della macchina ");
            System.out.println("premi 5 per aggiornare il prezzo della benzina ");
            System.out.println("premi 6 per uscire dal menu");
        
            int scelta = sc.nextInt();

            switch(scelta){
                case 1: 
                    System.out.println("Quanti litri aggiungi al distributore? ");
                    double unaQuantita = sc.nextDouble();
                    distributore.rifornisci(unaQuantita);
                    break;

                case 2:
                    System.out.println("Quanti euro di benzina vuoi fare? ");
                    double euro = sc.nextDouble();
                    distributore.vendi(euro, auto1);
                    break;

                case 3:
                    System.out.println("Quanti km vuoi percorrere? ");
                    double km = sc.nextDouble();
                    auto1.drive(km);
                    break;

                case 4:
                    System.out.println("Attualmente la macchina ha: "+auto1.getGas());
                    break;

                case 5:
                    System.out.println("Inserisci il costo della benzina per litro: ");
                    double unPrezzoPerLitro = sc.nextDouble();
                    distributore.aggiorna(unPrezzoPerLitro);
                    break;
            
                case 6:
                    esci= true;
                    System.out.println("Arrivederci torni a trovarci.");
                    break;

                default:
                    System.out.println("Questa opzione non esiste.");
                    break;
            }
        }
        sc.close();
    }
}