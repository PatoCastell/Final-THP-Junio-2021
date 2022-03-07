package FinalLargo;

public class Test {

	public static void main(String[] args) {
		Edificio edificio= new Edificio(30);
		System.out.println(edificio.getAscensores());
		llamarAscensor(14, edificio);
		llamarAscensor(13, edificio);
		llamarAscensor(2, edificio);
		llamarAscensor(16, edificio);
		llamarAscensor(5, edificio);
		llamarAscensor(30, edificio);
		llamarAscensor(1, edificio);
		
	}
	
	public static void llamarAscensor(int piso, Edificio e) {
		int numAscensor=e.llamarAscensor(piso);
		System.out.println("ASCENSOR "+numAscensor);
	}

}
