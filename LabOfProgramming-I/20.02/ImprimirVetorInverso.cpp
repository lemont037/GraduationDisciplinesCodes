#include <iostream>

using namespace std;

int main(){
	int v[5] = {1,2,3,4,5};
	int *p = v + 4;

	do{
		cout << *p << endl;
	}while(p-- != v);
}