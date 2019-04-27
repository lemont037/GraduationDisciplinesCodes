abstract class Account{
    protected String type;
    protected int id;
    protected double balance;

    protected double consultBalance(){
        return balance;
    }

    protected abstract void credit(double valor);

    protected abstract void debit(double valor);

    public String toString(){
        return "Account Type: "+type+"\n"
              +"ID: "+id+"\n"
              +"Balance: R$"+balance+"\n";
    }
}