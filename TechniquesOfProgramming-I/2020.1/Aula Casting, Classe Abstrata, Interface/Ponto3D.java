class Ponto3D extends Ponto{
	
	float z;

	Ponto3D(){
		super(0);
	}
	Ponto3D(float x, float y, float z){
		super(x,y);
		this.z = z;
	}

	void mover(float dx, float dy, float dz){
		super.mover(dx,dy);
		z += dz;
	}
}