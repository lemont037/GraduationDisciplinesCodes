#include <iostream>

#include "quicksort.hpp"

using namespace std;

int main(){

		int size = 6;
		int vector[] = {3,4,1,6,2,5};

		//int* nVector = vector_copier<int>(vector, size);

		int* nVector = quicksortIndexes<int>(vector,size);

		cout << "Original vector: ";
		for(int i = 0; i < size; i++)
			cout << *(vector+i) << " ";
		cout << endl;

		cout << "New vector: ";
		for(int i = 0; i < size; i++)
			cout << *(nVector+i) << " ";
		cout << endl;
}