public class ElementoRiproducibile extends ElementoMultimediale{
    private int durata;
    private int volume;

    public ElementoRiproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    //Metodo per ottenere la durata  perche e privato
    public int getDurata(){
        return durata;
    }

    //Metodo per ottenere il volume  perche e privato
    public int getVolume(){
        return volume;
    }

    //Metodo volume
        public void alzaVolume() {
            if (volume < 10) {
                volume++;
                System.out.println("Il volume è stato aumentato a " + volume);
            } else {
                System.out.println("Il volume è già al massimo.");
            }
        }
        public void abbassaVolume(){
            if(volume > 0){
                volume--;
                System.out.println("Il volume è stato abbassato a "+ volume);
            }else{
                System.out.println("Il volume è già al minimo.");
            }
        }

}


