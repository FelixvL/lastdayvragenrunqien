class Demo{  // AZ
	public static void main(String[] args){	
		NIM drt = new MIN();
		drt.a(drt.a);
		System.out.println("regenachtig");
	}
	static DRT hoi(DRT drt){
		return new NIM();
	}
}

class NIM implements DRT{
	int a = 2;
	void a(int a){
		System.out.println("a"+a);
	}   
	public void lopen(){
		System.out.println("lopen in NIM");
	}
}
class MIN extends NIM{
	int a = 3;
	void a(int a){
		System.out.println("a2"+a);
	}   

}
interface DRT{    
	void lopen() throws Exception;
}
