package main;

import java.util.Calendar;

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
		
		Druk.wypiszFakture(f);
		
		//TEST ZEWN. rabatu
		LosowyRabat lr=new LosowyRabat();
		System.out.println(lr.losujRabat());

		KategoriaZlozona kz1 = new KategoriaZlozona();
		KategoriaProsta k1 = new KategoriaProsta("bestseller");
		KategoriaProsta k2 = new KategoriaProsta("dla dzieci");

		KategoriaZlozona kz2 = new KategoriaZlozona();
		KategoriaProsta kol1 = new KategoriaProsta("zielony");
		KategoriaProsta kol2 = new KategoriaProsta("czerwony");

		kz2.dodajKategorie(kol1);
		kz2.dodajKategorie(kol2);

		kz1.dodajKategorie(k1);
		kz1.dodajKategorie(k2);
		kz1.dodajKategorie(kz2);

		kz1.wypiszNazwe();




	}
}
