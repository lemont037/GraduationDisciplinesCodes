#include <iostream>

#include "quicksort.hpp"

using namespace std;

int main(){
	int io = -1;

	while(io != 0){
		
		
		int size, uRange, lRange;

		cout << "Inform a size to the vector: ";
		cin >> size;
		
		cout << endl
			 << "Now, please, inform the set limiters(Upper and lower) for the range generator instance:" << endl
			 << "Lower: ";
		cin >> lRange;
		cout << endl
			 << "Upper:";
		cin >> uRange;

		cout << endl
			 << "Inform a size to the vector: ";
		cin >> size;
		cout << endl;

		vector<int> v;
		v.instance_creator();

		int* nVector = vector_copier<int>(v);

		cout << "Original vector: ";
		for(int i = 0; i < 6; i++)
			cout << *(vector+i) << " ";
		cout << endl;

		cout << "New vector: ";
		for(int i = 0; i < 6; i++)
			cout << *(nVector+i) << " ";
		cout << endl;
	} 
}