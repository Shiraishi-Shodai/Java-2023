package 応用情報;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[]args) {
		// 事前準備（JAR配置を含む）
				try {
					//①JDBCドライバの指定
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					throw new IllegalStateException("ドライバのロードに失敗しました");
				}
				/* : */
				Connection con = null;
				try {
					// データベースの接続
					con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/data4","root","pathSQL");//②URL,ID,パスワードを指定してデータベースに接続する

					// 送信処理
					// 送信すべきSQL文を準備 
						//③SQLのひな形を指定  番号、氏名、3科目の合計を合計の降順で抽出する 
					PreparedStatement pstmt = con.prepareStatement("select * from study");
						//  3科目の合計には列見出し(列別名)をつけておく
					// 組み立て終えたSQL文をDBMSに送信する
					ResultSet rs = pstmt.executeQuery();//④検索系SQL文を送信
					// 結果表を処理する
					System.out.println("teacher");
					while (rs.next()) {
						System.out.printf("%s\n",rs.getString("teacher"));
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
