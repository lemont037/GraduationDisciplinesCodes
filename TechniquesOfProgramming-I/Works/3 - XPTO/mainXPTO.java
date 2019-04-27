class mainXPTO extends Sistema{
    public static void main (String args[]) {
        Sistema s = new Sistema();
        s.createAccountBasic(1);
        s.createAccountPlus(2);
        s.createAccountExtreme(3);
        
        for(int i = 1; i<=3; i++) s.credit(i,1000);
        for(int i = 1; i<=3; i++) s.debit(i,10);
        
        //todas as igualdades devem ser verdadeiras
        System.out.println(s.consultBalanceAccount(1));
        if(s.consultBalanceAccount(1) == 990){
            System.out.println("Saldo correto");
        }else{
            System.out.println("Saldo incorreto");
        }
        System.out.println(s.consultBalanceAccount(2));
        if(s.consultBalanceAccount(2) == 995)
            System.out.println("Saldo correto");
        else
            System.out.println("Saldo incorreto");
            System.out.println(s.consultBalanceAccount(3));
        if(s.consultBalanceAccount(3) == 992.02)
            System.out.println("Saldo correto");
        else
            System.out.println("Saldo incorreto");
        }
}