class Demo{  // BB
	public static void main(String[] args){	
		Bot bot = new Bot("Duitsland");
		bot.kracht = 8;
		Bot bot2 = new Bot("Nederland");
	}

}

class Bot{
	static int kracht = 4;
	Bot(String a){
		System.out.println("in Bot Ervoor");
		this();
		System.out.println(a);
	}
	Bot(){
		System.out.println("in Bot" + kracht);
	}
}



