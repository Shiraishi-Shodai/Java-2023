package Practice89;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice89{
	public static void main(String[] args){
		// 事前準備（JAR配置を含む）
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}
		/* : */
		Connection con = null;
		try {
			// データベースの接続
			 con = DriverManager.getConnection("jdbc:h2:~/testdb","dbuser","dbpass");
			// 送信すべきSQL文のひな形を準備
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO SCORE VALUES(?,?,?,?,?)");

			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);

			while (true) {
				System.out.println("成績情報を入力してください");
				System.out.println("（番号に0を入力するとシステム終了）");
				System.out.print("番号    ：");
				int no = sc1.nextInt();
				if (no == 0) {
					System.out.print("終了します");
					break;
				}
				System.out.print("氏名    ：");
				String name = sc2.nextLine();
				System.out.print("Java得点：");
				int java = sc1.nextInt();
				System.out.print("SQL得点 ：");
				int sql = sc1.nextInt();
				System.out.print("HTML得点：");
				int html = sc1.nextInt();

				// 送信処理
				// ひな形に値を流し込みSQL文を組み立てる
				//④ひな形に値(出席番号,氏名,java点数,SQL点数,HTML点数を流し込む)
				pstmt.setInt(1,no);
				pstmt.setString(2,name);
				pstmt.setInt(3,java);
				pstmt.setInt(4,sql);
				pstmt.setInt(5,html);
				// 組み立て終えたSQL文をDBMSに送信する
				int r = pstmt.executeUpdate();//⑤更新系SQL文を送信
				// 処理結果を判定する
				if (r != 0) {
					System.out.printf("番号:%d 氏名:%sを登録しました", no, name);
				} else {
					System.out.println("登録できませんでした");
				}
			}

			pstmt.close(); //⑥ひな形を閉じる

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベース接続の切断
			if (con != null) {
				try {
					//⑦接続を切断する
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


