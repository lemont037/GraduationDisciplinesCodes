class MainSets{
    public static void main(String args[]){
        //Creating sets to test
        Conjunto setNaturals = new Conjunto();
        setNaturals.create();
        Conjunto setEvens = new Conjunto();
        setEvens.create();
        Conjunto setOdds = new Conjunto();
        setOdds.create();
        Conjunto setPrimers = new Conjunto();
        setPrimers.create();
        
        //Settings the values
        //Naturals
        for(int i = 0; i < 10; i++){
            setNaturals.insert(i);
        }
        //Evens
        for(int i = 0; setEvens.qttElem < 5; i++){
            if(i%2 == 0)
                setEvens.insert(i);
        }
        //Odds
        for(int i = 0; setOdds.qttElem < 5; i++){
            if(i%2 != 0)
                setOdds.insert(i);
        }
        //Primers
        int divisors;
        for(int i = 1; setPrimers.qttElem < 10; i++){
            divisors = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0)
                    divisors++;
            }
            if(divisors == 2)
                setPrimers.insert(i);
        }

        //Printting sets
        setNaturals.print(0); 
        setEvens.print(0); 
        setOdds.print(0); 
        setPrimers.print(0); 

        //Tests
        //Primers set is subset of itself
        System.out.println(" >> Primers set is subset of itself:");

        if(setPrimers.isSubSet(setPrimers))
            System.out.println("Yes, setPrimers is subset of itself");
        else
            System.out.println("No, setPrimers isn't subset of itself");
        
        //If sets Evens, Odds and Primers are subsets of set Naturals
        System.out.println(" >> If sets Evens, Odds and Primers are subsets of set Naturals:");
        
        if(setEvens.isSubSet(setNaturals))
            System.out.println("Yes, set Evens is subset of set Naturals");
        else
            System.out.println("No, set Evens isn't subset of set Naturals");
        if(setOdds.isSubSet(setNaturals))
            System.out.println("Yes, set Odds is subset of set Naturals");
        else
            System.out.println("No, set Odds isn't subset of set Naturals");
        if(setPrimers.isSubSet(setNaturals))
            System.out.println("Yes, set Primers is subset of set Naturals");
        else
            System.out.println("No, set Primers isn't subset of set Naturals");
        
        //If the union of sets Evens and Odds is the set Naturals
        System.out.println(" >> If the union of sets Evens and Odds is the set Naturals:");
        
        Conjunto setUnionEvensOdds = new Conjunto();
        setUnionEvensOdds = setEvens.union(setOdds);

        if(setUnionEvensOdds.isSubSet(setNaturals) && setNaturals.isSubSet(setUnionEvensOdds))
            System.out.println("Yes, the union between Evens and Odds sets is equals to the set Naturals!");
        else
            System.out.println("No, the union between Evens and Odds sets isn't equals to the set Naturals!");
        
        //If the intersection between Naturals and Evens sets is void
        System.out.println(" >> If the intersection between Naturals and Evens sets is void:");
        
        Conjunto setInterNatEvens = new Conjunto();
        setInterNatEvens = setEvens.intersection(setOdds);
        
        if(setInterNatEvens.qttElem == 0)
            System.out.println("Yes, the intersection is void");
        else
            System.out.println("No, the intersection isn't void");

        //Difference between Naturals and Evens sets
        System.out.println(" >> Difference between Naturals and Evens sets");

        Conjunto setDifeNatEvens = new Conjunto();
        setDifeNatEvens = setNaturals.difference(setEvens);
        setDifeNatEvens.print(0); 

        //Catersian Product of Evens and Odds
        System.out.println(" >> Catersian Product of Evens and Odds:");
        Conjunto setProduct = new Conjunto();
        setProduct = setEvens.product(setOdds);
        setProduct.print(0);

        //Set Power of Evens
        System.out.println(" >> Set Power of Evens");
        Conjunto setPower = new Conjunto();
        setPower = setEvens.setPower();
        System.out.println("Quantity of subsets: "+setPower.qttElem);
        setPower.print(0);
    }
}