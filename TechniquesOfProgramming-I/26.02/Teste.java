class Teste {
	public static void main(String args[]){
		//Instances---------------------------------------------------------------
		System.out.println("\nCreating-----------------------------------------");
		//Ponto1
		Ponto p1 = new Ponto();
		//Setting
		p1.setX(4);
		p1.setY(5);
		//Printing
		System.out.println("Reference: "+p1);
		System.out.println("X:"+p1.getX()+" Y:"+p1.getY());
		
		//Ponto2
		Ponto p2 = new Ponto(3,4);
		//With this constructor, we are already inicializing the atributes
		//Printing
		System.out.println("Reference: "+p2);
		System.out.println("X:"+p2.getX()+" Y:"+p2.getY());

		//Moving-----------------------------------------------------------------
		System.out.println("\nMoving-------------------------------------------");
		p1.mover(1.3,4.5);
		System.out.println("Method 01 (P1) >> X:"+p1.getX()+" Y:"+p1.getY());
		p1.mover(2,5.4);
		System.out.println("Method 02 (P1) >> X:"+p1.getX()+" Y:"+p1.getY());
		
		System.out.println("\n");

		p2.mover(3.4,6.7);
		System.out.println("Method 01 (P2) >> X:"+p2.getX()+" Y:"+p2.getY());
		p2.mover(5,1.2);
		System.out.println("Mehtod 02 (P2) >> X:"+p2.getX()+" Y:"+p2.getY());
	}
}
