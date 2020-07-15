
class Demo{    //   KZ
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
		int getal = 25;
		ws.wegen( y -> y.charAt(3) + getal );
		System.out.println("Brons");
	}
}

class Weegschaal{
	void wegen(Voordelambda vdl){
		int print = vdl.checken("XXXXXXXXXXX");  //88
		System.out.println("print: "+ print);
	}
}

interface Voordelambda{
	int checken(String hup);
}
