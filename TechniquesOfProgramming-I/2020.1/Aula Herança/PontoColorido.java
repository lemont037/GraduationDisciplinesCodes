class PontoColorido extends Ponto{
	
	int cor;

	PontoColorido(){
		super(0);
	}
	PontoColorido(float x, float y){
		super(x,y);
	}
	PontoColorido(float x, float y, int c){
		super(x,y);
		this.cor = c;
	}
}