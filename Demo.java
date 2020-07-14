class Demo{  // VM
	public static void main(String[] args){	
		Zwevend v = new Vliegtuig();
		System.out.println(v.nummer);
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
	public ZweefVliegtuig wtf(){ return null; }
}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{
	String nummer =  "Zweefvliegtuig";
	public ZweefVliegtuig wtf(){return null;}
}