package kategoria;

public class KategoriaProsta extends Kategoria {
    private String name;

    //DODAC ARRAY LISTE TOWAROW


    public KategoriaProsta(String name) {
        this.name = name;
    }

    //DODAJ TOWAR

//  TEZ TOWAR
    @Override
    public void wypiszNazwe() {
        System.out.println(this.name);
//        for (Towar towar : kolekcjaTowarowa) {
//
//        }
    }
}
