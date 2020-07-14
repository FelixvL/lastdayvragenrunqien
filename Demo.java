class Demo{  // WX
	public static void main(String[] args){	
		Brief brief = new Brief("R");
		System.out.println(brief.letter.letter);
	}
}
class Brief{
	Letter letter;

}
class Letter{
	String letter = "T";
	Letter(String letter){
		letter = letter;
	}
}
