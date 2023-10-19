package 章末問題.第2;

public class Main {
	public static void main(String[]args) {
		String file;
		String folder;
	}
	public String method(String folder,String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder+=file;
	}
}
