class Demo{  // WY
	public static void main(String[] args){	
		Brief brief = new Brief();
		brief.letter = new Letter("Y");
		System.out.println(brief.letter.letter);
	}
}
class Brief{
	Letter letter;

}
class Letter{
	String letter = "R";
	Letter(String letter){
		letter = letter;
	}
}
