class Quadrado extends Figura{

	int lado;

	void desenhar(){
		System.out.println("Oi eu sou um quadrado!");
	}

	void calcularArea(){
		return lado * lado;
	} 
}