class Demo{  // VG
	public static void main(String[] args){	
		Zwevend v = new Vliegtuig();
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
	public Vliegtuig wtf(){ return new Vliegtuig(); }
}


class ZweefVliegtuig extends Vliegtuig implements Vliegend, Zwevend{
	String nummer =  "Zweefvliegtuig";
	public ZweefVliegtuig wtf(){return null;}
}