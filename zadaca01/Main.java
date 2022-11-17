package zadaca01;

public class Main {
public static void main(String[] args) {
	Covek objekt = new Covek();
	objekt.setIme("Emanuela");
	objekt.setPrezime("Chavleska");
	objekt.setMaticenBroj("1111002558746");
	
	System.out.println("Ime: "+ objekt.getIme());
	System.out.println("Prezime: "+ objekt.getPrezime());
	System.out.println("Maticen broj: "+ objekt.getMaticenBroj());
}
}
