
class Demo{    //   UX
	public static void main(String[] args){
		System.out.println("run");
		new Fiets().fietsen();
	}
}
class Fiets{
	void fietsen() throws Exception{
		throw new FietsError();
	}
}


class FietsError extends Exception{}