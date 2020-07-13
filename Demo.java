class Demo{  // BM
	public static void main(String[] args){	
		Bot bot = new Bot();
		bot.kracht = 8;
		System.out.println( bot.bereken() );
	}

}

class Bot{
	static int kracht = 4;
	public int bereken(){
		System.out.println("bereken"+this.kracht);
		return 6;
	}
	Bot(String a){
		this();
		System.out.println("in Bot String");
	}
	Bot(){
		System.out.println("in Bot");
	}
}



