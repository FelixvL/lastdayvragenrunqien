
class Demo{    //   KO
	public static void main(String[] args){
		Weegschaal ws = new Weegschaal();
	

		ws.wegen(  int t -> t < 4  );


		System.out.println("Tafel");
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
