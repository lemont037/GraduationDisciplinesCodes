class Conjunto<T>{
	int private qttElem;
	T private vector[];

	public void create(int size){
		vector = new T[size];
		qtdElem = new int(0);
	}

	public bool insert(T elem){
		if(qttElem == vector.length())
			if(!realocate(vector))
				return false;		
		vector[qttElem++] = elem;
		return true;
	}

	public bool contains(T elem){
		for(int i = 0; i < qttElem; i++){
			if(vector[i] == elem)
				return true
		}
		return false;
	}

	public isSubSet(T setA, T setB){
		/**Here is implicit that the analysis
		 * will considerate if A is sub set
		 * of B.*/

		bool contains = new bool(false);

		for(int a = 0; a < setA.qttElem; a++){
			for(int b = 0; b < setB.qttElem; b++){
				if(setA.vector[a] == setB.vector[b]){
					contains = new bool(true);
					break;
				}
			}
			if(!contains)
				return false;
		}
		return true;
	}

	public Conjunto union(T setA, T setB){
		Conjunto setUnion = new Conjunto();
		int size = setA.qttElem + setB.qttElem;
		setUnion.create(size);
		
		int setAQttElem = setA.qttElem;

		System.arraycopy(setA,0,setUnion,0,setAQttElem);
		for(int i = 0; i < setB.qttElem; i++)
			if(!setUnion.contains(setB.vector[i])
				setUnion.vector[setAQttElem++];

		return setUnion;
	}

	public Conjunto intersection(T setA, T setB){
		Conjunto setIntersec = new Conjunto();
		int size = setA.qttElem + setB.qttElem;
		setIntersec.create(size);

		for(int a = 0; a < setA.qttElem; a++)
			if(setB.contains(setA.vector[a]))
				setIntersec.insert(setA.vector[a]);
		
		return setIntersec;
	}

	public Conjunto difference(T setA, T setB){
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
	
	public Conjunto product(T setA, T setB){
		Conjunto setProduct = new Conjunto();
		int size = setA.vector.length() + setB.vector.length();
		setProduct.create(size);

		for(int a = 0; a < qttElem; a++)
			for(int b = 0; b < qttElem; b++)
				setProduct.insert([setA.vector[a],setB.vector[b]]);

		return setProduct;
	}

	public Conjunto setPower(T setA){
		//Not correct
		Conjunto setPower = new Conjunto();
		int size = Math.pow(2,setA.qttElem);
	
		int aux;

		for(int subSetI = 1; subSetI <= qttElem; subSetI++){
			T[] subSet;
			if(subSetI != 1)
				subSet = new T[subSetI];
				aux = subSetI-1;
			for(int elem = 0; elem < qttElem; elem++){
				if(subSetI == 1)
					subSet = new T[1];
				T[elem] = setA.vector[elem];
				if(subSetI == 1)
					setPower.insert(subSet);
				else if(elem-aux == 0;){
					setPower.insert(subSet);
					aux += subSetI;
				}
			}
			if(subSetI != 1)
				setPower.insert(subSet);
		}
		return setPower;
	}
}

