import java.util.ArrayList;
import java.util.List;

public class Page {
	private List<Paragraph> _paragraphs = null;
	
	public Page(String data) {
		_paragraphs = new ArrayList<Paragraph>();
		
		String[] lines = data.split(R.Text.NewLine);
		
		String par = "";
		for(String s : lines) {
			if(!s.isEmpty()) {
				par += s + R.Text.NewLine;
			} else {
				if(!par.isEmpty()) {
					_paragraphs.add(new Paragraph(par));
					par = "";
				}
			}
		}
		if(!par.isEmpty()) {
			_paragraphs.add(new Paragraph(par));
		}
	}
	
	@Override
	public String toString() {
		String r = "";
		for(Paragraph s : _paragraphs) {
			r += R.Text.Space + s + R.Text.NewLine + R.Text.NewLine;
		}
		return r;
	}
	
	public List<Paragraph> GetParagraphs() {
		return _paragraphs;
	}
}
