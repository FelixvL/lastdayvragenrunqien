class Demo{  // VW
	public static void main(String[] args){	
		Zwevend v = new ZweefVliegtuig();
		System.out.println("Adieu");
	}

}
interface Vliegend{

}
interface Zwevend{}
class Vliegtuig implements Vliegend{

}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{

}