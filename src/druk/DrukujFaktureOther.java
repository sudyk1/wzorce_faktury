package druk;

import dokumenty.Faktura;
import dokumenty.Pozycja;

import java.util.Iterator;

public class DrukujFaktureOther extends DrukujFakture {
    @Override
    public void drukujNaglowek(Faktura faktura) {
        System.out.println("################################################################################");
        System.out.println("Faktura wystawiona dla firmy: " + faktura.getKontrahent()
                + ", dnia: " + faktura.getDataSprzedazy() );
    }

    @Override
    public void drukujPozycje(Faktura faktura) {
        System.out.println("################################################################################");
        System.out.println("Towary zakupione przez " + faktura.getKontrahent() + ":");
        Iterator<Pozycja> i = faktura.getIteratorPozycji();
        while (i.hasNext()) {
            Pozycja pozycja = i.next();
            System.out.println("## " + pozycja.getNazwa() + " w ilości: " + pozycja.getIlosc()
                    + ", wartość jednostkowa: "
                    + pozycja.getCena() + "zł, łączna wartość: " + pozycja.getWartosc() + "zł");
        }
    }

    @Override
    public void drukujStopke(Faktura faktura) {
        System.out.println("################################################################################");
        System.out.println("Łączna wartość faktury [ " + faktura.getSuma() + "zł ]");
        System.out.println("Faktura wystawiona dla firmy: " + faktura.getKontrahent()
                + ", dnia: " + faktura.getDataSprzedazy() );
        System.out.println("################################################################################\n");
    }
}
