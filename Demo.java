
class Demo{    //   KU
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
	
		ws.wegen( jojoblablago  -> jojoblablago.length() < 4  );

		System.out.println("Strand");
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
