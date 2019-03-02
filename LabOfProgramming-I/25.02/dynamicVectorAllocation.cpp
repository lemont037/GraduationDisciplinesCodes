#include <iostream>
#include <new>

using std::cout;
using std::cin;
using std::endl;
using std::nothrow;

#include "dynamicVectorAllocation.hpp"

int main(){
	cout << "Initiating a vector: ";
	vector v;
	if(v.init())
		cout << "Vector initiated!" << endl;
	else
		cout << "ERRO on to alloc the vector" << endl;
	
	cout << "Insert inttegers to the vector (Any non-positive intteger to stop the entry):" << endl;
	int valor;
	for(;;){
		cin >> valor;
		if(valor < 0)
			break;
		if(!v.insert(valor)){
			cout << "ERRO: No space" << endl;
			break;
		}
	}

	v.print();
	cout << endl << "End of execution! :)" << endl;
}


