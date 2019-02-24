class Teste {
	public static void main(String args[]){
		//Ponto1--------------------------------------------
		Ponto p1 = new Ponto();
		//Setting
		p1.setX(1);
		p1.setY(2);
		//Printing
		System.out.println("Reference: "+p1);
		System.out.println("X:"+p1.getX()+" Y:"+p1.getY());
		System.out.println("X and Y: "+p1.getXY());
		
		System.out.println("\n");

		//Ponto2--------------------------------------------
		Ponto p2 = new Ponto();
		//Setting
		p2.setX(3);
		p2.setY(4);
		//Printing
		System.out.println("Reference: "+p2);
		System.out.println("X:"+p2.getX()+" Y:"+p2.getY());
		System.out.println("X and Y: "+p2.getXY());
	}
}
