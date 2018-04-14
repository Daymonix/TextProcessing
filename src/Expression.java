import java.util.ArrayList;
import java.util.List;

public class Expression {
	private List<Lexem> _lexems= null;
	private Sign sign = null;
	
	public Expression(String data, Sign sg) {
		sign = sg;
		_lexems = new ArrayList<Lexem>();
		
		String x = "";
		Character sub = ' ';
		for(int i = 0; i < data.length(); i++) {
			sub = data.toCharArray()[i];
			
			if(R.Text.SignsPause.indexOf(sub) < 0) {
				x += sub;
			} else {
				
				if(!x.isEmpty()) {
					_lexems.add(new Lexem(x, new Sign(sub)));
				}
				x = "";
				
			}
		}
		
		if(!x.isEmpty()) {
			_lexems.add(new Lexem(x, new Sign(sub)));
		}
	}
	
	@Override
	public String toString() {
		String r = "";
		for(Lexem s : _lexems) {
			r += s + " ";
		}
		return r.trim() + sign;
	}
	
	public List<Lexem> GetLexems() {
		return _lexems;
	}

}
