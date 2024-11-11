package JavaWord;

public class WordOne {
	private String kWord = null;
	private String eWord = null;
	
	public void setkWord(String kWord) {
		this.kWord = kWord;
	}
	public void seteWord(String eWord) {
		this.eWord = eWord;
	}
	
	public String getkWord() {
		return kWord;
	}
	public String geteWord() {
		return eWord;
	}
	
	public void view() {
		System.out.println("한글 :  " + getkWord() + "   영어 : " + geteWord());
	}
}
