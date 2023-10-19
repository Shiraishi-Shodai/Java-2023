package 第9章.Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice92 {
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
			// 送信すべきSQL文のひな形を準備
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO CUSTOMER VALUES(?,?,?,?)");//③SQLのひな型を指定（CUSTOMERテーブルに挿入するSQL）

			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);

			System.out.println("顧客情報を入力してください");
			System.out.print("番号    ：");
			int no = sc1.nextInt();
			System.out.print("氏名    ：");
			String name = sc2.nextLine();
			System.out.print("住所    ：");
			String adr = sc2.nextLine();
			//④現在日時を取得し、long型に変換した値をコンストラクタに指定してTimestamp型のインスタンスを生成する。
			Date d = new Date();
			long l = d.getTime();
			Timestamp t = new Timestamp(l);
			// 送信処理
			//⑤ひな形に値(番号,氏名,住所,登録日時を流し込む)
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			pstmt.setString(3, adr);
			pstmt.setTimestamp(4, t);
			// 組み立て終えたSQL文をDBMSに送信する
			int r = pstmt.executeUpdate();//⑥更新系SQL文を送信
			// 処理結果を判定する
			if (r != 0) {
				System.out.printf("番号:%d 氏名:%sを登録しました\n", no, name);
			} else {
				System.out.println("登録できませんでした");
			}

			// 送信すべきSQL文を準備
			//⑦SQLを指定（CUSTOMERテーブルに挿入するSQL）
			pstmt = con.prepareStatement("SELECT NO,NAME,ADDRESS,YMD FROM CUSTOMER");
			// 組み立て終えたSQL文をDBMSに送信する
			ResultSet rs = pstmt.executeQuery();//⑧更新系SQL文を送信
			// 結果表を処理する
			System.out.println("番号 氏名                  住所                            登録日");
			while (rs.next()) {
				//⑩検索結果から登録日時を取り出し、Timestamp型からlong型に変換し、さらにDate型に変換する。
				java.sql.Timestamp ts = rs.getTimestamp(4);
				l = ts.getTime();
				Date d2 = new Date(l);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'MM'月'dd'日('k'時'mm'分'ss'秒')");
				System.out.printf("%d %s                  %s                            %s\n",rs.getInt(1),rs.getString(2),rs.getString(3),sdf.format(d2));
			}
			//⑫ひな形を閉じる
		    pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベース接続の切断
			if (con != null) {
				try {
					//⑬接続を切断する
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

