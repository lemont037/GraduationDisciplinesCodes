public class Quadrado extends Figura{
    public Quadrado(){
        super.qttDots = 4;
        super.setVtxs();
    }

    public double calcularArea(){
        return Math.pow(super.distanceDots(super.dots[0], super.dots[1]),2);
    }

    @Override
    public String toString(){
        return "Quadrado";
    }
}