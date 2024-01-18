public class Articolo {
    private final String nome;

    private final double prezzo;

    public double getPrezzo(){
        return prezzo;
    }

    public Articolo(String nome, double prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
