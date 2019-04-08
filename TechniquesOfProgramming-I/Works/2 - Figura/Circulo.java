public class Circulo extends Figura{
    public Circulo(){
        super.qttDots = 2;
        super.setVtxs();
    }

    public double calcularArea(){
        return Math.PI*Math.pow(super.distanceDots(super.dots[0], super.dots[1]),2);
    }

    @Override
    public String toString(){
        return "Circulo";
    }
}