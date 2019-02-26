class Ponto {
	//Atributes
	float x, y;
	int color;

	//Constructors Methods
	Ponto(){
		this(0,0,0);
	}

	Ponto(float x, float y){
		this(x,y,0);
	}

	Ponto(float x, float y, int color){
		this.x = x;
		this.y = y;
		this.color = color;
	}

	//Operations Methods
	//Actions
	void mover(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}

	void mover(int raio, double ang){
		x += raio*Math.cos(ang);
		y += raio*Math.sin(ang);
	}

	//Sets
	void setX (float x){
		this.setXYColor(x,this.y,this.color);
	}
	
	void setY(float y){
		this.setXYColor(this.x,y,this.color);
	}
	
	void setXY(float x, float y){
		this.setXYColor(x,y,this.color);
	}

	void setXYColor(float x, float y, int color){
		this.x = x;
		this.y = y;
		this.color = color;
	}

	//Gets
	float getX(){
		return x;
	}

	float getY(){
		return y;
	}

	Ponto getXY(){
		return this;
	}
}
