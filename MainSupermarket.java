public class MainSupermarket {
    public static void main(String[] args) {
        Articolo articolo1 = new Articolo("Pizza Margherita", 4.99);
        //articolo1.nome = "Pizza Margherita";
        //articolo1.prezzo = 4.99;

        Articolo articolo2 = new Articolo("Coca-cola", 1.99);
        //articolo2.nome = "Coca-cola";
        //articolo2.prezzo = 1.99;

        Carrello carrello = new Carrello();
        carrello.articoli = new Articolo[]{articolo1, articolo2};
        carrello.prezzoFinale = articolo1.getPrezzo() + articolo2.getPrezzo();
        System.out.println("Carrello: " + carrello);
    }
}
