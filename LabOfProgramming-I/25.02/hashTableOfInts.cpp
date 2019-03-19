#include <iostream>

using std::cout;
using std::endl;
using std::cin;

#include "hashTableOfInts.hpp"

int main(){
	int size;

	cout << "Informe o tamanho do vetor inicial: ";
	cin >> size;
	
	cout << endl << endl;

	cout << "Inicializando o vetor......";
	hashTable t;

	if(t.initVector(size))
		cout << "OK" << endl;
	else
		cout << "FAIL" << endl;

	cout << "Informe os inteiros a serem inseridos (Qualquer inteiro negativo para parar):" << endl;
	int valor = 0;

	while(valor >= 0){
		cin >> valor;
		if(!t.insert(valor)){
			cout << "FAIL ON INSERT" << endl;
			break;
		}
	}

	cout << "Imprimindo o vetor: " << endl;
	t.printValues();

	cout << "Finalizando a tabela hash.....";
	t.finishHashTable();
	if(t.vector == nullptr)
		cout << "OK" << endl;
	else
		cout << "FAIL" << endl;

	cout << "Imprimindo o vetor: " << endl;
	t.printValues();
}
