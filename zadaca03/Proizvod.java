package zadaca03;

public class Proizvod {
private String imeNaProizvod, proizvoditel;
private int tezina, cena;

public Proizvod() {
	this.imeNaProizvod = "Milka";
	this.proizvoditel = "Vitaminka";
	this.tezina = 100;
	this.cena = 60;
}

public String getImeNaProizvod() {
	return imeNaProizvod;
}

public String getProizvoditel() {
	return proizvoditel;
}

public int getTezina() {
	return tezina;
}

public int getCena() {
	return cena;
}

public void setImeNaProizvod(String imeNaProizvod) {
	this.imeNaProizvod = imeNaProizvod;
}

public void setProizvoditel(String proizvoditel) {
	this.proizvoditel = proizvoditel;
}

public void setTezina(int tezina) {
	this.tezina = tezina;
}

public void setCena(int cena) {
	this.cena = cena;
}
}
