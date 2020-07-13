class Demo{  // RT
	public static void main(String[] args){	
		System.out.println("Start");
		Bot bot = new Bot();
		Bot bot2 = new Bot();
		bot2.kracht = 4;
		System.out.println(bot.kracht);
		System.out.println("Stop");
	}
}

class Bot{
	static int kracht = bereken();
	public int bereken(){
		System.out.println("bereken");
		return 6;
	}
}



