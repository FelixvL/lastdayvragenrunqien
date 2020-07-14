class Demo{  // LK
	public static void main(String[] args){	
		Brief brief = new Brief();
		brief.letter = new Letter("Y");
		System.out.println(schrijven(brief, new Brief()));
		System.out.println(brief.letter.letter);
	}
	static String schrijven(Brief brief, Brief feirb){
		feirb.letter = new Letter("Z");
		brief = feirb;
		return brief.letter.letter;
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
