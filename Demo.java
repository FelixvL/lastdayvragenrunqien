
class Demo{    //   KA
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
		int getal = 25;
		ws.wegen( getal -> getal + getal );
		System.out.println("Brons");
	}
}

class Weegschaal{
	void wegen(Voordelambda vdl){
		int print = vdl.checken(20);  //88
		System.out.println("print: "+ print);
	}
}

interface Voordelambda{
	int checken(int hup);
}
