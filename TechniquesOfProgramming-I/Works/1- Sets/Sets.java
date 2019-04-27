class Conjunto{
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

	public boolean isSubSet(Conjunto setB){
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

	public Conjunto union(Conjunto setB){
		Conjunto setUnion = new Conjunto();
		setUnion.create(this.qttElem+setB.qttElem);
		
		System.arraycopy(this.vector, 0, setUnion.vector, 0, this.qttElem);
		setUnion.qttElem = this.qttElem;

		for(int i = 0; i < setB.qttElem; i++)
			setUnion.insert(setB.vector[i]);
		
		return setUnion;
	}

	public Conjunto intersection(Conjunto setB){
		Conjunto setIntersect = new Conjunto();
		setIntersect.create();

		for(int i = 0; i < this.qttElem; i++)
			if(setB.contains(this.vector[i]))
				setIntersect.insert(this.vector[i]);
		
		return setIntersect;
	}

	public Conjunto difference(Conjunto setB){
		Conjunto setDifference = new Conjunto();
		setDifference.create();

		for(int a = 0; a < this.qttElem; a++)
			if(!setB.contains(this.vector[a]))
				setDifference.insert(this.vector[a]);
		
		return setDifference;
	}
	
	public Conjunto product(Conjunto setB){
		Conjunto setProduct = new Conjunto();
		int size = this.qttElem * setB.qttElem;
		setProduct.create(size);

		for(int a = 0; a < this.qttElem; a++)
			for(int b = 0; b < setB.qttElem; b++){
				Conjunto subSet = new Conjunto();
				subSet.create(2);
				subSet.insert(this.vector[a]);
				subSet.insert(setB.vector[b]);
				setProduct.insert(subSet);
			}
		return setProduct;
	}

	public Conjunto setPower() {
		//Binary method
		Conjunto setPower = new Conjunto();
		setPower.create((int)Math.pow(2,this.qttElem));

		for(int i = 0; i < Math.pow(2,this.qttElem); i++){
			char binary[] = new char[this.qttElem];
			char bin[] = Integer.toBinaryString(i).toCharArray();
			
			int pos = this.qttElem - bin.length;
			int posAux = 0;
			for(int index = 0; index < this.qttElem; index++){
				if(index < pos)
					binary[index] = '0';
				else
					binary[index] = bin[posAux++];
			}

			Conjunto subSet = new Conjunto();
			subSet.create();
			for(int j = 0; j < this.qttElem; j++){
				if(binary[j] != '0')
					subSet.insert(this.vector[j]);
			}
			setPower.insert(subSet);
		}
		return setPower;
	}

	public void sortSubSets(){
		for(int i = 0; i < this.qttElem; i++){
			//To be implemented
		}
	}

	public void print(int isSub){
		System.out.print("[");
		if(this.qttElem == 0 && isSub == 1)
			System.out.print("]");
		for(int i = 0; i < qttElem; i++){
			if(i+1 != qttElem){
				if(vector[i] instanceof Conjunto){
					Conjunto set = (Conjunto) vector[i];
					set.print(1);
				}else
					System.out.print(vector[i]);
				System.out.print((isSub == 0) ? ", " : ",");
			}else{
				if(vector[i] instanceof Conjunto){
					Conjunto set = (Conjunto) vector[i];
					set.print(1);
				}else
					System.out.print(vector[i]);
					System.out.print((isSub == 0) ? "]\n" : "]");
			}
		}
	}
}

