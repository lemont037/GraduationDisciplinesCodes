#include <iostream>

using namespace std;

int main(){
	int* a = new int(456);
	cout << "a: " << *a << endl;
	cout << "Delete a" << endl;
	delete a;
	cout << "a: " << *a << endl;


	if(*a == NULL)
		cout << "Nulo" << endl;
	else
		cout << "Nao nulo" << endl;
		cout << "a: " << *a << endl;
}
