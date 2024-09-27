public class Immagine extends ElementoMultimediale{
private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    //Metodi luminoosita
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
    public void show(){
        System.out.println(getTitolo()+ " "+ "*".repeat(luminosita));
    }

}
