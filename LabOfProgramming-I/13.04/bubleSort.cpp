#include <iostream>

using std::cout;
using std::cin;
using std::endl;

#include "bubleSort.hpp"

int main(){
	int vector[10] = {9,2,4,1,7,8,3,5,10,6};
	int* begin = vector;
	int* end = vector + 9;
	
	quickSort<int>(begin,end);
}
