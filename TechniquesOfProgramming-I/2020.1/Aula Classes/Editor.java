class Editor {
	public static void main(String args[]) {
		Ponto p1 = new Ponto();
		System.out.println("Ponto 01: "+p1.x+", "+p1.y);
		Ponto p2 = new Ponto(3);
		System.out.println("Ponto 02: "+p2.x+", "+p2.y);
		Ponto p3 = new Ponto(5,9);
		System.out.println("Ponto 03: "+p3.x+", "+p3.y);
	}
}