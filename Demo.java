class Demo{  // JH
	public static void main(String[] args){	
		char r = 88;
		new HBR().groeien(r++);
		new HBR().groeien(r++);

	}
}

class HBR{
	 void groeien(char fer){
		System.out.println(fer);
	}
	void groeien(int fer){
		System.out.println(fer);
	}

}


