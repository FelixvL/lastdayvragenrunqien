class Demo{  // MI
	public static void main(String[] args){	
		hoi(null).lopen();
		System.out.println("obrigado");
	}
	static DRT hoi(DRT drt){
		return new NIM();
	}
}

class NIM implements DRT{   
	void lopen(){
		System.out.println("lopen in NIM");
	}
}

interface DRT{    
	void lopen();
}
