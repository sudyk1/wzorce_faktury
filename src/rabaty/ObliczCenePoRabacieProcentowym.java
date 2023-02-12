package rabaty;
import main.Konfiguracja;

public class ObliczCenePoRabacieProcentowym implements
        IObliczCenePoRabacie {
    @Override
    public double obliczCenePoRabacie(double cena) {
        Konfiguracja k = Konfiguracja.getInstance();
        double procent = k.getProcentRabatu();
        return cena -= cena * procent/100;
    }
}
