package main;

import java.util.Calendar;

import druk.DrukujFakture;
import kategoria.Kategoria;
import kategoria.KategoriaProsta;
import kategoria.KategoriaZlozona;
import magazyn.Towar;

import dokumenty.Faktura;

import druk.Druk;

//ZEWNETRZNY RABAT
import rabatlosowy.LosowyRabat;

public class Ui {

	public static void main(String[] args) {
		Calendar teraz=Calendar.getInstance();
		
		//Tworzymy towary
		Towar t1=new Towar(10,"buty");
		Towar t2=new Towar(2,"skarpety");
		
		//I przykladowa fakture
		Faktura f=new Faktura(teraz.getTime(),"Fido");
		f.dodajPozycje(t1,3);
		f.dodajPozycje(t2, 5);

		f.wypiszFakture();


		//TEST ZEWN. rabatu
		LosowyRabat lr=new LosowyRabat();
		System.out.println(lr.losujRabat());

		KategoriaZlozona kz1 = new KategoriaZlozona("Ksiazki");
		KategoriaProsta k1 = new KategoriaProsta("bestseller");
		Towar t3 = new Towar(10.0, "bestseller1");
		Towar t4 = new Towar(12.0, "bestseller2");
		KategoriaProsta k2 = new KategoriaProsta("dla dzieci");
		Towar t5 = new Towar(15.0, "dladzieci1");

		KategoriaZlozona kz2 = new KategoriaZlozona("Kolory");
		KategoriaProsta kol1 = new KategoriaProsta("zielony");
		Towar t6 = new Towar(14 ,"zielony lisc");
		KategoriaProsta kol2 = new KategoriaProsta("czerwony");
		Towar t7 = new Towar(24 ,"czerwony lisc");

		kz1.dodajKategorie(k1);
		kz1.dodajKategorie(k2);
		kz1.dodajKategorie(kz2);

		k1.dodajTowar(t3);
		k1.dodajTowar(t4);

		k2.dodajTowar(t5);
		kz2.dodajKategorie(kol1);
		kz2.dodajKategorie(kol2);

		kol1.dodajTowar(t6);
		kol2.dodajTowar(t7);

		kz1.wypiszNazwe();

	}
}
