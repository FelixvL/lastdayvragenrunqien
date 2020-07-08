class Demo{  // KM
	final static public void main(String[] args){	
		int a = 34;	
		new Middag().gaan(a);
		System.out.println("einde:"+a);
	}
}
class Middag{
	int a = 35;
	void gaan(int b){
		b = 24;
		System.out.println("int"+a);
	}
}




