
class Demo{    //   XE
	public static void main(String[] args) throws Exception{
		System.out.println("run");
		try{
			new Fiets().fietsen();
			System.out.println("fiets op slot zetten");
		}catch(FietsError fe){
			System.out.println("genezen");
		}catch(RaceFietsError rfe){
			System.out.println("supersnel genezen");
		}
		System.out.println("Still Alive");
	}
}
class Fiets{
	void fietsen() throws Exception{
		throw new RaceFietsError();
	}
}


class FietsError extends Exception{}
class RaceFietsError extends Exception{}