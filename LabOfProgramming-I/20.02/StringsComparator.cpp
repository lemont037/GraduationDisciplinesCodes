#include <iostream>
#include <string.h>
#include "StringsComparator.hpp"

using namespace std;

int main(){
	char first[100], second[100];

	cout << "StringComparator-----------------------------------v0.1" << endl;
	cout << "Informe a primeira cadeia de caracteres:" << endl;
	cin >> first;
	char *r = first;
	cout << "Informe a segunda cadeia de caracteres:" << endl;
	cin >> second;
	char *s = second;
	
	cout << "RESULTADO----------------------------------------------" << endl;

	if(sao_iguais(r,s))
		cout << "As strings sao extritamente iguais!" << endl;
	else
		cout << "As strings nao sao extritamente iguais!" << endl;
}

