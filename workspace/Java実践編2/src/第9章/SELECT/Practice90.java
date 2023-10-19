package 第9章.SELECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Practice90 {
	public static void main(String[] args) {
		// 事前準備（JAR配置を含む）
		try {
			//①JDBCドライバの指定
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}
		/* : */
		Connection con = null;
		try {
			// データベースの接続
			con = DriverManager.getConnection("jdbc:h2:~/testdb","dbuser","dbpass");//②URL,ID,パスワードを指定してデータベースに接続する

			// 送信処理
			// 送信すべきSQL文を準備 
				//③SQLのひな形を指定  番号、氏名、3科目の合計を合計の降順で抽出する 
			PreparedStatement pstmt = con.prepareStatement("select NO,NAME,(JAVA+SQL+HTML) as 合計 from score order by 合計 desc");
				//  3科目の合計には列見出し(列別名)をつけておく
			// 組み立て終えたSQL文をDBMSに送信する
			ResultSet rs = pstmt.executeQuery();//④検索系SQL文を送信
			// 結果表を処理する
			System.out.println("番号 氏名                  合計");
			while (rs.next()) {
				System.out.printf("%d   %s  %d \n",rs.getInt("NO"),rs.getString("NAME"),rs.getInt("合計") );
			}
			//⑦ResultSetを閉じる
			rs.close();
			//⑧ひな形を閉じる
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベース接続の切断
			if (con != null) {
				try {
					//⑨接続を切断する
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

