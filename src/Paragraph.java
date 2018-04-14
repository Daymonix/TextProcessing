import java.util.ArrayList;
import java.util.List;

public class Paragraph {
	private List<Expression> _expressions = null;
	
	public Paragraph(String data) {
		_expressions = new ArrayList<Expression>();

		String x = "";
		Character sub = ' ';
		for(int i = 0; i < data.length(); i++) {
			sub = data.toCharArray()[i];
			if(R.Text.SignsStop.indexOf(sub) < 0) {
				x += sub;
			} else {
				if(!x.isEmpty()) {
					_expressions.add(new Expression(x, new Sign(sub)));
				}
				x = "";
			}
		}
		
		if(!x.isEmpty()) {
			_expressions.add(new Expression(x, new Sign(sub)));
		}
	}
	
	@Override
	public String toString() {
		String r = "";
		for(Expression s : _expressions) {
			r += s + " ";
		}
		return r.trim();
	}
	
	public List<Expression> GetExpressions() {
		return _expressions;
	}

}
