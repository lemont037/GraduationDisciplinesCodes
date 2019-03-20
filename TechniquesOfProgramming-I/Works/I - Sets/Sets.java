class Conjunto<T>{
	int qttElem;
	T vector[];

	public void create(int size){
		vector = new T[size];
		qttElem = 0;
	}

	public boolean realocate(Conjunto set){
		Conjunto newSet = new Conjunto();
		newSet.create(set.vector.length*2);

		System.arraycopy(set, 0, newSet, 0, set.qttElem);
	}

	public boolean insert(T elem){
		if(qttElem == vector.length)
			if(!realocate(this))
				return false;		
		vector[qttElem++] = elem;
		return true;
	}

	public boolean contains(T elem){
		for(int i = 0; i < qttElem; i++){
			if(vector[i] == elem)
				return true;
		}
		return false;
	}

	public boolean isSubSet(Conjunto setA, Conjunto setB){
		/**Here is implicit that the analysis
		 * will considerate if A is sub set
		 * of B.*/

		boolean contains = false;

		for(int a = 0; a < setA.qttElem; a++){
			for(int b = 0; b < setB.qttElem; b++){
				if(setA.vector[a] == setB.vector[b]){
					contains = true;
					break;
				}
			}
			if(!contains)
				return false;
		}
		return true;
	}

	public Conjunto union(Conjunto setA, Conjunto setB){
		Conjunto setUnion = new Conjunto();
		int size = setA.qttElem + setB.qttElem;
		setUnion.create(size);
		
		int setAQttElem = setA.qttElem;

		System.arraycopy(setA,0,setUnion,0,setAQttElem);
		for(int i = 0; i < setB.qttElem; i++)
			if(!setUnion.contains(setB.vector[i]))
				setUnion.vector[setAQttElem++] = setB.vector[i];

		return setUnion;
	}

	public Conjunto intersection(Conjunto setA, Conjunto setB){
		Conjunto setIntersec = new Conjunto();
		int size = setA.qttElem + setB.qttElem;
		setIntersec.create(size);

		for(int a = 0; a < setA.qttElem; a++)
			if(setB.contains(setA.vector[a]))
				setIntersec.insert(setA.vector[a]);
		
		return setIntersec;
	}

	public Conjunto difference(Conjunto setA, Conjunto setB){
		Conjunto setDiferen = new Conjunto();
		int size = setA.qttElem + setB.qttElem;
		setDiferen.create(size);

		for(int a = 0; a < setA.qttElem; a++)
			if(!setB.contains(setA.vector[a]))
				setDiferen.insert(setA.vector[a]);
		for(int b = 0; b < setB.qttElem; b++)
			if(!setA.contains(setB.vector[b]))
				setDiferen.insert(setB.vector[b]);
	
		return setDiferen;
	}
	
	public Conjunto product(Conjunto setA, Conjunto setB){
		Conjunto setProduct = new Conjunto();
		int size = setA.vector.length + setB.vector.length;
		setProduct.create(size);

		for(int a = 0; a < qttElem; a++)
			for(int b = 0; b < qttElem; b++){
				T[] tuple = {setA.vector[a],setB.vector[b]};
				setProduct.insert(tuple);
			}

		return setProduct;
	}

	public Conjunto setPower(Conjunto setA){
		//To be implemented
	}
}

