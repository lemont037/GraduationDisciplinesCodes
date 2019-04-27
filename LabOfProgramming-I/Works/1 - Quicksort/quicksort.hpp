#include <iostream>
#include <new>

using namespace std;

template <typename T>
void print(T* vector, int size){
	cout << "[";
	for(int i = 0; i < size; i++)
		cout << *(vector+i) << " ";
	cout << "]";
	//cout << endl;
}

template <typename T>
T* vector_copier(T* oVector, int size){
	
	T* nVector = new(nothrow) T[size];

	//Dynamic allocation verification

	T* oVectorAux = oVector;
	T* oVectorEnd = oVector+size;
	T* nVectorAux = nVector;

	for(;;){
		if(oVectorAux == oVectorEnd)
			break;
		*(nVectorAux++) = *(oVectorAux++);
	}

	return nVector;
}

template <typename T>
void swap(T* a, T* b){
	T aux = *a;
	*a = *b;
	*b = aux;
}

int escolher_pivo (int primeiro, int ultimo){
	int range = ultimo-primeiro;

	if(range % 2 == 0)
		return range/2;
	else
		return ((int)(range/2))+1;
}

template <typename T>
T* quicksortIndexes(T* oVector, int size){
	//In case of user request a set assortment of size 1.
	/*The function quicksort never will request a set assortment
	  with a size less or equal than 2*/
	if(size == 1)
		return oVector;

	T* nVector;
	int IndexPivo,
		leftPartSize = 0,
		rightPartSize = 0;

	//Creating the vector copy for to sort
	nVector = vector_copier(oVector, size);

	/*In case of a instace with size 2, is less costly do a
	  comparation than execute the for process*/
	if(size == 2){
		if(nVector[0] > nVector[1])
			swap(nVector[1], nVector[0]);
		return nVector;
	}

	//Calculating the index of pivo element
	IndexPivo = escolher_pivo(0,size-1);

	cout << " >> QUICKSORT:";
	print(nVector, size);
	cout << " -> Pivo: " << nVector[IndexPivo] << endl;

	//Swapping pivo to the start (For facility of swap)
	swap(&nVector[0],&nVector[IndexPivo]);

	//Elements smaller than pivo
	for(int i = 1; leftPartSize+rightPartSize < size-1;){
		cout << endl << "leftPart: " << leftPartSize << endl;
		cout << "rightPart: " << rightPartSize << endl;
		print(nVector, size);
		cout << " " << nVector[i] << " < " << nVector[0] << " | ";
		if(nVector[i] < nVector[0]){
			cout << "Yes | ";
			leftPartSize++;
			cout << "leftPart++, ";
			i++;
			cout << "i++" << endl;
		}else{
			cout << "No  | ";
			/*Case 01: The elemente i isn't together with the last
			element before the Right Partition Limit.
			*/
			if(i < (size-rightPartSize)-2){
				cout << "Swap(" << nVector[i] << "," << nVector[(size-rightPartSize)-1] << ") | ";
				swap(&nVector[i],&nVector[(size-rightPartSize)-1]);
				cout << "rightPart++, ";
				rightPartSize++;
				cout << "don't i++" << endl;
			}
			/*Case 02: The elemente i is together with the last
			elemente before the Right Partition Limit*/
			else if(i+1 == (size-rightPartSize)-1){
				cout << nVector[i] << " < " << nVector[i+1] << " | ";
				/*Case 02.1: If the elemente i+1 is greater than the element i,
				and we already know that the element i is greater than pivo,
				then, the element i+1 is also greater than the pivo*/
				if(nVector[i] < nVector[i+1]){
					cout << "Yes | ";
					cout << "2x rightPart++, ";
					rightPartSize += 2;
					cout << "don't i++" << endl;
				/*Case 02.2: If the elemente i+1 is less than element i,
				and we already know that the element i is greater than pivo,
				then, the element i+1 can be less than pivo, for this, we still
				need analyze it*/
				}else{
					cout << "No | ";
					cout << "Swap(" << nVector[i] << "," << nVector[(size-rightPartSize)-1] << ") | ";
					swap(&nVector[i],&nVector[i+1]);
					cout << "rightPart++, ";
					rightPartSize++;
					cout << "don't i++" << endl;
				}
			}
			/*Case 03: The elemente i is already the last
			elemente before the Right Partition Limit*/
			else if(i == (size-rightPartSize)-1){
				cout << "Don't Swap (The elemente is already on position) | ";
				cout << "rightPart++, ";
				rightPartSize++;
				cout << "don't i++" << endl;	
			}
		}
	}	
	
	//Swapping back pivo to the it real position
	swap(&nVector[0],&nVector[leftPartSize]);
	

	cout << endl << " >> PRE-END: ";
	print(nVector, size);
	cout << endl << "    leftPart: " << leftPartSize << endl;
	cout << "    rightPart: " << rightPartSize << endl;
	cout << endl;
		
	
	//Sort the left partition if necessary
	if(leftPartSize > 2){
		cout << " >> SORTING LEFT PARTITION" << endl;
		quicksortIndexes(nVector,leftPartSize);
	}
	//Sort the right partition if necessary
	if(rightPartSize > 2){
		cout << " >> SORTING RIGHT PARTITION" << endl;
		quicksortIndexes(nVector+leftPartSize+1,rightPartSize); 
	}

	return nVector;
}

template <typename T>
T* quicksortPointers(T* oVector, int size){
	//To be implemented
}