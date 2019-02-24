class Ponto {
	float x, y;

	void setX (float x){
		this.x = x;
	}
	
	void setY(float y){
		this.y = y;
	}
	
	void setXY(float x, float y){
		this.x = x;
		this.y = y;
	}

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
