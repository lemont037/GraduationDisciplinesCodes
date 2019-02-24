void inverter(int *v, int n){
	int *begin = v;
	int *end = v + n;
	int aux;

	while(begin < end){
		aux = *end;
		*end = *begin;
		*begin = aux;
		begin++;
		end--;
	}
}
