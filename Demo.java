class Demo{  // RE
	public static void main(String[] args){	
		float r = 56;   
		new HBR().groeien(r);

	}
}

class HBR{
	 void groeien(char fer){
		throw new RuntimeException();
	}
	void groeien(double fer){
		System.out.println(fer);
	}

}


