import java.util.ArrayList;

public class Sistema{
    ArrayList<Account> accounts = new ArrayList<Account>();

    public void createAccountBasic(int id){
        Account aB = new AccountBasic(id);
        accounts.add(aB);
    }

    public void createAccountPlus(int id){
        Account aP = new AccountPlus(id);
        accounts.add(aP);
    }

    public void createAccountExtreme(int id){
        Account aE = new AccountExtreme(id);
        accounts.add(aE);
    }

    public double consultBalanceAccount(int id){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).id == id)
                return accounts.get(i).consultBalance();
        }
        return 0.0;
    }

    public void credit(int id, double valor){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).id == id)
                accounts.get(i).credit(valor);
        }
    }

    public void debit(int id, double valor){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).id == id)
                accounts.get(i).debit(valor);
        }
    }
}