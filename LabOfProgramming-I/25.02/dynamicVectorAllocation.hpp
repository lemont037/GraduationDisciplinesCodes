struct vector{
	int* vector;
	int size;
	int qtdValors;

	bool init(){
		size = 1;
		vector = new(nothrow) int[size];
		if(!vector)
			return false;
		qtdValors = 0;
		return true;
	}
	
	void copyValors(int* aux){
		int* begin = vector;
		int* end = vector + qtdValors;
		int* pAux = aux;

		for(;begin != end; begin++)
			*(pAux++) = *begin;

		delete[] vector;
		vector = aux;
	}

	bool reallocate(){
		int* aux = new(nothrow) int[size*2];
		if(!aux)
			return false;
		
		copyValors(aux);
		size *= 2;
		return true;
	}

	bool insert(int valor){
		if(qtdValors == size)
			if(!reallocate())
				return false;

		*(vector+qtdValors++) = valor;
		return true;
		
	}

	void print(){
		int* end = vector + qtdValors - 1;
		cout << "vector[" << size << "] = {";
		for(;;vector++)
			if(vector < end)
				cout << *vector << ",";
			else{
				cout << *vector << "}";
				break;
			}
	}
};
