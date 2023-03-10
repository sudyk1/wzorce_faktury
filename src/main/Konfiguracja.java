package main;

import druk.DrukujFakture;
import druk.DrukujFaktureDefault;
import druk.DrukujFaktureOther;
import rabaty.*;

public class Konfiguracja {
    private static Konfiguracja instance;

    private Konfiguracja() {}

    public static Konfiguracja getInstance() {
        if (instance == null) instance = new Konfiguracja();
        return instance;
    }

    public double getKwotaRabatu() {return 1;}

    public double getProcentRabatu() {return 25;}

    public IObliczCenePoRabacie getBiezacyRabat() {

//        return new ObliczCenePoRabacieKwotowym();
//        return new ObliczCenePoRabacieProcentowym();
//        return new AdapterRabatuLosowegoObiektowy();
        return new AdapterRabatuLosowegoKlasowy();
    }
    public DrukujFakture getSposobDruku() {
        return new DrukujFaktureOther();
//        return new DrukujFaktureDefault();
    }
}
