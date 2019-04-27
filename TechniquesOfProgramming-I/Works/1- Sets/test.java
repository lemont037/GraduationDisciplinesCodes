class test{
    public static void main(String args[]){
            int i = 24;
            int vectorSize = 10;
			char binary[] = new char[vectorSize];
			char bin[] = Integer.toBinaryString(i).toCharArray();
			
			int pos = vectorSize - bin.length;
			int posAux = 0;
			for(int index = 0; index < vectorSize; index++){
				if(index < pos)
					binary[index] = '0';
				else
					binary[index] = bin[posAux++];
            }
            
            System.out.println(binary);
    }
}