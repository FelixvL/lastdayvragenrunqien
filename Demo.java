
class Demo{    //   KR
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
	
		ws.wegen( ()  -> 5 < 4  );

		System.out.println("Tafel");
	}
}

class Weegschaal{
	void wegen(Voordelambda vdl){
		boolean print = vdl.checken();
		System.out.println("print: "+ print);
	}
}

interface Voordelambda{
	boolean checken();
}
