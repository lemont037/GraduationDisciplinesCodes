public class Ponto{
    double x;
    double y;

    Ponto(){
        //It's never called
    }

    Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    protected double distanceDots(Ponto dots1, Ponto dots2){
        return Math.sqrt(Math.pow(dots2.x-dots1.x,2)+Math.pow(dots2.y-dots1.y,2));   
    }
}