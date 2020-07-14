class Demo{  // VN
	public static void main(String[] args){	
		Zwevend v = new Vliegtuig();
		System.out.println("Doei");
	}

}
interface Vliegend extends Zwevend{
	String nummer;
	Zwevend wtf();
}
interface Zwevend{
	String nummer;
}
class Vliegtuig implements Vliegend{
	String nummer;
	public ZweefVliegtuig wtf(){ return null; }
}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{
	String nummer;
	public ZweefVliegtuig wtf(){return null;}
}