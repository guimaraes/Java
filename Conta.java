class Conta{
	int numero;
	double saldo;
	int agencia;
	Pessoa titular; 

	void deposita(double valorASerDepositado){
		this.saldo += valorASerDepositado;
	}

	void saca(double valorASerSacado){
		if(this.saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}
	}
	
	void transfere(double valor, Conta destino){
		this.saldo -= valor;
		destino.saldo += valor;	

	}	
}
