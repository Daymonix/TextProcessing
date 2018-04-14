
public class Word {
	private String wordData = "";
	
	public Word(String data) {
		wordData = data;
	}
	
	@Override
	public String toString() {
		return wordData;
	}
	
	public void Change(String newWord) {
		wordData = newWord;
	}
}
