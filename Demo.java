
class Demo{    //  LB
	public static void main(String[] args){
		DDD ddd = new DDD();
		ddd.eee(null);
		System.out.println("Goud");
	}
}
class DDD extends XXX{
	void eee(ZZZ zzz){
		System.out.println("hoi");			
	}
}
class XXX{
	void eee(TTT ttt){
		System.out.println("doei");				
	}
}
class RRR{

}

interface ZZZ{
	
}
interface TTT extends ZZZ{
}