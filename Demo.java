class Demo{  // RT
	public static void main(String[] args){	
		int r = 0b120;   
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


