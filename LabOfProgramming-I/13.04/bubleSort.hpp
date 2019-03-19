template<class T>
void change(T* a, T* b){
	T* aux;
        *aux = *a;
	*a = *b;
	*b = *aux;
}

template<class T>
void print(T* beginVector,T* endVector){
	T* i = beginVector;
	cout << "[";
	for(;;i++){
		if(i == endVector){
			cout << *i << "]" << endl;
			break;
		}
		cout << *i << ", ";
	}
}

template<class T>
void quickSort(T* beginVector, T* endVector){
	int indexPivo = (endVector-beginVector)/2;
	T* pivo = beginVector+indexPivo;

	print<T>(beginVector,endVector);
	
	//Left
	T* l = pivo - 1;
	for(;;l--){
		if(*l > *pivo){
			T* la = l;
			T* lb = l;
			int indexL = l - beginVector;
			while(indexL < indexPivo){
				change(la++,++lb);
				indexL++;
			}
			indexPivo--;
			pivo--;
		}
		if(l == beginVector)
			break;
	}

	print<T>(beginVector,endVector);

	//Right
	T* r = pivo + 1;
	for(;;r++){
		if(*r < *pivo){
			T* ra = r;
			T* rb = r;
			int indexR = r - beginVector;
			while(indexR > indexPivo){
				change(ra--,--rb);
				indexR--;
			}
			indexPivo++;
			pivo++;
		}
		if(r == endVector)
			break;
	}

	print<T>(beginVector,endVector);

	if(pivo-beginVector > 1){
		quickSort<T>(beginVector,pivo);
	}
	if(endVector-pivo > 1){
		quickSort<T>(pivo,endVector);
	}
}
