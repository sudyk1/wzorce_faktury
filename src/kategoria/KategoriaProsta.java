package kategoria;

public class KategoriaProsta extends Kategoria {
    private String name;

    public KategoriaProsta(String name) {
        this.name = name;
    }

    @Override
    public void wypiszNazwe() {
        System.out.println(this.name);
    }
}
