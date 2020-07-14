class Demo{  // LO
	public static void main(String[] args){	
		Brief brief = new Brief();
		brief.letter = new Letter("Y");
		System.out.println(schrijven(brief));
	}
	static String schrijven(Brief brief){
		return brief.letter;
	}
}
class Brief{
	Letter letter;

}
class Letter{
	String letter = "R";
	Letter(String letter){
		this.letter = letter;
	}
}
