import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		String data = "";
		
		data = readFile("testdata.txt");
		
		Book b = new Book(StringPreproc.Prepare(data), 10);
		
		System.out.print("Enter count: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		int count = 0;
		try {
			count = Integer.parseInt(input);
		} catch (Exception ex) {
			System.out.print("Invalid value");
		}
		
		for(Page p : b.GetPages()) {
			for(Paragraph pr : p.GetParagraphs()) {
				for(Expression e : pr.GetExpressions()) {
					for(Lexem l : e.GetLexems()) {
						for(Word w : l.GetWords()) {
							String word = w.toString();
							if(word.length() == count && word.length() > 0) {
								if(!R.Text.isVowel(word.toCharArray()[0])) {
									w.Change("");
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(b);
		writeFile("testDataRs.txt", b.toString());
		
	}
	
	static String readFile(String path) {
		String r = "";
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			r = new String(encoded);
		} catch (Exception ex) {
			System.out.println("Invalid file or filename");
		}
		return r;
	}
	
	static void writeFile(String path, String data) {
		try {
			String str = data;
		    BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		    writer.write(str);
		     
		    writer.close();
		} catch (Exception ex) {
			System.out.println("Invalid file or filename");
		}
	}
	
}
