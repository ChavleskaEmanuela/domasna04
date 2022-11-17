package zadaca02;

public class Main {
public static void main(String[] args) {
	Restoran objekt = new Restoran();
	
	objekt.setIme("Aura");
	objekt.setLokacija("ul. Goce Delcev br.20");
	objekt.setBrojSedista(50);
	objekt.setTelefon("075555444");
	
	System.out.println("Ime: " + objekt.getIme());
	System.out.println("Lokacija: " + objekt.getLokacija());
	System.out.println("Broj na sedista: " + objekt.getBrojSedista());
	System.out.println("Telefon: " + objekt.getTelefon());
}
}
