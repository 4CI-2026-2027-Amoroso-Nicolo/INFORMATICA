import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car auto1 = new Car("fegyr","fiat");
        boolean esci = false;

    while (!esci){
        System.out.println("Benvenuto al menu del Parcheggio ");
        System.out.println("premi 1 per entrare nel parcheggio ");
        System.out.println("premi 2 per uscire del parcheggio ");
        System.out.println("premi 3 per impostare il prezzo del parcheggio ");
        System.out.println("premi 4 per uscire dal menu");

        int scelta = sc.nextInt();

        switch(scelta){
            case 1: 
                if(parcheggio.entra()){
                System.out.println("L'auto è entrata nel parcheggio ");
                Car.postoMacchina();
                }else{
                    System.out.println("Il parcheggio è pieno");
                }
                break;

            case 2:
                System.out.println("L'auto è uscita dal parcheggio ");
                System.out.println("Devi pagare:" + parcheggio.esci());
                break;

            case 3:
                System.out.println("Quanto costa il parcheggio? ");
                double unCostoOrario = sc.nextDouble();
                parcheggio.setCosto(unCostoOrario);
                break;

            case 4:
                System.out.println("Arrivederci");
                break;

            default:
                System.out.println("Questa opzione non esiste.");
                    break;
            }

            
        }
    }
}