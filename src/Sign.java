
public class Sign {
	private Character signData = null;
	
	public Sign(Character data) {
		signData = data;
	}
	
	@Override
	public String toString() {
		return signData.toString();
	}
}
