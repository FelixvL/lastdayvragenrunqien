class Demo{  // VA
	public static void main(String[] args){	
		Vliegtuig v = new ZweefVliegtuig();
		System.out.println(v.wtf().nummer);
	}

}
interface Vliegend extends Zwevend{
	Zwevend wtf();
}
interface Zwevend{
	String nummer = "Zwevend";
}
class Vliegtuig implements Vliegend{
	String nummer =  "Vliegtuig";
	public Vliegend wtf(){ 
		System.out.println("Vliegtuig : "+ nummer);
		return new Vliegtuig(); 
	}
}
class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{
	public ZweefVliegtuig wtf(){
		System.out.println("ZweefVliegtuig : "+ nummer);
		return new ZweefVliegtuig();
	}
}