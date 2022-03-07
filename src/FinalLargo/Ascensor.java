package FinalLargo;

public class Ascensor {

	private int numero;
	private int pisoActual;
	private Funcionamiento funcionamiento;

	public Ascensor(int numero,Funcionamiento funcionamiento ) {
		this.setNumero(numero);
		this.setPisoActual(0);
		this.setFuncionamiento(funcionamiento);
	}

	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPisoActual() {
		return pisoActual;
	}

	private void setPisoActual(int pisoActual) {
		this.pisoActual = pisoActual;
	}

	public Funcionamiento getFuncionamiento() {
		return funcionamiento;
	}

	private void setFuncionamiento(Funcionamiento funcionamiento) {
		this.funcionamiento = funcionamiento;
	}

	public void modificarPiso(int piso) {
		this.pisoActual = piso;

	}

	public void modificarFuncionamiento() {
		if (this.numero % 2 == 0) {
			this.funcionamiento = Funcionamiento.SOLO_PARES;
		} else {
			this.funcionamiento = Funcionamiento.SOLO_IMPARES;
		}
	}

	public void modificarATodos() {
		this.funcionamiento = Funcionamiento.TODOS;
	}

	public boolean puedeParar(int piso) {
		boolean puede = false;
		if (piso % 2 == 0) {
			if (this.funcionamiento == Funcionamiento.SOLO_PARES || this.funcionamiento == Funcionamiento.TODOS) {
				puede = true;
			}

		}else {
			if(this.funcionamiento == Funcionamiento.SOLO_IMPARES || this.funcionamiento == Funcionamiento.TODOS) {
				puede=true;
			}
		}
		

		return puede;
	}

	@Override
	public String toString() {
		return "Ascensor [numero=" + numero + ", pisoActual=" + pisoActual + ", funcionamiento=" + funcionamiento + "]";
	}

}
