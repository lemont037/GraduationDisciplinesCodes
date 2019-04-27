class AccountBasic extends Account{

    AccountBasic(int id){
        this.id = id;
    }

    protected void credit(double valor){
        balance += valor;
    }

    protected void debit(double valor){
        balance -= valor;
    }
}