class Demo{  // LS
	public static void main(String[] args){	
		Brief brief = new Brief();
		brief.letter = new Letter("Y");
		System.out.println(schrijven(brief));
		System.out.println(brief.letter.letter);
	}
	static Letter schrijven(Brief brief){
		brief.letter = new Letter("Z");
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
