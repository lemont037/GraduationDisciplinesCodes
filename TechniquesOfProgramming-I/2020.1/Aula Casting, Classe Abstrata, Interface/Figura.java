public abstract class Figura {

	Ponto origem;

	public abstract void desenhar();

	public abstract void apagar();

	public abstract void calcularArea();

	void mover(float dx){
		ponto += dx;
	}
}