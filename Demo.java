class Demo{  // NB
	public static void main(String[] args){	
		System.out.println("zonnig");
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
