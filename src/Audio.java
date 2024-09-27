public class Audio extends ElementoRiproducibile implements Riproduci {
    public Audio(String titolo, int durata, int volume) {
        super(titolo,durata,volume);
    }

    @Override
    public void play(){
        for(int i = 0; i < getDurata(); i++){
            System.out.println(getTitolo() + ": " + "!".repeat(getVolume()));
        }
    }

}
