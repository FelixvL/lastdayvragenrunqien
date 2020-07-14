class Demo{  // VX
	public static void main(String[] args){	
		Vliegend v = new ZweefVliegtuig();
		System.out.println("Adieu");
	}

}
interface Vliegend{

}

class Vliegtuig implements Vliegend{

}


class ZweefVliegtuig extends Vliegtuig implements Vliegend{

}