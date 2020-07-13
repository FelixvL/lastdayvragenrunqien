import java.util.Scanner;

class Demo{  // AZ
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){	
		NIM drt;
		String invoer = scanner.nextLine();
		if(invoer.equals("a")) {
			System.out.println("je toetste a");
			drt = new MIN();
		}else {
			System.out.println("je toetste helemaal geen a");
			drt = new NIM();
		}
		drt.a(drt.a);
		System.out.println("regenachtig");
	}
	static DRT hoi(DRT drt){
		return new NIM();
	}
}

class NIM implements DRT{
	int a = 8;
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