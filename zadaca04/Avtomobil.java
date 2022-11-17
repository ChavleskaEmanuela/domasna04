package zadaca04;

public class Avtomobil {
private String marka,model,boja;
private int km;

public Avtomobil(String marka, String model, String boja, int km) {
this.marka = marka;
this.model = model;
this.boja = boja;
this.km = km;
}

public int Metod(int pomnoziKm) {
	km *= pomnoziKm;
	return km;
}

public String getMarka() {
	return marka;
}
public String getModel() {
	return model;
}
public String getBoja() {
	return boja;
}
public int getKm() {
	return km;
}
}
