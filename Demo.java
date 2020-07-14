class Demo{  // VT
	public static void main(String[] args){	
		Zwevend v = new Vliegtuig();
		System.out.println("Au revoir");
	}

}
interface Vliegend extends Zwevend{

}
interface Zwevend{}
class Vliegtuig implements Vliegend{

}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{

}