class Conjunto<T>{
	int qttElem;
	Object vector[];

	public void create(){
		create(1);
	}

	public void create(int size){
		vector = new Object[size];
		qttElem = 0;
	}

	public void realocate(){
		Object newVector[] = new Object[this.vector.length * 2];

		System.arraycopy(this.vector, 0, newVector, 0, this.qttElem);
		this.vector = newVector;
	}

	public void insert(Object elem){
		if(qttElem == vector.length)
			this.realocate();
		if(!this.contains(elem))
			vector[qttElem++] = elem;
	}

	public boolean contains(Object elem){
		for(int i = 0; i < qttElem; i++){
			if(vector[i] == elem)
				return true;
		}
		return false;
	}

	public boolean isSubSet(Conjunto<T> setB){
		/**Here is implicit that the analysis
		 * will considerate if A is sub set
		 * of B.*/

		boolean contains;

		for(int a = 0; a < this.qttElem; a++){
			contains = false;
			for(int b = 0; b < setB.qttElem; b++){
				if(this.vector[a] == setB.vector[b]){
					contains = true;
					break;
				}
			}
			if(!contains)
				return false;
		}
		return true;
	}

	public Conjunto<T> union(Conjunto<T> setB){
		Conjunto<T> setUnion = new Conjunto<T>();
		setUnion.create(this.qttElem+setB.qttElem);
		
		System.arraycopy(this.vector, 0, setUnion.vector, 0, this.qttElem);
		setUnion.qttElem = this.qttElem;

		for(int i = 0; i < setB.qttElem; i++)
			setUnion.insert(setB.vector[i]);
		
		return setUnion;
	}

	public Conjunto<T> intersection(Conjunto<T> setB){
		Conjunto<T> setIntersect = new Conjunto<T>();
		setIntersect.create();

		for(int i = 0; i < this.qttElem; i++)
			if(setB.contains(this.vector[i]))
				setIntersect.insert(this.vector[i]);
		
		return setIntersect;
	}

	public Conjunto<T> difference(Conjunto<T> setB){
		Conjunto<T> setDifference = new Conjunto<T>();
		setDifference.create();

		for(int a = 0; a < this.qttElem; a++)
			if(!setB.contains(this.vector[a]))
				setDifference.insert(this.vector[a]);
		
		return setDifference;
	}
	
	public void product(Conjunto<T> setA, Conjunto<T> setB){
		int size = setA.vector.length + setB.vector.length;
		this.create(size);

		for(int a = 0; a < qttElem; a++)
			for(int b = 0; b < qttElem; b++){
				this.insert(setA.vector[a]);
				this.insert(setB.vector[b]);
			}
	}

	public void setPower(Conjunto<T> setA) {
		//To be implemented
	}

	public void print(){
		System.out.print("[");
		for(int i = 0; i < qttElem; i++)
			if(i+1 != qttElem)
				System.out.print(vector[i]+", ");
			else
				System.out.print(vector[i]+"]\n");
	}
}

