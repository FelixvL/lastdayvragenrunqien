class Demo{  // AI
	public static void main(String[] args){	
		DRT drt = new MIN();
		drt.a(drt.a);
		System.out.println("wolkenachtig");
	}
	static DRT hoi(DRT drt){
		return new NIM();
	}
}

class NIM implements DRT{
	int a = 2;
	public void a(int a){
		System.out.println("a"+a);
	}   

}
class MIN extends NIM{
	int a = 3;
	public void a(int a){
		System.out.println("a2"+a);
		a = 8;
		System.out.println("a2"+a);
	}   

}
interface DRT{ 
	int a = 7;   
	void a() throws Exception;
}
