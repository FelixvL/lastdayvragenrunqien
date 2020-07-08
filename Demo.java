class Demo{  // OR
	final static public void main(String[] args){	
		int a = 34;	
		new Middag().gaan(a);
		System.out.println("einde:"+a);
	}
}
class Middag{
	int a = 35;
	Avond gaan(int b){
		b = 24;
		System.out.println("int"+a);
		return null;
	}
}
class Avond{
	int a = 36;
}



