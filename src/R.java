public class R {
	public static class Text {
		public static String PageSplitter = "________________________________________________________________________";
		public static String Space = " ";
		public static String Tab = "	";
		public static String NewLine = "\r\n";
		public static String SignsStop = ".?!;";
		public static String SignsPause = ",:";
		public static String Dash = "- ";
		public static char[] vowels = new char[]{'à', 'ÿ', 'ó', 'þ', 'è', 'û', 'ý', 'å', 'î', '¸', 'e', 'y', 'u', 'i', 'o', 'a'};

	    public static boolean isVowel(char c)
	    {
	        c = Character.toLowerCase(c); 

	        for (char d : vowels)   
	        {
	            if (c == d)
	                return true;
	        }
	        return false;
	    }
	}
}
