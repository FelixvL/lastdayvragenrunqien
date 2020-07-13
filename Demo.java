class Demo{  // BX

	public static void main(String[] args){	
		Bot bot = new Bot();
		System.out.println( bot.bereken() );
	}

}

class Bot{
	int kracht = bereken();
	public int bereken(){
		System.out.println("bereken");
		return 6;
	}
	Bot(){
		System.out.println("in Bot");
	}
}



