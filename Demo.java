class Demo{  // FM
	public static void main(String[] args){	
		int a = 35;
		try{
		if(a == 35)
			a = 37;
			if(a == 36)
				System.out.println("q");
			else
				throw new Error();
		System.out.println("r");
		System.out.println("s");
		}finally{
			System.out.println("go"+a);
		}
		System.out.println("no go "+ a);
	}
}
