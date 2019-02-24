
bool sao_iguais(const char *r, const char *s){
	bool iguais = false;

	for(;*r == *s and *r != '\0' and *s != '\0';){
		r++;
		s++;
	}
	
	if(*r != *s)
		return iguais;

	if(*r != '\0' or *s != '\0')
		iguais = false;
	else
		iguais = true;
	
	return iguais;
}
