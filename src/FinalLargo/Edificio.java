package FinalLargo;

import java.util.ArrayList;

public class Edificio {

	private int cantPisos;
	private ArrayList<Ascensor> ascensores;

	public Edificio(int cantPisos) {
		this.setCantPisos(cantPisos);
		this.ascensores = new ArrayList<Ascensor>();
		ascensores.add(new Ascensor(1, Funcionamiento.TODOS));
		ascensores.add(new Ascensor(2, Funcionamiento.TODOS));
		ascensores.add(new Ascensor(3, Funcionamiento.SOLO_IMPARES));
		ascensores.add(new Ascensor(4, Funcionamiento.SOLO_PARES));
		
		
	}

	public Ascensor obtenerMasCercano(int pisoActual) {
		Ascensor ascensorCerca = null;
		int cercano = 999;
		int resta = 0;
		for (Ascensor ascensor : ascensores) {
			if(ascensor.puedeParar(pisoActual)) {
				if(ascensor.getPisoActual()<pisoActual) {
					resta= pisoActual-ascensor.getPisoActual();
				}else {
					resta=ascensor.getPisoActual()-pisoActual;
				}
				if(resta<cercano) {
					cercano=resta;
					ascensorCerca=ascensor;
				}
				if(resta==cercano) {
					if(ascensor.getFuncionamiento()!=Funcionamiento.TODOS) {
						ascensorCerca=ascensor;
					}
				}
			}
		}
		return ascensorCerca;
	}
			
	public int llamarAscensor(int piso) {
		Ascensor ascensorCercano = obtenerMasCercano(piso);
		int numeroAscensor=0;
		if(ascensorCercano!=null) {
		 numeroAscensor=ascensorCercano.getNumero();
		ascensorCercano.modificarPiso(piso);}
		
		return numeroAscensor;
	}
	
	public void setModoSegunNumeroDeAscensor() {
		for (Ascensor ascensor : ascensores) {
			if(ascensor.getNumero()>2) {
				ascensor.modificarFuncionamiento();
			}
			else if (ascensor.getNumero()>0&&ascensor.getNumero()<3) {
				ascensor.modificarATodos();
			}
		}
	}
	
	

	private int getCantPisos() {
		return cantPisos;
	}

	private void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}

	public ArrayList<Ascensor> getAscensores() {
		return ascensores;
	}

	public void setAscensores(ArrayList<Ascensor> ascensores) {
		this.ascensores = ascensores;
	}

}
