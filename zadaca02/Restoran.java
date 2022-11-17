package zadaca02;

public class Restoran {
private String ime,lokacija, telefon;
private int brojSedista;

public String getIme() {
	return ime;
}

public String getLokacija() {
	return lokacija;
}

public int getBrojSedista() {
	return brojSedista;
}

public String getTelefon() {
	return telefon;
}

public void setIme(String ime) {
	this.ime = ime;
}

public void setLokacija(String lokacija) {
	this.lokacija = lokacija;
}

public void setBrojSedista(int brojSedista) {
	this.brojSedista = brojSedista;
}

public void setTelefon(String telefon) {
	this.telefon = telefon;
}
}
