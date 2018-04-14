
public class StringPreproc {
	public static String Prepare(String data) {
		data = data.replace(R.Text.Tab, R.Text.Space);
		String complicatedSpace = R.Text.Space + R.Text.Space;
		while(data.indexOf(complicatedSpace) > -1) {
			data = data.replace(complicatedSpace, R.Text.Space);
		}
		return data;
	}
}
