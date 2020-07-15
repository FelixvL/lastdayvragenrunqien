
class Demo{    //   KV
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
		System.out.println("Meertje");
		ws.wegen( j  -> {System.out.println("inlamda"+j); return j.length() < 4;}  );

		System.out.println("Strand");
	}
}

class Weegschaal{
	void wegen(Voordelambda vdl){
		System.out.println("Zee");
		boolean print = vdl.checken("vandaag");
		System.out.println("print: "+ print);
	}
}

interface Voordelambda{
	boolean checken(String hup);
}
