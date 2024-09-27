//classe principale

abstract class ElementoMultimediale {
    private String titolo;  //titolo condiviso tra tutti i elementi

    public ElementoMultimediale(String titolo){
        this.titolo= titolo;
    }
    //Metodo per ottenere il titolo perche e privato
    public String getTitolo(){
        return titolo;
    }

}
