#include <iostream>
#include "intArrayInverter.hpp"

using namespace std;

int main(){
	int n;
	cout << "intArrayInverter------------------------v0.1" << endl;
	cout << "Informe quantos inteiros ira inserir: ";
	cin >> n;
	int v[n];
	cout << "Preencha o array:" << endl;
	
	int *index = v;
	int *fim = v + n;
	int valor;
	for(;index != fim; index++){
		cin >> valor;
		*index = valor;
	}
		
	inverter(v,n);

	cout << "Novo v[" << n << "]: ";
	
	index = v + 1;
	fim = v + n;
	for(;index <= fim; index++)
		cout << *index << " ";
}
