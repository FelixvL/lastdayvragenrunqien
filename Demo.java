class Demo{  // VP
	public static void main(String[] args){	
		Zwevend v = new Vliegtuig();
		System.out.println("Doei");
	}

}
interface Vliegend extends Zwevend{
	Zwevend wtf();
}
interface Zwevend{
}
class Vliegtuig implements Vliegend{
	public ZweefVliegtuig wtf(){}
}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{

}