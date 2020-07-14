
class Demo{    //   UR
	public static void main(String[] args){
		System.out.println("run");
	}
}
class Fiets{
	void fietsen(){
		throw new ErroR();
	}
}


class ErroR extends Exception{}