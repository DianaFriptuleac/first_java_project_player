import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------Player---------------------------");
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementiPlayer = new ElementoMultimediale[5];

        // Creo i miei elementi
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci l'elemento del player: 1-Audio; 2-Video; 3-Immagine: ");
            int elementoP = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il titolo dell'elemento: ");
            String titolo = scanner.nextLine();

            switch (elementoP) {
                case 1:
                    System.out.println("Inserisci la durata audio: ");
                    int durataA = scanner.nextInt();
                    System.out.println("Inserisci il volume audio: ");
                    int volAudio = scanner.nextInt();
                    elementiPlayer[i] = new Audio(titolo, durataA, volAudio);
                    break;

                case 2:
                    System.out.println("Inserisci la durata del video: ");
                    int durataAV = scanner.nextInt();
                    System.out.println("Inserisci il volume del video: ");
                    int volVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità del video: ");
                    int lumVideo = scanner.nextInt();
                    elementiPlayer[i] = new Video(titolo, durataAV, volVideo, lumVideo);
                    break;

                case 3:
                    System.out.println("Inserisci la luminosità dell'immagine: ");
                    int lumImg = scanner.nextInt();
                    elementiPlayer[i] = new Immagine(titolo, lumImg);
                    break;

                default:
                    System.out.println("Errore! Il numero inserito non corrisponde a nessun elemento! ");
                    i--;
            }
        }

        // Esecuzione dei metodi
        int choice;
        do {
            System.out.println("Scegli un numero da 1 a 5 per eseguire un elemento, 6 per regolare il volume/luminosità, oppure 0 per uscire: ");
            choice = scanner.nextInt();
            if (choice > 0 && choice <= 5) {
                eseguiElemento(elementiPlayer[choice - 1]);
            } else if (choice == 6) {
                regolaElemento(scanner, elementiPlayer);
            } else if (choice != 0) {
                System.out.println("Numero inserito non valido!");
            }
        } while (choice != 0);

        System.out.println("Esecuzione finita!");
        scanner.close();
    }

    // Metodo per eseguire l'elemento
    private static void eseguiElemento(ElementoMultimediale elemento) {
        if (elemento instanceof Immagine) {
            ((Immagine) elemento).show();
        } else if (elemento instanceof Riproduci) {
            ((Riproduci) elemento).play();
        } else {
            System.out.println("Elemento inesistente!");
        }
    }

    // Metodo per regolare volume/luminosita
    private static void regolaElemento(Scanner scanner, ElementoMultimediale[] elementiPlayer) {
        System.out.println("Scegli l'elemento da regolare (1-5): ");
        int index = scanner.nextInt();
        if (index > 0 && index <= 5) {
            ElementoMultimediale elemento = elementiPlayer[index - 1];
            if (elemento instanceof ElementoRiproducibile) {
                regolaVolume(scanner, (ElementoRiproducibile) elemento);
            }
            if (elemento instanceof Video) {
                regolaLuminosita(scanner, (Video) elemento);
            } else if (elemento instanceof Immagine) {
                regolaLuminosita(scanner, (Immagine) elemento);
            }
        } else {
            System.out.println("Elemento non valido!");
        }
    }

    //Metodo volume
    private static void regolaVolume(Scanner scanner, ElementoRiproducibile elemento) {
        System.out.println("Per alzare il volume - 1 / Per abbassare il volume - 2: ");
        int sceltaVolume = scanner.nextInt();
        if (sceltaVolume == 1) {
            elemento.alzaVolume();
        } else if (sceltaVolume == 2) {
            elemento.abbassaVolume();
        }
    }
//Metodo luminosita per l'immagine
    private static void regolaLuminosita(Scanner scanner, Immagine immagine) {
        System.out.println("Per aumentare la luminosità dell'immagine - 1 / Per diminuire la luminosità dell'immagine - 2: ");
        int sceltaLum = scanner.nextInt();
        if (sceltaLum == 1) {
            immagine.aumentaLuminosita();
        } else if (sceltaLum == 2) {
            immagine.abbassaLuminosita();
        }
    }

    //Metodo per la luminosita del video
    private static void regolaLuminosita(Scanner scanner, Video video) {
        System.out.println("Per aumentare la luminosità del video - 1 / Per diminuire la luminosità del video - 2: ");
        int sceltaLum = scanner.nextInt();
        if (sceltaLum == 1) {
            video.aumentaLuminosita();
        } else if (sceltaLum == 2) {
            video.abbassaLuminosita();
        }
    }
}