abstract class Count{
    protected int id;
    private double balance;

    protected double balance(){
        return balance;
    }

    abstract void credit(double valor);

    abstract void debit(double valor);
}