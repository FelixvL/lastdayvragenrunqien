class Demo{  // YU
	public static void main(String[] args){	
		System.out.println( new SSS().rrr );
	}
}

class RRR{
	int sss = 4;
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


