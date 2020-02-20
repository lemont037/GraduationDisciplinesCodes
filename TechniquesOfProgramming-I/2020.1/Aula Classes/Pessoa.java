class Pessoa {
	String nome;
	int idade;
	Pessoa conjuge;

	void casar(Pessoa p){
		if(this != p && this.conjuge == null && p.conjuge == null){
			this.conjuge = p;
			p.conjuge = this;
		}
		return;
	}
}