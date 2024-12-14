package week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(getSpacedString(log));
	}

	@Override
	public void error(String error) {
		System.out.println("ERROR: " + getSpacedString(error));
	}

	//private method to separate strings with spaces
	private String getSpacedString(String string) {
		StringBuilder newString = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			newString.append(string.charAt(i));
			if (i != string.length() - 1) {
				newString.append(" ");
			}
		}
		
		return newString.toString();
	}
}
