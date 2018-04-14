import java.util.ArrayList;
import java.util.List;

public class Lexem {
	private Sign sign = null;
	private List<Word> _words = null;
	
	public Lexem(String data, Sign sg) {
		sign = sg;
		_words = new ArrayList<Word>();
		
		
		String x = "";
		for(int i = 0; i < data.length(); i++) {
			Character sub = data.toCharArray()[i];
			
			if(R.Text.Space.indexOf(sub) < 0) {
				x += sub;
			} else {
				
				if(!x.isEmpty()) {
					_words.add(new Word(x));
				}
				x = "";
			}
		}
		
		if(!x.isEmpty()) {
			_words.add(new Word(x));
		}
		
	}
	
	@Override
	public String toString() {
		String r = "";
		for(Word s : _words) {
			r += s + " ";
		}
		return r.trim() + sign;
	}
	
	public List<Word> GetWords() {
		return _words;
	}

}
