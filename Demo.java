class Demo{  // ZG
	public static void main(String[] args){	
		new Demo().groeien(new HBR()).groeien();

	}
	static HBR groeien(HBR abc){
		System.out.println("abc");
		return abc;
	}
	static void groeien(){
		System.out.println("def");
	}
}

class HBR{
	static void groeien(){
		System.out.println("ghi");
	}

}


