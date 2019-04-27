#include <iostream>
#include "quicksort.hpp"

using namespace std;

int main(){
	int size = 6;
	int vector[] = {1,2,3,4,5,6};

	swap(&vector[0],&vector[size-1]);

	cout << "Original vector: ";
	for(int i = 0; i < size; i++)
		cout << *(vector+i) << " ";
	cout << endl;
}