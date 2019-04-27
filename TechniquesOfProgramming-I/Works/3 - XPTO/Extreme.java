protected class AccountBasic{

    protected void credit(double valor){
        bonus = valor * 0.0002;
        balance += valor + bonus;
    }

    protected void debit(double valor){
        refund = valor * 0.0002;
        balance -= valor - refund;
    }
}