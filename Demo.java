
class Demo{    //  LC
	public static void main(String[] args){
		DDD ddd = new DDD();
		ddd.eee(23);
		System.out.println("Steen");
	}
}
class DDD extends XXX{   
	void eee(int zzz){
		System.out.println("hoi");			
	}
	void eee(Integer zzz){
		System.out.println("doei");			
	}
}




















class XXX{			// Eten
	void eee(TTT ttt){
		System.out.println("doei");				
	}
}
class RRR{

}

interface ZZZ{  // Dier
	
}
interface TTT extends ZZZ{  // Hond
}