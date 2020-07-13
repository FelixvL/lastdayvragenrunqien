class Demo{  // BC
	Demo(){
		System.out.println("Bot");
	}
	public static void main(String[] args){	
		Bot bot = new Bot("Duitsland");
		System.out.println(bot2.kracht[2]);
	}

}

class Bot extends Demo{
	static int[] kracht = new int[];
	Bot(String a){
		this();
		System.out.println("in Bot Ervoor");
		System.out.println(a);
	}
	Bot(){
		System.out.println("in Bot" + kracht);
		kracht = new int[]{5,8,9};
	}
}



