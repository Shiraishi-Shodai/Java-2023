package 第2章.Optionalクラス;

import java.util.Optional;

public class Practice74 {
	public static Optional<String> checkName(String familyName, String personalName) {
		String r;
		if (familyName == null || familyName == "") {
			r = null;
		} else if (personalName == null || personalName == "") {
			r = null;
		} else {
			r = familyName + personalName;//④姓と名を結合する;
		}
		return Optional.ofNullable(r);//⑤インスタンスを生成して返す
	}

	public static void main(String[] args) {
		Optional<String> s1 = checkName("河原", "太郎");
		System.out.println("1." + s1.orElse("姓・名どちらかが無効です"));
		
		Optional<String> s2 = checkName("", "太郎");
		System.out.println("2." + s2.orElse("姓・名どちらかが無効です"));
		
		Optional<String> s3 = checkName("河原", "");
		System.out.println("3." + s3.orElse("姓・名どちらかが無効です"));
		
		Optional<String> s4 = checkName("", "");
		System.out.println("4." + s4.orElse("姓・名どちらかが無効です"));
	}
}
