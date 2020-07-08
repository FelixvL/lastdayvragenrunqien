class Demo{  // OF
	final static public void main(String[] args){	
		new Middag();
		new Avond();
		System.out.println("Fiets");
	}
}
class Middag extends Avond{
	Middag Middag(){
		System.out.println("middag gemaakt")
	}
}
class Avond{
	int a = 36;
	Avond(){
		System.out.println("avond gemaakt");
	}
}



