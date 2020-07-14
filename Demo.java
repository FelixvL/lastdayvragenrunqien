class Demo{  // VK
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
	public ZweefVliegtuig wtf(){ return null; }
}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{
	public Vliegtuig wtf(){return null;}
}