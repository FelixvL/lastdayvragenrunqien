class Demo{  // ZH
	public static void main(String[] args){	
		new Demo().groeien(new HBR()).groeien();

	}
	 HBR groeien(HBR abc){
		System.out.println("abc");
		return abc;
	}
	 void groeien(){
		System.out.println("def");
	}
}

class HBR{
	 void groeien(){
		System.out.println("ghi");
	}

}


