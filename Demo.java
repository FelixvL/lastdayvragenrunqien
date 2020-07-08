class Demo{  // OP
	final static public void main(String[] args){	
		int a = 34;	
		a = new Middag().gaan(a++).a++;
		System.out.println("einde:"+a);
	}
}
class Middag{
	int a = 35;
	Avond gaan(int b){
		b = 24;
		System.out.println("int"+a++);
		return new Avond();
	}
}
class Avond{
	int a = 36;
}



