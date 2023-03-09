package kategoria;

import magazyn.Towar;

import java.util.ArrayList;

public class KategoriaProsta extends Kategoria {
    private String name;

    private ArrayList<Towar> kolekcjaTowarowa = new ArrayList<>();


    public KategoriaProsta(String name) {
        this.name = name;
    }

    //DODAJ TOWAR
    public void dodajTowar(Towar towar) {
        this.kolekcjaTowarowa.add(towar);
    }

//  TEZ TOWAR
    @Override
    public void wypiszNazwe() {
        System.out.println("\t" + this.name);
        if(!kolekcjaTowarowa.isEmpty()) {
            for (Towar towar : kolekcjaTowarowa) {
                System.out.println("\t\t" + towar);
            }
        }
    }
}
