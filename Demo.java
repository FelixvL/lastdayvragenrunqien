
class Demo{    //   KX
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
		int getal = 25;
		ws.wegen( y -> y.equals(" of morgen ")  );
		System.out.println("Ijzer");
	}
}

class Weegschaal{
	void wegen(Voordelambda vdl){
		boolean print = vdl.checken("vandaag");
		System.out.println("print: "+ print);
	}
}

interface Voordelambda{
	boolean checken(String hup);
}
