package rabaty;

import rabatlosowy.LosowyRabat;

public class AdapterRabatuLosowegoObiektowy implements IObliczCenePoRabacie {

    private LosowyRabat lr;

    public AdapterRabatuLosowegoObiektowy() { lr = new LosowyRabat();}

    public double obliczCenePoRabacie(double cena) {
        double procentRabatuLosowy = lr.losujRabat()/10;

        return cena = cena - cena * procentRabatuLosowy;
    }
}

