class Demo{  // IG
	public static void main(String[] args){	
		hoi(null);
		System.out.println("obrigado");
	}
	static DRT hoi(DRT drt){
		return new NIM();
	}
}

abstract class NIM implements DRT{   // Koe

}

interface DRT{    // Eetbaar
	void lopen();
}
