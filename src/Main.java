import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------Player---------------------------");
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementiPlayer = new ElementoMultimediale[5];

        //Creo i miei elementi
        for(int i = 0; i < 5; i++){
            System.out.println("Inserisci l'elemento del player: 1-Audio; 2-Video; 3-Immagine: ");
            int nrPlayer = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il titolo del elemento: ");
            String titolo = scanner.nextLine();
        }
    }
}