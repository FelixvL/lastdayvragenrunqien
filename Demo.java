
class Demo{    //   KL
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
	
		ws.wegen(  t -> t < 3   );

	}
}





class Weegschaal{
	void wegen(Voordelambda vdl){
		boolean print = vdl.checken(5);
		System.out.println("print: "+ print);
	}
}





interface Voordelambda{
	boolean checken(int vt);
}
