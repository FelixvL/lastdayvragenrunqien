
class Demo{    //   UT
	public static void main(String[] args){
		System.out.println("run");
	}
}
class Fiets{
	void fietsen() throws Exception{
		throw new FietsError();
	}
}


class FietsError extends Exception{}