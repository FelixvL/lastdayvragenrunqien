class Demo{  // VC
	public static void main(String[] args){	
		Vliegend v = new ZweefVliegtuig();
		System.out.println(v.wtf().nummer);
	}

}
interface Vliegend extends Zwevend{
	String nummer = "Vliegend";
	Zwevend wtf();
}
interface Zwevend{
	String nummer = "Zwevend";
}
class Vliegtuig implements Vliegend{
	String nummer =  "Vliegtuig";
	public Vliegtuig wtf(){ 
		System.out.println("Vliegtuig : "+ nummer);
		return new Vliegtuig(); 
	}
}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{
	String nummer =  "Zweefvliegtuig";
	public ZweefVliegtuig wtf(){
		System.out.println("ZweefVliegtuig : "+ nummer);
		return new ZweefVliegtuig();
	}
}