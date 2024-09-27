public class Immagine extends ElementoMultimediale{
private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita(){
        luminosita++;
    }
    public void abbassaLuminosita(){
        if(luminosita > 0){
            luminosita++;
        }else{
            System.out.println("La luminosità è già al minimo.");
        }
    }
    public void show(){
        System.out.println(getTitolo()+ " "+ "*".repeat(luminosita));
    }

}
