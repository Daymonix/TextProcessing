import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<Page> _pages = null;
	
	public Book(String data, int pageLen) {
		
		if(pageLen > 0 && data.length() > 0) {
			_pages = new ArrayList<Page>();
			
			int p = (int) (data.length() / pageLen) + 1;
			
			for(int i = 0; i < p; i++) {
				int start = i * pageLen;
				int end = start + pageLen;
				if(end > data.length()) {
					end = data.length();
				}
				_pages.add(new Page(data.substring(start, end)));
			}
		}
	}
	
	@Override
	public String toString() {
		String r = "";
		for(Page s : _pages) {
			r += s + R.Text.NewLine + R.Text.PageSplitter + R.Text.NewLine;
		}
		return r;
	}
	
	public List<Page> GetPages() {
		return _pages;
	}
	
}
