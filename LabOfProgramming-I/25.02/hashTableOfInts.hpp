#include <new>

using std::nothrow;

struct Noh{
	int value;
	Noh* next = nullptr;
};

struct hashTable{
	Noh** vector;
	int size;
	
	int hash(int n){
		return n % size;
	}

	bool initVector(int size){
		//Creating the vector
		vector = new(nothrow) Noh*[size];
		if(!vector)
			return false;
		this->size = size;

		//Initializing the vector with nullptr values
		Noh** aux = vector;
		Noh** end = &vector[size];
		for(; aux != end; aux++)
			*aux = nullptr;

		return true;
	}

	bool insert(int n){
		Noh* new_n = new(nothrow) Noh;
		if(!new_n)
			return false;
		
		int indexHash = hash(n);

		new_n->value = n;
		new_n->next = vector[indexHash];
		vector[indexHash] = new_n;
		return true;
	}

	void printValues(){
		Noh** aux = vector;
		Noh** end = &vector[size];
		
		cout << "[";
		for(; aux != end; aux++){
			if(*aux != nullptr){
				Noh* noh = *aux;
				Noh* nextNoh;
				do{
					nextNoh = noh->next;
					
					if(!(aux == end-1 && nextNoh == nullptr))
						cout << noh->value << ", ";
					else
						cout << noh->value << "]" << endl;

					noh = nextNoh;
				}while(noh != nullptr);
			}
		}

	}
	
	void finishHashTable(){
		Noh** aux = vector;
		Noh** end = &vector[size];
		
		/**for(; aux != end; aux++){
			if(*aux != nullptr){
				Noh* noh = *aux;
				Noh* nextNoh;
				do{
					nextNoh = noh->next;
					cout << "Excluindo Noh >> value: " << noh->value << endl;
					delete noh;
					noh = nextNoh;
				}while(noh != nullptr);
			}
		}*/
		delete[] vector;
		vector = nullptr;
	}

};

