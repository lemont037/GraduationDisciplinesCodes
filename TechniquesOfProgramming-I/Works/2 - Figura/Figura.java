import java.util.Scanner;

public abstract class Figura extends Ponto{
    protected int qttDots;
    protected Ponto[] dots;
    protected boolean isColored = false;
    protected String color;

    Scanner read = new Scanner(System.in);

    protected void desenhar(){
        System.out.println(this.toString());
    }

    protected void mover(float dx, float dy){
        for(int i = 0; i < this.qttDots; i++){
            this.dots[i].x += dx;
            this.dots[i].y += dy;
        }
    }

    protected void setVtxs(){
        dots = new Ponto[qttDots];
        double x;
        double y;
        System.out.println("Figura "+toString()+" | "+qttDots+" pontos -------------------------------");
        for(int i = 0; i < this.qttDots; i++){
            System.out.println("Informe as coordenadas x e y do "+(i+1)+"º ponto:");
            x = read.nextDouble();
            y = read.nextDouble();
            this.dots[i] = new Ponto(x,y);
        }
    }

    protected void coordenadas(){
        for(int i = 0; i < qttDots; i++){
            System.out.println("Ponto "+(i+1)+": "+"("+this.dots[i].x+","+this.dots[i].y+")");
        }
    }

    protected abstract double calcularArea();
}