public class Audio extends ElementoMultimediale {
private int durata;
private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void alzaVolume(){

        volume++;
    }
    public void abbassaVolume(){
        if(volume > 0){
            volume--;
        }else{
            System.out.println("Il volume è a zero, non può essere abbassato!");
        }
    }
    @Override
    public void play(){
        for(int i = 0; i < durata; i++){
            System.out.println(titolo + ": " + "!".repeat(volume));
        }
    }
}
