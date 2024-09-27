import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------Player---------------------------");
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementiPlayer = new ElementoMultimediale[5];

        //Creo i miei elementi
        for(int i = 0; i < 5; i++){
            System.out.println("Inserisci l'elemento del player: 1-Audio; 2-Video; 3-Immagine: ");
            int elementoP = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il titolo del elemento: ");
            String titolo = scanner.nextLine();

            switch(elementoP) {
                case 1:
                    System.out.println("Inserisci la durata audio: ");
                    int durataA = scanner.nextInt();
                    System.out.println("Inserisci il volume audio: ");
                    int volAudio = scanner.nextInt();
                    elementiPlayer[i] = new Audio(titolo,durataA,volAudio);
                    break;

                case 2:
                    System.out.println("Inserisci la durata del video: ");
                    int durataAV = scanner.nextInt();
                    System.out.println("Inserisci il volume del video: ");
                    int volVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità del video: ");
                    int lumVideo = scanner.nextInt();
                    elementiPlayer[i] = new Video(titolo,durataAV,volVideo,lumVideo);
                    break;

                case 3:
                    System.out.println("Inserisci la luminosità dell'immagine: ");
                    int lumImg = scanner.nextInt();
                    elementiPlayer[i] = new Immagine(titolo,lumImg);
                    break;

                default:
                    System.out.println("Errore! Il numero inserito non corrisponde a nessun elemento! ");

            }
        }
    }
}