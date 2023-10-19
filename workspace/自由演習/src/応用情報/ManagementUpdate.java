package 応用情報;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManagementUpdate {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
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

					//日付取得
					LocalDateTime local = LocalDateTime.now();
					//LocalDateTime型をString型に変換
					DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
					String day = local.format(f);
					System.out.print("教科");
					String subject = sc.nextLine();
					
					System.out.print("時間");
					double hour = sc.nextDouble();
					
					// 送信処理
					// 送信すべきSQL文を準備 
						//③SQLのひな形を指定  番号、氏名、3科目の合計を合計の降順で抽出する 
					PreparedStatement pstmt = con.prepareStatement("insert into management values(?,?,?)");
					//値をセットする
					pstmt.setString(1,day);
					pstmt.setString(2,subject);
					pstmt.setDouble(3, hour);
					// 組み立て終えたSQL文をDBMSに送信する
					int r = pstmt.executeUpdate();//④検索系SQL文を送信
					if(r != 0) {
						System.out.println("       日付            教科    時間");
						System.out.printf("%s      %s     %.1f\n",day,subject,hour);
					}else {
						System.out.printf("データの格納に失敗しました");
					}
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
