class AccountExtreme extends Account{

    AccountExtreme(int id){
        this.id = id;
    }

    protected void credit(double valor){
        double bonus = (valor/100) * 0.2;
        balance += valor + bonus;
    }

    protected void debit(double valor){
        double refund = (valor/100) * 0.2;
        balance -= valor - refund;
    }
}