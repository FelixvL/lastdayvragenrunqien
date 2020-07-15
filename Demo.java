
class Demo{    //   KY
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
		int getal = 25;
		ws.wegen( y -> y.equals("of morgen") + "getal" );
		System.out.println("Brons");
	}
}

class Weegschaal{
	void wegen(Voordelambda vdl){
		String print = vdl.checken("vandaag");
		System.out.println("print: "+ print);
	}
}

interface Voordelambda{
	String checken(String hup);
}
