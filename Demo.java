class Demo{  // WZ
	public static void main(String[] args){	
		Brief brief = new Brief();
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
