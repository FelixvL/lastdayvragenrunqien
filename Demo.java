
class Demo{    //   XG
	public static void main(String[] args){
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
	void fietsen() throws FietsError{
		throw new RaceFietsError();
	}
}
class RaceFiets extends Fiets{
	void fietsen(){
		System.out.println("fietsen in peloton");
	}
}


class FietsError extends Exception{}
class RaceFietsError extends FietsError{}