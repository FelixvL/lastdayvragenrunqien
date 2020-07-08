class Demo{  // HN
	final static public void main(String[] args){		
		new Middag().gaan(5);
	}
}
class Middag{
	int a = 35;
	void gaan(int a){
		System.out.println("int"+a);
	}
	void gaan(byte a){
		System.out.println("byte"+a);
	}
}




