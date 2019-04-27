class AccountPlus extends Account{

    AccountPlus(int id){
        this.id = id;
    }

    protected void credit(double valor){
        double bonus = (valor/100) * 0.5;
        balance += valor + bonus;
    }

    protected void debit(double valor){
        balance -= valor;
    }
}