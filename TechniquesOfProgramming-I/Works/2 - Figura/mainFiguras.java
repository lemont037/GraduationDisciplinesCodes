class mainFiguras{
    public static void main(String args[]){
        System.out.println(" >> Criando um circulo: ");
        Circulo c1 = new Circulo();
        System.out.println(" >> Criando um quadrado: ");
        Quadrado q1 = new Quadrado();

        System.out.println(" >> Desenhando o criculo:");
        c1.desenhar();
        System.out.println(" >> Desenhando o quadrado:");
        q1.desenhar();

        System.out.println(" >> Movendo o circulo:");
        System.out.println("Antes:");
        c1.coordenadas();
        c1.mover(25, -12);
        System.out.println("Agora:");
        c1.coordenadas();
        System.out.println(" >> Movendo o quadrado:");
        System.out.println("Antes:");
        q1.coordenadas();
        q1.mover(25, -12);
        System.out.println("Agora:");
        q1.coordenadas();

        System.out.println(" >> Calculando a area do circulo");
        System.out.println(c1.calcularArea());
        System.out.println(" >> Calculando a area do quadrado");
        System.out.println(q1.calcularArea());
    }
}