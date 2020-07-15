
class Demo{    //  LA
	public static void main(String[] args){
		DDD ddd = new DDD();
		ddd.eee(  x -> x.xxx() );
		System.out.println("Nikkel");
	}
}
class DDD{
	void eee(ZZZ zzz){
		System.out.println( zzz.ggg( new XXX() ) );	
	}
}
class XXX{
	RRR xxx(){
		return null;
	}
}
class RRR{

}

interface ZZZ{
	RRR ggg(XXX xxx);
}