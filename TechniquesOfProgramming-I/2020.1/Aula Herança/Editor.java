class Editor {
	public static void main(String args[]) {

		System.out.println("\nCriando:");
		Ponto p1 = new Ponto(2,3);
		System.out.println("Ponto 01: "+p1.x+", "+p1.y);
		
		PontoColorido p2 = new PontoColorido();
		System.out.println("Ponto 02: "+p2.x+", "+p2.y+", Cor: "+p2.cor);

		Ponto3D p3 = new Ponto3D(2,3,5);
		System.out.println("Ponto 03: "+p3.x+", "+p3.y+", "+p3.z);
		
	}
}