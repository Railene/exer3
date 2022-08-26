package entidades;

public class Nota {
	public String Nome;
	public double Nota1;
	public double Nota2;
	public double Nota3;
	
	public double NotaFinal() {
		return Nota1 + Nota2 + Nota3;
	}
	public double Media() {
		if(NotaFinal() < 60.0) {
			return 60.0 - NotaFinal();
		}
		else{
			return 0.0;
		}
	}

}
