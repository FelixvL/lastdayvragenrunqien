
class Demo{    //   XM
	public static void main(String[] args){
		System.out.println("run");
		try{
			Fiets f = new RaceFiets();
			f.fietsen();
			System.out.println("fiets op slot zetten");
		}catch(RaceFietsError rfe){
			System.out.println("supersnel genezen");
		}catch(FietsError fe){
			System.out.println("genezen");
		}
		System.out.println("Still Alive");
	}
}
class Fiets{
	int snelheid = 23;
	void fietsen() throws FietsError{
		throw new RaceFietsError();
	}
}
class RaceFiets extends Fiets{
	int fietsen(int snelheid){
		System.out.println("fietsen in peloton" + snelheid);
		return snelheid;
	}
}


class FietsError extends Exception{}
class RaceFietsError extends FietsError{}