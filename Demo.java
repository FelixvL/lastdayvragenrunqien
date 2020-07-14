
class Demo{    //   UJ
	public static void main(String[] args) throws Exception{
		System.out.println("run");
		try{
		new Fiets().fietsen();
		}catch(FietsError fe){
			System.out.println("genezen");
		}
		System.out.println("Still Alive");
	}
}
class Fiets{
	void fietsen() throws Exception{
		throw new FietsError();
	}
}


class FietsError extends Exception{}