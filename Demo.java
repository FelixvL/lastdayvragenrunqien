class Demo{  // NQ
	public static void main(String[] args){	
		DRT drt = new NIM();
		drt.lopen();
		System.out.println("regenachtig");
	}
	static DRT hoi(DRT drt){
		return new NIM();
	}
}

class NIM implements DRT{   
	public void lopen(){
		System.out.println("lopen in NIM");
	}
}

interface DRT{    
	void lopen() throws Exception;
}
