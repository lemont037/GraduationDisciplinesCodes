class Ponto {
	
	float x, y;
	
	Ponto(){
		this(0);
	}
	Ponto(float a){
		this(a,a);
	}
	Ponto(float x, float y){
		this.x = x;
		this.y = y;
	}

	void mover(float da){
		this.mover(da,da);
	}
	void mover(float dx, float dy){
		x += dx;
		y += dy;
	}
}