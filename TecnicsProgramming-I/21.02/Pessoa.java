class Pessoa{
	String nome;
	Pessoa conjuge;
	
	void setNome(String nome){
		this.nome = nome;
	}

	boolean isMarried(){
		return (conjuge != null);
	}

	void casar(Pessoa p){
		if(!this.isMarried() && !p.isMarried()){
			this.conjuge = p;
			p.conjuge = this;
		}else{
			System.out.println("Deuteronomio 5:21 -  Nao cobicaras a mulher do proximo!");
		}
	}
}
