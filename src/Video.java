public class Video extends ElementoRiproducibile implements Riproduci{
  private int luminosita;

  public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    //Metodo luminosita
    public void aumentaLuminosita(){
        luminosita++;
        System.out.println("Luminosità aumentata a " + luminosita);
    }
    public void abbassaLuminosita(){
        if(luminosita > 0){
            luminosita--;
            System.out.println("Luminosità diminuita a " + luminosita);
        }else{
            System.out.println("La luminosità è già al minimo.");
        }
    }

    @Override
    public void play(){
        for(int i = 0; i < getDurata(); i++){
            System.out.println(getTitolo() + ": " + "!".repeat(getVolume()) + "*".repeat(luminosita));
        }
    }

    public int getLuminosita() {
      return luminosita;
    }
}

