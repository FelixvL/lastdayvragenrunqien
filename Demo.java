class Demo{  // ZA
	public static void main(String[] args){	
		int do = 34;
		RRR ab = new RRR(do);
		System.out.println(ab);

	}
}

class RRR{
	int sss = 4;
	
	RRR(){ 
		System.out.println("hoi is rrr");
	}
	RRR(int a){
		System.out.println("in SSS");
	}
}

class SSS extends RRR{
	int rrr = 5;
	SSS(int b){
		System.out.println("in RRR");
	}
}


