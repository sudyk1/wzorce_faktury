package kategoria;

import java.util.ArrayList;

public class KategoriaZlozona extends Kategoria {
    private ArrayList<Kategoria> kategorie = new ArrayList<>();
    public String name;

    public KategoriaZlozona(String name) {
        this.name = name;
    }

    public void dodajKategorie(Kategoria kategoria) {
        this.kategorie.add(kategoria);
    }

    public void wypiszNazwe() {
        System.out.println(this.name + " =================");
        for (Kategoria kategoria : kategorie) {
            kategoria.wypiszNazwe();
        }
    }
}
