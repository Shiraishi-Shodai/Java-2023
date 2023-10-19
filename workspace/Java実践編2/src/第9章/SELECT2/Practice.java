package 第9章.SELECT2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		// 事前準備（JAR配置を含む）
		try {
			//①JDBCドライバの指定
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}

		Connection con = null;
		try {
			// データベースの接続
			con = DriverManager.getConnection("jdbc:h2:~/testdb","dbuser","adm");//②URL,ID,パスワードを指定してデータベースに接続する

			// 送信処理
			// 送信すべきSQL文のひな形を準備
			PreparedStatement pstmt = null;
			Scanner sc = new Scanner(System.in);
			System.out.println("表示内容を選択してください。");
			System.out.print("（1:JAVA平均点, 2:SQL平均点, 3:HTML平均点）：");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				//③SQLを指定（java点数の平均点を求めるSQL　平均点には列見出し（列別名）をつける）
				pstmt = con.prepareStatement("SELECT AVG(JAVA) AS 平均 FROM SCORE");
				System.out.println("Java平均点");
				break;
			case 2:
				//④SQLを指定（SQL点数の平均点を求めるSQL　平均点には列見出し（列別名）をつける）
				pstmt = con.prepareStatement("SELECT AVG(SQL) AS 平均 FROM SCORE");
				System.out.println("SQL平均点");
				break;
			case 3:
				//⑤SQLを指定（HTML点数の平均点を求めるSQL　平均点には列見出し（列別名）をつける）
				pstmt = con.prepareStatement("SELECT AVG(HTML) AS 平均 FROM SCORE");
				System.out.println("HTML平均点");
				break;
			default:
				//⑥SQLを指定（3科目合計の平均点を求めるSQL　平均点には列見出し（列別名）をつける）
				pstmt = con.prepareStatement("SELECT AVG(JAVA+SQL+HTML) AS 平均 FROM SCORE");
				System.out.println("３科目合計平均点");
			}

			// 組み立て終えたSQL文をDBMSに送信する
			ResultSet rs = pstmt.executeQuery();//検索系SQLを実行する
			// 結果表を処理する
			if (rs.next()) {
				System.out.println(rs.getDouble("平均"));
			} else {
				System.out.println("求めることが出来ませんでした");
			}

			//⑨ResultSetを閉じる
			rs.close();
			//⑩ひな形を閉じる
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベース接続の切断
			if (con != null) {
				try {
					//⑪接続を切断する
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

