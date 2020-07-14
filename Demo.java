class Demo{  // VV
	public static void main(String[] args){	
		Zwevend v = new Vliegtuig();
		System.out.println("Au revoir");
	}

}
interface Vliegend{

}
interface Zwevend extends Vliegend{}
class Vliegtuig implements Vliegend{

}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{

}